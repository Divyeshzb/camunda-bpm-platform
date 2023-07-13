package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BpmnError_BpmnError_36cb4dc62a_Test {

    private BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        bpmnError = new BpmnError();
    }

    @Test
    public void testBpmnError_Success() {
        String errorCode = "ERROR_001";
        String message = "Test error message";
        bpmnError.setErrorCode(errorCode);
        bpmnError.setMessage(message);
        assertEquals(errorCode, bpmnError.getErrorCode());
        assertEquals(message, bpmnError.getMessage());
    }

    @Test
    public void testBpmnError_NullErrorCode() {
        String errorCode = null;
        String message = "Test error message";
        ProcessEngineException exception = assertThrows(ProcessEngineException.class, () -> {
            bpmnError.setErrorCode(errorCode);
            bpmnError.setMessage(message);
        });
        assertEquals("Error code cannot be null", exception.getMessage());
    }

    @Test
    public void testBpmnError_NullMessage() {
        String errorCode = "ERROR_001";
        String message = null;
        ProcessEngineException exception = assertThrows(ProcessEngineException.class, () -> {
            bpmnError.setErrorCode(errorCode);
            bpmnError.setMessage(message);
        });
        assertEquals("Message cannot be null", exception.getMessage());
    }
}
