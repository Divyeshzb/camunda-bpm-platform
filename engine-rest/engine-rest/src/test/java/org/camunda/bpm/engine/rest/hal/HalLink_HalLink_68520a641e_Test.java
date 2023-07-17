package org.camunda.bpm.engine.rest.hal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HalLink_HalLink_68520a641e_Test {

    private HalLink halLink;

    @BeforeEach
    public void setUp() {
        halLink = new HalLink();
    }

    @Test
    public void testHalLinkConstructor() {
        assertEquals(null, halLink.getHref());
    }

    @Test
    public void testHalLinkConstructorWithNull() {
        assertThrows(NullPointerException.class, () -> {
            new HalLink(null);
        });
    }
}
