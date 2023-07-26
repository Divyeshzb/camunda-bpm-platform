package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_parseDecisions_5bc7b5e5b2_Test {

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine;

    @Mock
    private DmnTransformer transformer;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseDecisions_Success() {
        InputStream inputStream = new ByteArrayInputStream("test data".getBytes());
        DmnDecision decision1 = mock(DmnDecision.class);
        DmnDecision decision2 = mock(DmnDecision.class);
        List<DmnDecision> expectedDecisions = Arrays.asList(decision1, decision2);

        when(transformer.createTransform().modelInstance(inputStream).transformDecisions()).thenReturn(expectedDecisions);

        List<DmnDecision> actualDecisions = defaultDmnEngine.parseDecisions(inputStream);

        assertEquals(expectedDecisions, actualDecisions);
    }

    @Test
    public void testParseDecisions_NullInputStream() {
        assertThrows(IllegalArgumentException.class, () -> {
            defaultDmnEngine.parseDecisions(null);
        });
    }
}
