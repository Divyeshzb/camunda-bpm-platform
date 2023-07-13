package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MissingAuthorization_getResourceType_eb565ce35e_Test {

    @Mock
    MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetResourceTypeSuccess() {
        String expectedResourceType = "ResourceType1";
        when(missingAuthorization.getResourceType()).thenReturn(expectedResourceType);
        String actualResourceType = missingAuthorization.getResourceType();
        assertEquals(expectedResourceType, actualResourceType);
    }

    @Test
    public void testGetResourceTypeFailure() {
        String expectedResourceType = "ResourceType3";
        when(missingAuthorization.getResourceType()).thenReturn(expectedResourceType);
        String actualResourceType = missingAuthorization.getResourceType();
        assertEquals(expectedResourceType, actualResourceType);
    }
}
