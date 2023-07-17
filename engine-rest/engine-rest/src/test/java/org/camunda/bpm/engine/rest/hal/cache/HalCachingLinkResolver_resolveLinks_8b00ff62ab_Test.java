package org.camunda.bpm.engine.rest.hal.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.rest.hal.HalResource;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.camunda.bpm.engine.rest.cache.Cache;

public class HalCachingLinkResolver_resolveLinks_8b00ff62ab_Test {

    @InjectMocks
    HalCachingLinkResolver halCachingLinkResolver;

    @Mock
    Cache cache;

    @Mock
    ProcessEngine processEngine;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testResolveLinks_WhenCacheIsNull() {
        when(halCachingLinkResolver.getCache()).thenReturn(null);
        String[] linkedIds = {"1", "2"};
        List<HalResource<?>> result = halCachingLinkResolver.resolveLinks(linkedIds, processEngine);

        List<HalResource<?>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testResolveLinks_WhenCacheIsNotNull() {
        when(halCachingLinkResolver.getCache()).thenReturn(cache);
        String[] linkedIds = {"1", "2"};
        List<HalResource<?>> result = halCachingLinkResolver.resolveLinks(linkedIds, processEngine);

        List<HalResource<?>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}
