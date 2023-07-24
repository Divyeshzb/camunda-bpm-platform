package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.hal.cache.DefaultHalResourceCache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DefaultHalResourceCache_DefaultHalResourceCache_5e000f7437_Test {

    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setUp() {
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testDefaultHalResourceCache_constructor() {
        assertNotNull(defaultHalResourceCache, "DefaultHalResourceCache object is null");
    }

    @Test
    public void testDefaultHalResourceCache_constructor_withNegativeCapacity() {
        DefaultHalResourceCache defaultHalResourceCacheNegative = new DefaultHalResourceCache();
        assertNotNull(defaultHalResourceCacheNegative, "DefaultHalResourceCache object is null");
    }
}
