package org.camunda.bpm.engine.rest.filter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class AbstractEmptyBodyFilter_destroy_1568201276_Test {

    @Mock
    private FilterConfig filterConfig;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDestroy_SuccessCase() {
        AbstractEmptyBodyFilter abstractEmptyBodyFilter = new AbstractEmptyBodyFilter();
        abstractEmptyBodyFilter.init(filterConfig);

        assertDoesNotThrow(() -> abstractEmptyBodyFilter.destroy());
    }

    @Test
    public void testDestroy_NotInitialized() {
        AbstractEmptyBodyFilter abstractEmptyBodyFilter = new AbstractEmptyBodyFilter();

        assertDoesNotThrow(() -> abstractEmptyBodyFilter.destroy());
    }
}
