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
package org.apache.camel.component.log;

import java.io.StringWriter;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.WriterAppender;
import org.apache.logging.log4j.core.config.AppenderRef;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogBodyWithNewLineTest extends ContextTestSupport {

    private StringWriter writer;

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();
        writer = new StringWriter();

        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        final Configuration config = ctx.getConfiguration();

        Appender appender = WriterAppender.newBuilder()
                .setLayout(PatternLayout.newBuilder().withPattern(PatternLayout.SIMPLE_CONVERSION_PATTERN).build())
                .setTarget(writer)
                .setName("Writer").build();
        appender.start();

        final String loggerName = "logger_name";

        config.removeLogger(loggerName);
        LoggerConfig loggerConfig = LoggerConfig.newBuilder()
                .withIncludeLocation("true")
                .withLoggerName(loggerName)
                .withLevel(Level.INFO)
                .withAdditivity(true)
                .withConfig(config)
                .withRefs(new AppenderRef[] { AppenderRef.createAppenderRef("Writer", null, null) })
                .build();

        loggerConfig.addAppender(appender, Level.INFO, null);
        config.addLogger(loggerName, loggerConfig);
        ctx.updateLoggers();
    }

    @Test
    public void testNoSkip() {
        String body = "1" + LS + "2" + LS + "3";

        template.sendBody("direct:start", body);

        log.info("{}", writer);

        assertTrue(writer.toString().contains(body));
    }

    @Test
    public void testSkip() {
        String body = "1" + LS + "2" + LS + "3";

        template.sendBody("direct:skip", body);

        log.info("{}", writer);

        assertTrue(writer.toString().contains("123"));
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").to("log:logger_name?level=INFO&showAll=true&skipBodyLineSeparator=false");
                from("direct:skip").to("log:logger_name?level=INFO&showAll=true&skipBodyLineSeparator=true");
            }
        };
    }

}
