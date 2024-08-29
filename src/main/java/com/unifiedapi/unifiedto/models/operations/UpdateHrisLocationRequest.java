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


public class UpdateHrisLocationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends HrisLocation> hrisLocation;

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
    public UpdateHrisLocationRequest(
            Optional<? extends HrisLocation> hrisLocation,
            String connectionId,
            String id) {
        Utils.checkNotNull(hrisLocation, "hrisLocation");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.hrisLocation = hrisLocation;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public UpdateHrisLocationRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
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

    public UpdateHrisLocationRequest withHrisLocation(HrisLocation hrisLocation) {
        Utils.checkNotNull(hrisLocation, "hrisLocation");
        this.hrisLocation = Optional.ofNullable(hrisLocation);
        return this;
    }

    public UpdateHrisLocationRequest withHrisLocation(Optional<? extends HrisLocation> hrisLocation) {
        Utils.checkNotNull(hrisLocation, "hrisLocation");
        this.hrisLocation = hrisLocation;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateHrisLocationRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Location
     */
    public UpdateHrisLocationRequest withId(String id) {
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
        UpdateHrisLocationRequest other = (UpdateHrisLocationRequest) o;
        return 
            Objects.deepEquals(this.hrisLocation, other.hrisLocation) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hrisLocation,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateHrisLocationRequest.class,
                "hrisLocation", hrisLocation,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends HrisLocation> hrisLocation = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
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

        /**
         * ID of the Location
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateHrisLocationRequest build() {
            return new UpdateHrisLocationRequest(
                hrisLocation,
                connectionId,
                id);
        }
    }
}
