package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class HalRelationCacheConfiguration_getCacheConfigurations_78c51493bc_Test {

    @MockBean
    private HalRelationCacheConfiguration cacheConfiguration;

    private Map<Class<?>, Map<String, Object>> cacheConfigurations;

    @BeforeEach
    public void setup() {
        cacheConfigurations = new HashMap<>();
        Map<String, Object> config = new HashMap<>();
        config.put("key", "value");
        cacheConfigurations.put(String.class, config);
        when(cacheConfiguration.getCacheConfigurations()).thenReturn(cacheConfigurations);
    }

    @Test
    public void testGetCacheConfigurations_Success() {
        Map<Class<?>, Map<String, Object>> result = cacheConfiguration.getCacheConfigurations();
        assertEquals(cacheConfigurations, result);
        verify(cacheConfiguration, times(1)).getCacheConfigurations();
    }

    @Test
    public void testGetCacheConfigurations_Empty() {
        when(cacheConfiguration.getCacheConfigurations()).thenReturn(new HashMap<>());
        Map<Class<?>, Map<String, Object>> result = cacheConfiguration.getCacheConfigurations();
        assertTrue(result.isEmpty());
        verify(cacheConfiguration, times(1)).getCacheConfigurations();
    }

}
