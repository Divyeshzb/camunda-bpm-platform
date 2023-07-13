package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.camunda.bpm.engine.authorization.Permissions; // assuming the Permissions class is in this package
import org.camunda.bpm.engine.authorization.Permission; // assuming the Permission class is in this package

public class Permissions_forName_183d8c5ef5_Test {

    @Test
    public void testForName_withValidName() {
        Permission permission = Permissions.forName("READ");
        assertEquals(Permissions.READ, permission);
    }

    @Test
    public void testForName_withInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            Permissions.forName("INVALID");
        });
    }
}
