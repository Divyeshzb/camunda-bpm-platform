package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class OptimizePermissions_OptimizePermissions_21c43ad34b_Test {

    @MockBean
    private OptimizePermissions optimizePermissions;

    @BeforeEach
    public void setUp() {
        Mockito.when(optimizePermissions.getName()).thenReturn("TestName");
        Mockito.when(optimizePermissions.getId()).thenReturn(123);
    }

    @Test
    public void testOptimizePermissions() {
        assertEquals("TestName", optimizePermissions.getName());
        assertEquals(123, optimizePermissions.getId());
    }

    @Test
    public void testOptimizePermissionsWithInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            optimizePermissions.setName("");
            optimizePermissions.setId(123);
        });
        assertEquals("Name cannot be empty", exception.getMessage());
    }

    @Test
    public void testOptimizePermissionsWithInvalidId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            optimizePermissions.setName("TestName");
            optimizePermissions.setId(-1);
        });
        assertEquals("Id cannot be negative", exception.getMessage());
    }
}
