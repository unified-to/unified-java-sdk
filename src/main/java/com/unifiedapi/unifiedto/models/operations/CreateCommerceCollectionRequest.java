/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CommerceCollection;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateCommerceCollectionRequest {

    /**
     * A collection of items/products/services
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CommerceCollection> commerceCollection;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateCommerceCollectionRequest(
            Optional<? extends CommerceCollection> commerceCollection,
            String connectionId) {
        Utils.checkNotNull(commerceCollection, "commerceCollection");
        Utils.checkNotNull(connectionId, "connectionId");
        this.commerceCollection = commerceCollection;
        this.connectionId = connectionId;
    }
    
    public CreateCommerceCollectionRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    /**
     * A collection of items/products/services
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CommerceCollection> commerceCollection() {
        return (Optional<CommerceCollection>) commerceCollection;
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

    /**
     * A collection of items/products/services
     */
    public CreateCommerceCollectionRequest withCommerceCollection(CommerceCollection commerceCollection) {
        Utils.checkNotNull(commerceCollection, "commerceCollection");
        this.commerceCollection = Optional.ofNullable(commerceCollection);
        return this;
    }

    /**
     * A collection of items/products/services
     */
    public CreateCommerceCollectionRequest withCommerceCollection(Optional<? extends CommerceCollection> commerceCollection) {
        Utils.checkNotNull(commerceCollection, "commerceCollection");
        this.commerceCollection = commerceCollection;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateCommerceCollectionRequest withConnectionId(String connectionId) {
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
        CreateCommerceCollectionRequest other = (CreateCommerceCollectionRequest) o;
        return 
            Objects.deepEquals(this.commerceCollection, other.commerceCollection) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceCollection,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCommerceCollectionRequest.class,
                "commerceCollection", commerceCollection,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceCollection> commerceCollection = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A collection of items/products/services
         */
        public Builder commerceCollection(CommerceCollection commerceCollection) {
            Utils.checkNotNull(commerceCollection, "commerceCollection");
            this.commerceCollection = Optional.ofNullable(commerceCollection);
            return this;
        }

        /**
         * A collection of items/products/services
         */
        public Builder commerceCollection(Optional<? extends CommerceCollection> commerceCollection) {
            Utils.checkNotNull(commerceCollection, "commerceCollection");
            this.commerceCollection = commerceCollection;
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
        
        public CreateCommerceCollectionRequest build() {
            return new CreateCommerceCollectionRequest(
                commerceCollection,
                connectionId);
        }
    }
}

