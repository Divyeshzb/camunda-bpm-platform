package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ProcessInstancePermissions_getValue_914b8c6310_Test {

    @InjectMocks
    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        processInstancePermissions = new ProcessInstancePermissions();
    }

    @Test
    public void testGetValue() {
        int expectedValue = 10; 
        processInstancePermissions.setValue(expectedValue); 
        int actualValue = processInstancePermissions.getValue();
        Assertions.assertEquals(expectedValue, actualValue, "The expected value does not match the actual value.");
    }

    @Test
    public void testGetValueWithZero() {
        int expectedValue = 0;
        processInstancePermissions.setValue(expectedValue);
        int actualValue = processInstancePermissions.getValue();
        Assertions.assertEquals(expectedValue, actualValue, "The expected value does not match the actual value.");
    }
}
