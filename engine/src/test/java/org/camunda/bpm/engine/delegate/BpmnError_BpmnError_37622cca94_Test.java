package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BpmnError_BpmnError_37622cca94_Test {

    @Test
    public void testBpmnError_Success() {
        String errorCode = "Err001";
        BpmnError error = new BpmnError(errorCode);

        assertEquals(errorCode, error.getErrorCode());
    }

    @Test(expected = ProcessEngineException.class)
    public void testBpmnError_Failure() {
        String errorCode = null;
        BpmnError error = new BpmnError(errorCode);
    }

    @Test
    public void testBpmnError_EdgeCase() {
        String errorCode = "";
        BpmnError error = new BpmnError(errorCode);

        assertTrue(error.getErrorCode().isEmpty());
    }
}
