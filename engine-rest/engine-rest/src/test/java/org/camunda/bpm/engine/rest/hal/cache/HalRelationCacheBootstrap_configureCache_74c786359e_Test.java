package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

public class HalRelationCacheBootstrap_configureCache_74c786359e_Test {

    @Mock
    private Cache cache;

    private HalRelationCacheBootstrap instance;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        instance = new HalRelationCacheBootstrap();
    }

    @Test
    public void testConfigureCache_Success() throws Exception {
        String property = "testProperty";
        Object value = new Object();
        instance.configureCache(cache, property, value);
        verify(cache).setTestProperty(value);
    }

    @Test
    public void testConfigureCache_NoSetter() {
        String property = "noSetterProperty";
        Object value = new Object();
        assertThrows(HalRelationCacheConfigurationException.class, () -> {
            instance.configureCache(cache, property, value);
        });
    }

    // ... rest of the test methods
}
