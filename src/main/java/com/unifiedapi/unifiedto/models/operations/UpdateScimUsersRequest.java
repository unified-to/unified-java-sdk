/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.ScimUser;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UpdateScimUsersRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends ScimUser> scimUser;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the User
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateScimUsersRequest(
            Optional<? extends ScimUser> scimUser,
            String connectionId,
            String id) {
        Utils.checkNotNull(scimUser, "scimUser");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.scimUser = scimUser;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public UpdateScimUsersRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScimUser> scimUser() {
        return (Optional<ScimUser>) scimUser;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the User
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateScimUsersRequest withScimUser(ScimUser scimUser) {
        Utils.checkNotNull(scimUser, "scimUser");
        this.scimUser = Optional.ofNullable(scimUser);
        return this;
    }

    public UpdateScimUsersRequest withScimUser(Optional<? extends ScimUser> scimUser) {
        Utils.checkNotNull(scimUser, "scimUser");
        this.scimUser = scimUser;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateScimUsersRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the User
     */
    public UpdateScimUsersRequest withId(String id) {
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
        UpdateScimUsersRequest other = (UpdateScimUsersRequest) o;
        return 
            Objects.deepEquals(this.scimUser, other.scimUser) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            scimUser,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateScimUsersRequest.class,
                "scimUser", scimUser,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends ScimUser> scimUser = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder scimUser(ScimUser scimUser) {
            Utils.checkNotNull(scimUser, "scimUser");
            this.scimUser = Optional.ofNullable(scimUser);
            return this;
        }

        public Builder scimUser(Optional<? extends ScimUser> scimUser) {
            Utils.checkNotNull(scimUser, "scimUser");
            this.scimUser = scimUser;
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
         * ID of the User
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateScimUsersRequest build() {
            return new UpdateScimUsersRequest(
                scimUser,
                connectionId,
                id);
        }
    }
}

