package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultHalResourceCache_DefaultHalResourceCache_a888553986_Test {

    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setUp() {
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testDefaultHalResourceCache_WithDefaultParameters() {
        assertEquals(100, defaultHalResourceCache.getSize1());
        assertEquals(100, defaultHalResourceCache.getSize2());
    }

    @Test
    public void testDefaultHalResourceCache_WithInvalidParameters() {
        // Uncomment the below line if there is a validation in the constructor.
        //defaultHalResourceCache = new DefaultHalResourceCache(-100, -100);
    }
}
