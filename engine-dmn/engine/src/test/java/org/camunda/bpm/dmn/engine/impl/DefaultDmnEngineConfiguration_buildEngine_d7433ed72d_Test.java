package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.camunda.bpm.dmn.engine.DmnEngine;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class DefaultDmnEngineConfiguration_buildEngine_d7433ed72d_Test {

    @InjectMocks
    DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    DmnEngine dmnEngine;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testBuildEngineSuccess() {
        DmnEngine result = defaultDmnEngineConfiguration.buildEngine();
        assertNotNull(result, "Engine build should be successful and not null");
        assertTrue(result instanceof DefaultDmnEngine, "Engine build should return instance of DefaultDmnEngine");
    }

    @Test
    public void testBuildEngineFailure() {
        assertThrows(Exception.class, () -> defaultDmnEngineConfiguration.buildEngine(), "Engine build should throw an exception");
    }
}
