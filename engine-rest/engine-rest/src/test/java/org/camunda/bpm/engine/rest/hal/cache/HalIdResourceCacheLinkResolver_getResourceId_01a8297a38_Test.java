package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.hal.HalIdResource;
import org.camunda.bpm.engine.rest.hal.HalResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class HalIdResourceCacheLinkResolver_getResourceId_01a8297a38_Test {
    
    private HalIdResourceCacheLinkResolver resolver;

    @BeforeEach
    public void setup() {
        resolver = new HalIdResourceCacheLinkResolver();
    }

    @Test
    public void testGetResourceId_Success() {
        HalIdResource mockResource = mock(HalIdResource.class);
        when(mockResource.getId()).thenReturn("1234");

        String result = resolver.getResourceId(mockResource);

        assertEquals("1234", result, "Resource id should match expected id");
    }

    @Test
    public void testGetResourceId_NullResource() {
        HalResource<?> nullResource = null;

        assertThrows(NullPointerException.class, () -> {
            resolver.getResourceId(nullResource);
        }, "Method should throw NullPointerException when resource is null");
    }

    @Test
    public void testGetResourceId_WrongResourceType() {
        HalResource<?> wrongResource = mock(HalResource.class);

        assertThrows(ClassCastException.class, () -> {
            resolver.getResourceId(wrongResource);
        }, "Method should throw ClassCastException when resource is not HalIdResource");
    }
}
