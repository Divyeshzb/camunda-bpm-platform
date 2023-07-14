package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BpmnError_BpmnError_3e1a7fca7b_Test {

    @Mock
    Throwable cause;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBpmnErrorWithValidErrorCode() {
        String errorCode = "error_123";
        BpmnError error = new BpmnError();
        error.setErrorCode(errorCode);
        assertEquals(errorCode, error.getErrorCode());
    }

    @Test
    public void testBpmnErrorWithNullErrorCode() {
        String errorCode = null;
        BpmnError error = new BpmnError();
        assertThrows(ProcessEngineException.class, () -> error.setErrorCode(errorCode));
    }
}
