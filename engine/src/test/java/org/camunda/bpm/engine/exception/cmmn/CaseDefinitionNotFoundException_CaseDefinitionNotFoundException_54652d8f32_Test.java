package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.camunda.bpm.engine.CaseService;
import org.camunda.bpm.engine.exception.cmmn.CaseDefinitionNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_54652d8f32_Test {

    @MockBean
    private CaseService caseService;

    @BeforeEach
    public void setUp() {
        CaseDefinitionNotFoundException exception = new CaseDefinitionNotFoundException("Case Definition Not Found");
        when(caseService.createCaseInstanceQuery().caseDefinitionKey(anyString()).singleResult())
                .thenThrow(exception);
    }

    @Test
    public void testCaseDefinitionNotFoundException_WithValidCaseDefinitionKey() {
        try {
            caseService.createCaseInstanceQuery().caseDefinitionKey("validCaseDefinitionKey").singleResult();
        } catch (CaseDefinitionNotFoundException e) {
            assertEquals("Case Definition Not Found", e.getMessage());
        }
    }

    @Test
    public void testCaseDefinitionNotFoundException_WithInvalidCaseDefinitionKey() {
        try {
            caseService.createCaseInstanceQuery().caseDefinitionKey("invalidCaseDefinitionKey").singleResult();
        } catch (CaseDefinitionNotFoundException e) {
            assertEquals("Case Definition Not Found", e.getMessage());
        }
    }
}
