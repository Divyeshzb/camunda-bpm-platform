package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BpmnError_BpmnError_bef15d3e58_Test {

    private String errorCode;
    private BpmnError error;

    @Before
    public void setUp() {
        errorCode = "Test_Error_Code"; // TODO: Change the value to the actual error code you want to test
        error = new BpmnError();
        error.setErrorCode(errorCode);
    }

    @Test
    public void testBpmnError_Success() {
        assertEquals(errorCode, error.getErrorCode());
    }

    @Test(expected = ProcessEngineException.class)
    public void testBpmnError_NullErrorCode() {
        error.setErrorCode(null);
    }
}
