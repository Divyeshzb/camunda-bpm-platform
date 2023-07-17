package org.camunda.bpm.engine.rest.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CacheControlFilter_init_00722f0ee6_Test {

    @Mock
    private FilterConfig filterConfig;

    private CacheControlFilter cacheControlFilter;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cacheControlFilter = new CacheControlFilter();
    }

    @Test
    public void testInitWithValidConfig() {
        assertDoesNotThrow(() -> cacheControlFilter.init(filterConfig));
    }

    @Test
    public void testInitWithNullConfig() {
        assertThrows(ServletException.class, () -> cacheControlFilter.init(null));
    }
}
