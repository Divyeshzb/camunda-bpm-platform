package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.Resource;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;

@SpringBootTest
public class UserOperationLogCategoryPermissions_getTypes_a8ff202203_Test {

    @MockBean
    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    private Resource[] RESOURCES = new Resource[3];

    @BeforeEach
    public void setup() {
        RESOURCES[0] = mock(Resource.class);
        RESOURCES[1] = mock(Resource.class);
        RESOURCES[2] = mock(Resource.class);

        when(userOperationLogCategoryPermissions.getTypes()).thenReturn(RESOURCES);
    }

    @Test
    public void testGetTypes() {
        Resource[] actualResources = userOperationLogCategoryPermissions.getTypes();
        assertArrayEquals(RESOURCES, actualResources);
    }

    @Test
    public void testGetTypes_Empty() {
        RESOURCES = new Resource[0];
        when(userOperationLogCategoryPermissions.getTypes()).thenReturn(RESOURCES);
        Resource[] actualResources = userOperationLogCategoryPermissions.getTypes();
        assertArrayEquals(RESOURCES, actualResources);
    }
}
