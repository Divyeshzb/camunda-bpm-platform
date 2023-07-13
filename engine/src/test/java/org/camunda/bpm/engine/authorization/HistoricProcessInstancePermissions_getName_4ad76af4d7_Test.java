package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HistoricProcessInstancePermissions_getName_4ad76af4d7_Test {

    private HistoricProcessInstancePermissions historicProcessInstancePermissions;

    @BeforeEach
    public void setup() {
        historicProcessInstancePermissions = Mockito.mock(HistoricProcessInstancePermissions.class);
        Mockito.when(historicProcessInstancePermissions.getName()).thenReturn("TestName");
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "TestName";
        String actualName = historicProcessInstancePermissions.getName();
        Assertions.assertEquals(expectedName, actualName, "The name should match the expected name");
    }

    @Test
    public void testGetName_Failure() {
        String unexpectedName = "UnexpectedName";
        String actualName = historicProcessInstancePermissions.getName();
        Assertions.assertNotEquals(unexpectedName, actualName, "The name should not match the unexpected name");
    }
}
