package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BpmnError_BpmnError_3e1a7fca7b_Test {

    private BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        bpmnError = new BpmnError("errorCode", new Throwable("cause"));
    }

    @Test
    public void testBpmnErrorConstructorWithValidErrorCodeAndCause() {
        assertEquals("errorCode", bpmnError.getErrorCode());
        assertEquals("cause", bpmnError.getCause().getMessage());
    }

    @Test
    public void testBpmnErrorConstructorWithNullErrorCode() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            BpmnError error = new BpmnError(null, new Throwable("cause"));
        });
        String expectedMessage = "Error code is null";
        assertTrue(exception.getMessage().contains(expectedMessage));
    }
}
