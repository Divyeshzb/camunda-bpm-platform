package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class HistoricTaskPermissions_getName_4ad76af4d7_Test {

    @InjectMocks
    private HistoricTaskPermissions historicTaskPermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        historicTaskPermissions = new HistoricTaskPermissions();
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "TestName";
        try {
            historicTaskPermissions.setName(expectedName);
        } catch (Exception e) {
            Assertions.fail("Error in setting name: " + e.getMessage());
        }
        String actualName = null;
        try {
            actualName = historicTaskPermissions.getName();
        } catch (Exception e) {
            Assertions.fail("Error in getting name: " + e.getMessage());
        }
        Assertions.assertEquals(expectedName, actualName, "The name returned by getName() method does not match the expected name");
    }

    @Test
    public void testGetName_Null() {
        try {
            historicTaskPermissions.setName(null);
        } catch (Exception e) {
            Assertions.fail("Error in setting name: " + e.getMessage());
        }
        String actualName = null;
        try {
            actualName = historicTaskPermissions.getName();
        } catch (Exception e) {
            Assertions.fail("Error in getting name: " + e.getMessage());
        }
        Assertions.assertNull(actualName, "The name returned by getName() method is not null");
    }
}
