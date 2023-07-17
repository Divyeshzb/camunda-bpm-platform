// Test generated by RoostGPT for test camuda-engine-test using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.engine.rest.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class AbstractEmptyBodyFilter_destroy_1568201276_Test {

    @InjectMocks
    private AbstractEmptyBodyFilter abstractEmptyBodyFilter;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDestroy_success() {
        try {
            abstractEmptyBodyFilter.destroy();
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    public void testDestroy_failure() {
        FilterConfig filterConfig = mock(FilterConfig.class);
        when(filterConfig.getFilterName()).thenThrow(new ServletException());

        try {
            abstractEmptyBodyFilter.init(filterConfig);
            abstractEmptyBodyFilter.destroy();
            fail("Exception should have been thrown");
        } catch (ServletException e) {
            // Expected Exception
        }
    }
}
