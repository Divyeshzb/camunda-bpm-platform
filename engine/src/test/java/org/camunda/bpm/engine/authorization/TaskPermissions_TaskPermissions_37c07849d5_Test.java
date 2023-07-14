package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class TaskPermissions_TaskPermissions_37c07849d5_Test {

    @Mock
    private TaskPermissions taskPermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        when(taskPermissions.getName()).thenReturn("Test Task");
        when(taskPermissions.getId()).thenReturn("1");
    }

    @Test
    public void testTaskPermissionsName() {
        assertEquals("Test Task", taskPermissions.getName());
    }

    @Test
    public void testTaskPermissionsId() {
        assertEquals("1", taskPermissions.getId());
    }
}
