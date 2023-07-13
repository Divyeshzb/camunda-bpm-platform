package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BpmnError_BpmnError_36cb4dc62a_Test {
    private BpmnError bpmnError;

    @BeforeEach
    public void setUp() {
        bpmnError = new BpmnError();
        bpmnError.setErrorCode("errorCode");
        bpmnError.setMessage("message");
    }

    @Test
    public void testBpmnErrorSuccess() {
        assertEquals("errorCode", bpmnError.getErrorCode());
        assertEquals("message", bpmnError.getMessage());
    }

    @Test
    public void testBpmnErrorFailure() {
        assertThrows(ProcessEngineException.class, () -> {
            bpmnError.setErrorCode(null);
        });
        assertThrows(ProcessEngineException.class, () -> {
            bpmnError.setMessage(null);
        });
    }
}
