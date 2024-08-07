/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateCrmPipelineRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CrmPipeline> crmPipeline;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateCrmPipelineRequest(
            Optional<? extends CrmPipeline> crmPipeline,
            String connectionId) {
        Utils.checkNotNull(crmPipeline, "crmPipeline");
        Utils.checkNotNull(connectionId, "connectionId");
        this.crmPipeline = crmPipeline;
        this.connectionId = connectionId;
    }
    
    public CreateCrmPipelineRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CrmPipeline> crmPipeline() {
        return (Optional<CrmPipeline>) crmPipeline;
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

    public CreateCrmPipelineRequest withCrmPipeline(CrmPipeline crmPipeline) {
        Utils.checkNotNull(crmPipeline, "crmPipeline");
        this.crmPipeline = Optional.ofNullable(crmPipeline);
        return this;
    }

    public CreateCrmPipelineRequest withCrmPipeline(Optional<? extends CrmPipeline> crmPipeline) {
        Utils.checkNotNull(crmPipeline, "crmPipeline");
        this.crmPipeline = crmPipeline;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateCrmPipelineRequest withConnectionId(String connectionId) {
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
        CreateCrmPipelineRequest other = (CreateCrmPipelineRequest) o;
        return 
            Objects.deepEquals(this.crmPipeline, other.crmPipeline) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            crmPipeline,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCrmPipelineRequest.class,
                "crmPipeline", crmPipeline,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends CrmPipeline> crmPipeline = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder crmPipeline(CrmPipeline crmPipeline) {
            Utils.checkNotNull(crmPipeline, "crmPipeline");
            this.crmPipeline = Optional.ofNullable(crmPipeline);
            return this;
        }

        public Builder crmPipeline(Optional<? extends CrmPipeline> crmPipeline) {
            Utils.checkNotNull(crmPipeline, "crmPipeline");
            this.crmPipeline = crmPipeline;
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
        
        public CreateCrmPipelineRequest build() {
            return new CreateCrmPipelineRequest(
                crmPipeline,
                connectionId);
        }
    }
}

