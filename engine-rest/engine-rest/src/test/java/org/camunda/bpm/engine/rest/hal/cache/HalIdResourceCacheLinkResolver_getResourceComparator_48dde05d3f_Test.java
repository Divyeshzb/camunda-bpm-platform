package org.camunda.bpm.engine.rest.hal.cache;

import java.util.Comparator;
import org.camunda.bpm.engine.rest.hal.HalIdResource;
import org.camunda.bpm.engine.rest.hal.HalResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HalIdResourceCacheLinkResolver_getResourceComparator_48dde05d3f_Test {

    private HalIdResourceCacheLinkResolver linkResolver;

    @BeforeEach
    public void setUp() {
        linkResolver = new HalIdResourceCacheLinkResolver();
    }

    @Test
    public void testGetResourceComparator() {
        Comparator<HalResource<?>> comparator = linkResolver.getResourceComparator();
        HalResource<?> resource1 = new HalIdResource("1");
        HalResource<?> resource2 = new HalIdResource("2");

        assertEquals(-1, comparator.compare(resource1, resource2));
    }

    @Test
    public void testGetResourceComparatorWithEqualResources() {
        Comparator<HalResource<?>> comparator = linkResolver.getResourceComparator();
        HalResource<?> resource1 = new HalIdResource("1");
        HalResource<?> resource2 = new HalIdResource("1");

        assertEquals(0, comparator.compare(resource1, resource2));
    }
}
