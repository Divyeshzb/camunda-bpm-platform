package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class DefaultHalResourceCache_ensureCapacityLimit_d080772ecf_Test {

    private DefaultHalResourceCache cache;

    private HalResourceCacheEntry resource1, resource2, resource3;

    @BeforeEach
    public void setup() {
        resource1 = mock(HalResourceCacheEntry.class);
        resource2 = mock(HalResourceCacheEntry.class);
        resource3 = mock(HalResourceCacheEntry.class);
        cache = spy(new DefaultHalResourceCache());
        List<HalResourceCacheEntry> resources = new ArrayList<>();
        resources.add(resource1);
        resources.add(resource2);
        resources.add(resource3);
        doReturn(resources).when(cache).getResources();
    }

    @Test
    public void testEnsureCapacityLimit_WhenSizeExceedsCapacity() {
        doReturn(4).when(cache).size();
        doReturn(3).when(cache).getCapacity();
        doReturn(false).when(cache).expired(any(HalResourceCacheEntry.class));

        cache.ensureCapacityLimit();

        verify(cache, times(1)).remove(anyString());
    }

    @Test
    public void testEnsureCapacityLimit_WhenSizeDoesNotExceedCapacity() {
        doReturn(2).when(cache).size();
        doReturn(3).when(cache).getCapacity();

        cache.ensureCapacityLimit();

        verify(cache, never()).remove(anyString());
    }

    @Test
    public void testEnsureCapacityLimit_WhenResourceExpired() {
        doReturn(4).when(cache).size();
        doReturn(3).when(cache).getCapacity();
        doReturn(true).when(cache).expired(any(HalResourceCacheEntry.class));

        cache.ensureCapacityLimit();

        verify(cache, times(3)).remove(anyString());
    }

    @Test
    public void testEnsureCapacityLimit_WhenNoResourceExpired() {
        doReturn(4).when(cache).size();
        doReturn(3).when(cache).getCapacity();
        doReturn(false).when(cache).expired(any(HalResourceCacheEntry.class));

        cache.ensureCapacityLimit();

        verify(cache, times(1)).remove(anyString());
    }
}
