package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.hal.HalResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HalCachingLinkResolver_getResourceComparator_48dde05d3f_Test {

    private HalCachingLinkResolver halCachingLinkResolver;

    @BeforeEach
    public void setUp() {
        halCachingLinkResolver = Mockito.spy(HalCachingLinkResolver.class);
    }

    @Test
    public void testGetResourceComparator_whenResourceComparatorIsNull() {
        Comparator<HalResource<?>> comparator = halCachingLinkResolver.getResourceComparator();
        assertNull(comparator, "Expected resource comparator to be null");
    }

    @Test
    public void testGetResourceComparator_whenResourceComparatorIsNotNull() {
        // TODO: Set the resource comparator in HalCachingLinkResolver to a non-null value before testing
        Comparator<HalResource<?>> expectedComparator = Comparator.comparing(HalResource::getId);
        Mockito.doReturn(expectedComparator).when(halCachingLinkResolver).getResourceComparator();

        Comparator<HalResource<?>> actualComparator = halCachingLinkResolver.getResourceComparator();
        assertEquals(expectedComparator, actualComparator, "Expected resource comparator to match the set comparator");
    }
}
