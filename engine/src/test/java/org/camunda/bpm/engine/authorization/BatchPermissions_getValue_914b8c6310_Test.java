package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

public class BatchPermissions_getValue_914b8c6310_Test {

    private int id;

    @Mock
    private BatchPermissions batchPermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        id = 5; 
    }

    @Test
    public void testGetValueSuccess() {
        Mockito.when(batchPermissions.getValue()).thenReturn(id);
        int actual = batchPermissions.getValue();
        Assertions.assertEquals(id, actual, "Expected and actual values should match");
    }

    @Test
    public void testGetValueFailure() {
        int unexpected = 10; 
        Mockito.when(batchPermissions.getValue()).thenReturn(id);
        int actual = batchPermissions.getValue();
        Assertions.assertNotEquals(unexpected, actual, "Expected and actual values should not match");
    }
}
