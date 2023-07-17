package org.camunda.bpm.engine.rest.hal.cache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultHalResourceCache_getSecondsToLive_159beb6860_Test {

    private DefaultHalResourceCache defaultHalResourceCache;

    @BeforeEach
    public void setup() {
        defaultHalResourceCache = new DefaultHalResourceCache();
    }

    @Test
    public void testGetSecondsToLiveWithPositiveValue() {
        defaultHalResourceCache.setSecondsToLive(5000);
        long expected = 5000;
        long actual = defaultHalResourceCache.getSecondsToLive();
        assertEquals(expected, actual, "The returned seconds to live should match the expected value");
    }

    @Test
    public void testGetSecondsToLiveWithZeroValue() {
        defaultHalResourceCache.setSecondsToLive(0);
        long expected = 0;
        long actual = defaultHalResourceCache.getSecondsToLive();
        assertEquals(expected, actual, "The returned seconds to live should match the expected value");
    }
}
