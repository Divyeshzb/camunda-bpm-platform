package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Permissions_getValue_914b8c6310_Test {

    private Permissions permissions;

    @BeforeEach
    public void setup() {
        permissions = Permissions.NONE; // Assuming Permissions is an Enum with NONE as one of its constants
    }

    @Test
    public void testGetValue_WhenIdIsPositive() {
        permissions = Permissions.CREATE; // Assuming Permissions is an Enum with CREATE as one of its constants
        int expected = 5; // Assuming CREATE has a value of 5
        int actual = permissions.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetValue_WhenIdIsZero() {
        permissions = Permissions.NONE; // Assuming Permissions is an Enum with NONE as one of its constants
        int expected = 0; // Assuming NONE has a value of 0
        int actual = permissions.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetValue_WhenIdIsNegative() {
        permissions = Permissions.DELETE; // Assuming Permissions is an Enum with DELETE as one of its constants
        int expected = -10; // Assuming DELETE has a value of -10
        int actual = permissions.getValue();
        assertEquals(expected, actual);
    }
}
