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
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class StorageFile {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<String> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_url")
    private Optional<String> downloadUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hash")
    private Optional<String> hash;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mime_type")
    private Optional<String> mimeType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private Optional<String> parentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    private Optional<? extends List<StoragePermission>> permissions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends StorageFileType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonCreator
    public StorageFile(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("data") Optional<String> data,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("download_url") Optional<String> downloadUrl,
            @JsonProperty("hash") Optional<String> hash,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("mime_type") Optional<String> mimeType,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("parent_id") Optional<String> parentId,
            @JsonProperty("permissions") Optional<? extends List<StoragePermission>> permissions,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("size") Optional<Double> size,
            @JsonProperty("type") Optional<? extends StorageFileType> type,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") Optional<String> userId) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        Utils.checkNotNull(hash, "hash");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(mimeType, "mimeType");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(permissions, "permissions");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        this.createdAt = createdAt;
        this.data = data;
        this.description = description;
        this.downloadUrl = downloadUrl;
        this.hash = hash;
        this.id = id;
        this.mimeType = mimeType;
        this.name = name;
        this.parentId = parentId;
        this.permissions = permissions;
        this.raw = raw;
        this.size = size;
        this.type = type;
        this.updatedAt = updatedAt;
        this.userId = userId;
    }
    
    public StorageFile() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> data() {
        return data;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> downloadUrl() {
        return downloadUrl;
    }

    @JsonIgnore
    public Optional<String> hash() {
        return hash;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> mimeType() {
        return mimeType;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> parentId() {
        return parentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<StoragePermission>> permissions() {
        return (Optional<List<StoragePermission>>) permissions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<Double> size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StorageFileType> type() {
        return (Optional<StorageFileType>) type;
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

    public StorageFile withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public StorageFile withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public StorageFile withData(String data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public StorageFile withData(Optional<String> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public StorageFile withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public StorageFile withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public StorageFile withDownloadUrl(String downloadUrl) {
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        this.downloadUrl = Optional.ofNullable(downloadUrl);
        return this;
    }

    public StorageFile withDownloadUrl(Optional<String> downloadUrl) {
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        this.downloadUrl = downloadUrl;
        return this;
    }

    public StorageFile withHash(String hash) {
        Utils.checkNotNull(hash, "hash");
        this.hash = Optional.ofNullable(hash);
        return this;
    }

    public StorageFile withHash(Optional<String> hash) {
        Utils.checkNotNull(hash, "hash");
        this.hash = hash;
        return this;
    }

    public StorageFile withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public StorageFile withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public StorageFile withMimeType(String mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = Optional.ofNullable(mimeType);
        return this;
    }

    public StorageFile withMimeType(Optional<String> mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = mimeType;
        return this;
    }

    public StorageFile withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public StorageFile withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public StorageFile withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = Optional.ofNullable(parentId);
        return this;
    }

    public StorageFile withParentId(Optional<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public StorageFile withPermissions(List<StoragePermission> permissions) {
        Utils.checkNotNull(permissions, "permissions");
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    public StorageFile withPermissions(Optional<? extends List<StoragePermission>> permissions) {
        Utils.checkNotNull(permissions, "permissions");
        this.permissions = permissions;
        return this;
    }

    public StorageFile withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public StorageFile withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public StorageFile withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public StorageFile withSize(Optional<Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public StorageFile withType(StorageFileType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public StorageFile withType(Optional<? extends StorageFileType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public StorageFile withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public StorageFile withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public StorageFile withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public StorageFile withUserId(Optional<String> userId) {
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
        StorageFile other = (StorageFile) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.downloadUrl, other.downloadUrl) &&
            Objects.deepEquals(this.hash, other.hash) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.mimeType, other.mimeType) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.parentId, other.parentId) &&
            Objects.deepEquals(this.permissions, other.permissions) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            data,
            description,
            downloadUrl,
            hash,
            id,
            mimeType,
            name,
            parentId,
            permissions,
            raw,
            size,
            type,
            updatedAt,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StorageFile.class,
                "createdAt", createdAt,
                "data", data,
                "description", description,
                "downloadUrl", downloadUrl,
                "hash", hash,
                "id", id,
                "mimeType", mimeType,
                "name", name,
                "parentId", parentId,
                "permissions", permissions,
                "raw", raw,
                "size", size,
                "type", type,
                "updatedAt", updatedAt,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> data = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> downloadUrl = Optional.empty();
 
        private Optional<String> hash = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> mimeType = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> parentId = Optional.empty();
 
        private Optional<? extends List<StoragePermission>> permissions = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<Double> size = Optional.empty();
 
        private Optional<? extends StorageFileType> type = Optional.empty();
 
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

        public Builder data(String data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<String> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
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

        public Builder downloadUrl(String downloadUrl) {
            Utils.checkNotNull(downloadUrl, "downloadUrl");
            this.downloadUrl = Optional.ofNullable(downloadUrl);
            return this;
        }

        public Builder downloadUrl(Optional<String> downloadUrl) {
            Utils.checkNotNull(downloadUrl, "downloadUrl");
            this.downloadUrl = downloadUrl;
            return this;
        }

        public Builder hash(String hash) {
            Utils.checkNotNull(hash, "hash");
            this.hash = Optional.ofNullable(hash);
            return this;
        }

        public Builder hash(Optional<String> hash) {
            Utils.checkNotNull(hash, "hash");
            this.hash = hash;
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

        public Builder mimeType(String mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = Optional.ofNullable(mimeType);
            return this;
        }

        public Builder mimeType(Optional<String> mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = mimeType;
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

        public Builder permissions(List<StoragePermission> permissions) {
            Utils.checkNotNull(permissions, "permissions");
            this.permissions = Optional.ofNullable(permissions);
            return this;
        }

        public Builder permissions(Optional<? extends List<StoragePermission>> permissions) {
            Utils.checkNotNull(permissions, "permissions");
            this.permissions = permissions;
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

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Double> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder type(StorageFileType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends StorageFileType> type) {
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
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public StorageFile build() {
            return new StorageFile(
                createdAt,
                data,
                description,
                downloadUrl,
                hash,
                id,
                mimeType,
                name,
                parentId,
                permissions,
                raw,
                size,
                type,
                updatedAt,
                userId);
        }
    }
}

