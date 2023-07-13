package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class UserOperationLogCategoryPermissions_getTypes_a8ff202203_Test {

    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    @BeforeEach
    public void setup() {
        userOperationLogCategoryPermissions = new UserOperationLogCategoryPermissions();
    }

    @Test
    public void testGetTypes() {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();
        Resource resource3 = new Resource();
        Resource[] expectedResources = {resource1, resource2, resource3}; 
        userOperationLogCategoryPermissions.setResources(expectedResources);
        assertArrayEquals(expectedResources, userOperationLogCategoryPermissions.getTypes());
    }

    @Test
    public void testGetTypes_Empty() {
        Resource[] expectedResources = {};
        userOperationLogCategoryPermissions.setResources(expectedResources); 
        assertArrayEquals(expectedResources, userOperationLogCategoryPermissions.getTypes());
    }
}
