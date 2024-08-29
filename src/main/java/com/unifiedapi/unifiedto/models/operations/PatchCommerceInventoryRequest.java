/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CommerceInventory;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PatchCommerceInventoryRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CommerceInventory> commerceInventory;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Inventory
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchCommerceInventoryRequest(
            Optional<? extends CommerceInventory> commerceInventory,
            String connectionId,
            String id) {
        Utils.checkNotNull(commerceInventory, "commerceInventory");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.commerceInventory = commerceInventory;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public PatchCommerceInventoryRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CommerceInventory> commerceInventory() {
        return (Optional<CommerceInventory>) commerceInventory;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Inventory
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchCommerceInventoryRequest withCommerceInventory(CommerceInventory commerceInventory) {
        Utils.checkNotNull(commerceInventory, "commerceInventory");
        this.commerceInventory = Optional.ofNullable(commerceInventory);
        return this;
    }

    public PatchCommerceInventoryRequest withCommerceInventory(Optional<? extends CommerceInventory> commerceInventory) {
        Utils.checkNotNull(commerceInventory, "commerceInventory");
        this.commerceInventory = commerceInventory;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchCommerceInventoryRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Inventory
     */
    public PatchCommerceInventoryRequest withId(String id) {
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
        PatchCommerceInventoryRequest other = (PatchCommerceInventoryRequest) o;
        return 
            Objects.deepEquals(this.commerceInventory, other.commerceInventory) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceInventory,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchCommerceInventoryRequest.class,
                "commerceInventory", commerceInventory,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceInventory> commerceInventory = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder commerceInventory(CommerceInventory commerceInventory) {
            Utils.checkNotNull(commerceInventory, "commerceInventory");
            this.commerceInventory = Optional.ofNullable(commerceInventory);
            return this;
        }

        public Builder commerceInventory(Optional<? extends CommerceInventory> commerceInventory) {
            Utils.checkNotNull(commerceInventory, "commerceInventory");
            this.commerceInventory = commerceInventory;
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
         * ID of the Inventory
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchCommerceInventoryRequest build() {
            return new PatchCommerceInventoryRequest(
                commerceInventory,
                connectionId,
                id);
        }
    }
}
