package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class ProcessInstancePermissions_getTypes_a8ff202203_Test {

    @MockBean
    private ProcessInstancePermissions processInstancePermissions;

    private static final Resource[] RESOURCES;

    @BeforeEach
    public void setup() {
        RESOURCES = new Resource[] { new Resource(), new Resource() };
        when(processInstancePermissions.getTypes()).thenReturn(RESOURCES);
    }

    @Test
    public void testGetTypesSuccess() {
        Resource[] actualResources = processInstancePermissions.getTypes();
        assertArrayEquals(RESOURCES, actualResources, "The expected and actual resources should match");
    }

    @Test
    public void testGetTypesFailure() {
        Resource[] RESOURCES_FAILURE = new Resource[] { new Resource() };
        when(processInstancePermissions.getTypes()).thenReturn(RESOURCES_FAILURE);
        Resource[] actualResources = processInstancePermissions.getTypes();
        assertArrayEquals(RESOURCES_FAILURE, actualResources, "The expected and actual resources should not match");
    }
}
