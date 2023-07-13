package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Ensure that this enum exists in your project
enum Permissions {
    CREATE
}

public class Permissions_Permissions_22e7b00e07_Test {

    @Test
    public void testPermissionsConstructorSuccess() {
        Permissions permissions = Permissions.valueOf("CREATE");

        assertEquals("CREATE", permissions.name());
        assertEquals(0, permissions.ordinal());
    }

    @Test
    public void testPermissionsConstructorFailure() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Permissions permissions = Permissions.valueOf("invalid");
        });
        assertEquals("No enum constant org.camunda.bpm.engine.authorization.Permissions.invalid.", exception.getMessage());
    }
}
