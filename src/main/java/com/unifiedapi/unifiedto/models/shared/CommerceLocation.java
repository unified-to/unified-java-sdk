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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class CommerceLocation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends PropertyCommerceLocationAddress> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    private Optional<Boolean> isActive;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends CommerceLocationRaw> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public CommerceLocation(
            @JsonProperty("address") Optional<? extends PropertyCommerceLocationAddress> address,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("is_active") Optional<Boolean> isActive,
            @JsonProperty("name") String name,
            @JsonProperty("raw") Optional<? extends CommerceLocationRaw> raw,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.address = address;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.raw = raw;
        this.updatedAt = updatedAt;
    }
    
    public CommerceLocation(
            String name) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyCommerceLocationAddress> address() {
        return (Optional<PropertyCommerceLocationAddress>) address;
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
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Boolean> isActive() {
        return isActive;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CommerceLocationRaw> raw() {
        return (Optional<CommerceLocationRaw>) raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CommerceLocation withAddress(PropertyCommerceLocationAddress address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public CommerceLocation withAddress(Optional<? extends PropertyCommerceLocationAddress> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public CommerceLocation withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public CommerceLocation withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public CommerceLocation withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public CommerceLocation withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public CommerceLocation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public CommerceLocation withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CommerceLocation withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = Optional.ofNullable(isActive);
        return this;
    }

    public CommerceLocation withIsActive(Optional<Boolean> isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public CommerceLocation withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CommerceLocation withRaw(CommerceLocationRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public CommerceLocation withRaw(Optional<? extends CommerceLocationRaw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public CommerceLocation withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public CommerceLocation withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        CommerceLocation other = (CommerceLocation) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.isActive, other.isActive) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            createdAt,
            description,
            id,
            isActive,
            name,
            raw,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceLocation.class,
                "address", address,
                "createdAt", createdAt,
                "description", description,
                "id", id,
                "isActive", isActive,
                "name", name,
                "raw", raw,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends PropertyCommerceLocationAddress> address = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> isActive = Optional.empty();
 
        private String name;
 
        private Optional<? extends CommerceLocationRaw> raw = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(PropertyCommerceLocationAddress address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends PropertyCommerceLocationAddress> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
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
            this.name = name;
            return this;
        }

        public Builder raw(CommerceLocationRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends CommerceLocationRaw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
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
        
        public CommerceLocation build() {
            return new CommerceLocation(
                address,
                createdAt,
                description,
                id,
                isActive,
                name,
                raw,
                updatedAt);
        }
    }
}

