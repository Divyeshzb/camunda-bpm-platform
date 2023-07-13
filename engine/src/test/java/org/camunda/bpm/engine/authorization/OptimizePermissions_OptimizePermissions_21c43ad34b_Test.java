package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class OptimizePermissions_OptimizePermissions_21c43ad34b_Test {

    private OptimizePermissions optimizePermissions;

    @BeforeEach
    public void setUp() {
        optimizePermissions = Mockito.mock(OptimizePermissions.class);
    }

    @Test
    public void testOptimizePermissions_success() {
        String name = "Test";
        int id = 1;
        when(optimizePermissions.getName()).thenReturn(name);
        when(optimizePermissions.getId()).thenReturn(id);
        assertEquals(name, optimizePermissions.getName());
        assertEquals(id, optimizePermissions.getId());
    }

    @Test
    public void testOptimizePermissions_failure() {
        String name = "Test";
        int id = 1;
        when(optimizePermissions.getName()).thenReturn("Wrong");
        when(optimizePermissions.getId()).thenReturn(0);
        assertNotEquals(name, optimizePermissions.getName());
        assertNotEquals(id, optimizePermissions.getId());
    }
}
