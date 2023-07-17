package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.rest.cache.Cache;

public class HalRelationCacheBootstrap_configureCache_01ec5922c6_Test {

    @Mock
    private Cache mockCache;

    private Map<String, Object> cacheConfiguration;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cacheConfiguration = new HashMap<>();
        cacheConfiguration.put("testKey1", "testValue1");
        cacheConfiguration.put("testKey2", "testValue2");
    }

    @Test
    public void testConfigureCache_Success() {
        HalRelationCacheBootstrap halRelationCacheBootstrap = new HalRelationCacheBootstrap();
        halRelationCacheBootstrap.configureCache(mockCache, cacheConfiguration);

        verify(mockCache, times(1)).configureCache("testKey1", "testValue1");
        verify(mockCache, times(1)).configureCache("testKey2", "testValue2");
    }

    @Test
    public void testConfigureCache_EmptyConfiguration() {
        cacheConfiguration.clear();
        HalRelationCacheBootstrap halRelationCacheBootstrap = new HalRelationCacheBootstrap();
        halRelationCacheBootstrap.configureCache(mockCache, cacheConfiguration);

        verify(mockCache, times(0)).configureCache("testKey1", "testValue1");
        verify(mockCache, times(0)).configureCache("testKey2", "testValue2");
    }
}
