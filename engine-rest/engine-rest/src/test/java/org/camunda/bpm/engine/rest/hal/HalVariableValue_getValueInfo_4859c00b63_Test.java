package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HalVariableValue_getValueInfo_4859c00b63_Test {

    @Mock
    private HalVariableValue halVariableValue;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValueInfoSuccess() {
        Map<String, Object> expectedValueInfo = new HashMap<>();
        expectedValueInfo.put("key1", "value1");
        expectedValueInfo.put("key2", "value2");

        when(halVariableValue.getValueInfo()).thenReturn(expectedValueInfo);

        Map<String, Object> actualValueInfo = halVariableValue.getValueInfo();

        assertEquals(expectedValueInfo, actualValueInfo);
    }

    @Test
    public void testGetValueInfoFailure() {
        Map<String, Object> expectedValueInfo = new HashMap<>();
        expectedValueInfo.put("key1", "value1");
        expectedValueInfo.put("key2", "value2");

        when(halVariableValue.getValueInfo()).thenReturn(new HashMap<>());

        Map<String, Object> actualValueInfo = halVariableValue.getValueInfo();

        assertEquals(expectedValueInfo, actualValueInfo);
    }
}
