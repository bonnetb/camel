/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.drive.Drive.Drives;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.drive.Drive$Drives
 */
public enum DriveDrivesApiMethod implements ApiMethod {

    CREATE(
        com.google.api.services.drive.Drive.Drives.Create.class,
        "create",
        arg("requestId", String.class),
        arg("content", com.google.api.services.drive.model.Drive.class)),

    DELETE(
        com.google.api.services.drive.Drive.Drives.Delete.class,
        "delete",
        arg("driveId", String.class)),

    GET(
        com.google.api.services.drive.Drive.Drives.Get.class,
        "get",
        arg("driveId", String.class)),

    HIDE(
        com.google.api.services.drive.Drive.Drives.Hide.class,
        "hide",
        arg("driveId", String.class)),

    LIST(
        com.google.api.services.drive.Drive.Drives.List.class,
        "list"),

    UNHIDE(
        com.google.api.services.drive.Drive.Drives.Unhide.class,
        "unhide",
        arg("driveId", String.class)),

    UPDATE(
        com.google.api.services.drive.Drive.Drives.Update.class,
        "update",
        arg("driveId", String.class),
        arg("content", com.google.api.services.drive.model.Drive.class));

    private final ApiMethod apiMethod;

    private DriveDrivesApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Drives.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
