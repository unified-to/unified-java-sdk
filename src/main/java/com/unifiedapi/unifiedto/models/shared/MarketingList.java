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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
/**
 * MarketingList - Mailing List
 */

public class MarketingList {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_at")
    private Optional<OffsetDateTime> endAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    private Optional<Boolean> isActive;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The raw data returned by the integration for this list
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_at")
    private Optional<OffsetDateTime> startAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonCreator
    public MarketingList(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("end_at") Optional<OffsetDateTime> endAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("is_active") Optional<Boolean> isActive,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("start_at") Optional<OffsetDateTime> startAt,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") Optional<String> userId) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(endAt, "endAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(startAt, "startAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        this.createdAt = createdAt;
        this.description = description;
        this.endAt = endAt;
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.raw = raw;
        this.startAt = startAt;
        this.updatedAt = updatedAt;
        this.userId = userId;
    }
    
    public MarketingList() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> endAt() {
        return endAt;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Boolean> isActive() {
        return isActive;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The raw data returned by the integration for this list
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startAt() {
        return startAt;
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

    public MarketingList withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public MarketingList withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public MarketingList withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public MarketingList withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public MarketingList withEndAt(OffsetDateTime endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = Optional.ofNullable(endAt);
        return this;
    }

    public MarketingList withEndAt(Optional<OffsetDateTime> endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = endAt;
        return this;
    }

    public MarketingList withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public MarketingList withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MarketingList withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = Optional.ofNullable(isActive);
        return this;
    }

    public MarketingList withIsActive(Optional<Boolean> isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public MarketingList withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public MarketingList withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The raw data returned by the integration for this list
     */
    public MarketingList withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    /**
     * The raw data returned by the integration for this list
     */
    public MarketingList withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public MarketingList withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = Optional.ofNullable(startAt);
        return this;
    }

    public MarketingList withStartAt(Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
        return this;
    }

    public MarketingList withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public MarketingList withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public MarketingList withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public MarketingList withUserId(Optional<String> userId) {
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
        MarketingList other = (MarketingList) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.endAt, other.endAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.isActive, other.isActive) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.startAt, other.startAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            description,
            endAt,
            id,
            isActive,
            name,
            raw,
            startAt,
            updatedAt,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarketingList.class,
                "createdAt", createdAt,
                "description", description,
                "endAt", endAt,
                "id", id,
                "isActive", isActive,
                "name", name,
                "raw", raw,
                "startAt", startAt,
                "updatedAt", updatedAt,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<OffsetDateTime> endAt = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> isActive = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<OffsetDateTime> startAt = Optional.empty();
 
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

        public Builder isActive(boolean isActive) {
            Utils.checkNotNull(isActive, "isActive");
            this.isActive = Optional.ofNullable(isActive);
            return this;
        }

        public Builder isActive(Optional<Boolean> isActive) {
            Utils.checkNotNull(isActive, "isActive");
            this.isActive = isActive;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The raw data returned by the integration for this list
         */
        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        /**
         * The raw data returned by the integration for this list
         */
        public Builder raw(Optional<? extends Map<String, Object>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder startAt(OffsetDateTime startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = Optional.ofNullable(startAt);
            return this;
        }

        public Builder startAt(Optional<OffsetDateTime> startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = startAt;
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
        
        public MarketingList build() {
            return new MarketingList(
                createdAt,
                description,
                endAt,
                id,
                isActive,
                name,
                raw,
                startAt,
                updatedAt,
                userId);
        }
    }
}

