package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.reset;

public class TaskPermissions_getName_4ad76af4d7_Test {

    @Mock
    private TaskPermissions taskPermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(taskPermissions.getName()).thenReturn("TaskName");
    }

    @Test
    public void testGetName_Success() {
        String name = taskPermissions.getName();
        assertEquals("TaskName", name);
        reset(taskPermissions);
    }

    @Test
    public void testGetName_Failure() {
        when(taskPermissions.getName()).thenReturn(null);
        String name = taskPermissions.getName();
        assertEquals(null, name);
        reset(taskPermissions);
    }
}
