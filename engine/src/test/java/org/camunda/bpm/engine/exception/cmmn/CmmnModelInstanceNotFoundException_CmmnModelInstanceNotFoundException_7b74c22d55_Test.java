package org.camunda.bpm.engine.exception.cmmn;

import org.junit.Test;
import static org.junit.Assert.*;

public class CmmnModelInstanceNotFoundExceptionTest {

    @Test
    public void testExceptionMessage() {
        String message = "Custom error message";
        CmmnModelInstanceNotFoundException exception = new CmmnModelInstanceNotFoundException(message);
        assertEquals("Exception message must be the same as the one passed in the constructor", message, exception.getMessage());
    }
}
