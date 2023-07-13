package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingAuthorization_MissingAuthorization_025969cb92_Test {

    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setUp() {
        missingAuthorization = Mockito.mock(MissingAuthorization.class);
    }

    @Test
    public void testMissingAuthorization_Success() {
        Mockito.when(missingAuthorization.getPermissionName()).thenReturn("read");
        Mockito.when(missingAuthorization.getResourceType()).thenReturn("document");
        Mockito.when(missingAuthorization.getResourceId()).thenReturn("123");

        assertEquals("read", missingAuthorization.getPermissionName());
        assertEquals("document", missingAuthorization.getResourceType());
        assertEquals("123", missingAuthorization.getResourceId());
    }

    @Test
    public void testMissingAuthorization_Failure() {
        Mockito.when(missingAuthorization.getPermissionName()).thenReturn("write");
        Mockito.when(missingAuthorization.getResourceType()).thenReturn("file");
        Mockito.when(missingAuthorization.getResourceId()).thenReturn("456");

        assertEquals("write", missingAuthorization.getPermissionName());
        assertEquals("file", missingAuthorization.getResourceType());
        assertEquals("456", missingAuthorization.getResourceId());
    }
}
