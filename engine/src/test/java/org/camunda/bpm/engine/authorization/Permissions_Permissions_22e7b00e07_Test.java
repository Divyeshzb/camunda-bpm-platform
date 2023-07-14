package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Permissions_Permissions_22e7b00e07_Test {

    @InjectMocks
    private Permissions permissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        permissions = new Permissions();
    }

    @Test
    public void testPermissionsConstructor_ValidInputs() {
        // Assuming the Permissions class has setters for name, id and resourceTypes
        permissions.setName("Test");
        permissions.setId(1);
        permissions.setResourceTypes(EnumSet.of(Resources.RESOURCE1, Resources.RESOURCE2));

        assertEquals("Test", permissions.getName());
        assertEquals(1, permissions.getId());
        assertEquals(EnumSet.of(Resources.RESOURCE1, Resources.RESOURCE2), permissions.getResourceTypes());
    }

    @Test
    public void testPermissionsConstructor_EmptyResourceTypes() {
        // Assuming the Permissions class has setters for name, id and resourceTypes
        permissions.setName("Test");
        permissions.setId(1);
        permissions.setResourceTypes(EnumSet.noneOf(Resources.class));

        assertEquals("Test", permissions.getName());
        assertEquals(1, permissions.getId());
        assertEquals(EnumSet.noneOf(Resources.class), permissions.getResourceTypes());
    }
}
