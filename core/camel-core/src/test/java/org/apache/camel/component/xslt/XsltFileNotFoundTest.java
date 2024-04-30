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
package org.apache.camel.component.xslt;

import java.io.FileNotFoundException;

import javax.xml.transform.TransformerException;

import org.apache.camel.CamelContext;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.TestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 */
public class XsltFileNotFoundTest extends TestSupport {

    @Test
    public void testNoXsltFile() throws Exception {
        RouteBuilder builder = createRouteBuilder();
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(builder);
        RuntimeCamelException exception = assertThrows(RuntimeCamelException.class, context::start);

        assertIsInstanceOf(TransformerException.class, exception.getCause().getCause().getCause());
        assertIsInstanceOf(FileNotFoundException.class, exception.getCause().getCause().getCause().getCause());
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("seda:a").to("xslt:org/apache/camel/component/xslt/notfound.xsl");
            }
        };
    }

}
