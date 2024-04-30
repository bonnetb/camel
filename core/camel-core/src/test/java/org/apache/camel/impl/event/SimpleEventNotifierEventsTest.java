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
package org.apache.camel.impl.event;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.CamelEvent;
import org.apache.camel.support.SimpleEventNotifierSupport;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.apache.camel.TestSupport.assertIsInstanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleEventNotifierEventsTest {

    private final List<CamelEvent> events = new ArrayList<>();

    private CamelContext context;
    private ProducerTemplate template;

    @BeforeEach
    public void setUp() throws Exception {
        context = createCamelContext();
        context.addRoutes(createRouteBuilder());
        template = context.createProducerTemplate();
        context.start();
    }

    @AfterEach
    public void tearDown() {
        if (context != null) {
            context.stop();
        }
    }

    protected CamelContext createCamelContext() {
        DefaultCamelContext context = new DefaultCamelContext();
        context.getManagementStrategy().addEventNotifier(new SimpleEventNotifierSupport() {
            public void notify(CamelEvent event) {
                events.add(event);
            }
        });
        return context;
    }

    @Test
    public void testExchangeDone() throws Exception {
        // optimized as this does not require exchange events
        assertFalse(context.getCamelContextExtension().isEventNotificationApplicable());

        MockEndpoint mock = context.getEndpoint("mock:result", MockEndpoint.class);
        mock.expectedMessageCount(1);

        template.sendBody("direct:start", "Hello World");

        mock.assertIsSatisfied();

        assertEquals(12, events.size());
        assertIsInstanceOf(CamelEvent.CamelContextInitializingEvent.class, events.get(0));
        assertIsInstanceOf(CamelEvent.CamelContextInitializedEvent.class, events.get(1));
        assertIsInstanceOf(CamelContextStartingEvent.class, events.get(2));
        assertIsInstanceOf(CamelContextRoutesStartingEvent.class, events.get(3));
        assertIsInstanceOf(RouteAddedEvent.class, events.get(4));
        assertIsInstanceOf(RouteAddedEvent.class, events.get(5));
        assertIsInstanceOf(RouteStartingEvent.class, events.get(6));
        assertIsInstanceOf(RouteStartedEvent.class, events.get(7));
        assertIsInstanceOf(RouteStartingEvent.class, events.get(8));
        assertIsInstanceOf(RouteStartedEvent.class, events.get(9));
        assertIsInstanceOf(CamelContextRoutesStartedEvent.class, events.get(10));
        assertIsInstanceOf(CamelContextStartedEvent.class, events.get(11));

        context.stop();

        assertEquals(22, events.size());
        assertIsInstanceOf(CamelContextStoppingEvent.class, events.get(12));
        assertIsInstanceOf(CamelContextRoutesStoppingEvent.class, events.get(13));
        assertIsInstanceOf(RouteStoppingEvent.class, events.get(14));
        assertIsInstanceOf(RouteStoppedEvent.class, events.get(15));
        assertIsInstanceOf(RouteRemovedEvent.class, events.get(16));
        assertIsInstanceOf(RouteStoppingEvent.class, events.get(17));
        assertIsInstanceOf(RouteStoppedEvent.class, events.get(18));
        assertIsInstanceOf(RouteRemovedEvent.class, events.get(19));
        assertIsInstanceOf(CamelContextRoutesStoppedEvent.class, events.get(20));
        assertIsInstanceOf(CamelContextStoppedEvent.class, events.get(21));
    }

    @Test
    public void testExchangeFailed() {
        // optimized as this does not require exchange events
        assertFalse(context.getCamelContextExtension().isEventNotificationApplicable());

        Exception e = assertThrows(Exception.class,
                () -> template.sendBody("direct:fail", "Hello World"),
                "Should have thrown an exception");

        assertIsInstanceOf(IllegalArgumentException.class, e.getCause());

        assertEquals(12, events.size());
        assertIsInstanceOf(CamelEvent.CamelContextInitializingEvent.class, events.get(0));
        assertIsInstanceOf(CamelEvent.CamelContextInitializedEvent.class, events.get(1));
        assertIsInstanceOf(CamelContextStartingEvent.class, events.get(2));
        assertIsInstanceOf(CamelContextRoutesStartingEvent.class, events.get(3));
        assertIsInstanceOf(RouteAddedEvent.class, events.get(4));
        assertIsInstanceOf(RouteAddedEvent.class, events.get(5));
        assertIsInstanceOf(RouteStartingEvent.class, events.get(6));
        assertIsInstanceOf(RouteStartedEvent.class, events.get(7));
        assertIsInstanceOf(RouteStartingEvent.class, events.get(8));
        assertIsInstanceOf(RouteStartedEvent.class, events.get(9));
        assertIsInstanceOf(CamelContextRoutesStartedEvent.class, events.get(10));
        assertIsInstanceOf(CamelContextStartedEvent.class, events.get(11));

        context.stop();

        assertEquals(22, events.size());
        assertIsInstanceOf(CamelContextStoppingEvent.class, events.get(12));
        assertIsInstanceOf(CamelContextRoutesStoppingEvent.class, events.get(13));
        assertIsInstanceOf(RouteStoppingEvent.class, events.get(14));
        assertIsInstanceOf(RouteStoppedEvent.class, events.get(15));
        assertIsInstanceOf(RouteRemovedEvent.class, events.get(16));
        assertIsInstanceOf(RouteStoppingEvent.class, events.get(17));
        assertIsInstanceOf(RouteStoppedEvent.class, events.get(18));
        assertIsInstanceOf(RouteRemovedEvent.class, events.get(19));
        assertIsInstanceOf(CamelContextRoutesStoppedEvent.class, events.get(20));
        assertIsInstanceOf(CamelContextStoppedEvent.class, events.get(21));
    }

    @Test
    public void testSuspendResume() {
        // optimized as this does not require exchange events
        assertFalse(context.getCamelContextExtension().isEventNotificationApplicable());

        assertEquals(12, events.size());
        assertIsInstanceOf(CamelEvent.CamelContextInitializingEvent.class, events.get(0));
        assertIsInstanceOf(CamelEvent.CamelContextInitializedEvent.class, events.get(1));
        assertIsInstanceOf(CamelContextStartingEvent.class, events.get(2));
        assertIsInstanceOf(CamelContextRoutesStartingEvent.class, events.get(3));
        assertIsInstanceOf(RouteAddedEvent.class, events.get(4));
        assertIsInstanceOf(RouteAddedEvent.class, events.get(5));
        assertIsInstanceOf(RouteStartingEvent.class, events.get(6));
        assertIsInstanceOf(RouteStartedEvent.class, events.get(7));
        assertIsInstanceOf(RouteStartingEvent.class, events.get(8));
        assertIsInstanceOf(RouteStartedEvent.class, events.get(9));
        assertIsInstanceOf(CamelContextRoutesStartedEvent.class, events.get(10));
        assertIsInstanceOf(CamelContextStartedEvent.class, events.get(11));

        context.suspend();

        assertEquals(14, events.size());
        assertIsInstanceOf(CamelContextSuspendingEvent.class, events.get(12));
        // notice direct component is not suspended (as they are internal)
        assertIsInstanceOf(CamelContextSuspendedEvent.class, events.get(13));

        context.resume();

        assertEquals(16, events.size());
        assertIsInstanceOf(CamelContextResumingEvent.class, events.get(14));
        assertIsInstanceOf(CamelContextResumedEvent.class, events.get(15));
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").to("log:foo").to("mock:result");

                from("direct:fail").throwException(new IllegalArgumentException("Damn"));
            }
        };
    }

}
