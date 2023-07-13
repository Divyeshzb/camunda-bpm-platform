package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TaskPermissions_getName_4ad76af4d7_Test {

    private TaskPermissions taskPermissions;

    @BeforeEach
    public void setup() {
        taskPermissions = Mockito.mock(TaskPermissions.class);
        Mockito.when(taskPermissions.getName()).thenReturn("TaskName");
    }

    @Test
    public void testGetName_Success() {
        String name = taskPermissions.getName();
        Assertions.assertEquals("TaskName", name, "Expected and actual name should match");
    }

    @Test
    public void testGetName_Failure() {
        Mockito.when(taskPermissions.getName()).thenReturn(null);
        String name = taskPermissions.getName();
        Assertions.assertNull(name, "Name should be null");
    }
}
