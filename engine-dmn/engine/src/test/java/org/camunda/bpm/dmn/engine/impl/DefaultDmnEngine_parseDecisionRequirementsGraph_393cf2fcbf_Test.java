package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.camunda.bpm.dmn.engine.DmnDecisionRequirementsGraph;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_parseDecisionRequirementsGraph_393cf2fcbf_Test {

    @Mock
    private DmnTransformer transformer;

    private DefaultDmnEngine defaultDmnEngine;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        defaultDmnEngine = new DefaultDmnEngine();
    }

    @Test
    public void testParseDecisionRequirementsGraph_Success() {
        DmnModelInstance dmnModelInstance = mock(DmnModelInstance.class);
        DmnDecisionRequirementsGraph expectedGraph = mock(DmnDecisionRequirementsGraph.class);

        when(transformer.createTransform().modelInstance(dmnModelInstance).transformDecisionRequirementsGraph()).thenReturn(expectedGraph);

        DmnDecisionRequirementsGraph actualGraph = defaultDmnEngine.parseDecisionRequirementsGraph(dmnModelInstance);

        assertNotNull(actualGraph);
        assertEquals(expectedGraph, actualGraph);
    }

    @Test
    public void testParseDecisionRequirementsGraph_NullInput() {
        try {
            defaultDmnEngine.parseDecisionRequirementsGraph(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("dmnModelInstance", e.getMessage());
        }
    }
}
