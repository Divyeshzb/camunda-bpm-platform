package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ProcessInstancePermissions_ProcessInstancePermissions_dd1ab3b6d8_Test {

    @Mock
    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProcessInstancePermissionsName() {
        String expectedName = "test";
        when(processInstancePermissions.getName()).thenReturn(expectedName);
        assertEquals(expectedName, processInstancePermissions.getName());
    }

    @Test
    public void testProcessInstancePermissionsId() {
        int expectedId = 1;
        when(processInstancePermissions.getId()).thenReturn(expectedId);
        assertEquals(expectedId, processInstancePermissions.getId());
    }
}
