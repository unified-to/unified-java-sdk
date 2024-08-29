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


public class HrisTimeoff {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approved_at")
    private Optional<OffsetDateTime> approvedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approver_user_id")
    private Optional<String> approverUserId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("comments")
    private Optional<String> comments;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_at")
    private Optional<OffsetDateTime> endAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonProperty("start_at")
    private OffsetDateTime startAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends HrisTimeoffStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends HrisTimeoffType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonProperty("user_id")
    private String userId;

    @JsonCreator
    public HrisTimeoff(
            @JsonProperty("approved_at") Optional<OffsetDateTime> approvedAt,
            @JsonProperty("approver_user_id") Optional<String> approverUserId,
            @JsonProperty("comments") Optional<String> comments,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("end_at") Optional<OffsetDateTime> endAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("start_at") OffsetDateTime startAt,
            @JsonProperty("status") Optional<? extends HrisTimeoffStatus> status,
            @JsonProperty("type") Optional<? extends HrisTimeoffType> type,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") String userId) {
        Utils.checkNotNull(approvedAt, "approvedAt");
        Utils.checkNotNull(approverUserId, "approverUserId");
        Utils.checkNotNull(comments, "comments");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(endAt, "endAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(startAt, "startAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        this.approvedAt = approvedAt;
        this.approverUserId = approverUserId;
        this.comments = comments;
        this.createdAt = createdAt;
        this.endAt = endAt;
        this.id = id;
        this.raw = raw;
        this.startAt = startAt;
        this.status = status;
        this.type = type;
        this.updatedAt = updatedAt;
        this.userId = userId;
    }
    
    public HrisTimeoff(
            OffsetDateTime startAt,
            String userId) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), startAt, Optional.empty(), Optional.empty(), Optional.empty(), userId);
    }

    @JsonIgnore
    public Optional<OffsetDateTime> approvedAt() {
        return approvedAt;
    }

    @JsonIgnore
    public Optional<String> approverUserId() {
        return approverUserId;
    }

    @JsonIgnore
    public Optional<String> comments() {
        return comments;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> endAt() {
        return endAt;
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
    public OffsetDateTime startAt() {
        return startAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisTimeoffStatus> status() {
        return (Optional<HrisTimeoffStatus>) status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisTimeoffType> type() {
        return (Optional<HrisTimeoffType>) type;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisTimeoff withApprovedAt(OffsetDateTime approvedAt) {
        Utils.checkNotNull(approvedAt, "approvedAt");
        this.approvedAt = Optional.ofNullable(approvedAt);
        return this;
    }

    public HrisTimeoff withApprovedAt(Optional<OffsetDateTime> approvedAt) {
        Utils.checkNotNull(approvedAt, "approvedAt");
        this.approvedAt = approvedAt;
        return this;
    }

    public HrisTimeoff withApproverUserId(String approverUserId) {
        Utils.checkNotNull(approverUserId, "approverUserId");
        this.approverUserId = Optional.ofNullable(approverUserId);
        return this;
    }

    public HrisTimeoff withApproverUserId(Optional<String> approverUserId) {
        Utils.checkNotNull(approverUserId, "approverUserId");
        this.approverUserId = approverUserId;
        return this;
    }

    public HrisTimeoff withComments(String comments) {
        Utils.checkNotNull(comments, "comments");
        this.comments = Optional.ofNullable(comments);
        return this;
    }

    public HrisTimeoff withComments(Optional<String> comments) {
        Utils.checkNotNull(comments, "comments");
        this.comments = comments;
        return this;
    }

    public HrisTimeoff withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public HrisTimeoff withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public HrisTimeoff withEndAt(OffsetDateTime endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = Optional.ofNullable(endAt);
        return this;
    }

    public HrisTimeoff withEndAt(Optional<OffsetDateTime> endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = endAt;
        return this;
    }

    public HrisTimeoff withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public HrisTimeoff withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisTimeoff withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public HrisTimeoff withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public HrisTimeoff withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
        return this;
    }

    public HrisTimeoff withStatus(HrisTimeoffStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public HrisTimeoff withStatus(Optional<? extends HrisTimeoffStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public HrisTimeoff withType(HrisTimeoffType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public HrisTimeoff withType(Optional<? extends HrisTimeoffType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public HrisTimeoff withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public HrisTimeoff withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public HrisTimeoff withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        HrisTimeoff other = (HrisTimeoff) o;
        return 
            Objects.deepEquals(this.approvedAt, other.approvedAt) &&
            Objects.deepEquals(this.approverUserId, other.approverUserId) &&
            Objects.deepEquals(this.comments, other.comments) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.endAt, other.endAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.startAt, other.startAt) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            approvedAt,
            approverUserId,
            comments,
            createdAt,
            endAt,
            id,
            raw,
            startAt,
            status,
            type,
            updatedAt,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisTimeoff.class,
                "approvedAt", approvedAt,
                "approverUserId", approverUserId,
                "comments", comments,
                "createdAt", createdAt,
                "endAt", endAt,
                "id", id,
                "raw", raw,
                "startAt", startAt,
                "status", status,
                "type", type,
                "updatedAt", updatedAt,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> approvedAt = Optional.empty();
 
        private Optional<String> approverUserId = Optional.empty();
 
        private Optional<String> comments = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<OffsetDateTime> endAt = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private OffsetDateTime startAt;
 
        private Optional<? extends HrisTimeoffStatus> status = Optional.empty();
 
        private Optional<? extends HrisTimeoffType> type = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder approvedAt(OffsetDateTime approvedAt) {
            Utils.checkNotNull(approvedAt, "approvedAt");
            this.approvedAt = Optional.ofNullable(approvedAt);
            return this;
        }

        public Builder approvedAt(Optional<OffsetDateTime> approvedAt) {
            Utils.checkNotNull(approvedAt, "approvedAt");
            this.approvedAt = approvedAt;
            return this;
        }

        public Builder approverUserId(String approverUserId) {
            Utils.checkNotNull(approverUserId, "approverUserId");
            this.approverUserId = Optional.ofNullable(approverUserId);
            return this;
        }

        public Builder approverUserId(Optional<String> approverUserId) {
            Utils.checkNotNull(approverUserId, "approverUserId");
            this.approverUserId = approverUserId;
            return this;
        }

        public Builder comments(String comments) {
            Utils.checkNotNull(comments, "comments");
            this.comments = Optional.ofNullable(comments);
            return this;
        }

        public Builder comments(Optional<String> comments) {
            Utils.checkNotNull(comments, "comments");
            this.comments = comments;
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

        public Builder endAt(OffsetDateTime endAt) {
            Utils.checkNotNull(endAt, "endAt");
            this.endAt = Optional.ofNullable(endAt);
            return this;
        }

        public Builder endAt(Optional<OffsetDateTime> endAt) {
            Utils.checkNotNull(endAt, "endAt");
            this.endAt = endAt;
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

        public Builder startAt(OffsetDateTime startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = startAt;
            return this;
        }

        public Builder status(HrisTimeoffStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends HrisTimeoffStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder type(HrisTimeoffType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends HrisTimeoffType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
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
            this.userId = userId;
            return this;
        }
        
        public HrisTimeoff build() {
            return new HrisTimeoff(
                approvedAt,
                approverUserId,
                comments,
                createdAt,
                endAt,
                id,
                raw,
                startAt,
                status,
                type,
                updatedAt,
                userId);
        }
    }
}
