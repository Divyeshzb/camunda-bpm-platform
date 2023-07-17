package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HalCollectionResource_getCount_3027ad163a_Test {

    @InjectMocks
    HalCollectionResource halCollectionResource;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetCount_success() {
        halCollectionResource.count = 5;
        long result = halCollectionResource.getCount();
        assertEquals(5, result, "Count value should be 5");
    }

    @Test
    public void testGetCount_zero() {
        halCollectionResource.count = 0;
        long result = halCollectionResource.getCount();
        assertEquals(0, result, "Count value should be 0");
    }

    @Test
    public void testGetCount_negative() {
        halCollectionResource.count = -3;
        long result = halCollectionResource.getCount();
        assertEquals(-3, result, "Count value should be -3");
    }
}
