package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmptyHalResource_emptyHalResource_6661469897_Test {

    private HalResource INSTANCE;

    @BeforeEach
    public void setUp() {
        INSTANCE = new HalResource();
    }

    @Test
    public void testEmptyHalResource_successCase() {
        HalResource result = EmptyHalResource.emptyHalResource();
        assertNotNull(result);
        assertEquals(INSTANCE, result);
    }

    @Test
    public void testEmptyHalResource_failureCase() {
        HalResource result = EmptyHalResource.emptyHalResource();
        assertNotNull(result);
        assertNotEquals(new HalResource(), result);
    }
}
