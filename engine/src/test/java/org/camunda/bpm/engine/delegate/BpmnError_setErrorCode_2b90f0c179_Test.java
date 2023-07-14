package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BpmnError_setErrorCode_2b90f0c179_Test {

    private BpmnError bpmnError;

    @BeforeEach
    void setUp() {
        bpmnError = new BpmnError("INITIAL_ERROR_CODE");
    }

    @Test
    void testSetErrorCode_withValidErrorCode() {
        String errorCode = "VALID_ERROR_CODE";
        bpmnError = new BpmnError(errorCode);
        assertEquals(errorCode, bpmnError.getErrorCode());
    }

    @Test
    void testSetErrorCode_withEmptyErrorCode() {
        String errorCode = "";
        ProcessEngineException exception = assertThrows(ProcessEngineException.class, () -> new BpmnError(errorCode));
        String expectedMessage = "Error Code";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testSetErrorCode_withNullErrorCode() {
        String errorCode = null;
        ProcessEngineException exception = assertThrows(ProcessEngineException.class, () -> new BpmnError(errorCode));
        String expectedMessage = "Error Code";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
