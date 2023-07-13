package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BpmnError_getMessage_3d85e9375f_Test {

    private BpmnError bpmnError;
    private final String errorCode = "ERROR_CODE";

    @BeforeEach
    public void setUp() {
        bpmnError = new BpmnError(errorCode);
    }

    @Test
    public void testGetErrorCode_Success() {
        assertEquals(errorCode, bpmnError.getErrorCode(), "The error codes should match");
    }
}
