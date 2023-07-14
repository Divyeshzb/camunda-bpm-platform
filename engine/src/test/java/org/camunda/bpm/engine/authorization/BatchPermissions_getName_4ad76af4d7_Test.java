package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatchPermissions_getName_4ad76af4d7_Test {

    @Test
    public void testGetName_Success() {
        String expectedName = "CREATE";
        BatchPermissions batchPermissions = BatchPermissions.CREATE;
        String actualName = batchPermissions.getName();
        assertEquals(expectedName, actualName);
    }

    // There is no need for a null test case, as enum values cannot be null.
}
