package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CaseIllegalStateTransitionException_CaseIllegalStateTransitionException_f71b8f817d_Test {

    @Mock
    Throwable cause;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testConstructorWithCause() {
        CaseIllegalStateTransitionException exception = new CaseIllegalStateTransitionException();
        exception.initCause(cause);
        Assertions.assertEquals(cause, exception.getCause());
    }

    @Test
    public void testConstructorWithNullCause() {
        CaseIllegalStateTransitionException exception = new CaseIllegalStateTransitionException();
        exception.initCause(null);
        Assertions.assertNull(exception.getCause());
    }
}
