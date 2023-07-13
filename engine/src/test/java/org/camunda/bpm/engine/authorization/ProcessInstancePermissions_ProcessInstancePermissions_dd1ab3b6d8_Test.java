package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProcessInstancePermissions_ProcessInstancePermissions_dd1ab3b6d8_Test {

    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void setUp() {
        processInstancePermissions = new ProcessInstancePermissions();
    }

    @Test
    public void testProcessInstancePermissions() {
        assertNotNull(processInstancePermissions);
    }
}
