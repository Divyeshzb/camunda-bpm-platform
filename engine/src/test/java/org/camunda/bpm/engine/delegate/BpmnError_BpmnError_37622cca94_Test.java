package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BpmnError_BpmnError_37622cca94_Test {

    private BpmnError bpmnError;
    private String errorCode;
    private String message;
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        errorCode = "123";
        message = "Test Message";
        cause = new Throwable("Test Throwable");
        
        bpmnError = new BpmnError();
        bpmnError.setErrorCode(errorCode);
        bpmnError.setMessage(message);
        bpmnError.setCause(cause);
    }

    @Test
    public void testBpmnError() {
        assertEquals(errorCode, bpmnError.getErrorCode());
        assertEquals(message, bpmnError.getMessage());
        assertEquals(cause, bpmnError.getCause());
    }

    @Test
    public void testBpmnErrorWithNullErrorCode() {
        String errorCode = null;
        assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError();
            error.setErrorCode(errorCode);
            error.setMessage(message);
            error.setCause(cause);
        });
    }

    @Test
    public void testBpmnErrorWithNullMessage() {
        String message = null;
        assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError();
            error.setErrorCode(errorCode);
            error.setMessage(message);
            error.setCause(cause);
        });
    }

    @Test
    public void testBpmnErrorWithNullCause() {
        Throwable cause = null;
        assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError();
            error.setErrorCode(errorCode);
            error.setMessage(message);
            error.setCause(cause);
        });
    }
}
