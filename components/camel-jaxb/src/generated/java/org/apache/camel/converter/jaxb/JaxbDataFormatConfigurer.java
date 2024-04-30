/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter.jaxb;

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
public class JaxbDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        JaxbDataFormat dataformat = (JaxbDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "contextpath":
        case "contextPath": dataformat.setContextPath(property(camelContext, java.lang.String.class, value)); return true;
        case "contextpathisclassname":
        case "contextPathIsClassName": dataformat.setContextPathIsClassName(property(camelContext, boolean.class, value)); return true;
        case "schema": dataformat.setSchema(property(camelContext, java.lang.String.class, value)); return true;
        case "schemaseveritylevel":
        case "schemaSeverityLevel": dataformat.setSchemaSeverityLevel(property(camelContext, int.class, value)); return true;
        case "schemalocation":
        case "schemaLocation": dataformat.setSchemaLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "nonamespaceschemalocation":
        case "noNamespaceSchemaLocation": dataformat.setNoNamespaceSchemaLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "objectfactory":
        case "objectFactory": dataformat.setObjectFactory(property(camelContext, boolean.class, value)); return true;
        case "ignorejaxbelement":
        case "ignoreJAXBElement": dataformat.setIgnoreJAXBElement(property(camelContext, boolean.class, value)); return true;
        case "mustbejaxbelement":
        case "mustBeJAXBElement": dataformat.setMustBeJAXBElement(property(camelContext, boolean.class, value)); return true;
        case "filternonxmlchars":
        case "filterNonXmlChars": dataformat.setFilterNonXmlChars(property(camelContext, boolean.class, value)); return true;
        case "encoding": dataformat.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "fragment": dataformat.setFragment(property(camelContext, boolean.class, value)); return true;
        case "partnamespace":
        case "partNamespace": dataformat.setPartNamespace(property(camelContext, javax.xml.namespace.QName.class, value)); return true;
        case "partclass":
        case "partClass": dataformat.setPartClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "xmlstreamwriterwrapper":
        case "xmlStreamWriterWrapper": dataformat.setXmlStreamWriterWrapper(property(camelContext, org.apache.camel.converter.jaxb.JaxbXmlStreamWriterWrapper.class, value)); return true;
        case "jaxbproviderproperties":
        case "jaxbProviderProperties": dataformat.setJaxbProviderProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "contenttypeheader":
        case "contentTypeHeader": dataformat.setContentTypeHeader(property(camelContext, boolean.class, value)); return true;
        case "accessexternalschemaprotocols":
        case "accessExternalSchemaProtocols": dataformat.setAccessExternalSchemaProtocols(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

