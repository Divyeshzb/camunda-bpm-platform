package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HalVariableValue_getValue_12fbcc50c3_Test {

    private HalVariableValue halVariableValue;

    @BeforeEach
    public void setUp() {
        halVariableValue = new HalVariableValue();
    }

    @Test
    public void testGetValue_WhenValueIsString() {
        String testValue = "testValue";
        halVariableValue.setValue(testValue);
        Object result = halVariableValue.getValue();
        assertEquals(testValue, result, "Expected and actual values should be same.");
    }

    @Test
    public void testGetValue_WhenValueIsNull() {
        halVariableValue.setValue(null);
        Object result = halVariableValue.getValue();
        assertEquals(null, result, "Expected and actual values should be same.");
    }
}
