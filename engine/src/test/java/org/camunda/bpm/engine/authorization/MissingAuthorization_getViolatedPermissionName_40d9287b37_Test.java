package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

public class MissingAuthorization_getViolatedPermissionName_40d9287b37_Test {

    @Mock
    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        Mockito.when(missingAuthorization.getViolatedPermissionName()).thenReturn("read");
    }

    @Test
    public void testGetViolatedPermissionName_Success() {
        String permissionName = missingAuthorization.getViolatedPermissionName();
        assertEquals("read", permissionName);
    }

    @Test
    public void testGetViolatedPermissionName_Failure() {
        Mockito.when(missingAuthorization.getViolatedPermissionName()).thenReturn("write");
        String permissionName = missingAuthorization.getViolatedPermissionName();
        assertEquals("write", permissionName);
    }
}
