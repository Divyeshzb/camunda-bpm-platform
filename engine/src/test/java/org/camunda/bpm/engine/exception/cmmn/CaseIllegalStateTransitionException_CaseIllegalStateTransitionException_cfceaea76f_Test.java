package org.camunda.bpm.engine.exception.cmmn;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaseIllegalStateTransitionExceptionTest {

    @Test
    public void testException() {
        try {
            throw new CaseIllegalStateTransitionException();
        } catch (CaseIllegalStateTransitionException e) {
            assertNotNull(e);
        }
    }
}
