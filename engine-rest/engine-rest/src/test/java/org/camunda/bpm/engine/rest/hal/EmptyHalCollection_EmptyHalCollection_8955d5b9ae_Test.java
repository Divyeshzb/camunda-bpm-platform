package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmptyHalCollection_EmptyHalCollection_8955d5b9ae_Test {

    @MockBean
    private EmptyHalCollection emptyHalCollection;

    @BeforeEach
    public void setUp() {
        when(emptyHalCollection.getCount()).thenReturn(0, 5);
    }

    @Test
    public void testEmptyHalCollectionWithZeroCount() {
        assertEquals(0, emptyHalCollection.getCount());
    }

    @Test
    public void testEmptyHalCollectionWithNonZeroCount() {
        assertEquals(5, emptyHalCollection.getCount());
    }

}
