package org.camunda.bpm.engine.exception.cmmn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
public class CmmnModelInstanceNotFoundException_CmmnModelInstanceNotFoundException_7b74c22d55_Test {

    @Test
    public void testCmmnModelInstanceNotFoundException() {
        CmmnModelInstanceNotFoundException exception = new CmmnModelInstanceNotFoundException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }
}
