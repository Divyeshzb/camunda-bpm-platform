package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemPermissions_getName_4ad76af4d7_Test {

    @Mock
    private SystemPermissions systemPermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName() {
        String expectedName = "SystemPermission";
        when(systemPermissions.getName()).thenReturn(expectedName);

        String actualName = systemPermissions.getName();

        assertEquals(expectedName, actualName, "The expected name does not match the actual name.");
    }

    @Test
    public void testGetName_EmptyString() {
        String expectedName = "";
        when(systemPermissions.getName()).thenReturn(expectedName);

        String actualName = systemPermissions.getName();

        assertEquals(expectedName, actualName, "The expected name does not match the actual name.");
    }
}
