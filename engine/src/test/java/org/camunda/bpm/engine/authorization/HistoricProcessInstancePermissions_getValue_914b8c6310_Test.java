package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HistoricProcessInstancePermissions_getValue_914b8c6310_Test {

    @Mock
    private HistoricProcessInstancePermissions historicProcessInstancePermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValue_success() {
        // TODO: Change the value as per your requirement
        int expectedValue = 10;
        when(historicProcessInstancePermissions.getValue()).thenReturn(expectedValue);

        int actualValue = historicProcessInstancePermissions.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetValue_failure() {
        // TODO: Change the value as per your requirement
        int unexpectedValue = 20;
        when(historicProcessInstancePermissions.getValue()).thenReturn(unexpectedValue);

        int actualValue = historicProcessInstancePermissions.getValue();
        assertEquals(unexpectedValue, actualValue);
    }
}
