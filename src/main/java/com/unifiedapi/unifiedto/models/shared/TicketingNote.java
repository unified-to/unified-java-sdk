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

public class TicketingNote {

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
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ticket_id")
    private Optional<String> ticketId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonCreator
    public TicketingNote(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("customer_id") Optional<String> customerId,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("ticket_id") Optional<String> ticketId,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") Optional<String> userId) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(ticketId, "ticketId");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        this.createdAt = createdAt;
        this.customerId = customerId;
        this.description = description;
        this.id = id;
        this.raw = raw;
        this.ticketId = ticketId;
        this.updatedAt = updatedAt;
        this.userId = userId;
    }
    
    public TicketingNote() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> ticketId() {
        return ticketId;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TicketingNote withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public TicketingNote withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TicketingNote withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    public TicketingNote withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    public TicketingNote withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public TicketingNote withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public TicketingNote withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public TicketingNote withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TicketingNote withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public TicketingNote withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public TicketingNote withTicketId(String ticketId) {
        Utils.checkNotNull(ticketId, "ticketId");
        this.ticketId = Optional.ofNullable(ticketId);
        return this;
    }

    public TicketingNote withTicketId(Optional<String> ticketId) {
        Utils.checkNotNull(ticketId, "ticketId");
        this.ticketId = ticketId;
        return this;
    }

    public TicketingNote withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public TicketingNote withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public TicketingNote withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public TicketingNote withUserId(Optional<String> userId) {
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
        TicketingNote other = (TicketingNote) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.ticketId, other.ticketId) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            customerId,
            description,
            id,
            raw,
            ticketId,
            updatedAt,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TicketingNote.class,
                "createdAt", createdAt,
                "customerId", customerId,
                "description", description,
                "id", id,
                "raw", raw,
                "ticketId", ticketId,
                "updatedAt", updatedAt,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<String> ticketId = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<String> userId = Optional.empty();  
        
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

        public Builder ticketId(String ticketId) {
            Utils.checkNotNull(ticketId, "ticketId");
            this.ticketId = Optional.ofNullable(ticketId);
            return this;
        }

        public Builder ticketId(Optional<String> ticketId) {
            Utils.checkNotNull(ticketId, "ticketId");
            this.ticketId = ticketId;
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
        
        public TicketingNote build() {
            return new TicketingNote(
                createdAt,
                customerId,
                description,
                id,
                raw,
                ticketId,
                updatedAt,
                userId);
        }
    }
}

