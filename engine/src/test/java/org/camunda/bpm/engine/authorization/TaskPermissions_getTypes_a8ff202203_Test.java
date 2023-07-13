package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class TaskPermissions_getTypes_a8ff202203_Test {

    @MockBean
    private TaskPermissions taskPermissions;

    private Resource[] RESOURCES;

    @BeforeEach
    public void setUp() {
        RESOURCES = new Resource[]{mock(Resource.class), mock(Resource.class)};
        when(taskPermissions.getTypes()).thenReturn(RESOURCES);
    }

    @Test
    public void testGetTypes_success() {
        Resource[] actualResources = taskPermissions.getTypes();
        assertArrayEquals(RESOURCES, actualResources, "Resources returned are not as expected");
    }

    @Test
    public void testGetTypes_noResources() {
        when(taskPermissions.getTypes()).thenReturn(new Resource[]{});
        Resource[] actualResources = taskPermissions.getTypes();
        assertArrayEquals(new Resource[]{}, actualResources, "Resources returned are not as expected when there are no resources");
    }
}
