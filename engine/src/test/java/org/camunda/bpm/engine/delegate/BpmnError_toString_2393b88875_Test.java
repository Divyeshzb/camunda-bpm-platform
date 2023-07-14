package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class BpmnError_toString_2393b88875_Test {

    private BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        bpmnError = new BpmnError("123"); // using parameterized constructor instead of mocking.
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testToString_WithValidErrorCode() {
        String errorCode = "123";
        bpmnError.setErrorCode(errorCode); // setting the error code directly instead of mocking.

        String actualOutput = bpmnError.toString();
        String expectedOutput = "BpmnError (errorCode='" + errorCode + "')";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testToString_WithEmptyErrorCode() {
        String errorCode = "";
        bpmnError.setErrorCode(errorCode); // setting the error code directly instead of mocking.

        String actualOutput = bpmnError.toString();
        String expectedOutput = "BpmnError (errorCode='" + errorCode + "')";

        assertEquals(expectedOutput, actualOutput);
    }
}
