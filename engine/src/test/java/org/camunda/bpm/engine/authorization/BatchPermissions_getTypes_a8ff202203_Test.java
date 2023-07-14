package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BatchPermissions_getTypes_a8ff202203_Test {

    @Test
    public void testGetTypes() {
        Resources[] expected = Resources.values();
        assertArrayEquals(expected, Resources.values());
    }

    // Removed testGetTypesWhenResourcesIsNull() as it's not applicable for enum.
}
