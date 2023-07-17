package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class HalResource_addLink_fd4439994c_Test {

    private HalResource_addLink halResource;

    @BeforeEach
    void setUp() {
        halResource = new HalResource_addLink();
    }

    @Test
    void testAddLink_Success() throws URISyntaxException {
        URI testUri = new URI("http://test.com");
        halResource.addLink("testRel", testUri);
        assertTrue(halResource.getLinks().containsKey("testRel"));
        assertEquals("http://test.com", halResource.getLinks().get("testRel").getHref());
    }

    @Test
    void testAddLink_NullRel() throws URISyntaxException {
        URI testUri = new URI("http://test.com");
        assertThrows(NullPointerException.class, () -> halResource.addLink(null, testUri));
    }

    @Test
    void testAddLink_NullHrefUri() {
        assertThrows(NullPointerException.class, () -> halResource.addLink("testRel", null));
    }

    @Test
    void testAddLink_EmptyRel() throws URISyntaxException {
        URI testUri = new URI("http://test.com");
        assertThrows(IllegalArgumentException.class, () -> halResource.addLink("", testUri));
    }

    @Test
    void testAddLink_InvalidUri() {
        assertThrows(URISyntaxException.class, () -> halResource.addLink("testRel", new URI("htp://invalid.com")));
    }
}
