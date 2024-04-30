/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.storage;

import javax.annotation.processing.Generated;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateEndpointUriFactoryMojo")
public class GoogleCloudStorageEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":bucketName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(35);
        props.add("autoCreateBucket");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("bridgeErrorHandler");
        props.add("bucketName");
        props.add("delay");
        props.add("deleteAfterRead");
        props.add("destinationBucket");
        props.add("downloadFileName");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("filter");
        props.add("greedy");
        props.add("includeBody");
        props.add("includeFolders");
        props.add("initialDelay");
        props.add("lazyStartProducer");
        props.add("moveAfterRead");
        props.add("objectName");
        props.add("operation");
        props.add("pollStrategy");
        props.add("repeatCount");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("sendEmptyMessageWhenIdle");
        props.add("serviceAccountKey");
        props.add("startScheduler");
        props.add("storageClass");
        props.add("storageClient");
        props.add("storageLocation");
        props.add("timeUnit");
        props.add("useFixedDelay");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "google-storage".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "bucketName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

