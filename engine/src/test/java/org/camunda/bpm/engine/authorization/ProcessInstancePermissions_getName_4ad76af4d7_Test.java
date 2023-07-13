package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProcessInstancePermissions_getName_4ad76af4d7_Test {

    private ProcessInstancePermissions_getName_4ad76af4d7 processInstance;

    @BeforeEach
    public void setUp() {
        processInstance = new ProcessInstancePermissions_getName_4ad76af4d7();
    }

    @Test
    public void testGetName() {
        String expectedName = "processName";
        processInstance.setName(expectedName);
        String actualName = processInstance.getName();
        assertEquals(expectedName, actualName, "Expected name does not match actual name");
    }

    @Test
    public void testGetNameWhenNameIsNull() {
        String expectedName = null;
        processInstance.setName(expectedName);
        String actualName = processInstance.getName();
        assertEquals(expectedName, actualName, "Expected name does not match actual name");
    }
}
