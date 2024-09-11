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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class UpdateCrmPipelineRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CrmPipeline> crmPipeline;

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

    /**
     * ID of the Pipeline
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateCrmPipelineRequest(
            Optional<? extends CrmPipeline> crmPipeline,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(crmPipeline, "crmPipeline");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.crmPipeline = crmPipeline;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public UpdateCrmPipelineRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
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

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    /**
     * ID of the Pipeline
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateCrmPipelineRequest withCrmPipeline(CrmPipeline crmPipeline) {
        Utils.checkNotNull(crmPipeline, "crmPipeline");
        this.crmPipeline = Optional.ofNullable(crmPipeline);
        return this;
    }

    public UpdateCrmPipelineRequest withCrmPipeline(Optional<? extends CrmPipeline> crmPipeline) {
        Utils.checkNotNull(crmPipeline, "crmPipeline");
        this.crmPipeline = crmPipeline;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateCrmPipelineRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateCrmPipelineRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateCrmPipelineRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Pipeline
     */
    public UpdateCrmPipelineRequest withId(String id) {
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
        UpdateCrmPipelineRequest other = (UpdateCrmPipelineRequest) o;
        return 
            Objects.deepEquals(this.crmPipeline, other.crmPipeline) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            crmPipeline,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCrmPipelineRequest.class,
                "crmPipeline", crmPipeline,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends CrmPipeline> crmPipeline = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
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

        /**
         * ID of the Pipeline
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateCrmPipelineRequest build() {
            return new UpdateCrmPipelineRequest(
                crmPipeline,
                connectionId,
                fields,
                id);
        }
    }
}

