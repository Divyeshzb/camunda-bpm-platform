package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseIllegalStateTransitionException_CaseIllegalStateTransitionException_9f0c0a4d3a_Test {

    @Test
    public void testCaseIllegalStateTransitionException_withValidMessage() {
        String message = "Valid transition message";
        CaseIllegalStateTransitionException exception = new CaseIllegalStateTransitionException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testCaseIllegalStateTransitionException_withNullMessage() {
        String message = null;
        CaseIllegalStateTransitionException exception = new CaseIllegalStateTransitionException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }
}
