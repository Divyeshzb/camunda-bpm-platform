package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BpmnError_setMessage_5f8f019051_Test {

    @Test
    void testSetMessage_Success() {
        String errorCode = "Error occurred while processing the request.";
        BpmnError bpmnError = new BpmnError(errorCode);
        assertEquals(errorCode, bpmnError.getErrorCode());
    }

    @Test
    void testSetMessage_EmptyString() {
        String errorCode = "";
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            new BpmnError(errorCode);
        });

        String expectedMessage = "Error Message";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testSetMessage_NullValue() {
        String errorCode = null;
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            new BpmnError(errorCode);
        });

        String expectedMessage = "Error Message";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
