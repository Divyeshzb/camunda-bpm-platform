package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OptimizePermissions_getValue_914b8c6310_Test {

    private OptimizePermissions optimizePermissions;

    @BeforeEach
    public void setup() {
        optimizePermissions = new OptimizePermissions();
    }

    @Test
    public void testGetValueSuccess() {
        int id = 5;
        optimizePermissions.setValue(id); // Assuming there's a setter method in OptimizePermissions class
        int result = optimizePermissions.getValue();
        Assertions.assertEquals(id, result, "The expected value does not match the actual value");
    }

    @Test
    public void testGetValueFailure() {
        int id = 10;
        optimizePermissions.setValue(id); // Assuming there's a setter method in OptimizePermissions class
        int result = optimizePermissions.getValue();
        Assertions.assertNotEquals(5, result, "The expected value should not match the actual value");
    }
}
