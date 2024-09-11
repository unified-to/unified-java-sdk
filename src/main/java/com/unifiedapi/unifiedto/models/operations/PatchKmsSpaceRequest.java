/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.KmsSpace;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PatchKmsSpaceRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends KmsSpace> kmsSpace;

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

    /**
     * ID of the Space
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchKmsSpaceRequest(
            Optional<? extends KmsSpace> kmsSpace,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(kmsSpace, "kmsSpace");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.kmsSpace = kmsSpace;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public PatchKmsSpaceRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<KmsSpace> kmsSpace() {
        return (Optional<KmsSpace>) kmsSpace;
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

    /**
     * ID of the Space
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchKmsSpaceRequest withKmsSpace(KmsSpace kmsSpace) {
        Utils.checkNotNull(kmsSpace, "kmsSpace");
        this.kmsSpace = Optional.ofNullable(kmsSpace);
        return this;
    }

    public PatchKmsSpaceRequest withKmsSpace(Optional<? extends KmsSpace> kmsSpace) {
        Utils.checkNotNull(kmsSpace, "kmsSpace");
        this.kmsSpace = kmsSpace;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchKmsSpaceRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchKmsSpaceRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchKmsSpaceRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Space
     */
    public PatchKmsSpaceRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        PatchKmsSpaceRequest other = (PatchKmsSpaceRequest) o;
        return 
            Objects.deepEquals(this.kmsSpace, other.kmsSpace) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            kmsSpace,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchKmsSpaceRequest.class,
                "kmsSpace", kmsSpace,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends KmsSpace> kmsSpace = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder kmsSpace(KmsSpace kmsSpace) {
            Utils.checkNotNull(kmsSpace, "kmsSpace");
            this.kmsSpace = Optional.ofNullable(kmsSpace);
            return this;
        }

        public Builder kmsSpace(Optional<? extends KmsSpace> kmsSpace) {
            Utils.checkNotNull(kmsSpace, "kmsSpace");
            this.kmsSpace = kmsSpace;
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

        /**
         * ID of the Space
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchKmsSpaceRequest build() {
            return new PatchKmsSpaceRequest(
                kmsSpace,
                connectionId,
                fields,
                id);
        }
    }
}

