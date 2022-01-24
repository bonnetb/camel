/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

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
public class TwilioEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(67);
        props.add("apiName");
        props.add("endDate");
        props.add("pathConferenceSid");
        props.add("postalCode");
        props.add("initialDelay");
        props.add("body");
        props.add("pathIpAccessControlListSid");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("messagingServiceSid");
        props.add("pathAddOnResultSid");
        props.add("greedy");
        props.add("applicationSid");
        props.add("from");
        props.add("callbackUrl");
        props.add("scheduledExecutorService");
        props.add("isoCountry");
        props.add("repeatCount");
        props.add("mediaUrl");
        props.add("pathQueueSid");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("ipAddress");
        props.add("backoffIdleThreshold");
        props.add("customerName");
        props.add("lazyStartProducer");
        props.add("areaCode");
        props.add("delay");
        props.add("phoneNumber");
        props.add("pathDomainSid");
        props.add("startScheduler");
        props.add("domainName");
        props.add("pathSid");
        props.add("region");
        props.add("inBody");
        props.add("exceptionHandler");
        props.add("startDate");
        props.add("status");
        props.add("backoffMultiplier");
        props.add("city");
        props.add("triggerValue");
        props.add("pathCredentialListSid");
        props.add("pathReferenceSid");
        props.add("pathCountryCode");
        props.add("scheduler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("street");
        props.add("qualityScore");
        props.add("friendlyName");
        props.add("timeUnit");
        props.add("pathRecordingSid");
        props.add("pathCallSid");
        props.add("pathAccountSid");
        props.add("credentialListSid");
        props.add("exchangePattern");
        props.add("methodName");
        props.add("pathAddressSid");
        props.add("pathMessageSid");
        props.add("url");
        props.add("pollStrategy");
        props.add("ipAccessControlListSid");
        props.add("to");
        props.add("twiml");
        props.add("username");
        props.add("usageCategory");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "twilio".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
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

