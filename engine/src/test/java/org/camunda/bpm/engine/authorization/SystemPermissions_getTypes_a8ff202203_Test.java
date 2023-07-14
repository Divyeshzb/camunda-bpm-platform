package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class SystemPermissions_getTypes_a8ff202203_Test {

    @MockBean
    private SystemPermissions systemPermissions;

    @MockBean
    private Resource resource1;

    @MockBean
    private Resource resource2;

    private Resource[] RESOURCES;

    @BeforeEach
    public void setup() {
        RESOURCES = new Resource[]{resource1, resource2}; // Use the mocked objects
        when(systemPermissions.getTypes()).thenReturn(RESOURCES);
    }

    @Test
    public void testGetTypes() {
        Resource[] actualResources = systemPermissions.getTypes();
        assertArrayEquals(RESOURCES, actualResources, "The expected output does not match the actual output");
    }

    @Test
    public void testGetTypes_noResources() {
        when(systemPermissions.getTypes()).thenReturn(new Resource[]{});
        Resource[] actualResources = systemPermissions.getTypes();
        assertEquals(0, actualResources.length, "The expected output does not match the actual output");
    }
}
