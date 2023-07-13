package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BpmnError_setMessage_5f8f019051_Test {

    private BpmnError target;

    @BeforeEach
    void setUp() {
        target = new BpmnError("errorCode");
    }

    @Test
    void getErrorCode_ValidErrorMessage_Success() {
        String validErrorCode = "errorCode";
        assertEquals(validErrorCode, target.getErrorCode());
    }

    @Test
    void getErrorCode_EmptyErrorCode_ProcessEngineException() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            new BpmnError("");
        });
        String expectedMessage = "Error Code cannot be empty.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getErrorCode_NullErrorCode_ProcessEngineException() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            new BpmnError(null);
        });
        String expectedMessage = "Error Code cannot be null.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
