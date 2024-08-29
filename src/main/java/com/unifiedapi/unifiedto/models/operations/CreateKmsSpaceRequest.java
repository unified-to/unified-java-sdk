/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.KmsSpace;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateKmsSpaceRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends KmsSpace> kmsSpace;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateKmsSpaceRequest(
            Optional<? extends KmsSpace> kmsSpace,
            String connectionId) {
        Utils.checkNotNull(kmsSpace, "kmsSpace");
        Utils.checkNotNull(connectionId, "connectionId");
        this.kmsSpace = kmsSpace;
        this.connectionId = connectionId;
    }
    
    public CreateKmsSpaceRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<KmsSpace> kmsSpace() {
        return (Optional<KmsSpace>) kmsSpace;
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

    public CreateKmsSpaceRequest withKmsSpace(KmsSpace kmsSpace) {
        Utils.checkNotNull(kmsSpace, "kmsSpace");
        this.kmsSpace = Optional.ofNullable(kmsSpace);
        return this;
    }

    public CreateKmsSpaceRequest withKmsSpace(Optional<? extends KmsSpace> kmsSpace) {
        Utils.checkNotNull(kmsSpace, "kmsSpace");
        this.kmsSpace = kmsSpace;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateKmsSpaceRequest withConnectionId(String connectionId) {
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
        CreateKmsSpaceRequest other = (CreateKmsSpaceRequest) o;
        return 
            Objects.deepEquals(this.kmsSpace, other.kmsSpace) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            kmsSpace,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateKmsSpaceRequest.class,
                "kmsSpace", kmsSpace,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends KmsSpace> kmsSpace = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder kmsSpace(KmsSpace kmsSpace) {
            Utils.checkNotNull(kmsSpace, "kmsSpace");
            this.kmsSpace = Optional.ofNullable(kmsSpace);
            return this;
        }

        public Builder kmsSpace(Optional<? extends KmsSpace> kmsSpace) {
            Utils.checkNotNull(kmsSpace, "kmsSpace");
            this.kmsSpace = kmsSpace;
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
        
        public CreateKmsSpaceRequest build() {
            return new CreateKmsSpaceRequest(
                kmsSpace,
                connectionId);
        }
    }
}
