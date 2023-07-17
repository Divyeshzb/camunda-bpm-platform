package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.impl.util.ClockUtil;
import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DefaultHalResourceCache_put_cf5a5f8381_Test {

    @Mock
    private Cache<String, HalResourceCacheEntry> cache;

    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testPut() {
        String id = "testId";
        Object resource = new Object();

        defaultHalResourceCache.put(id, resource);

        verify(cache).put(id, new HalResourceCacheEntry(id, resource));
    }

    @Test
    public void testPutWithNullId() {
        String id = null;
        Object resource = new Object();

        defaultHalResourceCache.put(id, resource);

        verify(cache).put(id, new HalResourceCacheEntry(id, resource));
    }

    @Test
    public void testPutWithNullResource() {
        String id = "testId";
        Object resource = null;

        defaultHalResourceCache.put(id, resource);

        verify(cache).put(id, new HalResourceCacheEntry(id, resource));
    }
}
