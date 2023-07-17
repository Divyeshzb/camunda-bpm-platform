package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

public class Hal_destroyHalRelationCaches_68c296a659_Test {

    private Map<String, Cache> halRelationCaches;

    @Mock
    private Cache cache;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        halRelationCaches = new HashMap<>();
        halRelationCaches.put("cache1", cache);
        halRelationCaches.put("cache2", cache);
    }

    @Test
    public void testDestroyHalRelationCaches() {
        for (Cache cache : halRelationCaches.values()) {
            cache.destroy();
        }
        halRelationCaches.clear();

        verify(cache, times(2)).destroy();
        assert(halRelationCaches.isEmpty());
    }

    @Test
    public void testDestroyHalRelationCachesWhenEmpty() {
        halRelationCaches.clear();

        for (Cache cache : halRelationCaches.values()) {
            cache.destroy();
        }
        halRelationCaches.clear();

        verify(cache, times(0)).destroy();
        assert(halRelationCaches.isEmpty());
    }
}
