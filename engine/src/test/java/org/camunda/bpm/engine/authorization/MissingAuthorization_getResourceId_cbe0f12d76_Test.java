package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MissingAuthorization_getResourceId_cbe0f12d76_Test {

    @Mock
    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setup() {
        when(missingAuthorization.getResourceId()).thenReturn(null, "1234");
    }

    @Test
    public void testGetResourceId_WhenResourceIdIsNull() {
        String resourceId = missingAuthorization.getResourceId();
        assertEquals(null, resourceId, "Resource Id should be null");
    }

    @Test
    public void testGetResourceId_WhenResourceIdIsNotNull() {
        String resourceId = missingAuthorization.getResourceId();
        assertEquals("1234", resourceId, "Resource Id should be 1234");
    }
}
