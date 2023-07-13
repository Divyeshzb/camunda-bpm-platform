package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessInstancePermissions_getName_4ad76af4d7_Test {

    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void setup() {
        processInstancePermissions = Mockito.mock(ProcessInstancePermissions.class);
        Mockito.when(processInstancePermissions.getName()).thenReturn("testName");
    }

    @Test
    public void testGetName_Success() {
        String name = processInstancePermissions.getName();
        assertEquals("testName", name);
    }

    @Test
    public void testGetName_Failure() {
        Mockito.when(processInstancePermissions.getName()).thenReturn(null);
        String name = processInstancePermissions.getName();
        assertEquals(null, name);
    }
}
