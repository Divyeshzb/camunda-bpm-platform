package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessDefinitionPermissions_getName_4ad76af4d7_Test {

    ProcessDefinitionPermissions processDefinitionPermissions;

    @BeforeEach
    public void setUp() {
        processDefinitionPermissions = new ProcessDefinitionPermissions();
    }

    @Test
    public void testGetName() {
        String expectedName = "testName";
        processDefinitionPermissions.setName(expectedName);
        String actualName = processDefinitionPermissions.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetName_Empty() {
        String expectedName = "";
        processDefinitionPermissions.setName(expectedName);
        String actualName = processDefinitionPermissions.getName();
        assertEquals(expectedName, actualName);
    }
}
