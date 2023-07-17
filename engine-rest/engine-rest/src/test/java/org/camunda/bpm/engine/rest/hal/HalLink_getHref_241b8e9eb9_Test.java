package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HalLink_getHref_241b8e9eb9_Test {

    @InjectMocks
    private HalLink halLink;

    private String href;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        href = "http://example.com";
    }

    @Test
    public void testGetHref_Success() {
        halLink.setHref(href);
        String result = halLink.getHref();
        assertEquals(href, result);
    }

    @Test
    public void testGetHref_Null() {
        halLink.setHref(null);
        String result = halLink.getHref();
        assertEquals(null, result);
    }
}
