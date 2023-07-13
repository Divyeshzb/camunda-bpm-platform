package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class HistoricTaskPermissions_getTypes_a8ff202203_Test {

    enum Resources {
        RESOURCE1, RESOURCE2
    }

    @Test
    public void testGetTypes() {
        Resources[] resources = Resources.values();
        Resources[] expectedResources = resources;
        assertArrayEquals(expectedResources, resources);
    }

    @Test
    public void testGetTypesWithEmptyResources() {
        Resources[] resources = new Resources[0];
        Resources[] expectedResources = new Resources[0];
        assertArrayEquals(expectedResources, resources);
    }
}
