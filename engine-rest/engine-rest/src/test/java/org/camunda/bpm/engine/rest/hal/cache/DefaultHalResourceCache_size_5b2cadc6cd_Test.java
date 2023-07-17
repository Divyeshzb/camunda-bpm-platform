package org.camunda.bpm.engine.rest.hal.cache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultHalResourceCache_size_5b2cadc6cd_Test {

    private DefaultHalResourceCache defaultHalResourceCache;
    private Cache cache;

    @BeforeEach
    public void setup() {
        cache = mock(Cache.class);
        defaultHalResourceCache = new DefaultHalResourceCache();
        // Assuming there is a method to set the cache in defaultHalResourceCache
        defaultHalResourceCache.setCache(cache);
    }

    @Test
    public void testSize_whenCacheIsEmpty() {
        // Arrange
        when(cache.size()).thenReturn(0);

        // Act
        int result = defaultHalResourceCache.size();

        // Assert
        assertEquals(0, result, "Cache size should be 0 when cache is empty");
    }

    @Test
    public void testSize_whenCacheIsNotEmpty() {
        // Arrange
        when(cache.size()).thenReturn(5);

        // Act
        int result = defaultHalResourceCache.size();

        // Assert
        assertEquals(5, result, "Cache size should be 5 when cache has 5 items");
    }
}
