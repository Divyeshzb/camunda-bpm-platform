package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BpmnError_getMessage_3d85e9375f_Test {

    BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        bpmnError = new BpmnError();
    }

    @Test
    public void testGetMessage_Success() {
        String expectedMessage = "Expected Message";
        bpmnError.setErrorCode(expectedMessage);
        String actualMessage = bpmnError.getErrorCode();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetMessage_Null() {
        bpmnError.setErrorCode(null);
        String actualMessage = bpmnError.getErrorCode();
        assertEquals(null, actualMessage);
    }
}
