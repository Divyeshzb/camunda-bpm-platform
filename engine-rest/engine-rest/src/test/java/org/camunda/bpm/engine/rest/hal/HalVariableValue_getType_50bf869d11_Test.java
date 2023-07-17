package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;

class HalVariableValue_getType_50bf869d11_Test {

    private HalVariableValue halVariableValue;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        halVariableValue = new HalVariableValue();
    }

    @Test
    public void testGetTypeWhenTypeIsNull() {
        halVariableValue.setType(null);
        assertNull(halVariableValue.getType());
    }

    @Test
    public void testGetTypeWhenTypeIsNotNull() {
        String type = "testType";
        halVariableValue.setType(type);
        assertEquals(type, halVariableValue.getType());
    }
}
