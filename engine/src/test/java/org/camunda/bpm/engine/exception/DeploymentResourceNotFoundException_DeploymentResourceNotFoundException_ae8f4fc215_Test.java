package org.camunda.bpm.engine.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_ae8f4fc215_Test {

  private DeploymentResourceNotFoundException deploymentResourceNotFoundException;

  @BeforeEach
  public void setUp() {
    // Using the default constructor
    deploymentResourceNotFoundException = new DeploymentResourceNotFoundException();
  }

  @Test
  public void testDeploymentResourceNotFoundException() {
    assertThrows(ProcessEngineException.class, () -> {
      throw deploymentResourceNotFoundException;
    });
  }

  @Test
  public void testDeploymentResourceNotFoundExceptionWithMessage() {
    assertThrows(ProcessEngineException.class, () -> {
      throw deploymentResourceNotFoundException;
    });
  }
}
