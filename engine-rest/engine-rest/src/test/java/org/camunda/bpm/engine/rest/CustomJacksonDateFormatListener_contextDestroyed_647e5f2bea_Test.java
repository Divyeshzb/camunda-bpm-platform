// Test generated by RoostGPT for test camuda-engine-test using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.engine.rest;

import javax.servlet.ServletContextEvent;
import org.camunda.bpm.engine.rest.mapper.JacksonConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class CustomJacksonDateFormatListener_contextDestroyed_647e5f2bea_Test {

    @Mock
    ServletContextEvent sce;

    @InjectMocks
    CustomJacksonDateFormatListener customJacksonDateFormatListener;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testContextDestroyed() {
        // TODO: Replace with actual default format
        String expectedDateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

        customJacksonDateFormatListener.contextDestroyed(sce);

        // Verify that the date format was set to the default
        verify(JacksonConfigurator.class, times(1)).setDateFormatString(expectedDateFormat);
    }

    @Test
    public void testContextDestroyedWithNullEvent() {
        // TODO: Replace with actual default format
        String expectedDateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

        customJacksonDateFormatListener.contextDestroyed(null);

        // Verify that the date format was set to the default even if the event was null
        verify(JacksonConfigurator.class, times(1)).setDateFormatString(expectedDateFormat);
    }
}
