package org.camunda.bpm.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Map;
import java.util.HashMap;

@SpringBootTest
public class AbstractProcessApplication_getProperties_0739908020_Test {

    @Test
    public void testGetPropertiesSuccess() {
        AbstractProcessApplication app = mock(AbstractProcessApplication.class);
        when(app.getProperties()).thenReturn(new HashMap<>());

        Map<String, String> properties = app.getProperties();

        assertNotNull(properties, "Properties map should not be null");
        assertTrue(properties.isEmpty(), "Properties map should be empty");
    }

    @Test
    public void testGetPropertiesFailure() {
        AbstractProcessApplication app = null;

        assertThrows(NullPointerException.class, () -> {
            Map<String, String> properties = app.getProperties();
        }, "Should throw NullPointerException when the AbstractProcessApplication object is null");
    }
}
