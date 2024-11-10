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


public class RepoRepository {

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
    @JsonProperty("is_private")
    private Optional<Boolean> isPrivate;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("org_id")
    private Optional<String> orgId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner")
    private Optional<String> owner;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    private Optional<String> webUrl;

    @JsonCreator
    public RepoRepository(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("is_private") Optional<Boolean> isPrivate,
            @JsonProperty("name") String name,
            @JsonProperty("org_id") Optional<String> orgId,
            @JsonProperty("owner") Optional<String> owner,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("web_url") Optional<String> webUrl) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isPrivate, "isPrivate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(owner, "owner");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(webUrl, "webUrl");
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isPrivate = isPrivate;
        this.name = name;
        this.orgId = orgId;
        this.owner = owner;
        this.raw = raw;
        this.updatedAt = updatedAt;
        this.webUrl = webUrl;
    }
    
    public RepoRepository(
            String name) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<Boolean> isPrivate() {
        return isPrivate;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> orgId() {
        return orgId;
    }

    @JsonIgnore
    public Optional<String> owner() {
        return owner;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> webUrl() {
        return webUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RepoRepository withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public RepoRepository withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public RepoRepository withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public RepoRepository withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public RepoRepository withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public RepoRepository withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public RepoRepository withIsPrivate(boolean isPrivate) {
        Utils.checkNotNull(isPrivate, "isPrivate");
        this.isPrivate = Optional.ofNullable(isPrivate);
        return this;
    }

    public RepoRepository withIsPrivate(Optional<Boolean> isPrivate) {
        Utils.checkNotNull(isPrivate, "isPrivate");
        this.isPrivate = isPrivate;
        return this;
    }

    public RepoRepository withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public RepoRepository withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.ofNullable(orgId);
        return this;
    }

    public RepoRepository withOrgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public RepoRepository withOwner(String owner) {
        Utils.checkNotNull(owner, "owner");
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    public RepoRepository withOwner(Optional<String> owner) {
        Utils.checkNotNull(owner, "owner");
        this.owner = owner;
        return this;
    }

    public RepoRepository withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public RepoRepository withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public RepoRepository withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public RepoRepository withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public RepoRepository withWebUrl(String webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = Optional.ofNullable(webUrl);
        return this;
    }

    public RepoRepository withWebUrl(Optional<String> webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = webUrl;
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
        RepoRepository other = (RepoRepository) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.isPrivate, other.isPrivate) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.owner, other.owner) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.webUrl, other.webUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            description,
            id,
            isPrivate,
            name,
            orgId,
            owner,
            raw,
            updatedAt,
            webUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RepoRepository.class,
                "createdAt", createdAt,
                "description", description,
                "id", id,
                "isPrivate", isPrivate,
                "name", name,
                "orgId", orgId,
                "owner", owner,
                "raw", raw,
                "updatedAt", updatedAt,
                "webUrl", webUrl);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> isPrivate = Optional.empty();
 
        private String name;
 
        private Optional<String> orgId = Optional.empty();
 
        private Optional<String> owner = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<String> webUrl = Optional.empty();  
        
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

        public Builder isPrivate(boolean isPrivate) {
            Utils.checkNotNull(isPrivate, "isPrivate");
            this.isPrivate = Optional.ofNullable(isPrivate);
            return this;
        }

        public Builder isPrivate(Optional<Boolean> isPrivate) {
            Utils.checkNotNull(isPrivate, "isPrivate");
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = Optional.ofNullable(orgId);
            return this;
        }

        public Builder orgId(Optional<String> orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        public Builder owner(String owner) {
            Utils.checkNotNull(owner, "owner");
            this.owner = Optional.ofNullable(owner);
            return this;
        }

        public Builder owner(Optional<String> owner) {
            Utils.checkNotNull(owner, "owner");
            this.owner = owner;
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

        public Builder webUrl(String webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = Optional.ofNullable(webUrl);
            return this;
        }

        public Builder webUrl(Optional<String> webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = webUrl;
            return this;
        }
        
        public RepoRepository build() {
            return new RepoRepository(
                createdAt,
                description,
                id,
                isPrivate,
                name,
                orgId,
                owner,
                raw,
                updatedAt,
                webUrl);
        }
    }
}

