package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.hal.cache.HalResourceCacheEntry;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultHalResourceCache_get_446286b1af_Test {

    @InjectMocks
    DefaultHalResourceCache defaultHalResourceCache;
    
    @Mock
    Cache cache;

    @Before
    public void setUp() {
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testGet_whenCacheEntryIsNull() {
        when(cache.get("testId")).thenReturn(null);
        Object result = defaultHalResourceCache.get("testId");
        assertNull(result);
    }

    @Test
    public void testGet_whenCacheEntryIsNotNullAndExpired() {
        HalResourceCacheEntry cacheEntry = new HalResourceCacheEntry();
        when(cache.get("testId")).thenReturn(cacheEntry);
        when(defaultHalResourceCache.expired(cacheEntry)).thenReturn(true);
        Object result = defaultHalResourceCache.get("testId");
        assertNull(result);
        Mockito.verify(cache).remove("testId");
    }

    @Test
    public void testGet_whenCacheEntryIsNotNullAndNotExpired() {
        HalResourceCacheEntry cacheEntry = new HalResourceCacheEntry();
        when(cache.get("testId")).thenReturn(cacheEntry);
        when(defaultHalResourceCache.expired(cacheEntry)).thenReturn(false);
        Object result = defaultHalResourceCache.get("testId");
        assertEquals("testResource", result);
    }
}
