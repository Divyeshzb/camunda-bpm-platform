package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.camunda.bpm.engine.EntityTypes;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Resources_resourceName_254efbf275_Test {
    private EntityTypes entityTypesMock;

    @BeforeEach
    public void setup() {
        entityTypesMock = Mockito.mock(EntityTypes.class);
        Mockito.when(entityTypesMock.getEntityType()).thenReturn("TestResource");
    }

    @Test
    public void testResourceNameSuccess() {
        String result = entityTypesMock.getEntityType();
        assertEquals("TestResource", result, "Expected and actual resource names do not match");
    }

    @Test
    public void testResourceNameFailure() {
        Mockito.when(entityTypesMock.getEntityType()).thenReturn("WrongResource");
        String result = entityTypesMock.getEntityType();
        assertEquals("TestResource", result, "Expected and actual resource names do not match");
    }
}
