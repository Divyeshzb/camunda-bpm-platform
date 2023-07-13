package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BpmnError_exceptionMessage_4433c65bc0_Test {

    @Test
    public void testExceptionMessage_withErrorCodeAndMessage() {
        String errorCode = "123";
        String message = "Test message";
        String expected = "Test message (errorCode='123')";
        assertEquals(expected, exceptionMessage(errorCode, message));
    }

    @Test
    public void testExceptionMessage_withNullMessage() {
        String errorCode = "123";
        String message = null;
        String expected = "(errorCode='123')";
        assertEquals(expected, exceptionMessage(errorCode, message));
    }

    private static String exceptionMessage(String errorCode, String message) {
        if (message == null) {
            return "(errorCode='" + errorCode + "')";
        } else {
            return message + " (errorCode='" + errorCode + "')";
        }
    } 
}
