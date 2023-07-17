package org.camunda.bpm.engine.rest.hal.cache;

import java.io.IOException;
import org.camunda.bpm.engine.rest.exception.HalRelationCacheConfigurationException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class HalRelationCacheConfiguration_parseConfiguration_8d5360c8e6_Test {

    private HalRelationCacheConfiguration halRelationCacheConfiguration;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = mock(ObjectMapper.class);
        halRelationCacheConfiguration = mock(HalRelationCacheConfiguration.class);
    }

    @Test
    public void testParseConfiguration_Success() throws IOException {
        String configuration = "{}";
        JsonNode jsonNode = objectMapper.readTree(configuration);
        doNothing().when(halRelationCacheConfiguration).parseConfiguration(any(JsonNode.class));
        halRelationCacheConfiguration.parseConfiguration(jsonNode);
        verify(halRelationCacheConfiguration, times(1)).parseConfiguration(jsonNode);
    }

    @Test
    public void testParseConfiguration_IOException() throws IOException {
        String configuration = "{}";
        when(objectMapper.readTree(configuration)).thenThrow(IOException.class);
        assertThrows(HalRelationCacheConfigurationException.class, () -> halRelationCacheConfiguration.parseConfiguration(configuration));
    }
}
