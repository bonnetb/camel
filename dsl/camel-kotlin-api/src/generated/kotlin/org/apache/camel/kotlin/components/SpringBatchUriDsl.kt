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
package org.apache.camel.kotlin.components

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.UriDsl

/**
 * Send messages to Spring Batch for further processing.
 */
public fun UriDsl.`spring-batch`(i: SpringBatchUriDsl.() -> Unit) {
  SpringBatchUriDsl(this).apply(i)
}

@CamelDslMarker
public class SpringBatchUriDsl(
  it: UriDsl,
) {
  private val it: UriDsl

  init {
    this.it = it
    this.it.component("spring-batch")
  }

  private var jobName: String = ""

  /**
   * The name of the Spring Batch job located in the registry.
   */
  public fun jobName(jobName: String) {
    this.jobName = jobName
    it.url("$jobName")
  }

  /**
   * Explicitly defines if the jobName should be taken from the headers instead of the URI.
   */
  public fun jobFromHeader(jobFromHeader: String) {
    it.property("jobFromHeader", jobFromHeader)
  }

  /**
   * Explicitly defines if the jobName should be taken from the headers instead of the URI.
   */
  public fun jobFromHeader(jobFromHeader: Boolean) {
    it.property("jobFromHeader", jobFromHeader.toString())
  }

  /**
   * Explicitly specifies a JobLauncher to be used.
   */
  public fun jobLauncher(jobLauncher: String) {
    it.property("jobLauncher", jobLauncher)
  }

  /**
   * Explicitly specifies a JobRegistry to be used.
   */
  public fun jobRegistry(jobRegistry: String) {
    it.property("jobRegistry", jobRegistry)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: String) {
    it.property("lazyStartProducer", lazyStartProducer)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: Boolean) {
    it.property("lazyStartProducer", lazyStartProducer.toString())
  }
}
