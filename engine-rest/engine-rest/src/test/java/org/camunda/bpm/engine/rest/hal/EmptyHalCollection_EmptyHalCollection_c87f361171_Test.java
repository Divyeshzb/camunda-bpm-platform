package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmptyHalCollection_EmptyHalCollection_c87f361171_Test {

    private EmptyHalCollection emptyHalCollection;

    @BeforeEach
    public void setUp() {
        emptyHalCollection = new EmptyHalCollection();
    }

    @Test
    public void testEmptyHalCollection_Success() {
        Map<String, Object> links = emptyHalCollection.get_links();
        Map<String, Object> embedded = emptyHalCollection.get_embedded();
        long count = emptyHalCollection.getCount();

        assertTrue(links.isEmpty());
        assertTrue(embedded.isEmpty());
        assertEquals(0, count);
    }

    @Test
    public void testEmptyHalCollection_Failure() {
        Map<String, Object> links = emptyHalCollection.get_links();
        Map<String, Object> embedded = emptyHalCollection.get_embedded();
        long count = emptyHalCollection.getCount();

        assertFalse(links.containsKey("randomKey"));
        assertFalse(embedded.containsKey("randomKey"));
        assertNotEquals(10, count);
    }
}
