/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.HrisCompany;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateHrisCompanyRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends HrisCompany> hrisCompany;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateHrisCompanyRequest(
            Optional<? extends HrisCompany> hrisCompany,
            String connectionId) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        Utils.checkNotNull(connectionId, "connectionId");
        this.hrisCompany = hrisCompany;
        this.connectionId = connectionId;
    }
    
    public CreateHrisCompanyRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisCompany> hrisCompany() {
        return (Optional<HrisCompany>) hrisCompany;
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

    public CreateHrisCompanyRequest withHrisCompany(HrisCompany hrisCompany) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        this.hrisCompany = Optional.ofNullable(hrisCompany);
        return this;
    }

    public CreateHrisCompanyRequest withHrisCompany(Optional<? extends HrisCompany> hrisCompany) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        this.hrisCompany = hrisCompany;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateHrisCompanyRequest withConnectionId(String connectionId) {
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
        CreateHrisCompanyRequest other = (CreateHrisCompanyRequest) o;
        return 
            Objects.deepEquals(this.hrisCompany, other.hrisCompany) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hrisCompany,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateHrisCompanyRequest.class,
                "hrisCompany", hrisCompany,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends HrisCompany> hrisCompany = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hrisCompany(HrisCompany hrisCompany) {
            Utils.checkNotNull(hrisCompany, "hrisCompany");
            this.hrisCompany = Optional.ofNullable(hrisCompany);
            return this;
        }

        public Builder hrisCompany(Optional<? extends HrisCompany> hrisCompany) {
            Utils.checkNotNull(hrisCompany, "hrisCompany");
            this.hrisCompany = hrisCompany;
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
        
        public CreateHrisCompanyRequest build() {
            return new CreateHrisCompanyRequest(
                hrisCompany,
                connectionId);
        }
    }
}

