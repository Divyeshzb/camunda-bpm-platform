package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BpmnErrorTest {

    @Test
    public void testExceptionMessage_WithNullMessage() {
        String errorCode = "123";
        String message = null;
        BpmnError bpmnError = new BpmnError();
        bpmnError.setErrorCode(errorCode);
        bpmnError.setMessage(message);

        String expectedOutput = "";

        String actualOutput = bpmnError.getMessage();

        assertEquals(expectedOutput, actualOutput, "The output should be an empty string when the message is null");
    }

    @Test
    public void testExceptionMessage_WithNonNullMessage() {
        String errorCode = "123";
        String message = "This is a test message.";
        BpmnError bpmnError = new BpmnError();
        bpmnError.setErrorCode(errorCode);
        bpmnError.setMessage(message);

        String expectedOutput = "This is a test message.";

        String actualOutput = bpmnError.getMessage();

        assertEquals(expectedOutput, actualOutput, "The output should concatenate the message and error code correctly when the message is not null");
    }
}
