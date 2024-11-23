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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * CommerceCollection - A collection of items/products/services
 */

public class CommerceCollection {

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
    @JsonProperty("is_featured")
    private Optional<Boolean> isFeatured;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_visible")
    private Optional<Boolean> isVisible;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("media")
    private Optional<? extends List<CommerceItemMedia>> media;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends List<CommerceItemMetadata>> metadata;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private Optional<String> parentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_description")
    private Optional<String> publicDescription;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_name")
    private Optional<String> publicName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<String>> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends CommerceCollectionType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public CommerceCollection(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("is_active") Optional<Boolean> isActive,
            @JsonProperty("is_featured") Optional<Boolean> isFeatured,
            @JsonProperty("is_visible") Optional<Boolean> isVisible,
            @JsonProperty("media") Optional<? extends List<CommerceItemMedia>> media,
            @JsonProperty("metadata") Optional<? extends List<CommerceItemMetadata>> metadata,
            @JsonProperty("name") String name,
            @JsonProperty("parent_id") Optional<String> parentId,
            @JsonProperty("public_description") Optional<String> publicDescription,
            @JsonProperty("public_name") Optional<String> publicName,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("tags") Optional<? extends List<String>> tags,
            @JsonProperty("type") Optional<? extends CommerceCollectionType> type,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(isFeatured, "isFeatured");
        Utils.checkNotNull(isVisible, "isVisible");
        Utils.checkNotNull(media, "media");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(publicDescription, "publicDescription");
        Utils.checkNotNull(publicName, "publicName");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isActive = isActive;
        this.isFeatured = isFeatured;
        this.isVisible = isVisible;
        this.media = media;
        this.metadata = metadata;
        this.name = name;
        this.parentId = parentId;
        this.publicDescription = publicDescription;
        this.publicName = publicName;
        this.raw = raw;
        this.tags = tags;
        this.type = type;
        this.updatedAt = updatedAt;
    }
    
    public CommerceCollection(
            String name) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<Boolean> isFeatured() {
        return isFeatured;
    }

    @JsonIgnore
    public Optional<Boolean> isVisible() {
        return isVisible;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CommerceItemMedia>> media() {
        return (Optional<List<CommerceItemMedia>>) media;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CommerceItemMetadata>> metadata() {
        return (Optional<List<CommerceItemMetadata>>) metadata;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> parentId() {
        return parentId;
    }

    @JsonIgnore
    public Optional<String> publicDescription() {
        return publicDescription;
    }

    @JsonIgnore
    public Optional<String> publicName() {
        return publicName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> tags() {
        return (Optional<List<String>>) tags;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CommerceCollectionType> type() {
        return (Optional<CommerceCollectionType>) type;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CommerceCollection withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public CommerceCollection withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public CommerceCollection withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public CommerceCollection withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public CommerceCollection withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public CommerceCollection withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CommerceCollection withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = Optional.ofNullable(isActive);
        return this;
    }

    public CommerceCollection withIsActive(Optional<Boolean> isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public CommerceCollection withIsFeatured(boolean isFeatured) {
        Utils.checkNotNull(isFeatured, "isFeatured");
        this.isFeatured = Optional.ofNullable(isFeatured);
        return this;
    }

    public CommerceCollection withIsFeatured(Optional<Boolean> isFeatured) {
        Utils.checkNotNull(isFeatured, "isFeatured");
        this.isFeatured = isFeatured;
        return this;
    }

    public CommerceCollection withIsVisible(boolean isVisible) {
        Utils.checkNotNull(isVisible, "isVisible");
        this.isVisible = Optional.ofNullable(isVisible);
        return this;
    }

    public CommerceCollection withIsVisible(Optional<Boolean> isVisible) {
        Utils.checkNotNull(isVisible, "isVisible");
        this.isVisible = isVisible;
        return this;
    }

    public CommerceCollection withMedia(List<CommerceItemMedia> media) {
        Utils.checkNotNull(media, "media");
        this.media = Optional.ofNullable(media);
        return this;
    }

    public CommerceCollection withMedia(Optional<? extends List<CommerceItemMedia>> media) {
        Utils.checkNotNull(media, "media");
        this.media = media;
        return this;
    }

    public CommerceCollection withMetadata(List<CommerceItemMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public CommerceCollection withMetadata(Optional<? extends List<CommerceItemMetadata>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public CommerceCollection withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CommerceCollection withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = Optional.ofNullable(parentId);
        return this;
    }

    public CommerceCollection withParentId(Optional<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public CommerceCollection withPublicDescription(String publicDescription) {
        Utils.checkNotNull(publicDescription, "publicDescription");
        this.publicDescription = Optional.ofNullable(publicDescription);
        return this;
    }

    public CommerceCollection withPublicDescription(Optional<String> publicDescription) {
        Utils.checkNotNull(publicDescription, "publicDescription");
        this.publicDescription = publicDescription;
        return this;
    }

    public CommerceCollection withPublicName(String publicName) {
        Utils.checkNotNull(publicName, "publicName");
        this.publicName = Optional.ofNullable(publicName);
        return this;
    }

    public CommerceCollection withPublicName(Optional<String> publicName) {
        Utils.checkNotNull(publicName, "publicName");
        this.publicName = publicName;
        return this;
    }

    public CommerceCollection withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public CommerceCollection withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public CommerceCollection withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public CommerceCollection withTags(Optional<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public CommerceCollection withType(CommerceCollectionType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public CommerceCollection withType(Optional<? extends CommerceCollectionType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CommerceCollection withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public CommerceCollection withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        CommerceCollection other = (CommerceCollection) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.isActive, other.isActive) &&
            Objects.deepEquals(this.isFeatured, other.isFeatured) &&
            Objects.deepEquals(this.isVisible, other.isVisible) &&
            Objects.deepEquals(this.media, other.media) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.parentId, other.parentId) &&
            Objects.deepEquals(this.publicDescription, other.publicDescription) &&
            Objects.deepEquals(this.publicName, other.publicName) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            description,
            id,
            isActive,
            isFeatured,
            isVisible,
            media,
            metadata,
            name,
            parentId,
            publicDescription,
            publicName,
            raw,
            tags,
            type,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceCollection.class,
                "createdAt", createdAt,
                "description", description,
                "id", id,
                "isActive", isActive,
                "isFeatured", isFeatured,
                "isVisible", isVisible,
                "media", media,
                "metadata", metadata,
                "name", name,
                "parentId", parentId,
                "publicDescription", publicDescription,
                "publicName", publicName,
                "raw", raw,
                "tags", tags,
                "type", type,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> isActive = Optional.empty();
 
        private Optional<Boolean> isFeatured = Optional.empty();
 
        private Optional<Boolean> isVisible = Optional.empty();
 
        private Optional<? extends List<CommerceItemMedia>> media = Optional.empty();
 
        private Optional<? extends List<CommerceItemMetadata>> metadata = Optional.empty();
 
        private String name;
 
        private Optional<String> parentId = Optional.empty();
 
        private Optional<String> publicDescription = Optional.empty();
 
        private Optional<String> publicName = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<? extends List<String>> tags = Optional.empty();
 
        private Optional<? extends CommerceCollectionType> type = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
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

        public Builder isFeatured(boolean isFeatured) {
            Utils.checkNotNull(isFeatured, "isFeatured");
            this.isFeatured = Optional.ofNullable(isFeatured);
            return this;
        }

        public Builder isFeatured(Optional<Boolean> isFeatured) {
            Utils.checkNotNull(isFeatured, "isFeatured");
            this.isFeatured = isFeatured;
            return this;
        }

        public Builder isVisible(boolean isVisible) {
            Utils.checkNotNull(isVisible, "isVisible");
            this.isVisible = Optional.ofNullable(isVisible);
            return this;
        }

        public Builder isVisible(Optional<Boolean> isVisible) {
            Utils.checkNotNull(isVisible, "isVisible");
            this.isVisible = isVisible;
            return this;
        }

        public Builder media(List<CommerceItemMedia> media) {
            Utils.checkNotNull(media, "media");
            this.media = Optional.ofNullable(media);
            return this;
        }

        public Builder media(Optional<? extends List<CommerceItemMedia>> media) {
            Utils.checkNotNull(media, "media");
            this.media = media;
            return this;
        }

        public Builder metadata(List<CommerceItemMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends List<CommerceItemMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = Optional.ofNullable(parentId);
            return this;
        }

        public Builder parentId(Optional<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }

        public Builder publicDescription(String publicDescription) {
            Utils.checkNotNull(publicDescription, "publicDescription");
            this.publicDescription = Optional.ofNullable(publicDescription);
            return this;
        }

        public Builder publicDescription(Optional<String> publicDescription) {
            Utils.checkNotNull(publicDescription, "publicDescription");
            this.publicDescription = publicDescription;
            return this;
        }

        public Builder publicName(String publicName) {
            Utils.checkNotNull(publicName, "publicName");
            this.publicName = Optional.ofNullable(publicName);
            return this;
        }

        public Builder publicName(Optional<String> publicName) {
            Utils.checkNotNull(publicName, "publicName");
            this.publicName = publicName;
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

        public Builder type(CommerceCollectionType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends CommerceCollectionType> type) {
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
        
        public CommerceCollection build() {
            return new CommerceCollection(
                createdAt,
                description,
                id,
                isActive,
                isFeatured,
                isVisible,
                media,
                metadata,
                name,
                parentId,
                publicDescription,
                publicName,
                raw,
                tags,
                type,
                updatedAt);
        }
    }
}

