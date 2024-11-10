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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class RepoPullrequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("closed_at")
    private Optional<OffsetDateTime> closedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("commit_ids")
    private Optional<? extends List<String>> commitIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("labels")
    private Optional<? extends List<String>> labels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("repo_id")
    private Optional<String> repoId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends RepoPullrequestStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_ids")
    private Optional<? extends List<String>> userIds;

    @JsonCreator
    public RepoPullrequest(
            @JsonProperty("closed_at") Optional<OffsetDateTime> closedAt,
            @JsonProperty("commit_ids") Optional<? extends List<String>> commitIds,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("labels") Optional<? extends List<String>> labels,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("repo_id") Optional<String> repoId,
            @JsonProperty("status") Optional<? extends RepoPullrequestStatus> status,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_ids") Optional<? extends List<String>> userIds) {
        Utils.checkNotNull(closedAt, "closedAt");
        Utils.checkNotNull(commitIds, "commitIds");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(labels, "labels");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(repoId, "repoId");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userIds, "userIds");
        this.closedAt = closedAt;
        this.commitIds = commitIds;
        this.createdAt = createdAt;
        this.id = id;
        this.labels = labels;
        this.raw = raw;
        this.repoId = repoId;
        this.status = status;
        this.updatedAt = updatedAt;
        this.userIds = userIds;
    }
    
    public RepoPullrequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> closedAt() {
        return closedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> commitIds() {
        return (Optional<List<String>>) commitIds;
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
    public Optional<List<String>> labels() {
        return (Optional<List<String>>) labels;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> repoId() {
        return repoId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RepoPullrequestStatus> status() {
        return (Optional<RepoPullrequestStatus>) status;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> userIds() {
        return (Optional<List<String>>) userIds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RepoPullrequest withClosedAt(OffsetDateTime closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = Optional.ofNullable(closedAt);
        return this;
    }

    public RepoPullrequest withClosedAt(Optional<OffsetDateTime> closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = closedAt;
        return this;
    }

    public RepoPullrequest withCommitIds(List<String> commitIds) {
        Utils.checkNotNull(commitIds, "commitIds");
        this.commitIds = Optional.ofNullable(commitIds);
        return this;
    }

    public RepoPullrequest withCommitIds(Optional<? extends List<String>> commitIds) {
        Utils.checkNotNull(commitIds, "commitIds");
        this.commitIds = commitIds;
        return this;
    }

    public RepoPullrequest withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public RepoPullrequest withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public RepoPullrequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public RepoPullrequest withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public RepoPullrequest withLabels(List<String> labels) {
        Utils.checkNotNull(labels, "labels");
        this.labels = Optional.ofNullable(labels);
        return this;
    }

    public RepoPullrequest withLabels(Optional<? extends List<String>> labels) {
        Utils.checkNotNull(labels, "labels");
        this.labels = labels;
        return this;
    }

    public RepoPullrequest withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public RepoPullrequest withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public RepoPullrequest withRepoId(String repoId) {
        Utils.checkNotNull(repoId, "repoId");
        this.repoId = Optional.ofNullable(repoId);
        return this;
    }

    public RepoPullrequest withRepoId(Optional<String> repoId) {
        Utils.checkNotNull(repoId, "repoId");
        this.repoId = repoId;
        return this;
    }

    public RepoPullrequest withStatus(RepoPullrequestStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public RepoPullrequest withStatus(Optional<? extends RepoPullrequestStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public RepoPullrequest withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public RepoPullrequest withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public RepoPullrequest withUserIds(List<String> userIds) {
        Utils.checkNotNull(userIds, "userIds");
        this.userIds = Optional.ofNullable(userIds);
        return this;
    }

    public RepoPullrequest withUserIds(Optional<? extends List<String>> userIds) {
        Utils.checkNotNull(userIds, "userIds");
        this.userIds = userIds;
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
        RepoPullrequest other = (RepoPullrequest) o;
        return 
            Objects.deepEquals(this.closedAt, other.closedAt) &&
            Objects.deepEquals(this.commitIds, other.commitIds) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.labels, other.labels) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.repoId, other.repoId) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userIds, other.userIds);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            closedAt,
            commitIds,
            createdAt,
            id,
            labels,
            raw,
            repoId,
            status,
            updatedAt,
            userIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RepoPullrequest.class,
                "closedAt", closedAt,
                "commitIds", commitIds,
                "createdAt", createdAt,
                "id", id,
                "labels", labels,
                "raw", raw,
                "repoId", repoId,
                "status", status,
                "updatedAt", updatedAt,
                "userIds", userIds);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> closedAt = Optional.empty();
 
        private Optional<? extends List<String>> commitIds = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends List<String>> labels = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<String> repoId = Optional.empty();
 
        private Optional<? extends RepoPullrequestStatus> status = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<? extends List<String>> userIds = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder closedAt(OffsetDateTime closedAt) {
            Utils.checkNotNull(closedAt, "closedAt");
            this.closedAt = Optional.ofNullable(closedAt);
            return this;
        }

        public Builder closedAt(Optional<OffsetDateTime> closedAt) {
            Utils.checkNotNull(closedAt, "closedAt");
            this.closedAt = closedAt;
            return this;
        }

        public Builder commitIds(List<String> commitIds) {
            Utils.checkNotNull(commitIds, "commitIds");
            this.commitIds = Optional.ofNullable(commitIds);
            return this;
        }

        public Builder commitIds(Optional<? extends List<String>> commitIds) {
            Utils.checkNotNull(commitIds, "commitIds");
            this.commitIds = commitIds;
            return this;
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

        public Builder labels(List<String> labels) {
            Utils.checkNotNull(labels, "labels");
            this.labels = Optional.ofNullable(labels);
            return this;
        }

        public Builder labels(Optional<? extends List<String>> labels) {
            Utils.checkNotNull(labels, "labels");
            this.labels = labels;
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

        public Builder repoId(String repoId) {
            Utils.checkNotNull(repoId, "repoId");
            this.repoId = Optional.ofNullable(repoId);
            return this;
        }

        public Builder repoId(Optional<String> repoId) {
            Utils.checkNotNull(repoId, "repoId");
            this.repoId = repoId;
            return this;
        }

        public Builder status(RepoPullrequestStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends RepoPullrequestStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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

        public Builder userIds(List<String> userIds) {
            Utils.checkNotNull(userIds, "userIds");
            this.userIds = Optional.ofNullable(userIds);
            return this;
        }

        public Builder userIds(Optional<? extends List<String>> userIds) {
            Utils.checkNotNull(userIds, "userIds");
            this.userIds = userIds;
            return this;
        }
        
        public RepoPullrequest build() {
            return new RepoPullrequest(
                closedAt,
                commitIds,
                createdAt,
                id,
                labels,
                raw,
                repoId,
                status,
                updatedAt,
                userIds);
        }
    }
}

