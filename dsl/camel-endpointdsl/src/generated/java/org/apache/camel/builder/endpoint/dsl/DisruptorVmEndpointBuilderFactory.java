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
 * Provides asynchronous SEDA behavior using LMAX Disruptor.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DisruptorVmEndpointBuilderFactory {

    /**
     * Builder for endpoint consumers for the Disruptor VM component.
     */
    public interface DisruptorVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedDisruptorVmEndpointConsumerBuilder advanced() {
            return (AdvancedDisruptorVmEndpointConsumerBuilder) this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1024
         * Group: common
         * 
         * @param size the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder size(int size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1024
         * Group: common
         * 
         * @param size the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder size(String size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder concurrentConsumers(int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder concurrentConsumers(String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use Disruptor for Publish-Subscribe messaging. That is, you can send
         * a message to the queue and have each consumer receive a copy of the
         * message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param multipleConsumers the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder multipleConsumers(boolean multipleConsumers) {
            doSetProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use Disruptor for Publish-Subscribe messaging. That is, you can send
         * a message to the queue and have each consumer receive a copy of the
         * message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param multipleConsumers the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder multipleConsumers(String multipleConsumers) {
            doSetProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * Defines the strategy used by consumer threads to wait on new
         * exchanges to be published. The options allowed are:Blocking,
         * Sleeping, BusySpin and Yielding.
         * 
         * The option is a:
         * <code>org.apache.camel.component.disruptor.DisruptorWaitStrategy</code> type.
         * 
         * Default: Blocking
         * Group: consumer
         * 
         * @param waitStrategy the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder waitStrategy(org.apache.camel.component.disruptor.DisruptorWaitStrategy waitStrategy) {
            doSetProperty("waitStrategy", waitStrategy);
            return this;
        }
        /**
         * Defines the strategy used by consumer threads to wait on new
         * exchanges to be published. The options allowed are:Blocking,
         * Sleeping, BusySpin and Yielding.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.disruptor.DisruptorWaitStrategy</code> type.
         * 
         * Default: Blocking
         * Group: consumer
         * 
         * @param waitStrategy the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointConsumerBuilder waitStrategy(String waitStrategy) {
            doSetProperty("waitStrategy", waitStrategy);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Disruptor VM component.
     */
    public interface AdvancedDisruptorVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default DisruptorVmEndpointConsumerBuilder basic() {
            return (DisruptorVmEndpointConsumerBuilder) this;
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
        default AdvancedDisruptorVmEndpointConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
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
        default AdvancedDisruptorVmEndpointConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
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
        default AdvancedDisruptorVmEndpointConsumerBuilder exceptionHandler(org.apache.camel.spi.ExceptionHandler exceptionHandler) {
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
        default AdvancedDisruptorVmEndpointConsumerBuilder exceptionHandler(String exceptionHandler) {
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
        default AdvancedDisruptorVmEndpointConsumerBuilder exchangePattern(org.apache.camel.ExchangePattern exchangePattern) {
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
        default AdvancedDisruptorVmEndpointConsumerBuilder exchangePattern(String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Disruptor VM component.
     */
    public interface DisruptorVmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDisruptorVmEndpointProducerBuilder advanced() {
            return (AdvancedDisruptorVmEndpointProducerBuilder) this;
        }

        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1024
         * Group: common
         * 
         * @param size the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder size(int size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1024
         * Group: common
         * 
         * @param size the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder size(String size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full Disruptor will block
         * until the ringbuffer's capacity is no longer exhausted. By default,
         * the calling thread will block and wait until the message can be
         * accepted. By disabling this option, an exception will be thrown
         * stating that the queue is full.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param blockWhenFull the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder blockWhenFull(boolean blockWhenFull) {
            doSetProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full Disruptor will block
         * until the ringbuffer's capacity is no longer exhausted. By default,
         * the calling thread will block and wait until the message can be
         * accepted. By disabling this option, an exception will be thrown
         * stating that the queue is full.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param blockWhenFull the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder blockWhenFull(String blockWhenFull) {
            doSetProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Defines the producers allowed on the Disruptor. The options allowed
         * are: Multi to allow multiple producers and Single to enable certain
         * optimizations only allowed when one concurrent producer (on one
         * thread or otherwise synchronized) is active.
         * 
         * The option is a:
         * <code>org.apache.camel.component.disruptor.DisruptorProducerType</code> type.
         * 
         * Default: Multi
         * Group: producer
         * 
         * @param producerType the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder producerType(org.apache.camel.component.disruptor.DisruptorProducerType producerType) {
            doSetProperty("producerType", producerType);
            return this;
        }
        /**
         * Defines the producers allowed on the Disruptor. The options allowed
         * are: Multi to allow multiple producers and Single to enable certain
         * optimizations only allowed when one concurrent producer (on one
         * thread or otherwise synchronized) is active.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.disruptor.DisruptorProducerType</code> type.
         * 
         * Default: Multi
         * Group: producer
         * 
         * @param producerType the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder producerType(String producerType) {
            doSetProperty("producerType", producerType);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a producer will stop waiting for an
         * asynchronous task to complete. You can disable timeout by using 0 or
         * a negative value.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a producer will stop waiting for an
         * asynchronous task to complete. You can disable timeout by using 0 or
         * a negative value.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based.
         * 
         * The option is a: <code>org.apache.camel.WaitForTaskToComplete</code>
         * type.
         * 
         * Default: IfReplyExpected
         * Group: producer
         * 
         * @param waitForTaskToComplete the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder waitForTaskToComplete(org.apache.camel.WaitForTaskToComplete waitForTaskToComplete) {
            doSetProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.WaitForTaskToComplete</code> type.
         * 
         * Default: IfReplyExpected
         * Group: producer
         * 
         * @param waitForTaskToComplete the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointProducerBuilder waitForTaskToComplete(String waitForTaskToComplete) {
            doSetProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Disruptor VM component.
     */
    public interface AdvancedDisruptorVmEndpointProducerBuilder extends EndpointProducerBuilder {
        default DisruptorVmEndpointProducerBuilder basic() {
            return (DisruptorVmEndpointProducerBuilder) this;
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
        default AdvancedDisruptorVmEndpointProducerBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default AdvancedDisruptorVmEndpointProducerBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Disruptor VM component.
     */
    public interface DisruptorVmEndpointBuilder
            extends
                DisruptorVmEndpointConsumerBuilder,
                DisruptorVmEndpointProducerBuilder {
        default AdvancedDisruptorVmEndpointBuilder advanced() {
            return (AdvancedDisruptorVmEndpointBuilder) this;
        }

        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1024
         * Group: common
         * 
         * @param size the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointBuilder size(int size) {
            doSetProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1024
         * Group: common
         * 
         * @param size the value to set
         * @return the dsl builder
         */
        default DisruptorVmEndpointBuilder size(String size) {
            doSetProperty("size", size);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Disruptor VM component.
     */
    public interface AdvancedDisruptorVmEndpointBuilder
            extends
                AdvancedDisruptorVmEndpointConsumerBuilder,
                AdvancedDisruptorVmEndpointProducerBuilder {
        default DisruptorVmEndpointBuilder basic() {
            return (DisruptorVmEndpointBuilder) this;
        }

    }

    public interface DisruptorVmBuilders {
        /**
         * Disruptor VM (camel-disruptor)
         * Provides asynchronous SEDA behavior using LMAX Disruptor.
         * 
         * Category: messaging
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-disruptor
         * 
         * Syntax: <code>disruptor-vm:name</code>
         * 
         * Path parameter: name (required)
         * Name of queue
         * 
         * @param path name
         * @return the dsl builder
         */
        default DisruptorVmEndpointBuilder disruptorVm(String path) {
            return DisruptorVmEndpointBuilderFactory.endpointBuilder("disruptor-vm", path);
        }
        /**
         * Disruptor VM (camel-disruptor)
         * Provides asynchronous SEDA behavior using LMAX Disruptor.
         * 
         * Category: messaging
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-disruptor
         * 
         * Syntax: <code>disruptor-vm:name</code>
         * 
         * Path parameter: name (required)
         * Name of queue
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default DisruptorVmEndpointBuilder disruptorVm(String componentName, String path) {
            return DisruptorVmEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    static DisruptorVmEndpointBuilder endpointBuilder(String componentName, String path) {
        class DisruptorVmEndpointBuilderImpl extends AbstractEndpointBuilder implements DisruptorVmEndpointBuilder, AdvancedDisruptorVmEndpointBuilder {
            public DisruptorVmEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DisruptorVmEndpointBuilderImpl(path);
    }
}