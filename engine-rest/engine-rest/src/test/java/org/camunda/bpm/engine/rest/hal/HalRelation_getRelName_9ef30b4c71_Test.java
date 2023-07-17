package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HalRelation_getRelName_9ef30b4c71_Test {

    @Mock
    private HalRelation halRelation;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRelName_WhenRelNameIsSet() {
        String expectedRelName = "relationName";
        halRelation.setRelName(expectedRelName);

        String actualRelName = halRelation.getRelName();

        assertEquals(expectedRelName, actualRelName, "The relation name should match the set value");
    }

    @Test
    public void testGetRelName_WhenRelNameIsNotSet() {
        String expectedRelName = null;

        String actualRelName = halRelation.getRelName();

        assertEquals(expectedRelName, actualRelName, "The relation name should be null when not set");
    }
}
