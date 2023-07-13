package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatchPermissions_getName_4ad76af4d7_Test {

    @Test
    public void testGetName() {
        BatchPermissions batchPermissions = BatchPermissions.CREATE;
        String name = batchPermissions.name();
        assertEquals("CREATE", name);
    }

    @Test
    public void testGetNameWithEmptyString() {
        BatchPermissions batchPermissions = BatchPermissions.CREATE;
        batchPermissions = null;
        String name = (batchPermissions == null) ? "" : batchPermissions.name();
        assertEquals("", name);
    }
}
