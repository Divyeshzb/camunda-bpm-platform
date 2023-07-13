package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BpmnError_setErrorCode_2b90f0c179_Test {

    private BpmnError bpmnError;

    @Before
    public void setUp() {
        bpmnError = new BpmnError();
    }

    @Test
    public void testSetErrorCode_Success() {
        String errorCode = "456";
        bpmnError.setErrorCode(errorCode);
        assertEquals(errorCode, bpmnError.getErrorCode());
    }

    @Test(expected = ProcessEngineException.class)
    public void testSetErrorCode_ErrorCodeEmpty() {
        String errorCode = "";
        bpmnError.setErrorCode(errorCode);
    }

    @Test(expected = ProcessEngineException.class)
    public void testSetErrorCode_ErrorCodeNull() {
        String errorCode = null;
        bpmnError.setErrorCode(errorCode);
    }
}
