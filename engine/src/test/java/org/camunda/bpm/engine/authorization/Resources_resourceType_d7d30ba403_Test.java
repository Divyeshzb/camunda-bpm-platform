package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

interface EntityTypes {
    int getResourceType();
}

public class Resources_resourceType_d7d30ba403_Test {

    @Mock
    private EntityTypes entityTypes;

    private int id;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.id = 5; // TODO: Change the id value as per your requirement
    }

    @Test
    public void testResourceType_Success() {
        when(entityTypes.getResourceType()).thenReturn(id);

        int returnedId = entityTypes.getResourceType();
        assertEquals(id, returnedId, "Returned ID should match the expected ID");
    }

    @Test
    public void testResourceType_Failure() {
        when(entityTypes.getResourceType()).thenReturn(0);

        int returnedId = entityTypes.getResourceType();
        assertEquals(0, returnedId, "Returned ID should be 0 as we set it to 0 in mock");
    }
}
