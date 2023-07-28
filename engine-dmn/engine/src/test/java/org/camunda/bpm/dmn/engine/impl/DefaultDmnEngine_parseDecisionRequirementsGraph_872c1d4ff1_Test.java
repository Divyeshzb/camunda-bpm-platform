package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.camunda.bpm.dmn.engine.DmnDecisionRequirementsGraph;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_parseDecisionRequirementsGraph_872c1d4ff1_Test {

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine;

    @Mock
    private DmnTransformer transformer;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseDecisionRequirementsGraph() {
        InputStream inputStream = new ByteArrayInputStream("test data".getBytes());
        DmnDecisionRequirementsGraph mockGraph = mock(DmnDecisionRequirementsGraph.class);
        when(transformer.createTransform().modelInstance(inputStream).transformDecisionRequirementsGraph()).thenReturn(mockGraph);

        DmnDecisionRequirementsGraph result = defaultDmnEngine.parseDecisionRequirementsGraph(inputStream);

        assertNotNull(result);
        assertEquals(mockGraph, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDecisionRequirementsGraphWithNullInputStream() {
        defaultDmnEngine.parseDecisionRequirementsGraph(null);
    }
}
