/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.ScimGroup;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class PatchScimGroupsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ScimGroup scimGroup;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Group
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchScimGroupsRequest(
            ScimGroup scimGroup,
            String connectionId,
            String id) {
        Utils.checkNotNull(scimGroup, "scimGroup");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.scimGroup = scimGroup;
        this.connectionId = connectionId;
        this.id = id;
    }

    @JsonIgnore
    public ScimGroup scimGroup() {
        return scimGroup;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Group
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchScimGroupsRequest withScimGroup(ScimGroup scimGroup) {
        Utils.checkNotNull(scimGroup, "scimGroup");
        this.scimGroup = scimGroup;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchScimGroupsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Group
     */
    public PatchScimGroupsRequest withId(String id) {
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
        PatchScimGroupsRequest other = (PatchScimGroupsRequest) o;
        return 
            Objects.deepEquals(this.scimGroup, other.scimGroup) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            scimGroup,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchScimGroupsRequest.class,
                "scimGroup", scimGroup,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private ScimGroup scimGroup;
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder scimGroup(ScimGroup scimGroup) {
            Utils.checkNotNull(scimGroup, "scimGroup");
            this.scimGroup = scimGroup;
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
         * ID of the Group
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchScimGroupsRequest build() {
            return new PatchScimGroupsRequest(
                scimGroup,
                connectionId,
                id);
        }
    }
}

