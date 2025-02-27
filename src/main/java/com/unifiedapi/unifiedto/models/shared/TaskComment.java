/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class TaskComment {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonProperty("task_id")
    private String taskId;

    @JsonProperty("text")
    private String text;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_name")
    private Optional<String> userName;

    @JsonCreator
    public TaskComment(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("task_id") String taskId,
            @JsonProperty("text") String text,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") Optional<String> userId,
            @JsonProperty("user_name") Optional<String> userName) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(taskId, "taskId");
        Utils.checkNotNull(text, "text");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(userName, "userName");
        this.createdAt = createdAt;
        this.id = id;
        this.raw = raw;
        this.taskId = taskId;
        this.text = text;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.userName = userName;
    }
    
    public TaskComment(
            String taskId,
            String text) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), taskId, text, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public String taskId() {
        return taskId;
    }

    @JsonIgnore
    public String text() {
        return text;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    @JsonIgnore
    public Optional<String> userName() {
        return userName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TaskComment withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public TaskComment withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TaskComment withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public TaskComment withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TaskComment withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public TaskComment withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public TaskComment withTaskId(String taskId) {
        Utils.checkNotNull(taskId, "taskId");
        this.taskId = taskId;
        return this;
    }

    public TaskComment withText(String text) {
        Utils.checkNotNull(text, "text");
        this.text = text;
        return this;
    }

    public TaskComment withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public TaskComment withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public TaskComment withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public TaskComment withUserId(Optional<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public TaskComment withUserName(String userName) {
        Utils.checkNotNull(userName, "userName");
        this.userName = Optional.ofNullable(userName);
        return this;
    }

    public TaskComment withUserName(Optional<String> userName) {
        Utils.checkNotNull(userName, "userName");
        this.userName = userName;
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
        TaskComment other = (TaskComment) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.taskId, other.taskId) &&
            Objects.deepEquals(this.text, other.text) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.userName, other.userName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            id,
            raw,
            taskId,
            text,
            updatedAt,
            userId,
            userName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskComment.class,
                "createdAt", createdAt,
                "id", id,
                "raw", raw,
                "taskId", taskId,
                "text", text,
                "updatedAt", updatedAt,
                "userId", userId,
                "userName", userName);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private String taskId;
 
        private String text;
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<String> userId = Optional.empty();
 
        private Optional<String> userName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends Map<String, Object>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder taskId(String taskId) {
            Utils.checkNotNull(taskId, "taskId");
            this.taskId = taskId;
            return this;
        }

        public Builder text(String text) {
            Utils.checkNotNull(text, "text");
            this.text = text;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder userName(String userName) {
            Utils.checkNotNull(userName, "userName");
            this.userName = Optional.ofNullable(userName);
            return this;
        }

        public Builder userName(Optional<String> userName) {
            Utils.checkNotNull(userName, "userName");
            this.userName = userName;
            return this;
        }
        
        public TaskComment build() {
            return new TaskComment(
                createdAt,
                id,
                raw,
                taskId,
                text,
                updatedAt,
                userId,
                userName);
        }
    }
}

