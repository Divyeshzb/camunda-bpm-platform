package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CmmnModelInstanceNotFoundException_CmmnModelInstanceNotFoundException_78c604f27e_Test {

    private CmmnModelInstanceNotFoundException cmmnModelInstanceNotFoundException;
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        cause = new Throwable("Test Throwable");
        cmmnModelInstanceNotFoundException = new CmmnModelInstanceNotFoundException();
        cmmnModelInstanceNotFoundException.initCause(cause);
    }

    @Test
    public void testCmmnModelInstanceNotFoundException() {
        Throwable actualCause = cmmnModelInstanceNotFoundException.getCause();
        assertEquals(cause, actualCause);
    }

    @Test
    public void testCmmnModelInstanceNotFoundException_Null() {
        Throwable nullCause = new Throwable(null);
        cmmnModelInstanceNotFoundException.initCause(nullCause);
        assertNull(cmmnModelInstanceNotFoundException.getCause().getMessage());
    }
}
