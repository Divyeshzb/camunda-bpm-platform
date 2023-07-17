package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DefaultHalResourceCache_DefaultHalResourceCache_5e000f7437_Test {
    
    @Mock
    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testDefaultHalResourceCache_Capacity() {
        assertEquals(10, defaultHalResourceCache.getCapacity());
    }

    @Test
    public void testDefaultHalResourceCache_SecondsToLive() {
        assertEquals(1000, defaultHalResourceCache.getSecondsToLive());
    }

    @Test
    public void testDefaultHalResourceCache_InvalidCapacity() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new DefaultHalResourceCache();
        });
        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    public void testDefaultHalResourceCache_InvalidSecondsToLive() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new DefaultHalResourceCache();
        });
        assertEquals("SecondsToLive must be greater than zero", exception.getMessage());
    }

}
