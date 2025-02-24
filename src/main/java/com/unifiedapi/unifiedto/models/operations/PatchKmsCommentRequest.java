/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.KmsComment;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PatchKmsCommentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private KmsComment kmsComment;

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
     * ID of the Comment
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchKmsCommentRequest(
            KmsComment kmsComment,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(kmsComment, "kmsComment");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.kmsComment = kmsComment;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public PatchKmsCommentRequest(
            KmsComment kmsComment,
            String connectionId,
            String id) {
        this(kmsComment, connectionId, Optional.empty(), id);
    }

    @JsonIgnore
    public KmsComment kmsComment() {
        return kmsComment;
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
     * ID of the Comment
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchKmsCommentRequest withKmsComment(KmsComment kmsComment) {
        Utils.checkNotNull(kmsComment, "kmsComment");
        this.kmsComment = kmsComment;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchKmsCommentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchKmsCommentRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchKmsCommentRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Comment
     */
    public PatchKmsCommentRequest withId(String id) {
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
        PatchKmsCommentRequest other = (PatchKmsCommentRequest) o;
        return 
            Objects.deepEquals(this.kmsComment, other.kmsComment) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            kmsComment,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchKmsCommentRequest.class,
                "kmsComment", kmsComment,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private KmsComment kmsComment;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder kmsComment(KmsComment kmsComment) {
            Utils.checkNotNull(kmsComment, "kmsComment");
            this.kmsComment = kmsComment;
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
         * ID of the Comment
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchKmsCommentRequest build() {
            return new PatchKmsCommentRequest(
                kmsComment,
                connectionId,
                fields,
                id);
        }
    }
}

