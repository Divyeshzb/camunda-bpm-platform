package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class OptimizePermissions_getName_4ad76af4d7_Test {

    @InjectMocks
    private OptimizePermissions optimizePermissions;

    @Mock
    private OptimizePermissions mockOptimizePermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "John Doe";
        Mockito.when(mockOptimizePermissions.getName()).thenReturn(expectedName);
        String actualName = optimizePermissions.getName();
        Assertions.assertEquals(expectedName, actualName, "The names should match");
    }

    @Test
    public void testGetName_Empty() {
        String expectedName = "";
        Mockito.when(mockOptimizePermissions.getName()).thenReturn(expectedName);
        String actualName = optimizePermissions.getName();
        Assertions.assertEquals(expectedName, actualName, "The names should match even when empty");
    }

    @Test
    public void testGetName_Null() {
        Mockito.when(mockOptimizePermissions.getName()).thenReturn(null);
        String actualName = optimizePermissions.getName();
        Assertions.assertNull(actualName, "The name should be null");
    }
}
