package org.camunda.bpm.engine.rest.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PushbackInputStream;
import static org.mockito.Mockito.*;

public class AbstractEmptyBodyFilter_doFilter_5f0ac04764_Test {

    @Mock
    private HttpServletRequest request;

    @Mock
    private ServletResponse response;

    @Mock
    private FilterChain chain;

    @Mock
    private ServletInputStream inputStream;

    @Mock
    private PushbackInputStream pushbackInputStream;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoFilter_ContentTypeJsonAndBodyNotEmpty() throws IOException, ServletException {
        when(request.getContentType()).thenReturn("application/json");
        when(request.getInputStream()).thenReturn(inputStream);
        when(pushbackInputStream.read()).thenReturn(1);
        
        AbstractEmptyBodyFilter_doFilter_5f0ac04764_Test filter = new AbstractEmptyBodyFilter_doFilter_5f0ac04764_Test();
        filter.doFilter(request, response, chain);

        verify(chain, times(1)).doFilter(any(HttpServletRequest.class), eq(response));
    }

    @Test
    public void testDoFilter_ContentTypeJsonAndBodyEmpty() throws IOException, ServletException {
        when(request.getContentType()).thenReturn("application/json");
        when(request.getInputStream()).thenReturn(inputStream);
        when(pushbackInputStream.read()).thenReturn(-1);
        
        AbstractEmptyBodyFilter_doFilter_5f0ac04764_Test filter = new AbstractEmptyBodyFilter_doFilter_5f0ac04764_Test();
        filter.doFilter(request, response, chain);

        verify(chain, times(1)).doFilter(any(HttpServletRequest.class), eq(response));
    }

    @Test
    public void testDoFilter_ContentTypeNotJson() throws IOException, ServletException {
        when(request.getContentType()).thenReturn("text/html");
        
        AbstractEmptyBodyFilter_doFilter_5f0ac04764_Test filter = new AbstractEmptyBodyFilter_doFilter_5f0ac04764_Test();
        filter.doFilter(request, response, chain);

        verify(chain, times(1)).doFilter(request, response);
    }
}
