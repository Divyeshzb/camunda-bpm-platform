package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BpmnError_getErrorCode_043a99c432_Test {

    private BpmnError bpmnError;
    private String errorCode;

    @BeforeEach
    public void setup() {
        errorCode = "123";
        bpmnError = new BpmnError(errorCode);
    }

    @Test
    public void testGetErrorCode_Success() {
        String expected = errorCode;
        String actual = bpmnError.getErrorCode();
        assertEquals(expected, actual, "Expected and actual error codes do not match");
    }

    @Test
    public void testGetErrorCode_Failure() {
        errorCode = null;
        bpmnError = new BpmnError(errorCode);
        String actual = bpmnError.getErrorCode();
        String expected = errorCode;
        assertEquals(expected, actual, "Expected and actual error codes do not match");
    }
}
