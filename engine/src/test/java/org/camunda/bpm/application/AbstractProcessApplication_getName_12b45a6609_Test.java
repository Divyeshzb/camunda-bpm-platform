package org.camunda.bpm.application;

import org.camunda.bpm.application.impl.AbstractProcessApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AbstractProcessApplication_getName_12b45a6609_Test {

    @Mock
    private AbstractProcessApplication abstractProcessApplication;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetNameWithValue() {
        when(abstractProcessApplication.getName()).thenReturn("TestName");
        String name = abstractProcessApplication.getName();
        assertEquals("TestName", name);
    }

    @Test
    public void testGetNameWithNoValue() {
        when(abstractProcessApplication.getName()).thenReturn("");
        String name = abstractProcessApplication.getName();
        assertEquals("", name);
    }

    @Test
    public void testGetNameWithNull() {
        when(abstractProcessApplication.getName()).thenReturn(null);
        String name = abstractProcessApplication.getName();
        assertEquals(null, name);
    }
}
