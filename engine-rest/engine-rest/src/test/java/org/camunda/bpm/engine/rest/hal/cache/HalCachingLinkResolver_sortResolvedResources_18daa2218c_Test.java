package org.camunda.bpm.engine.rest.hal.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import org.camunda.bpm.engine.rest.hal.HalResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HalCachingLinkResolver_sortResolvedResources_18daa2218c_Test {

    private HalCachingLinkResolver halCachingLinkResolver;
    private Comparator<HalResource<?>> comparator;

    @BeforeEach
    public void setup() {
        halCachingLinkResolver = Mockito.spy(new HalCachingLinkResolver());
        comparator = Mockito.mock(Comparator.class);
        Mockito.doReturn(comparator).when(halCachingLinkResolver).getResourceComparator();
    }

    @Test
    public void testSortResolvedResources_WhenComparatorIsNull() {
        Mockito.doReturn(null).when(halCachingLinkResolver).getResourceComparator();
        List<HalResource<?>> resolvedResources = new ArrayList<>();
        halCachingLinkResolver.sortResolvedResources(resolvedResources);
        Mockito.verify(comparator, Mockito.never()).compare(Mockito.any(), Mockito.any());
    }

    @Test
    public void testSortResolvedResources_WhenComparatorIsNotNull() {
        List<HalResource<?>> resolvedResources = new ArrayList<>();
        resolvedResources.add(Mockito.mock(HalResource.class));
        resolvedResources.add(Mockito.mock(HalResource.class));
        halCachingLinkResolver.sortResolvedResources(resolvedResources);
        Mockito.verify(comparator, Mockito.times(1)).compare(Mockito.any(), Mockito.any());
    }
}
