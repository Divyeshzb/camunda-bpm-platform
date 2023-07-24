package org.camunda.bpm.engine.rest.hal.cache;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.Before;
import org.junit.Test;

public class DefaultHalResourceCache_remove_95487decfa_Test {

    private Cache cache;
    private DefaultHalResourceCache defaultHalResourceCache;

    @Before
    public void setUp() {
        cache = mock(Cache.class);
        defaultHalResourceCache = new DefaultHalResourceCache();
        defaultHalResourceCache.setCache(cache);
    }

    @Test
    public void testRemove() {
        String id = "testId";
        defaultHalResourceCache.remove(id);
        verify(cache, times(1)).remove(id);
    }

    @Test
    public void testRemove_NullId() {
        String id = null;
        defaultHalResourceCache.remove(id);
        verify(cache, times(0)).remove(id);
    }
}
