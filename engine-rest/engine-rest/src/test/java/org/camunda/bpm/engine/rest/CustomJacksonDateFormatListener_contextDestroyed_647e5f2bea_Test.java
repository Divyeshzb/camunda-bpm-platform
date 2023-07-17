package org.camunda.bpm.engine.rest;

import javax.servlet.ServletContextEvent;
import org.camunda.bpm.engine.rest.mapper.JacksonConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class CustomJacksonDateFormatListener_contextDestroyed_647e5f2bea_Test {

    private ServletContextEvent servletContextEvent;
    private JacksonConfigurator jacksonConfigurator;

    @BeforeEach
    public void setUp() {
        servletContextEvent = mock(ServletContextEvent.class);
        jacksonConfigurator = mock(JacksonConfigurator.class);
    }

    @Test
    public void testContextDestroyed_WithValidEvent() {
        doNothing().when(jacksonConfigurator).setDateFormatString(JacksonConfigurator.DEFAULT_DATE_FORMAT);
        CustomJacksonDateFormatListener listener = new CustomJacksonDateFormatListener();
        listener.contextDestroyed(servletContextEvent);
        verify(jacksonConfigurator, times(1)).setDateFormatString(JacksonConfigurator.DEFAULT_DATE_FORMAT);
    }

    @Test
    public void testContextDestroyed_WithNullEvent() {
        doNothing().when(jacksonConfigurator).setDateFormatString(JacksonConfigurator.DEFAULT_DATE_FORMAT);
        CustomJacksonDateFormatListener listener = new CustomJacksonDateFormatListener();
        listener.contextDestroyed(null);
        verify(jacksonConfigurator, times(1)).setDateFormatString(JacksonConfigurator.DEFAULT_DATE_FORMAT);
    }
}
