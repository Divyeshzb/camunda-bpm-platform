package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptimizePermissions_getName_4ad76af4d7_Test {

    private OptimizePermissions optimizePermissions;

    @BeforeEach
    public void setup() {
        optimizePermissions = Mockito.mock(OptimizePermissions.class);
        Mockito.when(optimizePermissions.getName()).thenReturn("TestName");
    }

    @Test
    public void testGetName_Success() {
        String name = optimizePermissions.getName();
        Assertions.assertEquals("TestName", name);
    }

    @Test
    public void testGetName_Failure() {
        Mockito.when(optimizePermissions.getName()).thenReturn("");
        String name = optimizePermissions.getName();
        Assertions.assertNotEquals("TestName", name);
    }
}
