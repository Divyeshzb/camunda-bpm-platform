package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HalRelationCacheConfiguration_setCacheImplementationClass_a764301a23_Test {

    private HalRelationCacheConfiguration halRelationCacheConfiguration;

    @Mock
    private Cache mockCache;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        halRelationCacheConfiguration = new HalRelationCacheConfiguration();
    }

    @Test
    public void testSetCacheImplementationClass_Success() {
        halRelationCacheConfiguration.setCacheImplementationClass(mockCache.getClass());
        Assertions.assertEquals(mockCache.getClass(), halRelationCacheConfiguration.getCacheImplementationClass());
    }

    @Test
    public void testSetCacheImplementationClass_Failure() {
        Class<?> invalidClass = String.class;
        Assertions.assertThrows(HalRelationCacheConfigurationException.class,
                () -> halRelationCacheConfiguration.setCacheImplementationClass(invalidClass));
    }
}
