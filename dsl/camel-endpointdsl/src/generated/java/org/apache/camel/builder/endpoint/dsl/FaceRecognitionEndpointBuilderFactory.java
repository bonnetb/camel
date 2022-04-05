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
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Face Recognition Service (FRS) is an intelligent service that uses computers
 * to process, analyze, and understand facial images based on human facial
 * features.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FaceRecognitionEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Huawei Cloud Face Recognition Service (FRS)
     * component.
     */
    public interface FaceRecognitionEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * Access key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * This param is mandatory when the operation is faceLiveDetection,
         * indicating the action code sequence list. Actions are separated by
         * commas (,). Currently, the following actions are supported: 1: Shake
         * the head to the left. 2: Shake the head to the right. 3: Nod the
         * head. 4: Mouth movement.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param actions the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder actions(String actions) {
            doSetProperty("actions", actions);
            return this;
        }
        /**
         * This param can be used when the operation is faceLiveDetection,
         * indicating the action time array. The length of the array is the same
         * as the number of actions. Each item contains the start time and end
         * time of the action in the corresponding sequence. The unit is the
         * milliseconds from the video start time.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param actionTimes the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder actionTimes(String actionTimes) {
            doSetProperty("actionTimes", actionTimes);
            return this;
        }
        /**
         * This param can be used when operation is faceVerification, indicating
         * the Base64 character string converted from the other image. It needs
         * to be configured if imageBase64 is set. The image size cannot exceed
         * 10 MB. The image resolution of the narrow sides must be greater than
         * 15 pixels, and that of the wide sides cannot exceed 4096 pixels. The
         * supported image formats include JPG, PNG, and BMP.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param anotherImageBase64 the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder anotherImageBase64(
                String anotherImageBase64) {
            doSetProperty("anotherImageBase64", anotherImageBase64);
            return this;
        }
        /**
         * This param can be used when operation is faceVerification, indicating
         * the local file path of the other image. It needs to be configured if
         * imageFilePath is set. Image size cannot exceed 8 MB, and it is
         * recommended that the image size be less than 1 MB.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param anotherImageFilePath the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder anotherImageFilePath(
                String anotherImageFilePath) {
            doSetProperty("anotherImageFilePath", anotherImageFilePath);
            return this;
        }
        /**
         * This param can be used when operation is faceVerification, indicating
         * the URL of the other image. It needs to be configured if imageUrl is
         * set. The options are as follows: 1.HTTP/HTTPS URLs on the public
         * network 2.OBS URLs. To use OBS data, authorization is required,
         * including service authorization, temporary authorization, and
         * anonymous public authorization. For details, see Configuring the
         * Access Permission of OBS.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param anotherImageUrl the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder anotherImageUrl(
                String anotherImageUrl) {
            doSetProperty("anotherImageUrl", anotherImageUrl);
            return this;
        }
        /**
         * Fully qualified Face Recognition service url. Carries higher
         * precedence than region based configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder endpoint(String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
        /**
         * This param can be used when operation is faceDetection or
         * faceVerification, indicating the Base64 character string converted
         * from an image. Any one of imageBase64, imageUrl and imageFilePath
         * needs to be set, and the priority is imageBase64 imageUrl
         * imageFilePath. The Image size cannot exceed 10 MB. The image
         * resolution of the narrow sides must be greater than 15 pixels, and
         * that of the wide sides cannot exceed 4096 pixels. The supported image
         * formats include JPG, PNG, and BMP.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param imageBase64 the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder imageBase64(String imageBase64) {
            doSetProperty("imageBase64", imageBase64);
            return this;
        }
        /**
         * This param can be used when operation is faceDetection or
         * faceVerification, indicating the local image file path. Any one of
         * imageBase64, imageUrl and imageFilePath needs to be set, and the
         * priority is imageBase64 imageUrl imageFilePath. Image size cannot
         * exceed 8 MB, and it is recommended that the image size be less than 1
         * MB.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param imageFilePath the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder imageFilePath(
                String imageFilePath) {
            doSetProperty("imageFilePath", imageFilePath);
            return this;
        }
        /**
         * This param can be used when operation is faceDetection or
         * faceVerification, indicating the URL of an image. Any one of
         * imageBase64, imageUrl and imageFilePath needs to be set, and the
         * priority is imageBase64 imageUrl imageFilePath. The options are as
         * follows: 1.HTTP/HTTPS URLs on the public network 2.OBS URLs. To use
         * OBS data, authorization is required, including service authorization,
         * temporary authorization, and anonymous public authorization. For
         * details, see Configuring the Access Permission of OBS.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param imageUrl the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder imageUrl(String imageUrl) {
            doSetProperty("imageUrl", imageUrl);
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
        default FaceRecognitionEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Cloud project ID.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param projectId the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder projectId(String projectId) {
            doSetProperty("projectId", projectId);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder proxyPassword(
                String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * Face Recognition service region. Currently only cn-north-1 and
         * cn-north-4 are supported. This is lower precedence than endpoint
         * based configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder serviceKeys(
                org.apache.camel.component.huaweicloud.common.models.ServiceKeys serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * This param can be used when operation is faceLiveDetection,
         * indicating the Base64 character string converted from a video. Any
         * one of videoBase64, videoUrl and videoFilePath needs to be set, and
         * the priority is videoBase64 videoUrl videoFilePath. Requirements are
         * as follows: 1.The video size after Base64 encoding cannot exceed 8
         * MB. It is recommended that the video file be compressed to 200 KB to
         * 2 MB on the client. 2.The video duration must be 1 to 15 seconds.
         * 3.The recommended frame rate is 10 fps to 30 fps. 4.The encapsulation
         * format can be MP4, AVI, FLV, WEBM, ASF, or MOV. 5.The video encoding
         * format can be H.261, H.263, H.264, HEVC, VC-1, VP8, VP9, or WMV3.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param videoBase64 the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder videoBase64(String videoBase64) {
            doSetProperty("videoBase64", videoBase64);
            return this;
        }
        /**
         * This param can be used when operation is faceLiveDetection,
         * indicating the local video file path. Any one of videoBase64,
         * videoUrl and videoFilePath needs to be set, and the priority is
         * videoBase64 videoUrl videoFilePath. The video requirements are as
         * follows: 1.The size of a video file cannot exceed 8 MB. It is
         * recommended that the video file be compressed to 200 KB to 2 MB on
         * the client. 2.The video duration must be 1 to 15 seconds. 3.The
         * recommended frame rate is 10 fps to 30 fps. 4.The encapsulation
         * format can be MP4, AVI, FLV, WEBM, ASF, or MOV. 5.The video encoding
         * format can be H.261, H.263, H.264, HEVC, VC-1, VP8, VP9, or WMV3.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param videoFilePath the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder videoFilePath(
                String videoFilePath) {
            doSetProperty("videoFilePath", videoFilePath);
            return this;
        }
        /**
         * This param can be used when operation is faceLiveDetection,
         * indicating the URL of a video. Any one of videoBase64, videoUrl and
         * videoFilePath needs to be set, and the priority is videoBase64
         * videoUrl videoFilePath. Currently, only the URL of an OBS bucket on
         * HUAWEI CLOUD is supported and FRS must have the permission to read
         * data in the OBS bucket. For details about how to enable the read
         * permission, see Service Authorization. The video requirements are as
         * follows: 1.The video size after Base64 encoding cannot exceed 8 MB.
         * 2.The video duration must be 1 to 15 seconds. 3.The recommended frame
         * rate is 10 fps to 30 fps. 4.The encapsulation format can be MP4, AVI,
         * FLV, WEBM, ASF, or MOV. 5.The video encoding format can be H.261,
         * H.263, H.264, HEVC, VC-1, VP8, VP9, or WMV3.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param videoUrl the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder videoUrl(String videoUrl) {
            doSetProperty("videoUrl", videoUrl);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder ignoreSslVerification(
                boolean ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
    }

    public interface FaceRecognitionBuilders {
        /**
         * Huawei Cloud Face Recognition Service (FRS) (camel-huaweicloud-frs)
         * Face Recognition Service (FRS) is an intelligent service that uses
         * computers to process, analyze, and understand facial images based on
         * human facial features.
         * 
         * Category: cloud,messaging
         * Since: 3.15
         * Maven coordinates: org.apache.camel:camel-huaweicloud-frs
         * 
         * Syntax: <code>hwcloud-frs:operation</code>
         * 
         * Path parameter: operation (required)
         * Name of Face Recognition operation to perform, including
         * faceDetection, faceVerification and faceLiveDetection
         * 
         * @param path operation
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder hwcloudFrs(String path) {
            return FaceRecognitionEndpointBuilderFactory.endpointBuilder("hwcloud-frs", path);
        }
        /**
         * Huawei Cloud Face Recognition Service (FRS) (camel-huaweicloud-frs)
         * Face Recognition Service (FRS) is an intelligent service that uses
         * computers to process, analyze, and understand facial images based on
         * human facial features.
         * 
         * Category: cloud,messaging
         * Since: 3.15
         * Maven coordinates: org.apache.camel:camel-huaweicloud-frs
         * 
         * Syntax: <code>hwcloud-frs:operation</code>
         * 
         * Path parameter: operation (required)
         * Name of Face Recognition operation to perform, including
         * faceDetection, faceVerification and faceLiveDetection
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default FaceRecognitionEndpointBuilder hwcloudFrs(
                String componentName,
                String path) {
            return FaceRecognitionEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static FaceRecognitionEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class FaceRecognitionEndpointBuilderImpl extends AbstractEndpointBuilder implements FaceRecognitionEndpointBuilder {
            public FaceRecognitionEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new FaceRecognitionEndpointBuilderImpl(path);
    }
}