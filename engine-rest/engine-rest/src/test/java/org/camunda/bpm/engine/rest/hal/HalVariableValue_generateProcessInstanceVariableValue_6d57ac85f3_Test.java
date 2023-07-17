package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.rest.ProcessInstanceRestService;
import org.camunda.bpm.engine.runtime.VariableInstance;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HalVariableValue_generateProcessInstanceVariableValue_6d57ac85f3_Test {

    @InjectMocks
    private HalVariableValue halVariableValue;

    @Mock
    private VariableInstance variableInstance;

    private String processInstanceId;

    @Before
    public void setUp() {
        halVariableValue = new HalVariableValue();
        processInstanceId = "some-id"; // replace "some-id" with actual process instance id
    }

    @Test
    public void testGenerateProcessInstanceVariableValue_success() {
        HalVariableValue expectedHalVariableValue = HalVariableValue.fromVariableInstance(variableInstance)
            .link(REL_SELF, ProcessInstanceRestService.PATH, processInstanceId, "variables");
        when(halVariableValue.generateProcessInstanceVariableValue(variableInstance, processInstanceId))
            .thenReturn(expectedHalVariableValue);
        HalVariableValue actualHalVariableValue = halVariableValue.generateProcessInstanceVariableValue(variableInstance, processInstanceId);
        assertEquals(expectedHalVariableValue, actualHalVariableValue);
    }

    @Test(expected = RestException.class)
    public void testGenerateProcessInstanceVariableValue_failure() {
        when(halVariableValue.generateProcessInstanceVariableValue(variableInstance, processInstanceId))
            .thenThrow(new RestException("Error generating HalVariableValue"));
        halVariableValue.generateProcessInstanceVariableValue(variableInstance, processInstanceId);
    }
}
