package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseException_CaseException_cc887ff75c_Test {

    @Test
    public void testDefaultConstructor() {
        CaseException caseException = new CaseException();
        assertNotNull(caseException);
    }

    @Test
    public void testConstructorExceptionMessage() {
        CaseException caseException = new CaseException();
        assertNull(caseException.getMessage());
    }

    @Test
    public void testConstructorWithCause() {
        CaseException caseException = new CaseException();
        assertNull(caseException.getCause());
    }

    @Test
    public void testConstructorWithNullCause() {
        CaseException caseException = new CaseException();
        assertNull(caseException.getCause());
    }
}
