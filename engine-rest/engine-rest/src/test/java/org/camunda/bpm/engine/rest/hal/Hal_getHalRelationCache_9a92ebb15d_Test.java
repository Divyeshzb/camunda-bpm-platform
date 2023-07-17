package org.camunda.bpm.engine.rest.hal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.camunda.bpm.engine.rest.cache.Cache;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Hal_getHalRelationCache_9a92ebb15d_Test {

    private Map<Class<?>, Cache> halRelationCaches;

    @Before
    public void setup() {
        halRelationCaches = new HashMap<>();
        halRelationCaches.put(String.class, mock(Cache.class));
    }

    @Test
    public void testGetHalRelationCache_Success() {
        Cache expectedCache = halRelationCaches.get(String.class);
        Cache actualCache = getHalRelationCache(String.class);
        assertEquals(expectedCache, actualCache);
    }

    @Test
    public void testGetHalRelationCache_Null() {
        Cache actualCache = getHalRelationCache(Integer.class);
        assertNull(actualCache);
    }

    public Cache getHalRelationCache(Class<?> resourceClass) {
        return halRelationCaches.get(resourceClass);
    }
}
