package org.camunda.bpm.engine.rest.hal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.HashMap;
import java.util.Map;

public class Hal_getLinkResolver_c0a593cdd1_Test {

    private Map<Class<?>, HalLinkResolver> halLinkResolvers;
    private HalLinkResolver halLinkResolver;

    @BeforeEach
    public void setUp() {
        halLinkResolvers = new HashMap<>();
        halLinkResolver = Mockito.mock(HalLinkResolver.class);
        halLinkResolvers.put(HalLinkResolver.class, halLinkResolver);
    }

    @Test
    public void testGetLinkResolver_success() {
        HalLinkResolver result = halLinkResolvers.get(HalLinkResolver.class);
        assertEquals(halLinkResolver, result, "Expected and actual HalLinkResolver should match");
    }

    @Test
    public void testGetLinkResolver_failure() {
        HalLinkResolver result = halLinkResolvers.get(String.class);
        assertNull(result, "Expected null as no HalLinkResolver is mapped to String.class");
    }
}
