package org.camunda.bpm.engine.rest.hal.cache;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultHalResourceCache_remove_95487decfa_Test {

    @Mock
    Cache cache;

    @InjectMocks
    DefaultHalResourceCache_remove_95487decfa defaultHalResourceCache;

    @Test
    public void testRemove_ValidId() {
        String id = "123";
        defaultHalResourceCache.remove(id);
        verify(cache, times(1)).remove(id);
    }

    @Test
    public void testRemove_NullId() {
        String id = null;
        defaultHalResourceCache.remove(id);
        verify(cache, times(1)).remove(id);
    }

    @Test
    public void testRemove_EmptyId() {
        String id = "";
        defaultHalResourceCache.remove(id);
        verify(cache, times(1)).remove(id);
    }
}
