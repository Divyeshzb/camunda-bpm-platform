package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class Permissions_getValue_914b8c6310_Test {

    @Test
    public void testGetValueSuccess() {
        Permissions permissions = Permissions.READ; // Assuming READ is a valid enum constant
        String actual = permissions.name();
        String expected = "READ";
        assertEquals(expected, actual, "The expected value should be READ");
    }

    @Test
    public void testGetValueFailure() {
        Permissions permissions = Permissions.WRITE; // Assuming WRITE is a valid enum constant
        String actual = permissions.name();
        String expected = "READ";
        assertNotEquals(expected, actual, "The expected value should not be READ");
    }
}
