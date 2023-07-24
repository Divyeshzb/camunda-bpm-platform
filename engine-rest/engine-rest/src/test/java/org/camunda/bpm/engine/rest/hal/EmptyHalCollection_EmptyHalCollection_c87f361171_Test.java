// Test generated by RoostGPT for test camuda-engine-test using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class EmptyHalCollection_EmptyHalCollection_c87f361171_Test {

    private EmptyHalCollection emptyHalCollection;

    @BeforeEach
    public void setUp() {
        emptyHalCollection = new EmptyHalCollection(5);
    }

    @Test
    public void testEmptyHalCollection() {
        assertTrue(emptyHalCollection._links.isEmpty());
        assertTrue(emptyHalCollection._embedded.isEmpty());
        assertEquals(5, emptyHalCollection.count);
    }

    @Test
    public void testEmptyHalCollectionZeroCount() {
        EmptyHalCollection zeroCountCollection = new EmptyHalCollection(0);
        assertTrue(zeroCountCollection._links.isEmpty());
        assertTrue(zeroCountCollection._embedded.isEmpty());
        assertEquals(0, zeroCountCollection.count);
    }
}
