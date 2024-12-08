/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CommerceMetadata;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateCommerceMetadataRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CommerceMetadata> commerceMetadata;

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
    public CreateCommerceMetadataRequest(
            Optional<? extends CommerceMetadata> commerceMetadata,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(commerceMetadata, "commerceMetadata");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.commerceMetadata = commerceMetadata;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateCommerceMetadataRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CommerceMetadata> commerceMetadata() {
        return (Optional<CommerceMetadata>) commerceMetadata;
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

    public CreateCommerceMetadataRequest withCommerceMetadata(CommerceMetadata commerceMetadata) {
        Utils.checkNotNull(commerceMetadata, "commerceMetadata");
        this.commerceMetadata = Optional.ofNullable(commerceMetadata);
        return this;
    }

    public CreateCommerceMetadataRequest withCommerceMetadata(Optional<? extends CommerceMetadata> commerceMetadata) {
        Utils.checkNotNull(commerceMetadata, "commerceMetadata");
        this.commerceMetadata = commerceMetadata;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateCommerceMetadataRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCommerceMetadataRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCommerceMetadataRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateCommerceMetadataRequest other = (CreateCommerceMetadataRequest) o;
        return 
            Objects.deepEquals(this.commerceMetadata, other.commerceMetadata) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceMetadata,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCommerceMetadataRequest.class,
                "commerceMetadata", commerceMetadata,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceMetadata> commerceMetadata = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder commerceMetadata(CommerceMetadata commerceMetadata) {
            Utils.checkNotNull(commerceMetadata, "commerceMetadata");
            this.commerceMetadata = Optional.ofNullable(commerceMetadata);
            return this;
        }

        public Builder commerceMetadata(Optional<? extends CommerceMetadata> commerceMetadata) {
            Utils.checkNotNull(commerceMetadata, "commerceMetadata");
            this.commerceMetadata = commerceMetadata;
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
        
        public CreateCommerceMetadataRequest build() {
            return new CreateCommerceMetadataRequest(
                commerceMetadata,
                connectionId,
                fields);
        }
    }
}

