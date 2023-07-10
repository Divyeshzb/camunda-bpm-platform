// Test generated by RoostGPT for test camunda-engine-unit using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.application;

import org.camunda.bpm.ProcessApplicationExecutionException;
import org.camunda.bpm.container.RuntimeContainerDelegate;
import org.camunda.bpm.engine.impl.context.Context;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.concurrent.Callable;

public class AbstractProcessApplication_execute_06e62b6040_Test {

    @Mock
    private Callable<String> mockCallable;

    @Mock
    private InvocationContext mockInvocationContext;

    private AbstractProcessApplication abstractProcessApplication;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        abstractProcessApplication = new AbstractProcessApplication() {
            @Override
            public String getName() {
                return "Test Process Application";
            }
        };
    }

    @Test
    public void testExecute_ShouldReturnExpectedResultWhenCallableExecutesSuccessfully() throws Exception {
        // Arrange
        String expected = "Expected Result";
        Mockito.when(mockCallable.call()).thenReturn(expected);

        // Act
        String actual = abstractProcessApplication.execute(mockCallable, mockInvocationContext);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testExecute_ShouldThrowProcessApplicationExecutionExceptionWhenCallableExecutionFails() throws Exception {
        // Arrange
        Mockito.when(mockCallable.call()).thenThrow(new Exception("Test Exception"));

        // Act & Assert
        Assertions.assertThrows(ProcessApplicationExecutionException.class, () -> {
            abstractProcessApplication.execute(mockCallable, mockInvocationContext);
        });
    }
}
