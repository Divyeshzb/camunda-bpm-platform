package org.camunda.bpm.engine.authorization;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchPermissions_forName_183d8c5ef5_Test {

    @Before
    public void setUp() {
        // No setup required if BatchPermissions does not have a default constructor
    }

    @Test
    public void testForNameValid() {
        Permissions expectedPermission = Permissions.READ;
        Permissions actualPermission = BatchPermissions.forName("READ"); // Assuming forName is a static method
        assertEquals(expectedPermission, actualPermission);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNameInvalid() {
        BatchPermissions.forName("INVALID_PERMISSION"); // Assuming forName is a static method
    }

    @Test
    public void testForNameNull() {
        try {
            BatchPermissions.forName(null); // Assuming forName is a static method
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Name is null"));
        }
    }

    @Test
    public void testForNameEmpty() {
        try {
            BatchPermissions.forName(""); // Assuming forName is a static method
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Name is empty"));
        }
    }
}
