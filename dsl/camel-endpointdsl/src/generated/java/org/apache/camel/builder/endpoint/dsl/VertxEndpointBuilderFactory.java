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
 * Send and receive messages to/from Vert.x Event Bus.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface VertxEndpointBuilderFactory {

    /**
     * Builder for endpoint consumers for the Vert.x component.
     */
    public interface VertxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedVertxEndpointConsumerBuilder advanced() {
            return (AdvancedVertxEndpointConsumerBuilder) this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: common
         * 
         * @param pubSub the value to set
         * @return the dsl builder
         */
        default VertxEndpointConsumerBuilder pubSub(Boolean pubSub) {
            doSetProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: common
         * 
         * @param pubSub the value to set
         * @return the dsl builder
         */
        default VertxEndpointConsumerBuilder pubSub(String pubSub) {
            doSetProperty("pubSub", pubSub);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Vert.x component.
     */
    public interface AdvancedVertxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default VertxEndpointConsumerBuilder basic() {
            return (VertxEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedVertxEndpointConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedVertxEndpointConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedVertxEndpointConsumerBuilder exceptionHandler(org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedVertxEndpointConsumerBuilder exceptionHandler(String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedVertxEndpointConsumerBuilder exchangePattern(org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedVertxEndpointConsumerBuilder exchangePattern(String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Vert.x component.
     */
    public interface VertxEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedVertxEndpointProducerBuilder advanced() {
            return (AdvancedVertxEndpointProducerBuilder) this;
        }

        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: common
         * 
         * @param pubSub the value to set
         * @return the dsl builder
         */
        default VertxEndpointProducerBuilder pubSub(Boolean pubSub) {
            doSetProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: common
         * 
         * @param pubSub the value to set
         * @return the dsl builder
         */
        default VertxEndpointProducerBuilder pubSub(String pubSub) {
            doSetProperty("pubSub", pubSub);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Vert.x component.
     */
    public interface AdvancedVertxEndpointProducerBuilder extends EndpointProducerBuilder {
        default VertxEndpointProducerBuilder basic() {
            return (VertxEndpointProducerBuilder) this;
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
        default AdvancedVertxEndpointProducerBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedVertxEndpointProducerBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Vert.x component.
     */
    public interface VertxEndpointBuilder
            extends
                VertxEndpointConsumerBuilder,
                VertxEndpointProducerBuilder {
        default AdvancedVertxEndpointBuilder advanced() {
            return (AdvancedVertxEndpointBuilder) this;
        }

        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: common
         * 
         * @param pubSub the value to set
         * @return the dsl builder
         */
        default VertxEndpointBuilder pubSub(Boolean pubSub) {
            doSetProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: common
         * 
         * @param pubSub the value to set
         * @return the dsl builder
         */
        default VertxEndpointBuilder pubSub(String pubSub) {
            doSetProperty("pubSub", pubSub);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Vert.x component.
     */
    public interface AdvancedVertxEndpointBuilder
            extends
                AdvancedVertxEndpointConsumerBuilder,
                AdvancedVertxEndpointProducerBuilder {
        default VertxEndpointBuilder basic() {
            return (VertxEndpointBuilder) this;
        }

    }

    public interface VertxBuilders {
        /**
         * Vert.x (camel-vertx)
         * Send and receive messages to/from Vert.x Event Bus.
         * 
         * Category: messaging
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-vertx
         * 
         * Syntax: <code>vertx:address</code>
         * 
         * Path parameter: address (required)
         * Sets the event bus address used to communicate
         * 
         * @param path address
         * @return the dsl builder
         */
        default VertxEndpointBuilder vertx(String path) {
            return VertxEndpointBuilderFactory.endpointBuilder("vertx", path);
        }
        /**
         * Vert.x (camel-vertx)
         * Send and receive messages to/from Vert.x Event Bus.
         * 
         * Category: messaging
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-vertx
         * 
         * Syntax: <code>vertx:address</code>
         * 
         * Path parameter: address (required)
         * Sets the event bus address used to communicate
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path address
         * @return the dsl builder
         */
        default VertxEndpointBuilder vertx(String componentName, String path) {
            return VertxEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    static VertxEndpointBuilder endpointBuilder(String componentName, String path) {
        class VertxEndpointBuilderImpl extends AbstractEndpointBuilder implements VertxEndpointBuilder, AdvancedVertxEndpointBuilder {
            public VertxEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new VertxEndpointBuilderImpl(path);
    }
}