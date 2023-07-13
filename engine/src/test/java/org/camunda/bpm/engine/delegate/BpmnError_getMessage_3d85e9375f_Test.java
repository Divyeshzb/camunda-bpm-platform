package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BpmnError_getMessage_3d85e9375f_Test {

    private BpmnError bpmnError;

    @Test
    public void testGetMessage_Success() {
        String expectedMessage = "This is a test message";
        bpmnError = new BpmnError();
        bpmnError.setErrorMessage(expectedMessage);

        String actualMessage = bpmnError.getErrorMessage();

        assertEquals(expectedMessage, actualMessage, "Expected and actual messages should be the same");
    }

    @Test
    public void testGetMessage_Null() {
        String expectedMessage = null;
        bpmnError = new BpmnError();
        bpmnError.setErrorMessage(expectedMessage);

        String actualMessage = bpmnError.getErrorMessage();

        assertEquals(expectedMessage, actualMessage, "Expected and actual messages should be the same");
    }
}
