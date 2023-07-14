package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingAuthorization_toString_2393b88875_Test {

    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setUp() {
        missingAuthorization = new MissingAuthorization();
    }

    @Test
    public void testToString_WithValidInputs() {
        missingAuthorization.setPermissionName("READ");
        missingAuthorization.setResourceType("RESOURCE");
        missingAuthorization.setResourceId("123");

        String result = missingAuthorization.toString();

        String expected = "MissingAuthorization[permissionName=READ, resourceType=RESOURCE, resourceId=123]";
        assertEquals(expected, result);
    }

    @Test
    public void testToString_WithNullInputs() {
        missingAuthorization.setPermissionName(null);
        missingAuthorization.setResourceType(null);
        missingAuthorization.setResourceId(null);

        String result = missingAuthorization.toString();

        String expected = "MissingAuthorization[permissionName=null, resourceType=null, resourceId=null]";
        assertEquals(expected, result);
    }
}
