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
package org.apache.camel.issues;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("CAMEL-16034: Manual test")
public class MDCUnitLoggingOutOfMemoryManualTest extends ContextTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                context.setUseMDCLogging(true);

                from("direct:foo")
                        .split().body().streaming()
                        .log("Hello split index ${headers.CamelSplitIndex}");
            }
        };
    }

    @Test
    public void testMDCLogging() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add("test");
        }

        template.sendBody("direct:foo", list);
    }
}
