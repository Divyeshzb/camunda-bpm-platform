package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoricProcessInstancePermissions_getName_4ad76af4d7_Test {

    @InjectMocks
    HistoricProcessInstancePermissions historicProcessInstancePermissions;

    @BeforeEach
    public void setup() {
        historicProcessInstancePermissions = Mockito.mock(HistoricProcessInstancePermissions.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName_Success() {
        String name = "TestName";
        Mockito.when(historicProcessInstancePermissions.getName()).thenReturn(name);
        assertEquals(name, historicProcessInstancePermissions.getName());
    }
}
