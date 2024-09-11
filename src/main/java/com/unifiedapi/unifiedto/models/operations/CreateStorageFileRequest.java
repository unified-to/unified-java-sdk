/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateStorageFileRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends StorageFile> storageFile;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    @JsonCreator
    public CreateStorageFileRequest(
            Optional<? extends StorageFile> storageFile,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(storageFile, "storageFile");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.storageFile = storageFile;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateStorageFileRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<StorageFile> storageFile() {
        return (Optional<StorageFile>) storageFile;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateStorageFileRequest withStorageFile(StorageFile storageFile) {
        Utils.checkNotNull(storageFile, "storageFile");
        this.storageFile = Optional.ofNullable(storageFile);
        return this;
    }

    public CreateStorageFileRequest withStorageFile(Optional<? extends StorageFile> storageFile) {
        Utils.checkNotNull(storageFile, "storageFile");
        this.storageFile = storageFile;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateStorageFileRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateStorageFileRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateStorageFileRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
        CreateStorageFileRequest other = (CreateStorageFileRequest) o;
        return 
            Objects.deepEquals(this.storageFile, other.storageFile) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            storageFile,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateStorageFileRequest.class,
                "storageFile", storageFile,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private Optional<? extends StorageFile> storageFile = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder storageFile(StorageFile storageFile) {
            Utils.checkNotNull(storageFile, "storageFile");
            this.storageFile = Optional.ofNullable(storageFile);
            return this;
        }

        public Builder storageFile(Optional<? extends StorageFile> storageFile) {
            Utils.checkNotNull(storageFile, "storageFile");
            this.storageFile = storageFile;
            return this;
        }

        /**
         * ID of the connection
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Comma-delimited fields to return
         */
        public Builder fields(List<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * Comma-delimited fields to return
         */
        public Builder fields(Optional<? extends List<String>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }
        
        public CreateStorageFileRequest build() {
            return new CreateStorageFileRequest(
                storageFile,
                connectionId,
                fields);
        }
    }
}

