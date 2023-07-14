package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.model.cmmn.CmmnModelInstance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CmmnModelInstanceNotFoundExceptionTest {

    @Test
    public void testCmmnModelInstanceNotFoundException() {
        CmmnModelInstanceNotFoundException exception = new CmmnModelInstanceNotFoundException();
        assertNotNull(exception);
    }

    @Test
    public void testCmmnModelInstanceNotFoundExceptionWithMessage() {
        String errorMessage = "CmmnModelInstance not found";
        CmmnModelInstanceNotFoundException exception = new CmmnModelInstanceNotFoundException(errorMessage);
        assertNotNull(exception);
        assertEquals(errorMessage, exception.getMessage());
    }
}
