/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cometd;

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
public class CometdEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/channelName";
    private static final String[] SCHEMES = new String[]{"cometd", "cometds"};

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(19);
        props.add("allowedOrigins");
        props.add("baseResource");
        props.add("bridgeErrorHandler");
        props.add("channelName");
        props.add("crossOriginFilterOn");
        props.add("disconnectLocalSession");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("filterPath");
        props.add("host");
        props.add("interval");
        props.add("jsonCommented");
        props.add("lazyStartProducer");
        props.add("logLevel");
        props.add("maxInterval");
        props.add("multiFrameInterval");
        props.add("port");
        props.add("sessionHeadersEnabled");
        props.add("timeout");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        for (String s : SCHEMES) {
            if (s.equals(scheme)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, true, copy);
        uri = buildPathParameter(syntax, uri, "channelName", null, true, copy);
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

