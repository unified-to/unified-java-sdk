/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UpdateUnifiedConnectionRequest {

    /**
     * A connection represents a specific authentication of an integration.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Connection connection;

    /**
     * ID of the Connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateUnifiedConnectionRequest(
            Connection connection,
            String id) {
        Utils.checkNotNull(connection, "connection");
        Utils.checkNotNull(id, "id");
        this.connection = connection;
        this.id = id;
    }

    /**
     * A connection represents a specific authentication of an integration.
     */
    @JsonIgnore
    public Connection connection() {
        return connection;
    }

    /**
     * ID of the Connection
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A connection represents a specific authentication of an integration.
     */
    public UpdateUnifiedConnectionRequest withConnection(Connection connection) {
        Utils.checkNotNull(connection, "connection");
        this.connection = connection;
        return this;
    }

    /**
     * ID of the Connection
     */
    public UpdateUnifiedConnectionRequest withId(String id) {
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
        UpdateUnifiedConnectionRequest other = (UpdateUnifiedConnectionRequest) o;
        return 
            Objects.deepEquals(this.connection, other.connection) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connection,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateUnifiedConnectionRequest.class,
                "connection", connection,
                "id", id);
    }
    
    public final static class Builder {
 
        private Connection connection;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A connection represents a specific authentication of an integration.
         */
        public Builder connection(Connection connection) {
            Utils.checkNotNull(connection, "connection");
            this.connection = connection;
            return this;
        }

        /**
         * ID of the Connection
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateUnifiedConnectionRequest build() {
            return new UpdateUnifiedConnectionRequest(
                connection,
                id);
        }
    }
}

