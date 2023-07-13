package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingAuthorizationTest {

    private MissingAuthorization instance;

    @Mock
    private Permission permission;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new MissingAuthorization();
    }

    @Test
    public void testGetViolatedPermissionNameSuccess() {
        String expectedPermissionName = "READ";
        when(permission.getName()).thenReturn(expectedPermissionName);
        instance.setPermission(permission);
        String actualPermissionName = instance.getViolatedPermissionName();
        assertEquals(expectedPermissionName, actualPermissionName);
    }

    @Test
    public void testGetViolatedPermissionNameFailure() {
        String expectedPermissionName = null;
        when(permission.getName()).thenReturn(expectedPermissionName);
        instance.setPermission(permission);
        String actualPermissionName = instance.getViolatedPermissionName();
        assertEquals(expectedPermissionName, actualPermissionName);
    }
}
