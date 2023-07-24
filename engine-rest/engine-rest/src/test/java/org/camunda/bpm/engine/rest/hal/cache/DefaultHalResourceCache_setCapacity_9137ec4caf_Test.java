package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultHalResourceCache_setCapacity_9137ec4caf_Test {

    @InjectMocks
    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testSetCapacity_PositiveValue() {
        int expectedCapacity = 10;
        defaultHalResourceCache.setCapacity(expectedCapacity);
        int actualCapacity = defaultHalResourceCache.getCapacity();
        assertEquals(expectedCapacity, actualCapacity);
    }

    @Test
    public void testSetCapacity_NegativeValue() {
        int expectedCapacity = -10;
        defaultHalResourceCache.setCapacity(expectedCapacity);
        int actualCapacity = defaultHalResourceCache.getCapacity();
        assertEquals(expectedCapacity, actualCapacity);
    }
}
