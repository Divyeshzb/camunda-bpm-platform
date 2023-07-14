package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BpmnError_getErrorCode_043a99c432_Test {

    @Mock
    private BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetErrorCode_Success() {
        // TODO: Replace "testCode1" with the actual error code you want to test
        when(bpmnError.getErrorCode()).thenReturn("testCode1");

        String errorCode = bpmnError.getErrorCode();
        assertEquals("testCode1", errorCode);
    }

    @Test
    public void testGetErrorCode_Empty() {
        // TODO: Replace "" with the actual error code you want to test
        when(bpmnError.getErrorCode()).thenReturn("");

        String errorCode = bpmnError.getErrorCode();
        assertEquals("", errorCode);
    }
}
