package org.camunda.bpm.engine.rest.hal.cache;

import org.camunda.bpm.engine.rest.hal.HalIdResource;
import org.camunda.bpm.engine.rest.hal.HalResource;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class HalIdResourceCacheLinkResolver_compare_952ab3ca3a_Test {

    private HalResource<?> resource1;
    private HalResource<?> resource2;

    @Before
    public void setUp() {
        resource1 = mock(HalIdResource.class);
        resource2 = mock(HalIdResource.class);
    }

    @Test
    public void testCompare_sameIds() {
        when(((HalIdResource) resource1).getId()).thenReturn("123");
        when(((HalIdResource) resource2).getId()).thenReturn("123");

        int result = compare(resource1, resource2);

        assertEquals(0, result);
    }

    @Test
    public void testCompare_differentIds() {
        when(((HalIdResource) resource1).getId()).thenReturn("123");
        when(((HalIdResource) resource2).getId()).thenReturn("124");

        int result = compare(resource1, resource2);

        assertEquals(-1, result);
    }

    @Test
    public void testCompare_nullId() {
        when(((HalIdResource) resource1).getId()).thenReturn(null);
        when(((HalIdResource) resource2).getId()).thenReturn("124");

        int result = compare(resource1, resource2);

        assertEquals(-1, result);
    }

    public int compare(HalResource<?> resource1, HalResource<?> resource2) {
        String id1 = ((HalIdResource) resource1).getId();
        String id2 = ((HalIdResource) resource2).getId();
        return id1.compareTo(id2);
    }
}
