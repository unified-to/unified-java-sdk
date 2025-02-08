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


public class AtsJobPosting {

    /**
     * job-post-specific address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends PropertyAtsJobPostingAddress> address;

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

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<String> location;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("posting_url")
    private Optional<String> postingUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public AtsJobPosting(
            @JsonProperty("address") Optional<? extends PropertyAtsJobPostingAddress> address,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("is_active") Optional<Boolean> isActive,
            @JsonProperty("location") Optional<String> location,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("posting_url") Optional<String> postingUrl,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(location, "location");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(postingUrl, "postingUrl");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.address = address;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isActive = isActive;
        this.location = location;
        this.name = name;
        this.postingUrl = postingUrl;
        this.updatedAt = updatedAt;
    }
    
    public AtsJobPosting() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * job-post-specific address
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyAtsJobPostingAddress> address() {
        return (Optional<PropertyAtsJobPostingAddress>) address;
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
    public Optional<String> location() {
        return location;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> postingUrl() {
        return postingUrl;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * job-post-specific address
     */
    public AtsJobPosting withAddress(PropertyAtsJobPostingAddress address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    /**
     * job-post-specific address
     */
    public AtsJobPosting withAddress(Optional<? extends PropertyAtsJobPostingAddress> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public AtsJobPosting withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public AtsJobPosting withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AtsJobPosting withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public AtsJobPosting withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public AtsJobPosting withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AtsJobPosting withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsJobPosting withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = Optional.ofNullable(isActive);
        return this;
    }

    public AtsJobPosting withIsActive(Optional<Boolean> isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public AtsJobPosting withLocation(String location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public AtsJobPosting withLocation(Optional<String> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
        return this;
    }

    public AtsJobPosting withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public AtsJobPosting withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public AtsJobPosting withPostingUrl(String postingUrl) {
        Utils.checkNotNull(postingUrl, "postingUrl");
        this.postingUrl = Optional.ofNullable(postingUrl);
        return this;
    }

    public AtsJobPosting withPostingUrl(Optional<String> postingUrl) {
        Utils.checkNotNull(postingUrl, "postingUrl");
        this.postingUrl = postingUrl;
        return this;
    }

    public AtsJobPosting withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public AtsJobPosting withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        AtsJobPosting other = (AtsJobPosting) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.isActive, other.isActive) &&
            Objects.deepEquals(this.location, other.location) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.postingUrl, other.postingUrl) &&
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
            location,
            name,
            postingUrl,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsJobPosting.class,
                "address", address,
                "createdAt", createdAt,
                "description", description,
                "id", id,
                "isActive", isActive,
                "location", location,
                "name", name,
                "postingUrl", postingUrl,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends PropertyAtsJobPostingAddress> address = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> isActive = Optional.empty();
 
        private Optional<String> location = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> postingUrl = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * job-post-specific address
         */
        public Builder address(PropertyAtsJobPostingAddress address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        /**
         * job-post-specific address
         */
        public Builder address(Optional<? extends PropertyAtsJobPostingAddress> address) {
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

        public Builder location(String location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<String> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
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

        public Builder postingUrl(String postingUrl) {
            Utils.checkNotNull(postingUrl, "postingUrl");
            this.postingUrl = Optional.ofNullable(postingUrl);
            return this;
        }

        public Builder postingUrl(Optional<String> postingUrl) {
            Utils.checkNotNull(postingUrl, "postingUrl");
            this.postingUrl = postingUrl;
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
        
        public AtsJobPosting build() {
            return new AtsJobPosting(
                address,
                createdAt,
                description,
                id,
                isActive,
                location,
                name,
                postingUrl,
                updatedAt);
        }
    }
}

