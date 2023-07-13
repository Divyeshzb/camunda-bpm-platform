package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProcessInstancePermissions_getValue_914b8c6310_Test {

    @Mock
    private ProcessInstancePermissions processInstancePermissions;

    private int id;

    @BeforeEach
    public void setUp() {
        id = 5; // TODO: Change the value to test with different id values
        when(processInstancePermissions.getValue()).thenReturn(id);
    }

    @Test
    public void testGetValue_success() {
        assertEquals(id, processInstancePermissions.getValue(), "Expected and actual values of id should match");
    }

    @Test
    public void testGetValue_failure() {
        int wrongId = 10; // TODO: Change the value to test with different id values
        assertNotEquals(wrongId, processInstancePermissions.getValue(), "Expected and actual values of id should not match");
    }
}
