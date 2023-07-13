package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BatchPermissions_forName_183d8c5ef5_Test {

    private BatchPermissions batchPermissions;

    @BeforeEach
    public void setUp() {
        batchPermissions = new BatchPermissions();
    }

    @Test
    public void testForName_Success() {
        String name = "READ";
        Permission result = batchPermissions.forName(name);
        Assertions.assertEquals(Permission.READ, result, "Expected and actual permissions should match");
    }

    @Test
    public void testForName_Failure() {
        String name = "INVALID";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            batchPermissions.forName(name);
        }, "Expected an IllegalArgumentException to be thrown");
    }
}
