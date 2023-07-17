package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response;
import org.camunda.bpm.engine.AuthorizationException;
import org.camunda.bpm.engine.BadUserRequestException;
import org.camunda.bpm.engine.ParseException;
import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.migration.MigratingProcessInstanceValidationException;
import org.camunda.bpm.engine.migration.MigrationPlanValidationException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionHandlerHelper_getStatus_84f49827d0_Test {
  
  private ExceptionHandlerHelper exceptionHandlerHelper;
  
  @Before
  public void setUp() {
    exceptionHandlerHelper = new ExceptionHandlerHelper();
  }
  
  @Test
  public void testGetStatus_ForAuthorizationException() {
    AuthorizationException exception = new AuthorizationException("Unauthorized");
    Response.Status status = exceptionHandlerHelper.getStatus(exception);
    assertEquals(Response.Status.FORBIDDEN, status);
  }
  
  @Test
  public void testGetStatus_ForMigrationPlanValidationException() {
    MigrationPlanValidationException exception = new MigrationPlanValidationException("Invalid Migration Plan");
    Response.Status status = exceptionHandlerHelper.getStatus(exception);
    assertEquals(Response.Status.BAD_REQUEST, status);
  }
  
  @Test
  public void testGetStatus_ForMigratingProcessInstanceValidationException() {
    MigratingProcessInstanceValidationException exception = new MigratingProcessInstanceValidationException("Invalid Migrating Process Instance");
    Response.Status status = exceptionHandlerHelper.getStatus(exception);
    assertEquals(Response.Status.BAD_REQUEST, status);
  }
  
  @Test
  public void testGetStatus_ForBadUserRequestException() {
    BadUserRequestException exception = new BadUserRequestException("Bad User Request");
    Response.Status status = exceptionHandlerHelper.getStatus(exception);
    assertEquals(Response.Status.BAD_REQUEST, status);
  }
  
  @Test
  public void testGetStatus_ForParseException() {
    ParseException exception = new ParseException("Parse Error");
    Response.Status status = exceptionHandlerHelper.getStatus(exception);
    assertEquals(Response.Status.BAD_REQUEST, status);
  }
  
  @Test
  public void testGetStatus_ForProcessEngineException() {
    ProcessEngineException exception = new ProcessEngineException("Process Engine Error");
    Response.Status status = exceptionHandlerHelper.getStatus(exception);
    assertEquals(Response.Status.INTERNAL_SERVER_ERROR, status);
  }
}
