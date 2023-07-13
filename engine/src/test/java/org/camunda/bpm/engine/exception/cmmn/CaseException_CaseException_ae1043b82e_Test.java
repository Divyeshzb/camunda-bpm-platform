package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

// Define CaseException class
class CaseException extends RuntimeException {
    public CaseException(String message) {
        super(message);
    }
}

public class CaseException_CaseException_ae1043b82e_Test {

    @Test
    public void testCaseException_ValidMessage() {
        String message = "Valid Case Exception Message";
        CaseException caseException = new CaseException(message);
        assertEquals(message, caseException.getMessage());
    }

    @Test
    public void testCaseException_NullMessage() {
        String message = null;
        CaseException caseException = new CaseException(message);
        assertEquals(message, caseException.getMessage());
    }

    @Test
    public void testCaseException_ThrowsProcessEngineException() {
        String message = "Process Engine Exception Message";
        assertThrows(CaseException.class, () -> {
            throw new CaseException(message);
        });
    }
}
