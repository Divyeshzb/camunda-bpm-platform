package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoricProcessInstancePermissions_getName_4ad76af4d7_Test {

    @InjectMocks
    private HistoricProcessInstancePermissions historicProcessInstancePermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName() {
        historicProcessInstancePermissions.setName("TestName");
        String name = historicProcessInstancePermissions.getName();
        assertEquals("TestName", name);
    }

    @Test
    public void testGetNameWhenNameIsNull() {
        historicProcessInstancePermissions.setName(null);
        String name = historicProcessInstancePermissions.getName();
        assertEquals(null, name);
    }
}
