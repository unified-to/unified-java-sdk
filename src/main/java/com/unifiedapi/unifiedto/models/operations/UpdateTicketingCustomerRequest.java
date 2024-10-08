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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class UpdateTicketingCustomerRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends TicketingCustomer> ticketingCustomer;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    /**
     * ID of the Customer
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateTicketingCustomerRequest(
            Optional<? extends TicketingCustomer> ticketingCustomer,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.ticketingCustomer = ticketingCustomer;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public UpdateTicketingCustomerRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
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
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
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

    public UpdateTicketingCustomerRequest withTicketingCustomer(TicketingCustomer ticketingCustomer) {
        Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
        this.ticketingCustomer = Optional.ofNullable(ticketingCustomer);
        return this;
    }

    public UpdateTicketingCustomerRequest withTicketingCustomer(Optional<? extends TicketingCustomer> ticketingCustomer) {
        Utils.checkNotNull(ticketingCustomer, "ticketingCustomer");
        this.ticketingCustomer = ticketingCustomer;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateTicketingCustomerRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateTicketingCustomerRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateTicketingCustomerRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Customer
     */
    public UpdateTicketingCustomerRequest withId(String id) {
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
        UpdateTicketingCustomerRequest other = (UpdateTicketingCustomerRequest) o;
        return 
            Objects.deepEquals(this.ticketingCustomer, other.ticketingCustomer) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ticketingCustomer,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateTicketingCustomerRequest.class,
                "ticketingCustomer", ticketingCustomer,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends TicketingCustomer> ticketingCustomer = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
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
         * Comma-delimited fields to return
         */
        public Builder fields(List<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * Comma-delimited fields to return
         */
        public Builder fields(Optional<? extends List<String>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
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
        
        public UpdateTicketingCustomerRequest build() {
            return new UpdateTicketingCustomerRequest(
                ticketingCustomer,
                connectionId,
                fields,
                id);
        }
    }
}

