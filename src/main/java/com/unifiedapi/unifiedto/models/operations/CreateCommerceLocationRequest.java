/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateCommerceLocationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CommerceLocation> commerceLocation;

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
    public CreateCommerceLocationRequest(
            Optional<? extends CommerceLocation> commerceLocation,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.commerceLocation = commerceLocation;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateCommerceLocationRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CommerceLocation> commerceLocation() {
        return (Optional<CommerceLocation>) commerceLocation;
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

    public CreateCommerceLocationRequest withCommerceLocation(CommerceLocation commerceLocation) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        this.commerceLocation = Optional.ofNullable(commerceLocation);
        return this;
    }

    public CreateCommerceLocationRequest withCommerceLocation(Optional<? extends CommerceLocation> commerceLocation) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        this.commerceLocation = commerceLocation;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateCommerceLocationRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCommerceLocationRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCommerceLocationRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateCommerceLocationRequest other = (CreateCommerceLocationRequest) o;
        return 
            Objects.deepEquals(this.commerceLocation, other.commerceLocation) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceLocation,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCommerceLocationRequest.class,
                "commerceLocation", commerceLocation,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceLocation> commerceLocation = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder commerceLocation(CommerceLocation commerceLocation) {
            Utils.checkNotNull(commerceLocation, "commerceLocation");
            this.commerceLocation = Optional.ofNullable(commerceLocation);
            return this;
        }

        public Builder commerceLocation(Optional<? extends CommerceLocation> commerceLocation) {
            Utils.checkNotNull(commerceLocation, "commerceLocation");
            this.commerceLocation = commerceLocation;
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
        
        public CreateCommerceLocationRequest build() {
            return new CreateCommerceLocationRequest(
                commerceLocation,
                connectionId,
                fields);
        }
    }
}

