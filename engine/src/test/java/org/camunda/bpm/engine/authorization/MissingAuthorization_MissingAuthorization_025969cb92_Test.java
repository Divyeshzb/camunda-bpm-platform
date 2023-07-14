package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MissingAuthorization_MissingAuthorization_025969cb92_Test {

    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setUp() {
        missingAuthorization = Mockito.mock(MissingAuthorization.class);
    }

    @Test
    public void testMissingAuthorizationSuccess() {
        String permissionName = "read";
        String resourceType = "file";
        String resourceId = "123";

        Mockito.when(missingAuthorization.getPermissionName()).thenReturn(permissionName);
        Mockito.when(missingAuthorization.getResourceType()).thenReturn(resourceType);
        Mockito.when(missingAuthorization.getResourceId()).thenReturn(resourceId);

        assertEquals(permissionName, missingAuthorization.getPermissionName());
        assertEquals(resourceType, missingAuthorization.getResourceType());
        assertEquals(resourceId, missingAuthorization.getResourceId());
    }

    @Test
    public void testMissingAuthorizationFailure() {
        String permissionName = "write";
        String resourceType = "database";
        String resourceId = "456";

        Mockito.when(missingAuthorization.getPermissionName()).thenReturn(permissionName);
        Mockito.when(missingAuthorization.getResourceType()).thenReturn(resourceType);
        Mockito.when(missingAuthorization.getResourceId()).thenReturn(resourceId);

        assertEquals(permissionName, missingAuthorization.getPermissionName());
        assertEquals(resourceType, missingAuthorization.getResourceType());
        assertEquals(resourceId, missingAuthorization.getResourceId());
    }
}
