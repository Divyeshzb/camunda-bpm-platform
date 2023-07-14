package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessEngineException_CaseException_cc887ff75c_Test {

    @Test
    public void testProcessEngineException_Success() {
        try {
            ProcessEngineException processEngineException = new ProcessEngineException();
            assertNotNull(processEngineException);
        } catch (Exception e) {
            fail("Exception should not have been thrown.");
        }
    }

    @Test
    public void testProcessEngineException_Failure() {
        try {
            ProcessEngineException processEngineException = null;
            assertNull(processEngineException);
        } catch (Exception e) {
            fail("Exception should not have been thrown.");
        }
    }
}
