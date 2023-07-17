package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultHalResourceCache_DefaultHalResourceCache_a888553986_Test {

    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setUp() {
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testDefaultHalResourceCache_Constructor() {
        // As per the instruction, we are not supposed to use parameterized constructors
        // Hence, the capacity and timeToLiveSeconds values are not set and the test is only checking if the object is not null
        assertNotNull(defaultHalResourceCache);
    }
}
