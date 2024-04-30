/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cbor;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.PackageDataFormatMojo")
@SuppressWarnings("unchecked")
public class CBORDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        CBORDataFormat dataformat = (CBORDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "objectmapper":
        case "objectMapper": dataformat.setObjectMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
        case "unmarshaltype":
        case "unmarshalType": dataformat.setUnmarshalType(property(camelContext, java.lang.Class.class, value)); return true;
        case "usedefaultobjectmapper":
        case "useDefaultObjectMapper": dataformat.setUseDefaultObjectMapper(property(camelContext, boolean.class, value)); return true;
        case "allowunmarshalltype":
        case "allowUnmarshallType": dataformat.setAllowUnmarshallType(property(camelContext, boolean.class, value)); return true;
        case "collectiontype":
        case "collectionType": dataformat.setCollectionType(property(camelContext, java.lang.Class.class, value)); return true;
        case "uselist":
        case "useList": dataformat.setUseList(property(camelContext, boolean.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "allowjmstype":
        case "allowJmsType": dataformat.setAllowJmsType(property(camelContext, boolean.class, value)); return true;
        case "enablefeatures":
        case "enableFeatures": dataformat.setEnableFeatures(property(camelContext, java.lang.String.class, value)); return true;
        case "disablefeatures":
        case "disableFeatures": dataformat.setDisableFeatures(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

