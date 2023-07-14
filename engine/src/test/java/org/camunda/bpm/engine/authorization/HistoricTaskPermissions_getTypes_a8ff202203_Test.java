package org.camunda.bpm.engine.authorization;

import org.camunda.bpm.engine.authorization.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HistoricTaskPermissions_getTypes_a8ff202203_Test {

    @InjectMocks
    private HistoricTaskPermissions historicTaskPermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        historicTaskPermissions = new HistoricTaskPermissions();
    }

    @Test
    public void testGetTypes() {
        Resource[] expectedResources = new Resource[]{}; // TODO: Initialize with expected resources
        Resource[] actualResources = historicTaskPermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources, "The expected and actual resources do not match.");
    }

    @Test
    public void testGetTypesWhenResourcesAreNull() {
        Resource[] expectedResources = null;
        Resource[] actualResources = historicTaskPermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources, "The expected and actual resources do not match when resources are null.");
    }
}
