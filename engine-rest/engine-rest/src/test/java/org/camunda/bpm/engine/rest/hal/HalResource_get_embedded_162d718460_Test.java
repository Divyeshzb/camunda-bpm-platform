package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class HalResource_get_embedded_162d718460_Test {

    private HalResource halResource;

    @BeforeEach
    public void setup() {
        halResource = Mockito.mock(HalResource.class);
    }

    @Test
    public void testGetEmbeddedSuccess() {
        Map<String, Object> expectedMap = new HashMap<>();
        expectedMap.put("key1", "value1");
        expectedMap.put("key2", "value2");

        when(halResource.get_embedded()).thenReturn(expectedMap);

        Map<String, Object> actualMap = halResource.get_embedded();

        assertNotNull(actualMap);
        assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testGetEmbeddedWhenEmpty() {
        Map<String, Object> expectedMap = new HashMap<>();

        when(halResource.get_embedded()).thenReturn(expectedMap);

        Map<String, Object> actualMap = halResource.get_embedded();

        assertNotNull(actualMap);
        assertEquals(expectedMap, actualMap);
    }
}
