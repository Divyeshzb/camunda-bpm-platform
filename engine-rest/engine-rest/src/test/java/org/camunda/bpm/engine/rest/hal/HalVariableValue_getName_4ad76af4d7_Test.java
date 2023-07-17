package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HalVariableValue_getName_4ad76af4d7_Test {

    private HalVariableValue halVariableValue;

    @BeforeEach
    public void setUp() {
        halVariableValue = new HalVariableValue();
    }

    @Test
    public void testGetName() {
        String expectedName = "TestName";
        halVariableValue.setName(expectedName);
        String actualName = halVariableValue.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetNameWhenNameIsNull() {
        halVariableValue.setName(null);
        String actualName = halVariableValue.getName();
        assertEquals(null, actualName);
    }
}
