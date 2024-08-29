/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UpdateAtsJobRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AtsJob> atsJob;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Job
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateAtsJobRequest(
            Optional<? extends AtsJob> atsJob,
            String connectionId,
            String id) {
        Utils.checkNotNull(atsJob, "atsJob");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.atsJob = atsJob;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public UpdateAtsJobRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsJob> atsJob() {
        return (Optional<AtsJob>) atsJob;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Job
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateAtsJobRequest withAtsJob(AtsJob atsJob) {
        Utils.checkNotNull(atsJob, "atsJob");
        this.atsJob = Optional.ofNullable(atsJob);
        return this;
    }

    public UpdateAtsJobRequest withAtsJob(Optional<? extends AtsJob> atsJob) {
        Utils.checkNotNull(atsJob, "atsJob");
        this.atsJob = atsJob;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateAtsJobRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Job
     */
    public UpdateAtsJobRequest withId(String id) {
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
        UpdateAtsJobRequest other = (UpdateAtsJobRequest) o;
        return 
            Objects.deepEquals(this.atsJob, other.atsJob) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            atsJob,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateAtsJobRequest.class,
                "atsJob", atsJob,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends AtsJob> atsJob = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder atsJob(AtsJob atsJob) {
            Utils.checkNotNull(atsJob, "atsJob");
            this.atsJob = Optional.ofNullable(atsJob);
            return this;
        }

        public Builder atsJob(Optional<? extends AtsJob> atsJob) {
            Utils.checkNotNull(atsJob, "atsJob");
            this.atsJob = atsJob;
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
         * ID of the Job
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateAtsJobRequest build() {
            return new UpdateAtsJobRequest(
                atsJob,
                connectionId,
                id);
        }
    }
}
