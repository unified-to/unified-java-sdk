/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateAtsApplicationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AtsApplication> atsApplication;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateAtsApplicationRequest(
            Optional<? extends AtsApplication> atsApplication,
            String connectionId) {
        Utils.checkNotNull(atsApplication, "atsApplication");
        Utils.checkNotNull(connectionId, "connectionId");
        this.atsApplication = atsApplication;
        this.connectionId = connectionId;
    }
    
    public CreateAtsApplicationRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsApplication> atsApplication() {
        return (Optional<AtsApplication>) atsApplication;
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

    public CreateAtsApplicationRequest withAtsApplication(AtsApplication atsApplication) {
        Utils.checkNotNull(atsApplication, "atsApplication");
        this.atsApplication = Optional.ofNullable(atsApplication);
        return this;
    }

    public CreateAtsApplicationRequest withAtsApplication(Optional<? extends AtsApplication> atsApplication) {
        Utils.checkNotNull(atsApplication, "atsApplication");
        this.atsApplication = atsApplication;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateAtsApplicationRequest withConnectionId(String connectionId) {
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
        CreateAtsApplicationRequest other = (CreateAtsApplicationRequest) o;
        return 
            Objects.deepEquals(this.atsApplication, other.atsApplication) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            atsApplication,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAtsApplicationRequest.class,
                "atsApplication", atsApplication,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends AtsApplication> atsApplication = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder atsApplication(AtsApplication atsApplication) {
            Utils.checkNotNull(atsApplication, "atsApplication");
            this.atsApplication = Optional.ofNullable(atsApplication);
            return this;
        }

        public Builder atsApplication(Optional<? extends AtsApplication> atsApplication) {
            Utils.checkNotNull(atsApplication, "atsApplication");
            this.atsApplication = atsApplication;
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
        
        public CreateAtsApplicationRequest build() {
            return new CreateAtsApplicationRequest(
                atsApplication,
                connectionId);
        }
    }
}
