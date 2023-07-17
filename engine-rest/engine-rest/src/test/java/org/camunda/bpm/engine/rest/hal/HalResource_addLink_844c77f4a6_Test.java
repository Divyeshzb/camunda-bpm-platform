package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class HalResource_addLink_844c77f4a6_Test {

    private HalResource halResource;

    @BeforeEach
    public void setUp() {
        halResource = new HalResource();
    }

    @Test
    public void testAddLink() {
        halResource.addLink("self", "http://localhost:8080/api/test");

        Map<String, HalLink> links = halResource.getLinks();
        assertNotNull(links);
        assertEquals(1, links.size());
        assertEquals("http://localhost:8080/api/test", links.get("self").getHref());
    }

    @Test
    public void testAddLinkWithExistingLinks() {
        halResource.addLink("self", "http://localhost:8080/api/test1");
        halResource.addLink("next", "http://localhost:8080/api/test2");

        Map<String, HalLink> links = halResource.getLinks();
        assertNotNull(links);
        assertEquals(2, links.size());
        assertEquals("http://localhost:8080/api/test1", links.get("self").getHref());
        assertEquals("http://localhost:8080/api/test2", links.get("next").getHref());
    }
}
