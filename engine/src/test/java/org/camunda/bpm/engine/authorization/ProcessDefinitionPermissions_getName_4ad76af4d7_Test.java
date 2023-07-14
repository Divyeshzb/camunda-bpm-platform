package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ProcessDefinitionPermissions_getName_4ad76af4d7_Test {

    private ProcessDefinitionPermissions processDefinitionPermissions;

    @BeforeEach
    public void setup() {
        processDefinitionPermissions = Mockito.mock(ProcessDefinitionPermissions.class);
        Mockito.when(processDefinitionPermissions.getName()).thenReturn("testName");
    }

    @Test
    public void testGetName_Success() {
        Assertions.assertEquals("testName", processDefinitionPermissions.getName());
    }

    @Test
    public void testGetName_Failure() {
        Mockito.when(processDefinitionPermissions.getName()).thenReturn(null);
        Assertions.assertNull(processDefinitionPermissions.getName());
    }
}
