package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.camunda.bpm.engine.authorization.Resources;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProcessInstancePermissions_getTypes_a8ff202203_Test {

    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void setUp() {
        processInstancePermissions = new ProcessInstancePermissions();
    }

    @Test
    public void testGetTypes() {
        Resource[] expectedResources = Resources.values();
        Resource[] actualResources = processInstancePermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources, "The actual resources should match the expected resources");
    }

    @Test
    public void testGetTypesWhenResourcesAreNull() {
        processInstancePermissions.setResources(null); // Assuming that there's a setter for RESOURCES
        Resource[] expectedResources = null;
        Resource[] actualResources = processInstancePermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources, "The actual resources should be null");
    }
}
