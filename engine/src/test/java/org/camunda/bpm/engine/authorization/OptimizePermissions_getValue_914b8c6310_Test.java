package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimizePermissions_getValue_914b8c6310_Test {

    private OptimizePermissions_getValue_914b8c6310 optimizePermissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        optimizePermissions = new OptimizePermissions_getValue_914b8c6310();
    }

    @Test
    public void testGetValue_success() {
        int result = optimizePermissions.getValue();
        assertEquals(10, result); // Assuming that the default value is 10
    }

    @Test
    public void testGetValue_failure() {
        int result = optimizePermissions.getValue();
        assertEquals(-1, result); // Assuming that the default value is -1
    }
}
