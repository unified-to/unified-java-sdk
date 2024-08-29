/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateCrmLeadRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CrmLead> crmLead;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateCrmLeadRequest(
            Optional<? extends CrmLead> crmLead,
            String connectionId) {
        Utils.checkNotNull(crmLead, "crmLead");
        Utils.checkNotNull(connectionId, "connectionId");
        this.crmLead = crmLead;
        this.connectionId = connectionId;
    }
    
    public CreateCrmLeadRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CrmLead> crmLead() {
        return (Optional<CrmLead>) crmLead;
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

    public CreateCrmLeadRequest withCrmLead(CrmLead crmLead) {
        Utils.checkNotNull(crmLead, "crmLead");
        this.crmLead = Optional.ofNullable(crmLead);
        return this;
    }

    public CreateCrmLeadRequest withCrmLead(Optional<? extends CrmLead> crmLead) {
        Utils.checkNotNull(crmLead, "crmLead");
        this.crmLead = crmLead;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateCrmLeadRequest withConnectionId(String connectionId) {
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
        CreateCrmLeadRequest other = (CreateCrmLeadRequest) o;
        return 
            Objects.deepEquals(this.crmLead, other.crmLead) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            crmLead,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCrmLeadRequest.class,
                "crmLead", crmLead,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends CrmLead> crmLead = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder crmLead(CrmLead crmLead) {
            Utils.checkNotNull(crmLead, "crmLead");
            this.crmLead = Optional.ofNullable(crmLead);
            return this;
        }

        public Builder crmLead(Optional<? extends CrmLead> crmLead) {
            Utils.checkNotNull(crmLead, "crmLead");
            this.crmLead = crmLead;
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
        
        public CreateCrmLeadRequest build() {
            return new CreateCrmLeadRequest(
                crmLead,
                connectionId);
        }
    }
}
