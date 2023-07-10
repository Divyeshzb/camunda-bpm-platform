package org.camunda.bpm.application;

import org.camunda.bpm.application.impl.DefaultElResolverLookup;
import org.camunda.bpm.engine.impl.javax.el.ELResolver;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AbstractProcessApplication_deploy_8f83850263_Test {

    @Mock
    private AbstractProcessApplication abstractProcessApplication;

    @Mock
    private ELResolver elResolver;

    @Before
    public void setUp() {
        when(DefaultElResolverLookup.lookupResolver(abstractProcessApplication)).thenReturn(elResolver);
    }

    @Test
    public void testInitProcessApplicationElResolver() {
        ELResolver result = abstractProcessApplication.initProcessApplicationElResolver();
        assertEquals(elResolver, result);
    }

    @Test(expected = NullPointerException.class)
    public void testInitProcessApplicationElResolverWithException() {
        when(DefaultElResolverLookup.lookupResolver(null)).thenThrow(NullPointerException.class);
        abstractProcessApplication.initProcessApplicationElResolver();
    }
}
