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


public class MetadataMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("object_type")
    private String objectType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("objects")
    private Optional<? extends Map<String, String>> objects;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public MetadataMetadata(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") String name,
            @JsonProperty("object_type") String objectType,
            @JsonProperty("objects") Optional<? extends Map<String, String>> objects,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(objectType, "objectType");
        Utils.checkNotNull(objects, "objects");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.objectType = objectType;
        this.objects = objects;
        this.raw = raw;
        this.type = type;
        this.updatedAt = updatedAt;
    }
    
    public MetadataMetadata(
            String name,
            String objectType) {
        this(Optional.empty(), Optional.empty(), name, objectType, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String objectType() {
        return objectType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> objects() {
        return (Optional<Map<String, String>>) objects;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MetadataMetadata withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public MetadataMetadata withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public MetadataMetadata withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public MetadataMetadata withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MetadataMetadata withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public MetadataMetadata withObjectType(String objectType) {
        Utils.checkNotNull(objectType, "objectType");
        this.objectType = objectType;
        return this;
    }

    public MetadataMetadata withObjects(Map<String, String> objects) {
        Utils.checkNotNull(objects, "objects");
        this.objects = Optional.ofNullable(objects);
        return this;
    }

    public MetadataMetadata withObjects(Optional<? extends Map<String, String>> objects) {
        Utils.checkNotNull(objects, "objects");
        this.objects = objects;
        return this;
    }

    public MetadataMetadata withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public MetadataMetadata withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public MetadataMetadata withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public MetadataMetadata withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public MetadataMetadata withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public MetadataMetadata withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        MetadataMetadata other = (MetadataMetadata) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.objectType, other.objectType) &&
            Objects.deepEquals(this.objects, other.objects) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            id,
            name,
            objectType,
            objects,
            raw,
            type,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MetadataMetadata.class,
                "createdAt", createdAt,
                "id", id,
                "name", name,
                "objectType", objectType,
                "objects", objects,
                "raw", raw,
                "type", type,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private String name;
 
        private String objectType;
 
        private Optional<? extends Map<String, String>> objects = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
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

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder objectType(String objectType) {
            Utils.checkNotNull(objectType, "objectType");
            this.objectType = objectType;
            return this;
        }

        public Builder objects(Map<String, String> objects) {
            Utils.checkNotNull(objects, "objects");
            this.objects = Optional.ofNullable(objects);
            return this;
        }

        public Builder objects(Optional<? extends Map<String, String>> objects) {
            Utils.checkNotNull(objects, "objects");
            this.objects = objects;
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

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
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
        
        public MetadataMetadata build() {
            return new MetadataMetadata(
                createdAt,
                id,
                name,
                objectType,
                objects,
                raw,
                type,
                updatedAt);
        }
    }
}

