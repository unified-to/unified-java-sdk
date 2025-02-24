/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.LmsClass;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateLmsClassRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private LmsClass lmsClass;

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
    public CreateLmsClassRequest(
            LmsClass lmsClass,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(lmsClass, "lmsClass");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.lmsClass = lmsClass;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateLmsClassRequest(
            LmsClass lmsClass,
            String connectionId) {
        this(lmsClass, connectionId, Optional.empty());
    }

    @JsonIgnore
    public LmsClass lmsClass() {
        return lmsClass;
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

    public CreateLmsClassRequest withLmsClass(LmsClass lmsClass) {
        Utils.checkNotNull(lmsClass, "lmsClass");
        this.lmsClass = lmsClass;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateLmsClassRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateLmsClassRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateLmsClassRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateLmsClassRequest other = (CreateLmsClassRequest) o;
        return 
            Objects.deepEquals(this.lmsClass, other.lmsClass) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lmsClass,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateLmsClassRequest.class,
                "lmsClass", lmsClass,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private LmsClass lmsClass;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lmsClass(LmsClass lmsClass) {
            Utils.checkNotNull(lmsClass, "lmsClass");
            this.lmsClass = lmsClass;
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
        
        public CreateLmsClassRequest build() {
            return new CreateLmsClassRequest(
                lmsClass,
                connectionId,
                fields);
        }
    }
}

