package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CaseExecutionNotFoundException_CaseExecutionNotFoundException_2d25a00e15_Test {

    @Test
    public void testCaseExecutionNotFoundExceptionWithNullCause() {
        try {
            throw new CaseExecutionNotFoundException();
        } catch (CaseExecutionNotFoundException ex) {
            assertNull(ex.getCause());
        }
    }

    @Test
    public void testCaseExecutionNotFoundExceptionWithNonNullCause() {
        Throwable cause = new RuntimeException("Test exception");
        try {
            throw new CaseExecutionNotFoundException(cause);
        } catch (CaseExecutionNotFoundException ex) {
            assertEquals(cause, ex.getCause());
            assertTrue(ex.getCause().getMessage().contains("Test exception"));
        }
    }
}
