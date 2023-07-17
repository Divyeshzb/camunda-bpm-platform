package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.rest.*;
import org.camunda.bpm.engine.rest.dto.VariableValueDto;
import org.camunda.bpm.engine.rest.exception.RestException;
import org.camunda.bpm.engine.rest.sub.VariableResource;
import org.camunda.bpm.engine.runtime.VariableInstance;
import javax.ws.rs.core.UriBuilder;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class HalVariableValue_generateCaseInstanceVariableValue_513251f6fd_Test {

    @Test
    public void testGenerateCaseInstanceVariableValue_Success() {
        VariableInstance variableInstance = mock(VariableInstance.class);
        String caseInstanceId = "testId";

        HalVariableValue result = HalVariableValue.generateCaseInstanceVariableValue(variableInstance, caseInstanceId);
        
        assertNotNull(result);
        assertEquals(result.getLinks().get(0).getHref(), UriBuilder.fromPath(CaseInstanceRestService.PATH).build(caseInstanceId, "variables").toString());
    }

    @Test
    public void testGenerateCaseInstanceVariableValue_NullVariableInstance() {
        String caseInstanceId = "testId";

        assertThrows(NullPointerException.class, () -> {
            HalVariableValue.generateCaseInstanceVariableValue(null, caseInstanceId);
        });
    }

    @Test
    public void testGenerateCaseInstanceVariableValue_NullCaseInstanceId() {
        VariableInstance variableInstance = mock(VariableInstance.class);

        assertThrows(NullPointerException.class, () -> {
            HalVariableValue.generateCaseInstanceVariableValue(variableInstance, null);
        });
    }
}
