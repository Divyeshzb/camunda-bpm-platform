package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Resources_resourceName_254efbf275_Test {

    private Resources resources;

    @BeforeEach
    public void setUp() {
        resources = new Resources();
    }

    @Test
    public void testResourceName() {
        String expectedName = "Resource1";
        resources.setResourceName(expectedName);
        String actualName = resources.getResourceName();
        assertEquals(expectedName, actualName, "The resource name should match the expected name");
    }

    @Test
    public void testResourceNameWithDifferentName() {
        String expectedName = "Resource2";
        resources.setResourceName(expectedName);
        String actualName = resources.getResourceName();
        assertEquals(expectedName, actualName, "The resource name should match the expected name");
    }

    @Test
    public void testResourceNameWithEmptyName() {
        String expectedName = "";
        resources.setResourceName(expectedName);
        String actualName = resources.getResourceName();
        assertEquals(expectedName, actualName, "The resource name should match the expected name");
    }

    @Test
    public void testResourceNameWithNullName() {
        String expectedName = null;
        resources.setResourceName(expectedName);
        String actualName = resources.getResourceName();
        assertEquals(expectedName, actualName, "The resource name should match the expected name");
    }
}
