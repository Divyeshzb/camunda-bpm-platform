// Test generated by RoostGPT for test camuda-engine-test using AI Type Open AI and AI Model gpt-4

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

public class HalVariableValue_build_f2861601a2_Test {
    
    @Test
    public void testHalRelationSuccess() {
        String scopeResourcePath = "somePath";
        String scopeId = "someId";
        String variablesName = "someVariables";
        String variableName = "someVariable";
        
        HalRelation relation = HalRelation.build("self", VariableResource.class, UriBuilder.fromPath("/{scopeResourcePath}").path("{scopeId}").path("{variablesName}").path("{variableName}"));
        
        assertEquals("self", relation.getRel());
        assertEquals(VariableResource.class, relation.getHalResourceClass());
        assertNotNull(relation.getUriBuilder());
    }
    
    @Test
    public void testHalRelationFailure() {
        String scopeResourcePath = null;
        String scopeId = null;
        String variablesName = null;
        String variableName = null;
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            HalRelation relation = HalRelation.build("self", VariableResource.class, UriBuilder.fromPath("/{scopeResourcePath}").path("{scopeId}").path("{variablesName}").path("{variableName}"));
        });
        
        String expectedMessage = "path parameter is null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
