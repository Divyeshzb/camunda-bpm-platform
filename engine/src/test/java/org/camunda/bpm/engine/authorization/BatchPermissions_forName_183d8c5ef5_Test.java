package org.camunda.bpm.engine.authorization;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchPermissions_forName_183d8c5ef5_Test {

    @Test
    public void testForName_validPermissionName() {
        String validPermissionName = "READ";
        Permission actualPermission = BatchPermissions.forName(validPermissionName);
        // TODO: Replace READ with the expected Permission object
        Permission expectedPermission = new Permission();
        assertEquals(expectedPermission, actualPermission);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForName_invalidPermissionName() {
        String invalidPermissionName = "INVALID";
        BatchPermissions.forName(invalidPermissionName);
    }

    @Test
    public void testForName_nullPermissionName() {
        String nullPermissionName = null;
        Permission actualPermission = BatchPermissions.forName(nullPermissionName);
        assertNull(actualPermission);
    }
}
