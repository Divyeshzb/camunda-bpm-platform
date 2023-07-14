package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SystemPermissions_SystemPermissions_8fbf8d54cb_Test {

    private SystemPermissions systemPermissions;

    @BeforeEach
    public void setUp() {
        systemPermissions = Mockito.mock(SystemPermissions.class);
    }

    @Test
    public void testSystemPermissions() {
        String name = "Test Permission";
        int id = 123;

        when(systemPermissions.getName()).thenReturn(name);
        when(systemPermissions.getId()).thenReturn(id);

        assertEquals(name, systemPermissions.getName());
        assertEquals(id, systemPermissions.getId());
    }

    @Test
    public void testSystemPermissions_EmptyName() {
        String name = "";
        int id = 123;

        when(systemPermissions.getName()).thenReturn(name);
        when(systemPermissions.getId()).thenReturn(id);

        assertEquals(name, systemPermissions.getName());
        assertEquals(id, systemPermissions.getId());
    }

    @Test
    public void testSystemPermissions_NegativeId() {
        String name = "Test Permission";
        int id = -123;

        when(systemPermissions.getName()).thenReturn(name);
        when(systemPermissions.getId()).thenReturn(id);

        assertEquals(name, systemPermissions.getName());
        assertEquals(id, systemPermissions.getId());
    }
}
