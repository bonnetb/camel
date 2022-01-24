/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.websocket;

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
public class WebsocketEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/resourceUri";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(22);
        props.add("sendTimeout");
        props.add("minVersion");
        props.add("sendToAll");
        props.add("exchangePattern");
        props.add("sslContextParameters");
        props.add("maxIdleTime");
        props.add("resourceUri");
        props.add("enableJmx");
        props.add("sessionSupport");
        props.add("staticResources");
        props.add("filterPath");
        props.add("subprotocol");
        props.add("lazyStartProducer");
        props.add("bridgeErrorHandler");
        props.add("allowedOrigins");
        props.add("crossOriginFilterOn");
        props.add("port");
        props.add("maxTextMessageSize");
        props.add("host");
        props.add("maxBinaryMessageSize");
        props.add("exceptionHandler");
        props.add("bufferSize");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "websocket".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", "0.0.0.0", false, copy);
        uri = buildPathParameter(syntax, uri, "port", "9292", false, copy);
        uri = buildPathParameter(syntax, uri, "resourceUri", null, true, copy);
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

