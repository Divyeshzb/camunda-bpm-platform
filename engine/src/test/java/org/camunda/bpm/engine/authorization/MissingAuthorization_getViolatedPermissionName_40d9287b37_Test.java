package org.camunda.bpm.engine.authorization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MissingAuthorization_getViolatedPermissionName_40d9287b37_Test {

    @Mock
    private MissingAuthorization missingAuthorization;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetViolatedPermissionNameSuccess() {
        String expectedPermissionName = "READ";
        when(missingAuthorization.getViolatedPermissionName()).thenReturn(expectedPermissionName);

        String actualPermissionName = missingAuthorization.getViolatedPermissionName();

        assertEquals(expectedPermissionName, actualPermissionName);
    }

    @Test
    public void testGetViolatedPermissionNameFailure() {
        String expectedPermissionName = "WRITE";
        when(missingAuthorization.getViolatedPermissionName()).thenReturn("READ");

        String actualPermissionName = missingAuthorization.getViolatedPermissionName();

        assertNotEquals(expectedPermissionName, actualPermissionName);
    }
}
