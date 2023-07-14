package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
public class Permissions_Permissions_b727422956_Test {

    private Permissions permissions;

    @Mock
    private ExternalService externalService;

    @BeforeEach
    public void setUp() {
        permissions = new Permissions();
    }

    @Test
    public void testName() {
        // Assuming Permissions class has a getName() method
        assertEquals("Test", permissions.getName(), "The name should be 'Test'");
    }

    @Test
    public void testId() {
        // Assuming Permissions class has a getId() method
        assertEquals(1, permissions.getId(), "The id should be 1");
    }

    @Test
    public void testInvalidName() {
        // Assuming Permissions class has a setName() method
        permissions.setName("Invalid");
        assertNotEquals("Test", permissions.getName(), "The name should not be 'Test'");
    }

    @Test
    public void testInvalidId() {
        // Assuming Permissions class has a setId() method
        permissions.setId(2);
        assertNotEquals(1, permissions.getId(), "The id should not be 1");
    }
}
