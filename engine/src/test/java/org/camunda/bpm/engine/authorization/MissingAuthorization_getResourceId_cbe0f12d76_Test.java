package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MissingAuthorization_getResourceId_cbe0f12d76_Test {

    @Mock
    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetResourceId_Success() {
        String expectedResourceId = "123";
        when(missingAuthorization.getResourceId()).thenReturn(expectedResourceId);
        String actualResourceId = missingAuthorization.getResourceId();
        assertEquals(expectedResourceId, actualResourceId);
    }

    @Test
    public void testGetResourceId_Null() {
        when(missingAuthorization.getResourceId()).thenReturn(null);
        String actualResourceId = missingAuthorization.getResourceId();
        assertEquals(null, actualResourceId);
    }
}
