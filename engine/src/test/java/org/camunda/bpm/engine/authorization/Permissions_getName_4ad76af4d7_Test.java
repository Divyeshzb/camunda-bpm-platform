package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Permissions_getName_4ad76af4d7_Test {

    private Permissions permissions;

    @BeforeEach
    public void setUp() {
        permissions = Permissions.READ; // assuming READ is an enum constant in Permissions
    }

    @Test
    public void testGetName_WhenNameIsSet() {
        String expectedName = "READ";
        String actualName = permissions.name();
        assertEquals(expectedName, actualName);
    }
}
