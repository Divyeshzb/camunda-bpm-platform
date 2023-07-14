package org.camunda.bpm.engine.exception.cmmn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_81b8e12c74_Test {

    @Test
    public void testCaseDefinitionNotFoundException() {
        CaseDefinitionNotFoundException exception = new CaseDefinitionNotFoundException("Test CaseDefinitionNotFoundException");
        assertNotNull(exception);
    }

    @Test
    public void testCaseDefinitionNotFoundExceptionWithMessage() {
        CaseDefinitionNotFoundException exception = new CaseDefinitionNotFoundException("Test CaseDefinitionNotFoundException with message");
        assertNotNull(exception);
    }
}
