package org.camunda.bpm.engine.authorization;

import org.junit.Test;
import static org.junit.Assert.*;

public class HistoricTaskPermissionsTest {

    @Test
    public void testNameGetterAndSetter() {
        HistoricTaskPermissions historicTaskPermissions = new HistoricTaskPermissions();
        String testName = "Test Name";
        
        historicTaskPermissions.setName(testName);
        
        assertEquals(testName, historicTaskPermissions.getName());
    }
}
