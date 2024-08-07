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

    @JsonCreator
    public CreateCommerceLocationRequest(
            Optional<? extends CommerceLocation> commerceLocation,
            String connectionId) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        Utils.checkNotNull(connectionId, "connectionId");
        this.commerceLocation = commerceLocation;
        this.connectionId = connectionId;
    }
    
    public CreateCommerceLocationRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
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
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceLocation,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCommerceLocationRequest.class,
                "commerceLocation", commerceLocation,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceLocation> commerceLocation = Optional.empty();
 
        private String connectionId;  
        
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
        
        public CreateCommerceLocationRequest build() {
            return new CreateCommerceLocationRequest(
                commerceLocation,
                connectionId);
        }
    }
}

