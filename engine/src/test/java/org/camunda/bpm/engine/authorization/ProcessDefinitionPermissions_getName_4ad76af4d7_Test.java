package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessDefinitionPermissions_getName_4ad76af4d7_Test {

  private ProcessDefinitionPermissions processDefinitionPermissions;

  @BeforeEach
  public void setup() {
    processDefinitionPermissions = new ProcessDefinitionPermissions();
    processDefinitionPermissions.setName("TestName");
  }

  @Test
  public void testGetName_Success() {
    String expectedName = "TestName";
    String actualName = processDefinitionPermissions.getName();
    assertEquals(expectedName, actualName, "The expected name does not match the actual name");
  }

  @Test
  public void testGetName_Failure() {
    String expectedName = "WrongName";
    String actualName = processDefinitionPermissions.getName();
    assertEquals(expectedName, actualName, "The expected name does not match the actual name");
  }
}
