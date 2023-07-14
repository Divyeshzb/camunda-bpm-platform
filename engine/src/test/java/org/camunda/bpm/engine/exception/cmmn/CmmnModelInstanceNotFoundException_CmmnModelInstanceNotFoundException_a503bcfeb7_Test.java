package org.camunda.bpm.engine.exception.cmmn;

import org.junit.Test;
import static org.junit.Assert.*;

public class CmmnModelInstanceNotFoundExceptionTest {

    @Test
    public void testExceptionMessage() {
        CmmnModelInstanceNotFoundException exception = new CmmnModelInstanceNotFoundException();
        
        assertNotNull(exception);
    }
}
