package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.camunda.bpm.engine.rest.exception.ExceptionHandlerHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionLogger_log_a2da351d24_Test {

    @Mock
    private ExceptionHandlerHelper exceptionHandlerHelper;

    private ExceptionLogger_log_a2da351d24 exceptionLogger;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        exceptionLogger = new ExceptionLogger_log_a2da351d24();
    }

    @Test
    public void testLogWithStatusCodeOver500() {
        Throwable throwable = new Throwable();
        Response.Status status = Response.Status.INTERNAL_SERVER_ERROR;
        when(exceptionHandlerHelper.getInstance().getStatus(throwable)).thenReturn(status);

        exceptionLogger.log(throwable);

        verify(exceptionLogger, times(1)).logWarn(String.valueOf(status.getStatusCode()), getStackTrace(throwable));
        verify(exceptionLogger, never()).logDebug(String.valueOf(status.getStatusCode()), getStackTrace(throwable));
    }

    @Test
    public void testLogWithStatusCodeLessThan500() {
        Throwable throwable = new Throwable();
        Response.Status status = Response.Status.BAD_REQUEST;
        when(exceptionHandlerHelper.getInstance().getStatus(throwable)).thenReturn(status);

        exceptionLogger.log(throwable);

        verify(exceptionLogger, never()).logWarn(String.valueOf(status.getStatusCode()), getStackTrace(throwable));
        verify(exceptionLogger, times(1)).logDebug(String.valueOf(status.getStatusCode()), getStackTrace(throwable));
    }

    private String getStackTrace(Throwable throwable) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        throwable.printStackTrace(printWriter);
        return result.toString();
    }
}
