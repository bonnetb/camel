/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd;

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
public class EtcdStatsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":path";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(31);
        props.add("backoffMultiplier");
        props.add("sendEmptyExchangeOnTimeout");
        props.add("sslContextParameters");
        props.add("initialDelay");
        props.add("recursive");
        props.add("timeout");
        props.add("scheduler");
        props.add("path");
        props.add("timeToLive");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("greedy");
        props.add("scheduledExecutorService");
        props.add("fromIndex");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("exchangePattern");
        props.add("userName");
        props.add("backoffIdleThreshold");
        props.add("uris");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("startScheduler");
        props.add("servicePath");
        props.add("exceptionHandler");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("userName");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "etcd-stats".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "path", null, false, copy);
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

