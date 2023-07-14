package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SystemPermissions_getName_4ad76af4d7_Test {

    @InjectMocks
    private SystemPermissions systemPermissions = new SystemPermissions();

    @Mock
    private NameService nameService = new NameService();

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "John Doe";
        when(nameService.getName()).thenReturn(expectedName);
        String actualName = systemPermissions.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetName_Failure() {
        String expectedName = null;
        when(nameService.getName()).thenReturn(expectedName);
        String actualName = systemPermissions.getName();
        assertEquals(expectedName, actualName);
    }
}
