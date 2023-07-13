package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseIllegalStateTransitionException_CaseIllegalStateTransitionException_9f0c0a4d3a_Test {

    private CaseIllegalStateTransitionException caseIllegalStateTransitionException;

    @Test
    public void testConstructor_withValidMessage() {
        String message = "Valid Exception Message";
        caseIllegalStateTransitionException = new CaseIllegalStateTransitionException();
        caseIllegalStateTransitionException.setMessage(message);
        assertEquals(message, caseIllegalStateTransitionException.getMessage());
    }

    @Test
    public void testConstructor_withNullMessage() {
        String message = null;
        caseIllegalStateTransitionException = new CaseIllegalStateTransitionException();
        caseIllegalStateTransitionException.setMessage(message);
        assertNull(caseIllegalStateTransitionException.getMessage());
    }
}
