package org.camunda.bpm.engine.rest.filter;

import javax.servlet.ServletInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AbstractEmptyBodyFilter_getReader_fd7d8a97aa_Test {

    private AbstractEmptyBodyFilter abstractEmptyBodyFilter;

    @BeforeEach
    public void setup() {
        abstractEmptyBodyFilter = new AbstractEmptyBodyFilter();
    }

    @Test
    public void testGetReader() throws IOException {
        String input = "Test string";
        ServletInputStream inputStream = mock(ServletInputStream.class);
        when(inputStream.read()).thenReturn((int) input.charAt(0), (int) input.charAt(1), -1);

        BufferedReader reader = abstractEmptyBodyFilter.getReader(inputStream);
        String output = reader.readLine();
        
        assertEquals(input, output);
    }

    @Test
    public void testGetReaderWithEmptyStream() throws IOException {
        String input = "";
        ServletInputStream inputStream = mock(ServletInputStream.class);
        when(inputStream.read()).thenReturn(-1);

        BufferedReader reader = abstractEmptyBodyFilter.getReader(inputStream);
        String output = reader.readLine();
        
        assertEquals(input, output);
    }
}
