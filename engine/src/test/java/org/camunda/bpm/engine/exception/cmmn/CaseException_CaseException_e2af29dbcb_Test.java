package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CaseException_CaseException_e2af29dbcb_Test {

    @Mock
    private Throwable cause;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        cause = new Throwable();
    }

    @Test
    public void testCaseExceptionSuccess() {
        String message = "Test message";
        CaseException caseException = new CaseException();
        caseException.setMessage(message);
        caseException.setCause(cause);
        Assert.assertEquals(message, caseException.getMessage());
        Assert.assertEquals(cause, caseException.getCause());
    }

    @Test(expected = ProcessEngineException.class)
    public void testCaseExceptionFailure() {
        String message = null;
        CaseException caseException = new CaseException();
        caseException.setMessage(message);
        caseException.setCause(cause);
    }
}
