package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultHalResourceCache_getCapacity_6cdad346c0_Test {

    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setUp() {
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testGetCapacity_DefaultValue() {
        int expectedCapacity = 0; // TODO: Change this value based on the default capacity
        assertEquals(expectedCapacity, defaultHalResourceCache.getCapacity());
    }

    @Test
    public void testGetCapacity_AfterSettingValue() {
        int expectedCapacity = 10; // TODO: Change this value based on your test scenario
        defaultHalResourceCache.setCapacity(expectedCapacity);
        assertEquals(expectedCapacity, defaultHalResourceCache.getCapacity());
    }
}
