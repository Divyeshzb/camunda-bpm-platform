package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingAuthorization_getResourceId_cbe0f12d76_Test {

    @Mock
    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetResourceId_Success() {
        String expectedResourceId = "resource_123";
        Mockito.when(missingAuthorization.getResourceId()).thenReturn(expectedResourceId);
        String actualResourceId = missingAuthorization.getResourceId();
        assertEquals(expectedResourceId, actualResourceId);
    }

    @Test
    public void testGetResourceId_Null() {
        Mockito.when(missingAuthorization.getResourceId()).thenReturn(null);
        String actualResourceId = missingAuthorization.getResourceId();
        assertEquals(null, actualResourceId);
    }
}
