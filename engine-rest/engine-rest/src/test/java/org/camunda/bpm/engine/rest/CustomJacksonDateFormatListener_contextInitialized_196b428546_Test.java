package org.camunda.bpm.engine.rest;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import org.camunda.bpm.engine.rest.mapper.JacksonConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

@RunWith(MockitoJUnitRunner.class)
public class CustomJacksonDateFormatListener_contextInitialized_196b428546_Test {

    private static final String CONTEXT_PARAM_NAME = "dateFormat";

    @Mock
    private ServletContextEvent servletContextEvent;

    @Mock
    private ServletContext servletContext;

    private CustomJacksonDateFormatListener listener;

    @Before
    public void setUp() {
        listener = new CustomJacksonDateFormatListener();
        when(servletContextEvent.getServletContext()).thenReturn(servletContext);
    }

    @Test
    public void testContextInitialized_withDateFormat() {
        String dateFormat = "yyyy-MM-dd";
        when(servletContext.getInitParameter(CONTEXT_PARAM_NAME)).thenReturn(dateFormat);

        listener.contextInitialized(servletContextEvent);

        verify(servletContext).getInitParameter(CONTEXT_PARAM_NAME);
    }

    @Test
    public void testContextInitialized_withoutDateFormat() {
        when(servletContext.getInitParameter(CONTEXT_PARAM_NAME)).thenReturn(null);

        listener.contextInitialized(servletContextEvent);

        verify(servletContext).getInitParameter(CONTEXT_PARAM_NAME);
    }
}
