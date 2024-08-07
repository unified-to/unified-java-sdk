/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.HrisLocation;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateHrisLocationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends HrisLocation> hrisLocation;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateHrisLocationRequest(
            Optional<? extends HrisLocation> hrisLocation,
            String connectionId) {
        Utils.checkNotNull(hrisLocation, "hrisLocation");
        Utils.checkNotNull(connectionId, "connectionId");
        this.hrisLocation = hrisLocation;
        this.connectionId = connectionId;
    }
    
    public CreateHrisLocationRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisLocation> hrisLocation() {
        return (Optional<HrisLocation>) hrisLocation;
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

    public CreateHrisLocationRequest withHrisLocation(HrisLocation hrisLocation) {
        Utils.checkNotNull(hrisLocation, "hrisLocation");
        this.hrisLocation = Optional.ofNullable(hrisLocation);
        return this;
    }

    public CreateHrisLocationRequest withHrisLocation(Optional<? extends HrisLocation> hrisLocation) {
        Utils.checkNotNull(hrisLocation, "hrisLocation");
        this.hrisLocation = hrisLocation;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateHrisLocationRequest withConnectionId(String connectionId) {
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
        CreateHrisLocationRequest other = (CreateHrisLocationRequest) o;
        return 
            Objects.deepEquals(this.hrisLocation, other.hrisLocation) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hrisLocation,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateHrisLocationRequest.class,
                "hrisLocation", hrisLocation,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends HrisLocation> hrisLocation = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hrisLocation(HrisLocation hrisLocation) {
            Utils.checkNotNull(hrisLocation, "hrisLocation");
            this.hrisLocation = Optional.ofNullable(hrisLocation);
            return this;
        }

        public Builder hrisLocation(Optional<? extends HrisLocation> hrisLocation) {
            Utils.checkNotNull(hrisLocation, "hrisLocation");
            this.hrisLocation = hrisLocation;
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
        
        public CreateHrisLocationRequest build() {
            return new CreateHrisLocationRequest(
                hrisLocation,
                connectionId);
        }
    }
}

