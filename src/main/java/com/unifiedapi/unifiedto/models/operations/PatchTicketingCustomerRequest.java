/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PatchTicketingCustomerRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends TicketingCustomer> ticketingCustomer;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Customer
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchTicketingCustomerRequest(
            Optional<? extends TicketingCustomer> ticketingCustomer,
            String connectionId,
            String id) {
        Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.ticketingCustomer = ticketingCustomer;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public PatchTicketingCustomerRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TicketingCustomer> ticketingCustomer() {
        return (Optional<TicketingCustomer>) ticketingCustomer;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Customer
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchTicketingCustomerRequest withTicketingCustomer(TicketingCustomer ticketingCustomer) {
        Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
        this.ticketingCustomer = Optional.ofNullable(ticketingCustomer);
        return this;
    }

    public PatchTicketingCustomerRequest withTicketingCustomer(Optional<? extends TicketingCustomer> ticketingCustomer) {
        Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
        this.ticketingCustomer = ticketingCustomer;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchTicketingCustomerRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Customer
     */
    public PatchTicketingCustomerRequest withId(String id) {
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
        PatchTicketingCustomerRequest other = (PatchTicketingCustomerRequest) o;
        return 
            Objects.deepEquals(this.ticketingCustomer, other.ticketingCustomer) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ticketingCustomer,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchTicketingCustomerRequest.class,
                "ticketingCustomer", ticketingCustomer,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends TicketingCustomer> ticketingCustomer = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ticketingCustomer(TicketingCustomer ticketingCustomer) {
            Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
            this.ticketingCustomer = Optional.ofNullable(ticketingCustomer);
            return this;
        }

        public Builder ticketingCustomer(Optional<? extends TicketingCustomer> ticketingCustomer) {
            Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
            this.ticketingCustomer = ticketingCustomer;
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
         * ID of the Customer
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchTicketingCustomerRequest build() {
            return new PatchTicketingCustomerRequest(
                ticketingCustomer,
                connectionId,
                id);
        }
    }
}

