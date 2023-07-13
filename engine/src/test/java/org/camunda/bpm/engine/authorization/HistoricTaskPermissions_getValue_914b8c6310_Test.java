package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoricTaskPermissions_getValue_914b8c6310_Test {

    private HistoricTaskPermissions historicTaskPermissions;

    @BeforeEach
    public void setup() {
        historicTaskPermissions = new HistoricTaskPermissions();
    }

    @Test
    public void testGetValue_Success() {
        // Assume that the default value of id in HistoricTaskPermissions is 5
        int result = historicTaskPermissions.getValue();
        assertEquals(5, result, "The returned value should be 5");
    }

    @Test
    public void testGetValue_Failure() {
        // Assume that the default value of id in HistoricTaskPermissions is 5
        int result = historicTaskPermissions.getValue();
        assertEquals(10, result, "The returned value should not be 10");
    }
}
