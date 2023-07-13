package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SystemPermissions_getValue_914b8c6310_Test {

    private YourClassName yourClassName;

    @BeforeEach
    public void setup() {
        yourClassName = new YourClassName();
    }

    @Test
    public void testGetValue_Success() {
        int expected = 10;
        int actual = yourClassName.getValue();
        Assertions.assertEquals(expected, actual, "Expected and actual values should match");
    }

    @Test
    public void testGetValue_Failure() {
        int unexpected = 20;
        int actual = yourClassName.getValue();
        Assertions.assertNotEquals(unexpected, actual, "Unexpected and actual values should not match");
    }
}
