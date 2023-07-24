package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.impl.util.ClockUtil;
import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultHalResourceCache_size_5b2cadc6cd_Test {

    @Mock
    private Cache cache;

    @Before
    public void setUp() {
        ClockUtil.reset();
    }

    @Test
    public void testSizeWhenCacheIsEmpty() {
        when(cache.size()).thenReturn(0);
        int actualSize = cache.size();
        assertEquals("Cache size should be 0", 0, actualSize);
    }

    @Test
    public void testSizeWhenCacheIsNotEmpty() {
        when(cache.size()).thenReturn(5);
        int actualSize = cache.size();
        assertEquals("Cache size should be 5", 5, actualSize);
    }

    @Test(expected = NullPointerException.class)
    public void testSizeWhenCacheIsNull() {
        when(cache.size()).thenThrow(new NullPointerException());
        cache.size();
    }
}
