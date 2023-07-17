package org.camunda.bpm.engine.rest.hal;

import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HalResource_getEmbedded_43b500a4d3_Test {

    @InjectMocks
    private HalResource halResource;

    @Mock
    private Map<String, Object> _embedded;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        _embedded = new TreeMap<>();
        _embedded.put("testKey", "testValue");
    }

    @Test
    public void testGetEmbedded_Success() {
        String name = "testKey";
        Object result = halResource.getEmbedded(name);
        Assertions.assertEquals("testValue", result);
    }

    @Test
    public void testGetEmbedded_Null() {
        String name = "nonExistingKey";
        Object result = halResource.getEmbedded(name);
        Assertions.assertNull(result);
    }
}
