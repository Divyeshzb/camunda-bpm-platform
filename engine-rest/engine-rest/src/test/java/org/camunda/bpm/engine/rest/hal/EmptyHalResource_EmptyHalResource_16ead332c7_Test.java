package org.camunda.bpm.engine.rest.hal;

import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmptyHalResource_EmptyHalResource_16ead332c7_Test {

    @Test
    public void testEmptyHalResourceLinks() {
        EmptyHalResource resource = new EmptyHalResource();
        assertEquals(Collections.emptyMap(), resource.getLinks(), "Links should be an empty map");
    }

    @Test
    public void testEmptyHalResourceEmbedded() {
        EmptyHalResource resource = new EmptyHalResource();
        assertEquals(Collections.emptyMap(), resource.getEmbedded(), "Embedded should be an empty map");
    }
}
