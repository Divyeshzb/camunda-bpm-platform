package org.camunda.bpm.engine.exception;

public class DeploymentResourceNotFoundException extends RuntimeException {

    public DeploymentResourceNotFoundException() {
        super();
    }

    public DeploymentResourceNotFoundException(String message) {
        super(message);
    }
}
