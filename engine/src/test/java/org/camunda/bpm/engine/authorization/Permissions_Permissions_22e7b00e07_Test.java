package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Permissions_Permissions_22e7b00e07_Test {

    private Permissions permissions;
    private Resources resourcesMock;

    @BeforeEach
    public void setUp() {
        permissions = new Permissions();
        resourcesMock = Mockito.mock(Resources.class);
    }

    @Test
    public void testPermissionsName() {
        // Assuming Permissions class has a method getName
        assertEquals("Test", permissions.getName());
    }

    @Test
    public void testPermissionsId() {
        // Assuming Permissions class has a method getId
        assertEquals(1, permissions.getId());
    }

    @Test
    public void testPermissionsResourceTypes() {
        Resources[] expectedResourceTypes = new Resources[]{resourcesMock};
        // Assuming Permissions class has a method getResourceTypes
        // Use assertArrayEquals to compare arrays
        assertArrayEquals(expectedResourceTypes, permissions.getResourceTypes());
    }
}
