/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.aggregate.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.sql.XADataSource;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class JdbcRemoveConfirmOrderAggregateTest extends AbstractJdbcAggregationTestSupport {
    private static final Logger LOG = Logger.getLogger(JdbcRemoveConfirmOrderAggregateTest.class.getName());

    public static class UT extends com.atomikos.icatch.jta.UserTransactionImp {
        private int count;

        @Override
        public void commit()
                throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SecurityException,
                IllegalStateException, SystemException {
            count++;
            if (count == 2) {
                try {
                    LOG.finest("sleeping while committing...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            super.commit();
        }

    }

    @Override
    void configureJdbcAggregationRepository() {
        repo = applicationContext.getBean("repoXA", JdbcAggregationRepository.class);
        // enable recovery
        repo.setUseRecovery(false);
        // check faster
        repo.setRecoveryInterval(50, TimeUnit.MILLISECONDS);
        XADataSource datasource = applicationContext.getBean("XAdatasource", XADataSource.class);
        try {
            Connection connection = datasource.getXAConnection().getConnection();
            connection.createStatement()
                    .execute("CREATE TABLE aggregationRepoXA "
                             + "(id varchar(255) NOT NULL, exchange blob NOT NULL, version bigint NOT NULL, constraint aggregationRepoXA_pk PRIMARY KEY (id));");
            connection.createStatement()
                    .execute("CREATE TABLE aggregationRepoXA_completed"
                             + "(id varchar(255) NOT NULL, exchange blob NOT NULL, version bigint NOT NULL, constraint aggregationRepoXA_completed_pk PRIMARY KEY (id));");
        } catch (SQLException e) {
            fail(e);
        }
    }

    @Test
    public void testJdbcAggregateRecover() throws Exception {

        getMockEndpoint("mock:result").expectedBodiesReceived("AB");

        template.sendBodyAndHeader("direct:start", "A", "id", 123);
        template.sendBodyAndHeader("direct:start", "B", "id", 123);
        // template.sendBodyAndHeader("direct:start", "C", "id", 123);
        // template.sendBodyAndHeader("direct:start", "D", "id", 123);
        // template.sendBodyAndHeader("direct:start", "E", "id", 123);
        assertMockEndpointsSatisfied(10, TimeUnit.SECONDS);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").threads(2).transacted("required").aggregate(header("id"), new MyAggregationStrategy()).completionSize(2).aggregationRepository(repo)
                    .optimisticLocking().to("mock:result").end();
            }
        };
    }
}
