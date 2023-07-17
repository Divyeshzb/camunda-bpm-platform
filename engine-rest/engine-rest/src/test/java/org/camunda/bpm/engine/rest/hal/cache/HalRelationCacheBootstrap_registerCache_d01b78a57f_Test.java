package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.hal.Hal;
import org.camunda.bpm.engine.rest.cache.Cache;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class HalRelationCacheBootstrap_registerCache_d01b78a57f_Test {

    @Mock
    private Hal halInstance;

    @Mock
    private Cache cache;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(halInstance.getInstance()).thenReturn(halInstance);
    }

    @Test
    public void testRegisterCache() {
        Class<?> halResourceClass = String.class;
        registerCache(halResourceClass, cache);
        verify(halInstance, times(1)).registerHalRelationCache(halResourceClass, cache);
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterCacheWithNullClass() {
        Class<?> halResourceClass = null;
        registerCache(halResourceClass, cache);
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterCacheWithNullCache() {
        Class<?> halResourceClass = String.class;
        registerCache(halResourceClass, null);
    }

    protected void registerCache(Class<?> halResourceClass, Cache cache) {
        halInstance.registerHalRelationCache(halResourceClass, cache);
    }
}
