/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class ListPassthroughsRequest {

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=path")
    private String path;

    @JsonCreator
    public ListPassthroughsRequest(
            String connectionId,
            String path) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(path, "path");
        this.connectionId = connectionId;
        this.path = path;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @JsonIgnore
    public String path() {
        return path;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the connection
     */
    public ListPassthroughsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public ListPassthroughsRequest withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
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
        ListPassthroughsRequest other = (ListPassthroughsRequest) o;
        return 
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.path, other.path);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionId,
            path);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListPassthroughsRequest.class,
                "connectionId", connectionId,
                "path", path);
    }
    
    public final static class Builder {
 
        private String connectionId;
 
        private String path;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the connection
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }
        
        public ListPassthroughsRequest build() {
            return new ListPassthroughsRequest(
                connectionId,
                path);
        }
    }
}

