package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HalLink_setHref_34aba2e6a5_Test {

    private HalLink halLink;

    @Mock
    private String href;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        halLink = new HalLink();
    }

    @Test
    public void testSetHref_Success() {
        String expectedHref = "https://example.com";
        when(href.toString()).thenReturn(expectedHref);

        halLink.setHref(href);
        assertEquals(expectedHref, halLink.getHref());
    }

    @Test
    public void testSetHref_Null() {
        when(href.toString()).thenReturn(null);

        halLink.setHref(href);
        assertEquals(null, halLink.getHref());
    }
}
