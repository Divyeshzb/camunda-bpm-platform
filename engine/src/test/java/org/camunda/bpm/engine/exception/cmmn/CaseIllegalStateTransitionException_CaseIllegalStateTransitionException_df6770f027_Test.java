package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CaseIllegalStateTransitionException_CaseIllegalStateTransitionException_df6770f027_Test {

    private CaseIllegalStateTransitionException caseIllegalStateTransitionException;

    @BeforeEach
    public void setUp() {
        caseIllegalStateTransitionException = new CaseIllegalStateTransitionException();
    }

    @Test
    public void testExceptionNotNull() {
        assertNotNull(caseIllegalStateTransitionException);
    }
}
