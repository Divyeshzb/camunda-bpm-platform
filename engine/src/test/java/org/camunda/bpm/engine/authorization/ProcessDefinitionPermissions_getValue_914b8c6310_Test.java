package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessDefinitionPermissions_getValue_914b8c6310_Test {

    @InjectMocks
    private ProcessDefinitionPermissions processDefinitionPermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValueWhenIdIsPositive() {
        processDefinitionPermissions.setId(1);
        int result = processDefinitionPermissions.getValue();
        assertEquals(1, result, "The expected value should be 1");
    }

    @Test
    public void testGetValueWhenIdIsZero() {
        processDefinitionPermissions.setId(0);
        int result = processDefinitionPermissions.getValue();
        assertEquals(0, result, "The expected value should be 0");
    }

    @Test
    public void testGetValueWhenIdIsNegative() {
        processDefinitionPermissions.setId(-1);
        int result = processDefinitionPermissions.getValue();
        assertEquals(-1, result, "The expected value should be -1");
    }
}
