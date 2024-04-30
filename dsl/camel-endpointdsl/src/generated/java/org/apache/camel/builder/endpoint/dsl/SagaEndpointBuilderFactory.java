/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Execute custom actions within a route using the Saga EIP.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SagaEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Saga component.
     */
    public interface SagaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSagaEndpointBuilder advanced() {
            return (AdvancedSagaEndpointBuilder) this;
        }

    }

    /**
     * Advanced builder for endpoint for the Saga component.
     */
    public interface AdvancedSagaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SagaEndpointBuilder basic() {
            return (SagaEndpointBuilder) this;
        }

        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedSagaEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedSagaEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface SagaBuilders {
        /**
         * Saga (camel-saga)
         * Execute custom actions within a route using the Saga EIP.
         * 
         * Category: clustering
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-saga
         * 
         * @return the dsl builder for the headers' name.
         */
        default SagaHeaderNameBuilder saga() {
            return SagaHeaderNameBuilder.INSTANCE;
        }
        /**
         * Saga (camel-saga)
         * Execute custom actions within a route using the Saga EIP.
         * 
         * Category: clustering
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-saga
         * 
         * Syntax: <code>saga:action</code>
         * 
         * Path parameter: action (required)
         * Action to execute (complete or compensate)
         * There are 2 enums and the value can be one of: COMPLETE, COMPENSATE
         * 
         * @param path action
         * @return the dsl builder
         */
        default SagaEndpointBuilder saga(String path) {
            return SagaEndpointBuilderFactory.endpointBuilder("saga", path);
        }
        /**
         * Saga (camel-saga)
         * Execute custom actions within a route using the Saga EIP.
         * 
         * Category: clustering
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-saga
         * 
         * Syntax: <code>saga:action</code>
         * 
         * Path parameter: action (required)
         * Action to execute (complete or compensate)
         * There are 2 enums and the value can be one of: COMPLETE, COMPENSATE
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path action
         * @return the dsl builder
         */
        default SagaEndpointBuilder saga(String componentName, String path) {
            return SagaEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Saga component.
     */
    public static class SagaHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final SagaHeaderNameBuilder INSTANCE = new SagaHeaderNameBuilder();

        /**
         * The long running action.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code Long-Running-Action}.
         */
        public String longRunningAction() {
            return "Long-Running-Action";
        }
    }
    static SagaEndpointBuilder endpointBuilder(String componentName, String path) {
        class SagaEndpointBuilderImpl extends AbstractEndpointBuilder implements SagaEndpointBuilder, AdvancedSagaEndpointBuilder {
            public SagaEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SagaEndpointBuilderImpl(path);
    }
}