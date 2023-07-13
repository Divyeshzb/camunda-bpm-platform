package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HistoricProcessInstancePermissions_getTypes_a8ff202203_Test {

    @Mock
    private HistoricProcessInstancePermissions historicProcessInstancePermissions;

    @Mock
    private Resource resource1;

    @Mock
    private Resource resource2;

    private Resource[] RESOURCES;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        RESOURCES = new Resource[]{resource1, resource2};
        when(historicProcessInstancePermissions.getTypes()).thenReturn(RESOURCES);
    }

    @Test
    public void testGetTypes_Success() {
        Resource[] actualResources = historicProcessInstancePermissions.getTypes();
        assertArrayEquals(RESOURCES, actualResources, "Returned resources should match the expected resources");
    }

    @Test
    public void testGetTypes_Empty() {
        when(historicProcessInstancePermissions.getTypes()).thenReturn(new Resource[]{});
        Resource[] actualResources = historicProcessInstancePermissions.getTypes();
        assertArrayEquals(new Resource[]{}, actualResources, "Returned resources should be empty");
    }
}
