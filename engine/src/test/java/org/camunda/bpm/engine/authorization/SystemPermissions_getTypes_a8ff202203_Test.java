package org.camunda.bpm.engine.authorization;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SystemPermissions_getTypes_a8ff202203_Test {

    @Mock
    private SystemPermissions systemPermissions;

    private Resource task;
    private Resource user;
    private Resource group;

    @Before
    public void setup() {
        task = new Resource();
        user = new Resource();
        group = new Resource();

        when(systemPermissions.getTypes()).thenReturn(new Resource[]{task, user});
    }

    @Test
    public void testGetTypesSuccess() {
        Resource[] expectedResources = new Resource[]{task, user};
        Resource[] actualResources = systemPermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources);
    }

    @Test
    public void testGetTypesFailure() {
        Resource[] unexpectedResources = new Resource[]{group};
        Resource[] actualResources = systemPermissions.getTypes();
        assertNotEquals(unexpectedResources, actualResources);
    }
}
