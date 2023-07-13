package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SystemPermissions_getName_4ad76af4d7_Test {

    private SystemPermissions systemPermissions;

    @BeforeEach
    public void setup() {
        systemPermissions = mock(SystemPermissions.class); // create a mock of SystemPermissions
    }

    @Test
    public void testGetName_WhenNameIsSet() {
        String expectedName = "Test Name";
        when(systemPermissions.getResourceName()).thenReturn(expectedName); // define the behavior of the mock

        String actualName = systemPermissions.getResourceName();

        assertEquals(expectedName, actualName, "The name returned by getName() should match the set name.");
    }

    @Test
    public void testGetName_WhenNameIsNotSet() {
        String expectedName = null;
        when(systemPermissions.getResourceName()).thenReturn(null); // define the behavior of the mock

        String actualName = systemPermissions.getResourceName();

        assertEquals(expectedName, actualName, "The name returned by getName() should be null when it is not set.");
    }
}
