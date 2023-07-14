package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BpmnError_BpmnError_36cb4dc62a_Test {

    private BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        bpmnError = new BpmnError();
        bpmnError.setErrorCode("errorCode");
        bpmnError.setMessage("message");
    }

    @Test
    public void testBpmnError_Success() {
        assertEquals("errorCode", bpmnError.getErrorCode());
        assertEquals("message", bpmnError.getMessage());
    }

    @Test
    public void testBpmnError_EmptyErrorCode() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError();
            error.setErrorCode("");
            error.setMessage("message");
        });

        String expectedMessage = "Error code cannot be empty.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testBpmnError_NullErrorCode() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError();
            error.setErrorCode(null);
            error.setMessage("message");
        });

        String expectedMessage = "Error code cannot be null.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testBpmnError_EmptyMessage() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError();
            error.setErrorCode("errorCode");
            error.setMessage("");
        });

        String expectedMessage = "Message cannot be empty.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testBpmnError_NullMessage() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError();
            error.setErrorCode("errorCode");
            error.setMessage(null);
        });

        String expectedMessage = "Message cannot be null.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
