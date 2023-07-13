package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BpmnError_toString_2393b88875_Test {

    @Test
    public void testToString_withErrorCode() {
        BpmnError testError = new BpmnError("404");
        String expectedOutput = "BpmnError (errorCode='404')";
        assertEquals(expectedOutput, testError.toString());
    }

    @Test
    public void testToString_withoutErrorCode() {
        BpmnError testError = new BpmnError(null);
        String expectedOutput = "BpmnError (errorCode='null')";
        assertEquals(expectedOutput, testError.toString());
    }

    @Test
    public void testToString_withEmptyErrorCode() {
        BpmnError testError = new BpmnError("");
        String expectedOutput = "BpmnError (errorCode='')";
        assertEquals(expectedOutput, testError.toString());
    }
}
