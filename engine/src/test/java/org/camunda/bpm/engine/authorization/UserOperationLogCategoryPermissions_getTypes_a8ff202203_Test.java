package org.camunda.bpm.engine.authorization;

import org.camunda.bpm.engine.authorization.Resources;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class UserOperationLogCategoryPermissions_getTypes_a8ff202203_Test {

    @Test
    public void testGetTypes() {
        Resources resources = new Resources();
        Resource[] expectedResources = resources.getTypes();
        Resource[] actualResources = resources.getTypes();
        assertArrayEquals(expectedResources, actualResources);
    }

    @Test
    public void testGetTypesWhenResourcesIsNull() {
        Resources resources = null;
        assertThrows(NullPointerException.class, () -> {
            Resource[] actualResources = resources.getTypes();
        }, "Resources object is null");
    }
}
