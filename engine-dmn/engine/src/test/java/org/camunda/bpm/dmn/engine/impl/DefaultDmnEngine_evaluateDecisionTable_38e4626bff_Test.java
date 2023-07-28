package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_evaluateDecisionTable_38e4626bff_Test {

  @InjectMocks
  private DefaultDmnEngine defaultDmnEngine = new DefaultDmnEngine();

  @Mock
  private DmnDecisionTableResult decisionTableResult = mock(DmnDecisionTableResult.class);

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testEvaluateDecisionTable_Success() {
    String decisionKey = "testKey";
    InputStream inputStream = mock(InputStream.class);
    Map<String, Object> variables = new HashMap<>();
    variables.put("testVar", "testValue");

    when(defaultDmnEngine.evaluateDecisionTable(decisionKey, inputStream, Variables.fromMap(variables).asVariableContext())).thenReturn(decisionTableResult);

    DmnDecisionTableResult result = defaultDmnEngine.evaluateDecisionTable(decisionKey, inputStream, variables);

    assertNotNull(result);
    assertEquals(decisionTableResult, result);
  }

  @Test
  public void testEvaluateDecisionTable_NullVariables() {
    String decisionKey = "testKey";
    InputStream inputStream = mock(InputStream.class);

    try {
      defaultDmnEngine.evaluateDecisionTable(decisionKey, inputStream, null);
      fail("Expected an IllegalArgumentException to be thrown");
    } catch (IllegalArgumentException e) {
      assertEquals("variables cannot be null", e.getMessage());
    }
  }
}
