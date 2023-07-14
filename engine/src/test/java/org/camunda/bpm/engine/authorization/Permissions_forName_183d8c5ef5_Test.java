package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class Permissions_forName_183d8c5ef5_Test {

    private Permissions permissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        permissions = Permissions.values()[0];
    }

    @Test
    public void testForName_ValidName() {
        // TODO: Replace "READ" with a valid permission name
        String name = "READ"; // replace "READ" with a valid value from your Permissions enum

        Permission permission = Permissions.valueOf(name);

        assertNotNull(permission, "Permission should not be null for valid name");
        assertEquals(name, permission.name(), "Permission name should match with the input");
    }

    @Test
    public void testForName_InvalidName() {
        // TODO: Replace "INVALID_NAME" with an invalid permission name
        String name = "INVALID_NAME"; // replace "INVALID_NAME" with an invalid value from your Permissions enum

        assertThrows(IllegalArgumentException.class, () -> Permissions.valueOf(name), "IllegalArgumentException should be thrown for invalid name");
    }
}
