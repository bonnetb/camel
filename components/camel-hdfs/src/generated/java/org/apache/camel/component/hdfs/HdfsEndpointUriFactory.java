/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hdfs;

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
public class HdfsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":hostName:port/path";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(48);
        props.add("backoffMultiplier");
        props.add("hostName");
        props.add("checkIdleInterval");
        props.add("pattern");
        props.add("compressionType");
        props.add("initialDelay");
        props.add("fileSystemType");
        props.add("scheduler");
        props.add("path");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("valueType");
        props.add("greedy");
        props.add("kerberosKeytabLocation");
        props.add("maxMessagesPerPoll");
        props.add("keyType");
        props.add("scheduledExecutorService");
        props.add("overwrite");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("owner");
        props.add("replication");
        props.add("kerberosConfigFileLocation");
        props.add("connectOnStartup");
        props.add("chunkSize");
        props.add("openedSuffix");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("exchangePattern");
        props.add("streamDownload");
        props.add("namedNodes");
        props.add("kerberosUsername");
        props.add("blockSize");
        props.add("backoffIdleThreshold");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("port");
        props.add("startScheduler");
        props.add("splitStrategy");
        props.add("compressionCodec");
        props.add("exceptionHandler");
        props.add("fileType");
        props.add("append");
        props.add("bufferSize");
        props.add("readSuffix");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "hdfs".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "hostName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", 8020, false, copy);
        uri = buildPathParameter(syntax, uri, "path", null, true, copy);
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

