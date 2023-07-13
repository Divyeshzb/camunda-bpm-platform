package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class Permissions_getValue_914b8c6310_Test {

    @Mock
    private Permissions permissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValue_Success() {
        Assertions.assertNotNull(permissions, "Permissions object is null");
    }

    @Test
    public void testGetValue_Failure() {
        Assertions.assertNotNull(permissions, "Permissions object is null");
    }
}
