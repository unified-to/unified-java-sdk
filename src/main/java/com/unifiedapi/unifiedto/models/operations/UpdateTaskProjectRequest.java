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


public class UpdateTaskProjectRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends TaskProject> taskProject;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Project
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateTaskProjectRequest(
            Optional<? extends TaskProject> taskProject,
            String connectionId,
            String id) {
        Utils.checkNotNull(taskProject, "taskProject");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.taskProject = taskProject;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public UpdateTaskProjectRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
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

    /**
     * ID of the Project
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateTaskProjectRequest withTaskProject(TaskProject taskProject) {
        Utils.checkNotNull(taskProject, "taskProject");
        this.taskProject = Optional.ofNullable(taskProject);
        return this;
    }

    public UpdateTaskProjectRequest withTaskProject(Optional<? extends TaskProject> taskProject) {
        Utils.checkNotNull(taskProject, "taskProject");
        this.taskProject = taskProject;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateTaskProjectRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Project
     */
    public UpdateTaskProjectRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        UpdateTaskProjectRequest other = (UpdateTaskProjectRequest) o;
        return 
            Objects.deepEquals(this.taskProject, other.taskProject) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            taskProject,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateTaskProjectRequest.class,
                "taskProject", taskProject,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends TaskProject> taskProject = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
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

        /**
         * ID of the Project
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateTaskProjectRequest build() {
            return new UpdateTaskProjectRequest(
                taskProject,
                connectionId,
                id);
        }
    }
}

