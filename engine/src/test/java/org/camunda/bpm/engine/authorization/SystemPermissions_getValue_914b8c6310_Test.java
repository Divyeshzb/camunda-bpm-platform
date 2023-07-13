package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SystemPermissions_getValue_914b8c6310_Test {

    @Mock
    private SystemPermissions systemPermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetValue_Success() {
        int expectedId = 10;
        Mockito.when(systemPermissions.getValue()).thenReturn(expectedId);

        int actualId = systemPermissions.getValue();

        assertEquals(expectedId, actualId, "The returned id should match the expected id");
    }

    @Test
    public void testGetValue_Failure() {
        int unexpectedId = 20;
        Mockito.when(systemPermissions.getValue()).thenReturn(10);

        int actualId = systemPermissions.getValue();

        assertNotEquals(unexpectedId, actualId, "The returned id should not match the unexpected id");
    }
}
