package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

public class Permissions_getTypes_a8ff202203_Test {

    @Mock
    private Permissions permissions;

    private Resource[] resourceTypes;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        resourceTypes = new Resource[3]; // TODO: Replace with actual resources
        when(permissions.getTypes()).thenReturn(resourceTypes);
    }

    @Test
    public void testGetTypesSuccess() {
        Resource[] expected = new Resource[3]; // TODO: Replace with actual resources
        Resource[] actual = permissions.getTypes();
        assertArrayEquals(expected, actual, "Returned resources do not match the expected resources");
    }

    @Test
    public void testGetTypesFailure() {
        Resource[] expected = new Resource[2]; // TODO: Replace with actual resources
        Resource[] actual = permissions.getTypes();
        assertArrayEquals(expected, actual, "Returned resources do not match the expected resources");
    }
}
