package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HalVariableValue_getName_4ad76af4d7_Test {

    @Mock
    private HalVariableValue halVariableValue;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNameGetter_withValidName() {
        String expectedName = "Test Name";
        when(halVariableValue.getName()).thenReturn(expectedName);

        String actualName = halVariableValue.getName();
        assertEquals(expectedName, actualName, "Expected name does not match actual name");
    }

    @Test
    public void testNameGetter_withEmptyName() {
        String expectedName = "";
        when(halVariableValue.getName()).thenReturn(expectedName);

        String actualName = halVariableValue.getName();
        assertEquals(expectedName, actualName, "Expected name does not match actual name");
    }

    @Test
    public void testNameGetter_withNullName() {
        String expectedName = null;
        when(halVariableValue.getName()).thenReturn(expectedName);

        String actualName = halVariableValue.getName();
        assertEquals(expectedName, actualName, "Expected name does not match actual name");
    }
}
