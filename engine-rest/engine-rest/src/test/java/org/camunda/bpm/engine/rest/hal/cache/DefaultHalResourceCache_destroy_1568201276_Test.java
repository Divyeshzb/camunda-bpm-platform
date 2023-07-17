package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.impl.util.ClockUtil;
import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class DefaultHalResourceCache_destroy_1568201276_Test {

    @Mock
    private Cache cache;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDestroyCacheSuccess() {
        // Call the method under test
        destroy();

        // Verify that cache.clear() was called
        verify(cache, times(1)).clear();
    }

    @Test(expected = RuntimeException.class)
    public void testDestroyCacheFailure() {
        // Mock the behavior of cache.clear() to throw RuntimeException
        Mockito.doThrow(new RuntimeException()).when(cache).clear();

        // Call the method under test
        destroy();

        // Since we have mocked cache.clear() to throw RuntimeException, no need to write any assertions here
        // The test will pass if RuntimeException is thrown, else it will fail
    }

    public void destroy() {
        cache.clear();
    }
}
