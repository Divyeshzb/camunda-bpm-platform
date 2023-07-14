package org.camunda.bpm.engine.exception.cmmn;

public class CaseIllegalStateTransitionException extends Exception {
    public CaseIllegalStateTransitionException() {
        super();
    }

    public CaseIllegalStateTransitionException(String message) {
        super(message);
    }

    public CaseIllegalStateTransitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public CaseIllegalStateTransitionException(Throwable cause) {
        super(cause);
    }
}
