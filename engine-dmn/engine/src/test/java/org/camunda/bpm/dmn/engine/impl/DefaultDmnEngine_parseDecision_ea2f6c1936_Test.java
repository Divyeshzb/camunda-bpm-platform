package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.camunda.bpm.dmn.engine.DmnDecision;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultDmnEngine_parseDecision_ea2f6c1936_Test {

    @Test
    public void testParseDecision_success() {
        String decisionKey = "testKey";
        InputStream inputStream = new ByteArrayInputStream("testData".getBytes(StandardCharsets.UTF_8));
        DmnDecision decision1 = mock(DmnDecision.class);
        DmnDecision decision2 = mock(DmnDecision.class);
        when(decision1.getKey()).thenReturn("otherKey");
        when(decision2.getKey()).thenReturn(decisionKey);
        List<DmnDecision> decisions = Arrays.asList(decision1, decision2);
        DefaultDmnEngine engine = new DefaultDmnEngine();
        engine.setDecisions(decisions);
        DmnDecision result = engine.parseDecision(decisionKey, inputStream);
        assertEquals(decision2, result);
    }

    @Test(expected = DecisionNotFoundException.class)
    public void testParseDecision_decisionNotFound() {
        String decisionKey = "testKey";
        InputStream inputStream = new ByteArrayInputStream("testData".getBytes(StandardCharsets.UTF_8));
        DmnDecision decision = mock(DmnDecision.class);
        when(decision.getKey()).thenReturn("otherKey");
        List<DmnDecision> decisions = Arrays.asList(decision);
        DefaultDmnEngine engine = new DefaultDmnEngine();
        engine.setDecisions(decisions);
        engine.parseDecision(decisionKey, inputStream);
    }
}
