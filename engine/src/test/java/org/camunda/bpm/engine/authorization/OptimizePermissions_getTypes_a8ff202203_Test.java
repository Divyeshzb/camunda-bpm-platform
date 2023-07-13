package org.camunda.bpm.engine.authorization;

import org.camunda.bpm.engine.authorization.Resources;
import org.camunda.bpm.engine.authorization.OptimizePermissions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OptimizePermissions_getTypes_a8ff202203_Test {

    @Test
    public void testGetTypesSuccess() {
        OptimizePermissions optimizePermissions = new OptimizePermissions();
        Resources[] expectedResources = Resources.values();
        Resources[] actualResources = optimizePermissions.getTypes();
        assertArrayEquals(expectedResources, actualResources);
    }

    @Test
    public void testGetTypesFailure() {
        OptimizePermissions optimizePermissions = new OptimizePermissions();
        Resources[] unexpectedResources = {};
        Resources[] actualResources = optimizePermissions.getTypes();
        assertNotEquals(unexpectedResources, actualResources);
    }
}
