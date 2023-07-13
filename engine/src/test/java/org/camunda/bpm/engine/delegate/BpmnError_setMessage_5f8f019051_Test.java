package org.camunda.bpm.engine.delegate;

public class BpmnError extends Exception {

    private String errorCode;

    public BpmnError(String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
    }

    public BpmnError(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
