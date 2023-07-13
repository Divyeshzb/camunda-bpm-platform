package org.camunda.bpm.engine.authorization;

public class MissingAuthorization {

    private String permissionName;
    private String resourceType;
    private String resourceId;

    public MissingAuthorization() {
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "MissingAuthorization[permissionName=" + permissionName
                + ", resourceType=" + resourceType
                + ", resourceId=" + resourceId
                + "]";
    }
}
