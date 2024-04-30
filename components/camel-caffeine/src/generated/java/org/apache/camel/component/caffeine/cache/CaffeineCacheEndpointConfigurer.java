/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.caffeine.cache;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class CaffeineCacheEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CaffeineCacheEndpoint target = (CaffeineCacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "cacheloader":
        case "cacheLoader": target.getConfiguration().setCacheLoader(property(camelContext, com.github.benmanes.caffeine.cache.CacheLoader.class, value)); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": target.getConfiguration().setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "evictiontype":
        case "evictionType": target.getConfiguration().setEvictionType(property(camelContext, org.apache.camel.component.caffeine.EvictionType.class, value)); return true;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": target.getConfiguration().setExpireAfterAccessTime(property(camelContext, int.class, value)); return true;
        case "expireafterwritetime":
        case "expireAfterWriteTime": target.getConfiguration().setExpireAfterWriteTime(property(camelContext, int.class, value)); return true;
        case "initialcapacity":
        case "initialCapacity": target.getConfiguration().setInitialCapacity(property(camelContext, java.lang.Integer.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maximumsize":
        case "maximumSize": target.getConfiguration().setMaximumSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "removallistener":
        case "removalListener": target.getConfiguration().setRemovalListener(property(camelContext, com.github.benmanes.caffeine.cache.RemovalListener.class, value)); return true;
        case "statscounter":
        case "statsCounter": target.getConfiguration().setStatsCounter(property(camelContext, com.github.benmanes.caffeine.cache.stats.StatsCounter.class, value)); return true;
        case "statsenabled":
        case "statsEnabled": target.getConfiguration().setStatsEnabled(property(camelContext, boolean.class, value)); return true;
        case "valuetype":
        case "valueType": target.getConfiguration().setValueType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return java.lang.String.class;
        case "cacheloader":
        case "cacheLoader": return com.github.benmanes.caffeine.cache.CacheLoader.class;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": return boolean.class;
        case "evictiontype":
        case "evictionType": return org.apache.camel.component.caffeine.EvictionType.class;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": return int.class;
        case "expireafterwritetime":
        case "expireAfterWriteTime": return int.class;
        case "initialcapacity":
        case "initialCapacity": return java.lang.Integer.class;
        case "key": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maximumsize":
        case "maximumSize": return java.lang.Integer.class;
        case "removallistener":
        case "removalListener": return com.github.benmanes.caffeine.cache.RemovalListener.class;
        case "statscounter":
        case "statsCounter": return com.github.benmanes.caffeine.cache.stats.StatsCounter.class;
        case "statsenabled":
        case "statsEnabled": return boolean.class;
        case "valuetype":
        case "valueType": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CaffeineCacheEndpoint target = (CaffeineCacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return target.getConfiguration().getAction();
        case "cacheloader":
        case "cacheLoader": return target.getConfiguration().getCacheLoader();
        case "createcacheifnotexist":
        case "createCacheIfNotExist": return target.getConfiguration().isCreateCacheIfNotExist();
        case "evictiontype":
        case "evictionType": return target.getConfiguration().getEvictionType();
        case "expireafteraccesstime":
        case "expireAfterAccessTime": return target.getConfiguration().getExpireAfterAccessTime();
        case "expireafterwritetime":
        case "expireAfterWriteTime": return target.getConfiguration().getExpireAfterWriteTime();
        case "initialcapacity":
        case "initialCapacity": return target.getConfiguration().getInitialCapacity();
        case "key": return target.getConfiguration().getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maximumsize":
        case "maximumSize": return target.getConfiguration().getMaximumSize();
        case "removallistener":
        case "removalListener": return target.getConfiguration().getRemovalListener();
        case "statscounter":
        case "statsCounter": return target.getConfiguration().getStatsCounter();
        case "statsenabled":
        case "statsEnabled": return target.getConfiguration().isStatsEnabled();
        case "valuetype":
        case "valueType": return target.getConfiguration().getValueType();
        default: return null;
        }
    }
}

