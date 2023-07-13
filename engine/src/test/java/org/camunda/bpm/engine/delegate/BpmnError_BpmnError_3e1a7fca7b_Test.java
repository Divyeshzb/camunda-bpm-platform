package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class BpmnError_BpmnError_3e1a7fca7b_Test {

    private String errorCode;
    private Throwable cause;
    private BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        errorCode = "Test_Error_Code";
        cause = Mockito.mock(Throwable.class);
        bpmnError = new BpmnError(errorCode, cause);
    }

    @Test
    public void testBpmnError_Success() {
        assertEquals(errorCode, bpmnError.getErrorCode());
        assertEquals(cause, bpmnError.getCause());
    }

    @Test
    public void testBpmnError_NullErrorCode() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> new BpmnError(null, cause));
        String expectedMessage = "Error code is mandatory";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testBpmnError_NullCause() {
        BpmnError bpmnError = new BpmnError(errorCode, null);
        assertEquals(errorCode, bpmnError.getErrorCode());
        assertNull(bpmnError.getCause());
    }
}
