package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseIllegalStateTransitionException_CaseIllegalStateTransitionException_cfceaea76f_Test {

    @Test
    public void testConstructor() {
        CaseIllegalStateTransitionException caseIllegalStateTransitionException = new CaseIllegalStateTransitionException();
        assertNotNull(caseIllegalStateTransitionException);
    }

    @Test
    public void testConstructorWithMessage() {
        String message = "Test Message";
        CaseIllegalStateTransitionException exception = new CaseIllegalStateTransitionException(message);
        assertEquals(message, exception.getMessage());
    }
}
