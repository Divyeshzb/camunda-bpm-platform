package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;

public class ProcessInstancePermissions_getName_4ad76af4d7_Test {

    @Mock
    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(processInstancePermissions.getName()).thenReturn("TestName");
    }

    @Test
    public void testGetNameSuccess() {
        String name = processInstancePermissions.getName();
        Assertions.assertEquals("TestName", name, "The name should be 'TestName'");
    }

    @Test
    public void testGetNameFailure() {
        when(processInstancePermissions.getName()).thenReturn(null);
        String name = processInstancePermissions.getName();
        Assertions.assertNull(name, "The name should be null");
    }
}
