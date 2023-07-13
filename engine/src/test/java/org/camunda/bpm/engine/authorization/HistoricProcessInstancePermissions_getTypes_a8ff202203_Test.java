package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HistoricProcessInstancePermissionsTest {
    @Test
    public void testHistoricProcessInstancePermissions() {
        HistoricProcessInstancePermissions permissions = new HistoricProcessInstancePermissions();
        assertNotNull(permissions.getTypes());
    }

    @Test
    public void testSetTypes() {
        Resources[] resources = Resources.values();
        HistoricProcessInstancePermissions permissions = new HistoricProcessInstancePermissions();
        permissions.setTypes(resources);
        assertArrayEquals(resources, permissions.getTypes());
    }
}
