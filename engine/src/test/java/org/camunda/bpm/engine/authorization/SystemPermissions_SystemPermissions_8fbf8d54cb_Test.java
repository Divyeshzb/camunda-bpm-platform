package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SystemPermissions_SystemPermissions_8fbf8d54cb_Test {

    @Mock
    private SystemPermissions systemPermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(systemPermissions.getName()).thenReturn("Admin");
        when(systemPermissions.getId()).thenReturn(1);
    }

    @Test
    public void testSystemPermissionsName() {
        assertEquals("Admin", systemPermissions.getName());
    }

    @Test
    public void testSystemPermissionsId() {
        assertEquals(1, systemPermissions.getId());
    }
}
