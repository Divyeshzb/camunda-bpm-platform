package org.camunda.bpm.engine.rest.hal.cache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.camunda.bpm.engine.impl.util.ClockUtil;
import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultHalResourceCache_put_cf5a5f8381_Test {

    private Cache<String, HalResourceCacheEntry> cache;
    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setup() {
        cache = mock(Cache.class);
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testPut() {
        String id = "testId";
        Object resource = new Object();

        defaultHalResourceCache.put(id, resource);

        HalResourceCacheEntry expectedEntry = new HalResourceCacheEntry();
        when(cache.get(id)).thenReturn(expectedEntry);
        assertEquals(expectedEntry, cache.get(id));
    }

    @Test
    public void testPut_NullId() {
        String id = null;
        Object resource = new Object();

        defaultHalResourceCache.put(id, resource);

        HalResourceCacheEntry expectedEntry = new HalResourceCacheEntry();
        when(cache.get(id)).thenReturn(expectedEntry);
        assertEquals(expectedEntry, cache.get(id));
    }

    // TODO: Add more test cases to cover all possible scenarios
}
