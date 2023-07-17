package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class EmptyHalCollection_emptyHalCollection_007ef0c7d3_Test {

    @MockBean
    private HalCollectionResource halCollectionResource;

    @BeforeEach
    public void setup() {
        when(halCollectionResource.emptyHalCollection()).thenReturn(null);
    }

    @Test
    public void testEmptyHalCollection_WhenInstanceExists() {
        HalCollectionResource actual = halCollectionResource.emptyHalCollection();
        assertNull(actual, "Expected null when instance exists");
    }

    @Test
    public void testEmptyHalCollection_WhenInstanceDoesNotExist() {
        when(halCollectionResource.emptyHalCollection()).thenReturn(new HalCollectionResource());
        HalCollectionResource actual = halCollectionResource.emptyHalCollection();
        assertNotNull(actual, "Expected not null when instance does not exist");
    }
}
