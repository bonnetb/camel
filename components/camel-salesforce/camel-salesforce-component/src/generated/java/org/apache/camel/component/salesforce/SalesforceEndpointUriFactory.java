/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.salesforce;

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
public class SalesforceEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":operationName:topicName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(59);
        props.add("initialReplayIdMap");
        props.add("notifyForOperations");
        props.add("sObjectQuery");
        props.add("notifyForOperationCreate");
        props.add("sObjectClass");
        props.add("compositeMethod");
        props.add("apexMethod");
        props.add("apiVersion");
        props.add("bridgeErrorHandler");
        props.add("reportMetadata");
        props.add("limit");
        props.add("queryLocator");
        props.add("contentType");
        props.add("sObjectFields");
        props.add("sObjectName");
        props.add("sObjectBlobFieldName");
        props.add("backoffIncrement");
        props.add("format");
        props.add("rawHttpHeaders");
        props.add("sObjectId");
        props.add("defaultReplayId");
        props.add("jobId");
        props.add("lazyStartProducer");
        props.add("objectMapper");
        props.add("sObjectSearch");
        props.add("notifyForOperationUpdate");
        props.add("sObjectIdName");
        props.add("replayId");
        props.add("locator");
        props.add("exceptionHandler");
        props.add("maxRecords");
        props.add("pkChunkingParent");
        props.add("fallBackReplayId");
        props.add("batchId");
        props.add("notifyForOperationUndelete");
        props.add("apexUrl");
        props.add("updateTopic");
        props.add("rawMethod");
        props.add("rawPath");
        props.add("instanceId");
        props.add("notifyForFields");
        props.add("sObjectIdValue");
        props.add("apexQueryParams");
        props.add("includeDetails");
        props.add("pkChunkingChunkSize");
        props.add("pkChunkingStartRow");
        props.add("httpClient");
        props.add("maxBackoff");
        props.add("rawPayload");
        props.add("reportId");
        props.add("resultId");
        props.add("exchangePattern");
        props.add("operationName");
        props.add("pkChunking");
        props.add("rawQueryParameters");
        props.add("notFoundBehaviour");
        props.add("allOrNone");
        props.add("topicName");
        props.add("notifyForOperationDelete");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "salesforce".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "operationName", null, false, copy);
        uri = buildPathParameter(syntax, uri, "topicName", null, false, copy);
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

