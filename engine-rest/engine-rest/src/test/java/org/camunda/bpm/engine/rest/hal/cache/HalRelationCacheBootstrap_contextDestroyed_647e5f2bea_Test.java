package org.camunda.bpm.engine.rest.hal.cache;

import javax.servlet.ServletContextEvent;
import org.camunda.bpm.engine.rest.hal.Hal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class HalRelationCacheBootstrap_contextDestroyed_647e5f2bea_Test {

    @InjectMocks
    HalRelationCacheBootstrap halRelationCacheBootstrap;

    @Mock
    ServletContextEvent servletContextEvent;

    @Before
    public void setUp() {
        // Removed the line where you were trying to mock the singleton
    }

    @Test
    public void testContextDestroyed_Success() {
        halRelationCacheBootstrap.contextDestroyed(servletContextEvent);
        // Verify the interaction with the singleton, not the singleton itself
        verify(Hal.getInstance(), times(1)).destroyHalRelationCaches();
    }

    @Test(expected = RuntimeException.class)
    public void testContextDestroyed_Failure() {
        // Mock the interaction with the singleton, not the singleton itself
        Mockito.doThrow(new RuntimeException()).when(Hal.getInstance()).destroyHalRelationCaches();
        halRelationCacheBootstrap.contextDestroyed(servletContextEvent);
    }
}
