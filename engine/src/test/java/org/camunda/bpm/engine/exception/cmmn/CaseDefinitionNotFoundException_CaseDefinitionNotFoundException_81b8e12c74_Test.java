package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.camunda.bpm.engine.CaseService;
import org.camunda.bpm.engine.impl.cmmn.entity.runtime.CaseInstanceEntity;

public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_81b8e12c74_Test {

    private CaseService caseService;

    @BeforeEach
    public void setup() {
        caseService = Mockito.mock(CaseService.class);
    }

    @Test
    public void testCaseDefinitionNotFoundException_WhenCaseDefinitionExists() {
        String caseDefinitionId = "test_case_definition_id";
        CaseInstanceEntity caseInstanceEntity = Mockito.mock(CaseInstanceEntity.class);
        Mockito.when(caseService.createCaseInstanceById(caseDefinitionId)).thenReturn(caseInstanceEntity);

        assertDoesNotThrow(() -> caseService.createCaseInstanceById(caseDefinitionId));
    }

    @Test
    public void testCaseDefinitionNotFoundException_WhenCaseDefinitionDoesNotExist() {
        String caseDefinitionId = "non_existent_case_definition_id";
        Mockito.when(caseService.createCaseInstanceById(caseDefinitionId)).thenReturn(null);

        assertThrows(CaseDefinitionNotFoundException.class, () -> caseService.createCaseInstanceById(caseDefinitionId));
    }
}
