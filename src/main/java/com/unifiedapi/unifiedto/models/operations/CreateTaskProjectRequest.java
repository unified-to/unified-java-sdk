/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.TaskProject;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateTaskProjectRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends TaskProject> taskProject;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateTaskProjectRequest(
            Optional<? extends TaskProject> taskProject,
            String connectionId) {
        Utils.checkNotNull(taskProject, "taskProject");
        Utils.checkNotNull(connectionId, "connectionId");
        this.taskProject = taskProject;
        this.connectionId = connectionId;
    }
    
    public CreateTaskProjectRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaskProject> taskProject() {
        return (Optional<TaskProject>) taskProject;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateTaskProjectRequest withTaskProject(TaskProject taskProject) {
        Utils.checkNotNull(taskProject, "taskProject");
        this.taskProject = Optional.ofNullable(taskProject);
        return this;
    }

    public CreateTaskProjectRequest withTaskProject(Optional<? extends TaskProject> taskProject) {
        Utils.checkNotNull(taskProject, "taskProject");
        this.taskProject = taskProject;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateTaskProjectRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTaskProjectRequest other = (CreateTaskProjectRequest) o;
        return 
            Objects.deepEquals(this.taskProject, other.taskProject) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            taskProject,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTaskProjectRequest.class,
                "taskProject", taskProject,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends TaskProject> taskProject = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder taskProject(TaskProject taskProject) {
            Utils.checkNotNull(taskProject, "taskProject");
            this.taskProject = Optional.ofNullable(taskProject);
            return this;
        }

        public Builder taskProject(Optional<? extends TaskProject> taskProject) {
            Utils.checkNotNull(taskProject, "taskProject");
            this.taskProject = taskProject;
            return this;
        }

        /**
         * ID of the connection
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }
        
        public CreateTaskProjectRequest build() {
            return new CreateTaskProjectRequest(
                taskProject,
                connectionId);
        }
    }
}
