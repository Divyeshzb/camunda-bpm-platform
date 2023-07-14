package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimizePermissions_getValue_914b8c6310_Test {

    private OptimizePermissions optimizePermissions;

    @BeforeEach
    public void setUp() {
        optimizePermissions = new OptimizePermissions();
    }

    @Test
    public void testGetValue_WhenIdIsPositive() {
        int expectedId = 5;
        optimizePermissions.setId(expectedId);

        int actualId = optimizePermissions.getId();

        assertEquals(expectedId, actualId, "The actual id did not match the expected id");
    }

    @Test
    public void testGetValue_WhenIdIsZero() {
        int expectedId = 0;
        optimizePermissions.setId(expectedId);

        int actualId = optimizePermissions.getId();

        assertEquals(expectedId, actualId, "The actual id did not match the expected id");
    }

    @Test
    public void testGetValue_WhenIdIsNegative() {
        int expectedId = -5;
        optimizePermissions.setId(expectedId);

        int actualId = optimizePermissions.getId();

        assertEquals(expectedId, actualId, "The actual id did not match the expected id");
    }
}
