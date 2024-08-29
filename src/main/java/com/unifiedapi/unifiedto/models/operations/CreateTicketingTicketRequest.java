/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateTicketingTicketRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends TicketingTicket> ticketingTicket;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateTicketingTicketRequest(
            Optional<? extends TicketingTicket> ticketingTicket,
            String connectionId) {
        Utils.checkNotNull(ticketingTicket, "ticketingTicket");
        Utils.checkNotNull(connectionId, "connectionId");
        this.ticketingTicket = ticketingTicket;
        this.connectionId = connectionId;
    }
    
    public CreateTicketingTicketRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TicketingTicket> ticketingTicket() {
        return (Optional<TicketingTicket>) ticketingTicket;
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

    public CreateTicketingTicketRequest withTicketingTicket(TicketingTicket ticketingTicket) {
        Utils.checkNotNull(ticketingTicket, "ticketingTicket");
        this.ticketingTicket = Optional.ofNullable(ticketingTicket);
        return this;
    }

    public CreateTicketingTicketRequest withTicketingTicket(Optional<? extends TicketingTicket> ticketingTicket) {
        Utils.checkNotNull(ticketingTicket, "ticketingTicket");
        this.ticketingTicket = ticketingTicket;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateTicketingTicketRequest withConnectionId(String connectionId) {
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
        CreateTicketingTicketRequest other = (CreateTicketingTicketRequest) o;
        return 
            Objects.deepEquals(this.ticketingTicket, other.ticketingTicket) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ticketingTicket,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTicketingTicketRequest.class,
                "ticketingTicket", ticketingTicket,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends TicketingTicket> ticketingTicket = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ticketingTicket(TicketingTicket ticketingTicket) {
            Utils.checkNotNull(ticketingTicket, "ticketingTicket");
            this.ticketingTicket = Optional.ofNullable(ticketingTicket);
            return this;
        }

        public Builder ticketingTicket(Optional<? extends TicketingTicket> ticketingTicket) {
            Utils.checkNotNull(ticketingTicket, "ticketingTicket");
            this.ticketingTicket = ticketingTicket;
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
        
        public CreateTicketingTicketRequest build() {
            return new CreateTicketingTicketRequest(
                ticketingTicket,
                connectionId);
        }
    }
}
