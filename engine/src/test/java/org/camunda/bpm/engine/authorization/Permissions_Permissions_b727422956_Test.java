package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class Permissions_Permissions_b727422956_Test {

    @Mock
    private Permissions permissions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPermissionsConstructor_name() {
        String name = "testName";

        when(permissions.getName()).thenReturn(name);

        assertEquals(name, permissions.getName());
    }

    @Test
    public void testPermissionsConstructor_id() {
        int id = 1;

        when(permissions.getId()).thenReturn(id);

        assertEquals(id, permissions.getId());
    }
}
