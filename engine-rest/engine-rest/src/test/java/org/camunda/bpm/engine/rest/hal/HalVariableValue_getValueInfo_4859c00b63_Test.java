package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HalVariableValue_getValueInfo_4859c00b63_Test {

    private Map<String, Object> valueInfo;

    @InjectMocks
    private HalVariableValue halVariableValue;

    @BeforeEach
    public void setup() {
        valueInfo = new HashMap<>();
        valueInfo.put("key1", "value1");
        valueInfo.put("key2", "value2");
        halVariableValue = new HalVariableValue();
        halVariableValue.setValueInfo(valueInfo);
    }

    @Test
    public void testGetValueInfo_Success() {
        Map<String, Object> result = halVariableValue.getValueInfo();
        assertEquals(valueInfo, result);
    }

    @Test
    public void testGetValueInfo_EmptyMap() {
        halVariableValue.setValueInfo(new HashMap<>());
        Map<String, Object> result = halVariableValue.getValueInfo();
        assertEquals(new HashMap<>(), result);
    }
}
