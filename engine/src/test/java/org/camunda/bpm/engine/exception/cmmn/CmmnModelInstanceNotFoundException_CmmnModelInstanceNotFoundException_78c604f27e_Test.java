package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.model.cmmn.CmmnModelInstance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CmmnModelInstanceNotFoundException_CmmnModelInstanceNotFoundException_78c604f27e_Test {

    private CmmnModelInstanceNotFoundException exception;

    @BeforeEach
    public void setUp() {
        exception = new CmmnModelInstanceNotFoundException();
    }

    @Test
    public void testCmmnModelInstanceNotFoundException_withNullCause() {
        assertNull(exception.getCause());
    }

    @Test
    public void testCmmnModelInstanceNotFoundException_withCause() {
        Throwable cause = new RuntimeException("Test Exception");
        exception.initCause(cause);
        assertEquals(cause, exception.getCause());
    }
}
