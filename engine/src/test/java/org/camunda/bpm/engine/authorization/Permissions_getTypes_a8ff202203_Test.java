package org.camunda.bpm.engine.authorization;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class Permissions_getTypes_a8ff202203_Test {

    private Permissions permissions;

    @Before
    public void setUp() {
        permissions = new Permissions(); // Make sure Permissions class has a default constructor
    }

    @Test
    public void testGetTypesSuccess() {
        Resource[] expected = {Resource.ONE, Resource.TWO}; // TODO: Change the values as per your use case
        Resource[] actual = permissions.getTypes(); // Make sure getTypes() method exists and returns Resource[]
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetTypesFailure() {
        Resource[] unexpected = {Resource.THREE, Resource.FOUR}; // TODO: Change the values as per your use case
        Resource[] actual = permissions.getTypes(); // Make sure getTypes() method exists and returns Resource[]
        assertNotEquals(unexpected, actual);
    }
}
