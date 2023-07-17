package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.hal.HalResource;
import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class HalCachingLinkResolver_putIntoCache_a35d05aade_Test {

    @InjectMocks
    HalCachingLinkResolver halCachingLinkResolver;

    @Mock
    Cache cache;

    @Mock
    HalResource halResource;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPutIntoCache_Success() {
        List<HalResource<?>> notCachedResources = new ArrayList<>(Arrays.asList(halResource));
        when(halCachingLinkResolver.getResourceId(halResource)).thenReturn("1");
        halCachingLinkResolver.putIntoCache(notCachedResources);
        verify(cache, times(1)).put("1", halResource);
    }

    @Test(expected = RuntimeException.class)
    public void testPutIntoCache_Failure() {
        List<HalResource<?>> notCachedResources = new ArrayList<>(Arrays.asList(halResource));
        when(halCachingLinkResolver.getResourceId(halResource)).thenReturn("1");
        doThrow(new RuntimeException()).when(cache).put("1", halResource);
        halCachingLinkResolver.putIntoCache(notCachedResources);
    }
}
