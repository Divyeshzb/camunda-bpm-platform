package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TaskPermissions_TaskPermissions_37c07849d5_Test {

    @Mock
    private TaskPermissions mockTaskPermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTaskPermissionsName() {
        when(mockTaskPermissions.getName()).thenReturn("Test");
        assertEquals("Test", mockTaskPermissions.getName());
    }

    @Test
    public void testTaskPermissionsId() {
        when(mockTaskPermissions.getId()).thenReturn("1");
        assertEquals("1", mockTaskPermissions.getId());
    }
}
