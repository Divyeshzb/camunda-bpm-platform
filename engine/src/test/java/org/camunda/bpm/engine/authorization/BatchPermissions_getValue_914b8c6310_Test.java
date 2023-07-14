package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatchPermissions_getValue_914b8c6310_Test {

    private SampleClass sampleClass; // replace SampleClass with BatchPermissions

    @BeforeEach
    public void setup() {
        sampleClass = Mockito.mock(SampleClass.class); // replace SampleClass with BatchPermissions
    }

    @Test
    public void testGetValue() {
        int expectedValue = 1;
        Mockito.when(sampleClass.getValue()).thenReturn(expectedValue);
        assertEquals(expectedValue, sampleClass.getValue(), "Expected value did not match with the actual value.");
    }

    @Test
    public void testGetValue_NegativeScenario() {
        int expectedValue = -1;
        Mockito.when(sampleClass.getValue()).thenReturn(expectedValue);
        assertEquals(expectedValue, sampleClass.getValue(), "Expected value did not match with the actual value.");
    }
}
