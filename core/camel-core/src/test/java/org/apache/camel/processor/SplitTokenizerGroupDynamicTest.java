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
package org.apache.camel.processor;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

public class SplitTokenizerGroupDynamicTest extends ContextTestSupport {

    @Test
    public void testSplitTokenizerA() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:split");
        mock.expectedBodiesReceived("Claus,James", "Willem");

        template.sendBodyAndHeader("direct:a", "Claus,James,Willem", "groups", 2);

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testSplitTokenizerB() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:split");
        mock.expectedBodiesReceived("James,Willem");

        template.sendBodyAndHeader("direct:b", "Claus,James,Willem".getBytes(), "groups", 2);

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {

                from("direct:a").split().tokenize(",", false, "${header.groups}").to("mock:split");

                from("direct:b").split(bodyAs(String.class).tokenize(",", "${header.groups}", true)).to("mock:split");
            }
        };
    }
}
