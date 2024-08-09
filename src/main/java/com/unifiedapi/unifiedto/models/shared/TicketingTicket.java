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


public class TicketingTicket {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("category")
    private Optional<String> category;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("closed_at")
    private Optional<OffsetDateTime> closedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    private Optional<String> customerId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("priority")
    private Optional<String> priority;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<String> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_ref")
    private Optional<String> sourceRef;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends TicketingTicketStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    private Optional<String> subject;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<String>> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<String> url;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonCreator
    public TicketingTicket(
            @JsonProperty("category") Optional<String> category,
            @JsonProperty("closed_at") Optional<OffsetDateTime> closedAt,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("customer_id") Optional<String> customerId,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("priority") Optional<String> priority,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("source") Optional<String> source,
            @JsonProperty("source_ref") Optional<String> sourceRef,
            @JsonProperty("status") Optional<? extends TicketingTicketStatus> status,
            @JsonProperty("subject") Optional<String> subject,
            @JsonProperty("tags") Optional<? extends List<String>> tags,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("url") Optional<String> url,
            @JsonProperty("user_id") Optional<String> userId) {
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(closedAt, "closedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(priority, "priority");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(sourceRef, "sourceRef");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(subject, "subject");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(userId, "userId");
        this.category = category;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.customerId = customerId;
        this.description = description;
        this.id = id;
        this.priority = priority;
        this.raw = raw;
        this.source = source;
        this.sourceRef = sourceRef;
        this.status = status;
        this.subject = subject;
        this.tags = tags;
        this.updatedAt = updatedAt;
        this.url = url;
        this.userId = userId;
    }
    
    public TicketingTicket() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> category() {
        return category;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> closedAt() {
        return closedAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> priority() {
        return priority;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> source() {
        return source;
    }

    @JsonIgnore
    public Optional<String> sourceRef() {
        return sourceRef;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TicketingTicketStatus> status() {
        return (Optional<TicketingTicketStatus>) status;
    }

    @JsonIgnore
    public Optional<String> subject() {
        return subject;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> tags() {
        return (Optional<List<String>>) tags;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> url() {
        return url;
    }

    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TicketingTicket withCategory(String category) {
        Utils.checkNotNull(category, "category");
        this.category = Optional.ofNullable(category);
        return this;
    }

    public TicketingTicket withCategory(Optional<String> category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    public TicketingTicket withClosedAt(OffsetDateTime closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = Optional.ofNullable(closedAt);
        return this;
    }

    public TicketingTicket withClosedAt(Optional<OffsetDateTime> closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = closedAt;
        return this;
    }

    public TicketingTicket withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public TicketingTicket withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TicketingTicket withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    public TicketingTicket withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    public TicketingTicket withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public TicketingTicket withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public TicketingTicket withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public TicketingTicket withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TicketingTicket withPriority(String priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = Optional.ofNullable(priority);
        return this;
    }

    public TicketingTicket withPriority(Optional<String> priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = priority;
        return this;
    }

    public TicketingTicket withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public TicketingTicket withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public TicketingTicket withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    public TicketingTicket withSource(Optional<String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public TicketingTicket withSourceRef(String sourceRef) {
        Utils.checkNotNull(sourceRef, "sourceRef");
        this.sourceRef = Optional.ofNullable(sourceRef);
        return this;
    }

    public TicketingTicket withSourceRef(Optional<String> sourceRef) {
        Utils.checkNotNull(sourceRef, "sourceRef");
        this.sourceRef = sourceRef;
        return this;
    }

    public TicketingTicket withStatus(TicketingTicketStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public TicketingTicket withStatus(Optional<? extends TicketingTicketStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public TicketingTicket withSubject(String subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = Optional.ofNullable(subject);
        return this;
    }

    public TicketingTicket withSubject(Optional<String> subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = subject;
        return this;
    }

    public TicketingTicket withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public TicketingTicket withTags(Optional<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public TicketingTicket withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public TicketingTicket withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public TicketingTicket withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    public TicketingTicket withUrl(Optional<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    public TicketingTicket withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public TicketingTicket withUserId(Optional<String> userId) {
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
        TicketingTicket other = (TicketingTicket) o;
        return 
            Objects.deepEquals(this.category, other.category) &&
            Objects.deepEquals(this.closedAt, other.closedAt) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.priority, other.priority) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.sourceRef, other.sourceRef) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.subject, other.subject) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            category,
            closedAt,
            createdAt,
            customerId,
            description,
            id,
            priority,
            raw,
            source,
            sourceRef,
            status,
            subject,
            tags,
            updatedAt,
            url,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TicketingTicket.class,
                "category", category,
                "closedAt", closedAt,
                "createdAt", createdAt,
                "customerId", customerId,
                "description", description,
                "id", id,
                "priority", priority,
                "raw", raw,
                "source", source,
                "sourceRef", sourceRef,
                "status", status,
                "subject", subject,
                "tags", tags,
                "updatedAt", updatedAt,
                "url", url,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<String> category = Optional.empty();
 
        private Optional<OffsetDateTime> closedAt = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> priority = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<String> source = Optional.empty();
 
        private Optional<String> sourceRef = Optional.empty();
 
        private Optional<? extends TicketingTicketStatus> status = Optional.empty();
 
        private Optional<String> subject = Optional.empty();
 
        private Optional<? extends List<String>> tags = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<String> url = Optional.empty();
 
        private Optional<String> userId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder category(String category) {
            Utils.checkNotNull(category, "category");
            this.category = Optional.ofNullable(category);
            return this;
        }

        public Builder category(Optional<String> category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
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

        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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

        public Builder priority(String priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = Optional.ofNullable(priority);
            return this;
        }

        public Builder priority(Optional<String> priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = priority;
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

        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        public Builder source(Optional<String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder sourceRef(String sourceRef) {
            Utils.checkNotNull(sourceRef, "sourceRef");
            this.sourceRef = Optional.ofNullable(sourceRef);
            return this;
        }

        public Builder sourceRef(Optional<String> sourceRef) {
            Utils.checkNotNull(sourceRef, "sourceRef");
            this.sourceRef = sourceRef;
            return this;
        }

        public Builder status(TicketingTicketStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends TicketingTicketStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder subject(String subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = Optional.ofNullable(subject);
            return this;
        }

        public Builder subject(Optional<String> subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = subject;
            return this;
        }

        public Builder tags(List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends List<String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
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

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        public Builder url(Optional<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
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
        
        public TicketingTicket build() {
            return new TicketingTicket(
                category,
                closedAt,
                createdAt,
                customerId,
                description,
                id,
                priority,
                raw,
                source,
                sourceRef,
                status,
                subject,
                tags,
                updatedAt,
                url,
                userId);
        }
    }
}

