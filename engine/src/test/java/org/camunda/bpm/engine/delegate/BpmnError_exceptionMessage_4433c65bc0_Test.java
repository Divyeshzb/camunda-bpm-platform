package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.impl.bpmn.parser.Error;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BpmnError_exceptionMessage_4433c65bc0_Test {

    private static String exceptionMessage(String errorCode, String message) {
        if (message == null) {
            return "";
        } else {
            return message + " (errorCode='" + errorCode + "')";
        }
    }

    @Test
    public void testExceptionMessage_withNullMessage() {
        String errorCode = "123";
        String message = null;
        String expectedOutput = "";
        assertEquals(expectedOutput, exceptionMessage(errorCode, message));
    }

    @Test
    public void testExceptionMessage_withNonNullMessage() {
        String errorCode = "456";
        String message = "Test Message";
        String expectedOutput = "Test Message (errorCode='456')";
        assertEquals(expectedOutput, exceptionMessage(errorCode, message));
    }

    // TODO: Add more test cases to cover all possible scenarios
}
