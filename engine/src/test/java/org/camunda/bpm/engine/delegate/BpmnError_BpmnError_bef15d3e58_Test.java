package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BpmnError_BpmnError_bef15d3e58_Test {
    private BpmnError bpmnError;

    @BeforeEach
    public void setUp() {
        bpmnError = new BpmnError();
        bpmnError.setErrorCode("TestErrorCode");
    }

    @Test
    public void testConstructorWithErrorCode() {
        assertEquals("TestErrorCode", bpmnError.getErrorCode());

        // TODO: Change the error code value and check if the constructor sets it correctly
        BpmnError testBpmnError = new BpmnError();
        testBpmnError.setErrorCode("NewErrorCode");
        assertEquals("NewErrorCode", testBpmnError.getErrorCode());
    }

    @Test
    public void testConstructorWithNullErrorCode() {
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            BpmnError testBpmnError = new BpmnError();
            testBpmnError.setErrorCode(null);
        });

        String expectedMessage = "Error code is null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
