/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.directmessage;

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
public class TwitterDirectMessageEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":user";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(43);
        props.add("accessToken");
        props.add("accessTokenSecret");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("bridgeErrorHandler");
        props.add("consumerKey");
        props.add("consumerSecret");
        props.add("count");
        props.add("delay");
        props.add("distanceMetric");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("extendedMode");
        props.add("filterOld");
        props.add("greedy");
        props.add("httpProxyHost");
        props.add("httpProxyPassword");
        props.add("httpProxyPort");
        props.add("httpProxyUser");
        props.add("initialDelay");
        props.add("lang");
        props.add("latitude");
        props.add("lazyStartProducer");
        props.add("locations");
        props.add("longitude");
        props.add("numberOfPages");
        props.add("pollStrategy");
        props.add("radius");
        props.add("repeatCount");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("sendEmptyMessageWhenIdle");
        props.add("sinceId");
        props.add("sortById");
        props.add("startScheduler");
        props.add("timeUnit");
        props.add("type");
        props.add("useFixedDelay");
        props.add("user");
        props.add("userIds");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(4);
        secretProps.add("accessToken");
        secretProps.add("accessTokenSecret");
        secretProps.add("consumerKey");
        secretProps.add("consumerSecret");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "twitter-directmessage".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "user", null, true, copy);
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

