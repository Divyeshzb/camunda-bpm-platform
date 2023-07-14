package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class OptimizePermissions_getName_4ad76af4d7_Test {

    @Mock
    private OptimizePermissions optimizePermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "John Doe";

        when(optimizePermissions.getName()).thenReturn(expectedName);

        String actualName = optimizePermissions.getName();

        assertEquals(expectedName, actualName, "The expected name does not match the actual name");
    }

    @Test
    public void testGetName_Failure() {
        String unexpectedName = "Jane Doe";

        when(optimizePermissions.getName()).thenReturn("John Doe");

        String actualName = optimizePermissions.getName();

        assertNotEquals(unexpectedName, actualName, "The expected name matches the actual name which is an error case");
    }
}
