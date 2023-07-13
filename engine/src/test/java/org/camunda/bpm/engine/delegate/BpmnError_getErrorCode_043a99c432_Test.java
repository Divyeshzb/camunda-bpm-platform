package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class BpmnError_getErrorCode_043a99c432_Test {

    @Mock
    private BpmnError error;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetErrorCode_Success() {
        String expectedErrorCode = "12345";
        when(error.getErrorCode()).thenReturn(expectedErrorCode);

        String actualErrorCode = error.getErrorCode();
        assertEquals(expectedErrorCode, actualErrorCode);
    }

    @Test
    public void testGetErrorCode_Failure() {
        String expectedErrorCode = "12345";
        when(error.getErrorCode()).thenReturn("54321");

        String actualErrorCode = error.getErrorCode();
        assertNotEquals(expectedErrorCode, actualErrorCode, "Error code does not match the expected value");
    }
}
