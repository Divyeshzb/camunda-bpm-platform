package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DefaultDmnEngineConfiguration_buildEngine_d7433ed72d_Test {

    DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    DmnEngine dmnEngine;

    @BeforeEach
    public void setup() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testBuildEngineSuccess() {
        dmnEngine = defaultDmnEngineConfiguration.buildEngine();
        assertNotNull(dmnEngine);
    }

    @Test
    public void testBuildEngineFailure() {
        // TODO: Change the value of 'init' method to throw an exception
        assertThrows(RuntimeException.class, () -> defaultDmnEngineConfiguration.buildEngine());
    }
}
