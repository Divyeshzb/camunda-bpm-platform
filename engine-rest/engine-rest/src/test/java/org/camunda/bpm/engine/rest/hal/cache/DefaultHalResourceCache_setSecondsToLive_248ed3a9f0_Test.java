package org.camunda.bpm.engine.rest.hal.cache;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultHalResourceCache_setSecondsToLive_248ed3a9f0_Test {

    private DefaultHalResourceCache cache;

    @BeforeEach
    public void setUp() {
        cache = new DefaultHalResourceCache();
    }

    @Test
    public void testSetSecondsToLive_PositiveValue() {
        long secondsToLive = 3600L; // 1 hour
        cache.setSecondsToLive(secondsToLive);

        assertEquals(secondsToLive, cache.getSecondsToLive(), "Seconds to live should be set correctly.");
    }

    @Test
    public void testSetSecondsToLive_Zero() {
        long secondsToLive = 0L;
        cache.setSecondsToLive(secondsToLive);

        assertEquals(secondsToLive, cache.getSecondsToLive(), "Seconds to live should be set to zero.");
    }

    @Test
    public void testSetSecondsToLive_NegativeValue() {
        long secondsToLive = -1L;
        // TODO: Change value to valid seconds if necessary

        cache.setSecondsToLive(secondsToLive);

        assertEquals(secondsToLive, cache.getSecondsToLive(), "Seconds to live should be set to negative value.");
    }
}
