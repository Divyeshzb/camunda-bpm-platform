package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.ProcessEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HalResource_get_links_0951274914_Test {

    @MockBean
    private ProcessEngine processEngine;

    private HalResource halResource;

    @BeforeEach
    public void setup() {
        halResource = new HalResource();
    }

    @Test
    public void testGetLinks_Success() {
        Map<String, HalLink> expectedLinks = new HashMap<>();
        expectedLinks.put("self", new HalLink(URI.create("http://localhost:8080/api/self")));
        expectedLinks.put("next", new HalLink(URI.create("http://localhost:8080/api/next")));

        halResource._links = expectedLinks;

        Map<String, HalLink> actualLinks = halResource.get_links();

        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void testGetLinks_Empty() {
        Map<String, HalLink> expectedLinks = new HashMap<>();

        halResource._links = expectedLinks;

        Map<String, HalLink> actualLinks = halResource.get_links();

        assertEquals(expectedLinks, actualLinks);
    }
}
