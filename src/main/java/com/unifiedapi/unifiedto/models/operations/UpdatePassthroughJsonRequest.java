/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UpdatePassthroughJsonRequest {

    /**
     * integration-specific payload
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends Object> requestBody;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=path")
    private String path;

    @JsonCreator
    public UpdatePassthroughJsonRequest(
            Optional<? extends Object> requestBody,
            String connectionId,
            String path) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(path, "path");
        this.requestBody = requestBody;
        this.connectionId = connectionId;
        this.path = path;
    }
    
    public UpdatePassthroughJsonRequest(
            String connectionId,
            String path) {
        this(Optional.empty(), connectionId, path);
    }

    /**
     * integration-specific payload
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Object> requestBody() {
        return (Optional<Object>) requestBody;
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
     * integration-specific payload
     */
    public UpdatePassthroughJsonRequest withRequestBody(Object requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    /**
     * integration-specific payload
     */
    public UpdatePassthroughJsonRequest withRequestBody(Optional<? extends Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdatePassthroughJsonRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public UpdatePassthroughJsonRequest withPath(String path) {
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
        UpdatePassthroughJsonRequest other = (UpdatePassthroughJsonRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.path, other.path);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            connectionId,
            path);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdatePassthroughJsonRequest.class,
                "requestBody", requestBody,
                "connectionId", connectionId,
                "path", path);
    }
    
    public final static class Builder {
 
        private Optional<? extends Object> requestBody = Optional.empty();
 
        private String connectionId;
 
        private String path;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * integration-specific payload
         */
        public Builder requestBody(Object requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        /**
         * integration-specific payload
         */
        public Builder requestBody(Optional<? extends Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
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

        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }
        
        public UpdatePassthroughJsonRequest build() {
            return new UpdatePassthroughJsonRequest(
                requestBody,
                connectionId,
                path);
        }
    }
}
