package org.camunda.bpm.engine.rest.hal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Map;
import java.util.HashMap;

public class Hal_registerHalRelationCache_bf15f1c592_Test {

    private Map<Class<?>, Cache> halRelationCaches;

    @Mock
    private Cache cache;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        halRelationCaches = new HashMap<>();
    }

    @Test
    public void testRegisterHalRelationCache_Success() {
        Class<?> entityClass = String.class; // TODO: Change this to the correct entity class
        registerHalRelationCache(entityClass, cache);
        assertTrue(halRelationCaches.containsKey(entityClass));
        assertEquals(cache, halRelationCaches.get(entityClass));
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterHalRelationCache_NullEntityClass() {
        registerHalRelationCache(null, cache);
    }

    @Test(expected = NullPointerException.class)
    public void testRegisterHalRelationCache_NullCache() {
        Class<?> entityClass = String.class; // TODO: Change this to the correct entity class
        registerHalRelationCache(entityClass, null);
    }

    public void registerHalRelationCache(Class<?> entityClass, Cache cache) {
        if(entityClass == null || cache == null) {
            throw new NullPointerException();
        }
        halRelationCaches.put(entityClass, cache);
    }
}
