package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TaskPermissions_getValue_914b8c6310_Test {

    @InjectMocks
    private TaskPermissions taskPermissions = new TaskPermissions();

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValueSuccess() {
        int expectedValue = 0;
        int actualValue = taskPermissions.getValue();
        Assertions.assertEquals(expectedValue, actualValue, "The expected and actual values do not match");
    }

    @Test
    public void testGetValueFailure() {
        int unexpectedValue = 20;
        int actualValue = taskPermissions.getValue();
        Assertions.assertNotEquals(unexpectedValue, actualValue, "The expected and actual values should not match");
    }
}
