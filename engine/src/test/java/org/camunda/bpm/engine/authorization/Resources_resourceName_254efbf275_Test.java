package org.camunda.bpm.engine.authorization;

import org.camunda.bpm.engine.EntityTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Resources_resourceName_254efbf275_Test {

    private EntityTypes entityTypes;

    @BeforeEach
    public void setup() {
        entityTypes = new EntityTypes();
    }

    @Test
    public void testResourceName_Success() {
        String expectedOutput = "TestEntity";
        String actualOutput = entityTypes.toString();
        assertEquals(expectedOutput, actualOutput, "The expected output should match the actual output");
    }

    @Test
    public void testResourceName_Failure() {
        String expectedOutput = "WrongEntity";
        String actualOutput = entityTypes.toString();
        assertEquals(expectedOutput, actualOutput, "The expected output should not match the actual output");
    }
}
