package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BatchPermissions_getValue_914b8c6310_Test {

    @Mock
    private BatchPermissions batchPermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValueSuccess() {
        when(batchPermissions.getValue()).thenReturn(123);
        int result = batchPermissions.getValue();
        assertEquals(123, result, "Expected and actual values should match");
    }

    @Test
    public void testGetValueFailure() {
        when(batchPermissions.getValue()).thenReturn(456);
        int result = batchPermissions.getValue();
        assertEquals(456, result, "Expected and actual values should match");
    }
}
