package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.camunda.bpm.engine.AuthorizationException;
import org.camunda.bpm.engine.BadUserRequestException;
import org.camunda.bpm.engine.ParseException;
import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.migration.MigratingProcessInstanceValidationException;
import org.camunda.bpm.engine.migration.MigrationPlanValidationException;
import org.camunda.bpm.engine.rest.dto.AuthorizationExceptionDto;
import org.camunda.bpm.engine.rest.dto.ExceptionDto;
import org.camunda.bpm.engine.rest.dto.ParseExceptionDto;
import org.camunda.bpm.engine.rest.dto.migration.MigratingProcessInstanceValidationExceptionDto;
import org.camunda.bpm.engine.rest.dto.migration.MigrationPlanValidationExceptionDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExceptionHandlerHelper_fromException_38c6b98bb3_Test {

    @Test
    public void testFromException_MigratingProcessInstanceValidationException() {
        MigratingProcessInstanceValidationException ex = new MigratingProcessInstanceValidationException();
        ExceptionDto dto = ExceptionHandlerHelper.fromException(ex);
        assertTrue(dto instanceof MigratingProcessInstanceValidationExceptionDto);
    }

    @Test
    public void testFromException_MigrationPlanValidationException() {
        MigrationPlanValidationException ex = new MigrationPlanValidationException();
        ExceptionDto dto = ExceptionHandlerHelper.fromException(ex);
        assertTrue(dto instanceof MigrationPlanValidationExceptionDto);
    }

    @Test
    public void testFromException_AuthorizationException() {
        AuthorizationException ex = new AuthorizationException();
        ExceptionDto dto = ExceptionHandlerHelper.fromException(ex);
        assertTrue(dto instanceof AuthorizationExceptionDto);
    }

    @Test
    public void testFromException_ParseException() {
        ParseException ex = new ParseException();
        ExceptionDto dto = ExceptionHandlerHelper.fromException(ex);
        assertTrue(dto instanceof ParseExceptionDto);
    }

    @Test
    public void testFromException_OtherException() {
        Exception ex = new Exception();
        ExceptionDto dto = ExceptionHandlerHelper.fromException(ex);
        assertTrue(dto instanceof ExceptionDto);
    }
}
