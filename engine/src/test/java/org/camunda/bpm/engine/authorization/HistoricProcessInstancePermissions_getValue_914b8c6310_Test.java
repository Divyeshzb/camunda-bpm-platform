package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.camunda.bpm.engine.authorization.HistoricProcessInstancePermissions;

public class HistoricProcessInstancePermissions_getValue_914b8c6310_Test {

    HistoricProcessInstancePermissions historicProcessInstancePermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        historicProcessInstancePermissions = Mockito.mock(HistoricProcessInstancePermissions.class);
    }

    @Test
    public void testGetValue_Success() {
        int expectedId = 10;
        Mockito.when(historicProcessInstancePermissions.getValue()).thenReturn(expectedId);

        int actualId = historicProcessInstancePermissions.getValue();
        Assertions.assertEquals(expectedId, actualId, "The expected ID did not match the actual ID");
    }

    @Test
    public void testGetValue_Failure() {
        int unexpectedId = 20;
        Mockito.when(historicProcessInstancePermissions.getValue()).thenReturn(unexpectedId);

        int actualId = historicProcessInstancePermissions.getValue();
        Assertions.assertNotEquals(unexpectedId, actualId, "The unexpected ID should not match the actual ID");
    }
}
