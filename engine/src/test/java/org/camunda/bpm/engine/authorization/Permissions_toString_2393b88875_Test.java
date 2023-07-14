package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Permissions_toString_2393b88875_Test {

    private Permissions permissions;

    @BeforeEach
    public void setup() {
        // Assuming that Permissions has a static method to get an instance
        permissions = Permissions.getInstance();
    }

    @Test
    public void testToString() {
        String actualName = permissions.toString();
        assertTrue(actualName.contains("Permissions"), "The toString method does not return the expected string.");
    }
}
