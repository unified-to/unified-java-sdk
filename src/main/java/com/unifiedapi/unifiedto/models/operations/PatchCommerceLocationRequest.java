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


public class PatchCommerceLocationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CommerceLocation> commerceLocation;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Location
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchCommerceLocationRequest(
            Optional<? extends CommerceLocation> commerceLocation,
            String connectionId,
            String id) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.commerceLocation = commerceLocation;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public PatchCommerceLocationRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
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
     * ID of the Location
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchCommerceLocationRequest withCommerceLocation(CommerceLocation commerceLocation) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        this.commerceLocation = Optional.ofNullable(commerceLocation);
        return this;
    }

    public PatchCommerceLocationRequest withCommerceLocation(Optional<? extends CommerceLocation> commerceLocation) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        this.commerceLocation = commerceLocation;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchCommerceLocationRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Location
     */
    public PatchCommerceLocationRequest withId(String id) {
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
        PatchCommerceLocationRequest other = (PatchCommerceLocationRequest) o;
        return 
            Objects.deepEquals(this.commerceLocation, other.commerceLocation) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceLocation,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchCommerceLocationRequest.class,
                "commerceLocation", commerceLocation,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceLocation> commerceLocation = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
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
         * ID of the Location
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchCommerceLocationRequest build() {
            return new PatchCommerceLocationRequest(
                commerceLocation,
                connectionId,
                id);
        }
    }
}

