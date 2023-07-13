package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class EntityTypes {
    // Assuming this class has a method resourceType() that returns an int
    public int resourceType() {
        // TODO: return the appropriate value
        return 0;
    }
}

class Resources_resourceType_d7d30ba403_Test {

    private EntityTypes entityTypes;

    @BeforeEach
    public void setup() {
        entityTypes = new EntityTypes();
        // TODO: Set the 'id' value for 'entityTypes' object here
    }

    @Test
    public void testResourceType_validId() {
        int expectedId = 1;  // TODO: Change this to the expected 'id' value
        assertEquals(expectedId, entityTypes.resourceType());
    }

    @Test
    public void testResourceType_invalidId() {
        int unexpectedId = 2;  // TODO: Change this to a value that 'id' should not be
        assertNotEquals(unexpectedId, entityTypes.resourceType());
    }
}
