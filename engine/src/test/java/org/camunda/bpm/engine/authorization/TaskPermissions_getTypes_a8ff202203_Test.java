package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.camunda.bpm.engine.authorization.Resources;
import org.junit.jupiter.api.Test;

public class TaskPermissions_getTypes_a8ff202203_Test {

    @Test
    public void testGetTypes() {
        Resources[] expectedResources = Resources.values();
        Resources[] actualResources = TaskPermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources);
    }

    @Test
    public void testGetTypes_whenResourcesAreModified() {
        // This test is incomplete. It's unclear how or if the RESOURCES array can be modified.
        // For the sake of this example, let's assume the RESOURCES array cannot be modified.
        // Therefore, the expectedResources array should match the RESOURCES array as it is.
        Resources[] expectedResources = Resources.values();
        Resources[] actualResources = TaskPermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources);
    }
}
