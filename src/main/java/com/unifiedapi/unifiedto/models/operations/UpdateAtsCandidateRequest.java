/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UpdateAtsCandidateRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AtsCandidate> atsCandidate;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Candidate
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateAtsCandidateRequest(
            Optional<? extends AtsCandidate> atsCandidate,
            String connectionId,
            String id) {
        Utils.checkNotNull(atsCandidate, "atsCandidate");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.atsCandidate = atsCandidate;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public UpdateAtsCandidateRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsCandidate> atsCandidate() {
        return (Optional<AtsCandidate>) atsCandidate;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Candidate
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateAtsCandidateRequest withAtsCandidate(AtsCandidate atsCandidate) {
        Utils.checkNotNull(atsCandidate, "atsCandidate");
        this.atsCandidate = Optional.ofNullable(atsCandidate);
        return this;
    }

    public UpdateAtsCandidateRequest withAtsCandidate(Optional<? extends AtsCandidate> atsCandidate) {
        Utils.checkNotNull(atsCandidate, "atsCandidate");
        this.atsCandidate = atsCandidate;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateAtsCandidateRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Candidate
     */
    public UpdateAtsCandidateRequest withId(String id) {
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
        UpdateAtsCandidateRequest other = (UpdateAtsCandidateRequest) o;
        return 
            Objects.deepEquals(this.atsCandidate, other.atsCandidate) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            atsCandidate,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateAtsCandidateRequest.class,
                "atsCandidate", atsCandidate,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends AtsCandidate> atsCandidate = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder atsCandidate(AtsCandidate atsCandidate) {
            Utils.checkNotNull(atsCandidate, "atsCandidate");
            this.atsCandidate = Optional.ofNullable(atsCandidate);
            return this;
        }

        public Builder atsCandidate(Optional<? extends AtsCandidate> atsCandidate) {
            Utils.checkNotNull(atsCandidate, "atsCandidate");
            this.atsCandidate = atsCandidate;
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
         * ID of the Candidate
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateAtsCandidateRequest build() {
            return new UpdateAtsCandidateRequest(
                atsCandidate,
                connectionId,
                id);
        }
    }
}

