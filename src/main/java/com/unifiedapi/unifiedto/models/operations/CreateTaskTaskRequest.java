/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.TaskTask;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateTaskTaskRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends TaskTask> taskTask;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateTaskTaskRequest(
            Optional<? extends TaskTask> taskTask,
            String connectionId) {
        Utils.checkNotNull(taskTask, "taskTask");
        Utils.checkNotNull(connectionId, "connectionId");
        this.taskTask = taskTask;
        this.connectionId = connectionId;
    }
    
    public CreateTaskTaskRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaskTask> taskTask() {
        return (Optional<TaskTask>) taskTask;
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

    public CreateTaskTaskRequest withTaskTask(TaskTask taskTask) {
        Utils.checkNotNull(taskTask, "taskTask");
        this.taskTask = Optional.ofNullable(taskTask);
        return this;
    }

    public CreateTaskTaskRequest withTaskTask(Optional<? extends TaskTask> taskTask) {
        Utils.checkNotNull(taskTask, "taskTask");
        this.taskTask = taskTask;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateTaskTaskRequest withConnectionId(String connectionId) {
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
        CreateTaskTaskRequest other = (CreateTaskTaskRequest) o;
        return 
            Objects.deepEquals(this.taskTask, other.taskTask) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            taskTask,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTaskTaskRequest.class,
                "taskTask", taskTask,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends TaskTask> taskTask = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder taskTask(TaskTask taskTask) {
            Utils.checkNotNull(taskTask, "taskTask");
            this.taskTask = Optional.ofNullable(taskTask);
            return this;
        }

        public Builder taskTask(Optional<? extends TaskTask> taskTask) {
            Utils.checkNotNull(taskTask, "taskTask");
            this.taskTask = taskTask;
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
        
        public CreateTaskTaskRequest build() {
            return new CreateTaskTaskRequest(
                taskTask,
                connectionId);
        }
    }
}

