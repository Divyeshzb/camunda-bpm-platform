package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.cache.Cache;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class HalRelationCacheConfiguration_parseConfiguration_1a15329201_Test {

    @InjectMocks
    HalRelationCacheConfiguration halRelationCacheConfiguration = new HalRelationCacheConfiguration();

    @Mock
    JsonNode jsonConfiguration;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseConfigurationSuccess() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"cacheImplementationClass\":\"org.camunda.bpm.engine.rest.cache.DefaultHalResourceCache\",\"cacheConfigurations\":{\"link1\":{\"maxElementsInMemory\":1000,\"overflowToDisk\":true}}}");
        when(jsonConfiguration.get("cacheImplementationClass")).thenReturn(jsonNode.get("cacheImplementationClass"));
        when(jsonConfiguration.get("cacheConfigurations")).thenReturn(jsonNode.get("cacheConfigurations"));

        halRelationCacheConfiguration.parseConfiguration(jsonConfiguration);

        verify(jsonConfiguration, times(1)).get("cacheImplementationClass");
        verify(jsonConfiguration, times(1)).get("cacheConfigurations");
    }

    @Test
    public void testParseConfigurationFailure() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"cacheImplementationClass\":\"org.camunda.bpm.engine.rest.cache.DefaultHalResourceCache\",\"cacheConfigurations\":{\"link1\":{\"maxElementsInMemory\":1000,\"overflowToDisk\":true}}}");
        when(jsonConfiguration.get("cacheImplementationClass")).thenReturn(jsonNode.get("cacheImplementationClass"));
        when(jsonConfiguration.get("cacheConfigurations")).thenReturn(null);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            halRelationCacheConfiguration.parseConfiguration(jsonConfiguration);
        });

        String expectedMessage = "Cache configurations not found";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
