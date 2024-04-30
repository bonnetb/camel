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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.sts.STS2Component;

/**
 * Manage AWS STS cluster instances.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2StsComponentBuilderFactory {

    /**
     * AWS Security Token Service (STS) (camel-aws2-sts)
     * Manage AWS STS cluster instances.
     * 
     * Category: cloud,management
     * Since: 3.5
     * Maven coordinates: org.apache.camel:camel-aws2-sts
     * 
     * @return the dsl builder
     */
    static Aws2StsComponentBuilder aws2Sts() {
        return new Aws2StsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Security Token Service (STS) component.
     */
    interface Aws2StsComponentBuilder extends ComponentBuilder<STS2Component> {
    
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.sts.STS2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder configuration(org.apache.camel.component.aws2.sts.STS2Configuration configuration) {
            doSetProperty("configuration", configuration);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.sts.STS2Operations&lt;/code&gt; type.
         * 
         * Default: assumeRole
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder operation(org.apache.camel.component.aws2.sts.STS2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
    
        
        /**
         * Set the need for overriding the endpoint. This option needs to be
         * used in combination with the uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder overrideEndpoint(boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
    
        
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
    
        
        /**
         * The region in which the STS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example, ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: aws-global
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
    
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder uriEndpointOverride(java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * To use an existing configured AWS STS client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.sts.StsClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param stsClient the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder stsClient(software.amazon.awssdk.services.sts.StsClient stsClient) {
            doSetProperty("stsClient", stsClient);
            return this;
        }
    
        /**
         * To define a proxy host when instantiating the STS client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
    
        /**
         * To define a proxy port when instantiating the STS client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
    
        
        /**
         * To define a proxy protocol when instantiating the STS client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder proxyProtocol(software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
    
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
    
        /**
         * If using a profile credentials provider, this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder profileCredentialsName(java.lang.String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
    
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    
        
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder trustAllCertificates(boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
    
        
        /**
         * Set whether the STS client should expect to load credentials through
         * a default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder useDefaultCredentialsProvider(boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
    
        
        /**
         * Set whether the STS client should expect to load credentials through
         * a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2StsComponentBuilder useProfileCredentialsProvider(boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
    }

    class Aws2StsComponentBuilderImpl
            extends AbstractComponentBuilder<STS2Component>
            implements Aws2StsComponentBuilder {
        @Override
        protected STS2Component buildConcreteComponent() {
            return new STS2Component();
        }
        private org.apache.camel.component.aws2.sts.STS2Configuration getOrCreateConfiguration(STS2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.sts.STS2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((STS2Component) component).setConfiguration((org.apache.camel.component.aws2.sts.STS2Configuration) value); return true;
            case "lazyStartProducer": ((STS2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((STS2Component) component).setOperation((org.apache.camel.component.aws2.sts.STS2Operations) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((STS2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "pojoRequest": getOrCreateConfiguration((STS2Component) component).setPojoRequest((boolean) value); return true;
            case "region": getOrCreateConfiguration((STS2Component) component).setRegion((java.lang.String) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((STS2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "autowiredEnabled": ((STS2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "stsClient": getOrCreateConfiguration((STS2Component) component).setStsClient((software.amazon.awssdk.services.sts.StsClient) value); return true;
            case "proxyHost": getOrCreateConfiguration((STS2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((STS2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((STS2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "accessKey": getOrCreateConfiguration((STS2Component) component).setAccessKey((java.lang.String) value); return true;
            case "profileCredentialsName": getOrCreateConfiguration((STS2Component) component).setProfileCredentialsName((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((STS2Component) component).setSecretKey((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((STS2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((STS2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "useProfileCredentialsProvider": getOrCreateConfiguration((STS2Component) component).setUseProfileCredentialsProvider((boolean) value); return true;
            default: return false;
            }
        }
    }
}