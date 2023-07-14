package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Permissions_getTypes_a8ff202203_Test {

    private Permissions permissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        permissions = new Permissions();
    }

    @Test
    public void testGetTypes() {
        Resource[] expectedResourceTypes = {Resource.USER, Resource.GROUP};
        Resource[] actualResourceTypes = permissions.getTypes();
        assertArrayEquals(expectedResourceTypes, actualResourceTypes);
    }

    @Test
    public void testGetTypesWithEmptyResources() {
        Resource[] expectedResourceTypes = {};
        Resource[] actualResourceTypes = permissions.getTypes();
        assertArrayEquals(expectedResourceTypes, actualResourceTypes);
    }
}
