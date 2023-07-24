// Test generated by RoostGPT for test camuda-engine-test using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.engine.rest.filter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import javax.servlet.ServletInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractEmptyBodyFilter_getReader_fd7d8a97aa_Test {

    private AbstractEmptyBodyFilter abstractEmptyBodyFilter;

    @Before
    public void setUp() {
        abstractEmptyBodyFilter = new AbstractEmptyBodyFilter();
    }

    @Test
    public void testGetReader() throws IOException {
        String testString = "test string";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(testString.getBytes());
        ServletInputStream servletInputStream = new ServletInputStream() {
            public int read() throws IOException {
                return byteArrayInputStream.read();
            }
        };

        BufferedReader expected = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        BufferedReader actual = abstractEmptyBodyFilter.getReader(servletInputStream);

        assertEquals(expected.readLine(), actual.readLine());
    }

    @Test
    public void testGetReaderWithEmptyStream() throws IOException {
        String testString = "";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(testString.getBytes());
        ServletInputStream servletInputStream = new ServletInputStream() {
            public int read() throws IOException {
                return byteArrayInputStream.read();
            }
        };

        BufferedReader expected = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        BufferedReader actual = abstractEmptyBodyFilter.getReader(servletInputStream);

        assertEquals(expected.readLine(), actual.readLine());
    }
}
