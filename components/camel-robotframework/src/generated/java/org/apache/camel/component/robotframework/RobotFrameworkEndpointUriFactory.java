/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.robotframework;

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
public class RobotFrameworkEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":resourceUri";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(69);
        props.add("tagStatIncludes");
        props.add("metadata");
        props.add("excludes");
        props.add("xunitFile");
        props.add("reportBackground");
        props.add("contentCache");
        props.add("listener");
        props.add("variableFiles");
        props.add("allowContextMapAll");
        props.add("initialDelay");
        props.add("summaryTitle");
        props.add("output");
        props.add("logTitle");
        props.add("bridgeErrorHandler");
        props.add("greedy");
        props.add("outputDirectory");
        props.add("scheduledExecutorService");
        props.add("randomize");
        props.add("repeatCount");
        props.add("dryrun");
        props.add("splitOutputs");
        props.add("suites");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("reportTitle");
        props.add("includes");
        props.add("runMode");
        props.add("backoffIdleThreshold");
        props.add("tags");
        props.add("argumentFile");
        props.add("tagStatLinks");
        props.add("lazyStartProducer");
        props.add("tests");
        props.add("delay");
        props.add("startScheduler");
        props.add("name");
        props.add("suiteStatLevel");
        props.add("warnOnSkippedFiles");
        props.add("exceptionHandler");
        props.add("monitorWidth");
        props.add("runEmptySuite");
        props.add("backoffMultiplier");
        props.add("allowTemplateFromHeader");
        props.add("log");
        props.add("debugFile");
        props.add("document");
        props.add("skipTeardownOnExit");
        props.add("noStatusReturnCode");
        props.add("scheduler");
        props.add("tagDocs");
        props.add("useFixedDelay");
        props.add("logLevel");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("timeUnit");
        props.add("variables");
        props.add("runFailed");
        props.add("listeners");
        props.add("criticalTags");
        props.add("exchangePattern");
        props.add("combinedTagStats");
        props.add("monitorColors");
        props.add("resourceUri");
        props.add("exitOnFailure");
        props.add("pollStrategy");
        props.add("tagStatExcludes");
        props.add("timestampOutputs");
        props.add("report");
        props.add("nonCriticalTags");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "robotframework".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

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

