package org.camunda.bpm.engine.rest.hal.cache;

import java.util.Iterator;
import java.util.Map;
import org.camunda.bpm.engine.rest.cache.Cache;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HalRelationCacheConfiguration_parseCacheConfigurations_2457f33ae3_Test {

    private HalRelationCacheConfiguration halRelationCacheConfiguration;

    @Mock
    private JsonNode jsonConfiguration;
    
    @Mock
    private JsonNode jsonNode;

    @Mock
    private Iterator<Map.Entry<String, JsonNode>> cacheConfigurations;

    @Mock
    private Map.Entry<String, JsonNode> cacheConfiguration;

    @Before
    public void setUp() {
        halRelationCacheConfiguration = new HalRelationCacheConfiguration();
    }

    @Test
    public void testParseCacheConfigurations_WithValidJsonConfiguration() {
        String CONFIG_CACHES = "cacheConfigurations";
        when(jsonConfiguration.get(CONFIG_CACHES)).thenReturn(jsonNode);
        when(jsonNode.fields()).thenReturn(cacheConfigurations);
        when(cacheConfigurations.hasNext()).thenReturn(true, false);
        when(cacheConfigurations.next()).thenReturn(cacheConfiguration);

        halRelationCacheConfiguration.parseCacheConfigurations(jsonConfiguration);

        verify(halRelationCacheConfiguration, Mockito.times(1)).parseCacheConfiguration(anyString(), any(JsonNode.class));
    }

    @Test
    public void testParseCacheConfigurations_WithNullJsonConfiguration() {
        String CONFIG_CACHES = "cacheConfigurations";
        when(jsonConfiguration.get(CONFIG_CACHES)).thenReturn(null);

        halRelationCacheConfiguration.parseCacheConfigurations(jsonConfiguration);

        verify(halRelationCacheConfiguration, never()).parseCacheConfiguration(anyString(), any(JsonNode.class));
    }
}
