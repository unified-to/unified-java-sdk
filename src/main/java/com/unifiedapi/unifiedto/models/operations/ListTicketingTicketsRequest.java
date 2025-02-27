/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ListTicketingTicketsRequest {

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=customer_id")
    private Optional<String> customerId;

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Double> offset;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    private Optional<String> order;

    /**
     * Query string to search. eg. email address or name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<String> query;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<String> sort;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<OffsetDateTime> updatedGte;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user_id")
    private Optional<String> userId;

    @JsonCreator
    public ListTicketingTicketsRequest(
            String connectionId,
            Optional<String> customerId,
            Optional<? extends List<String>> fields,
            Optional<Double> limit,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> query,
            Optional<String> sort,
            Optional<OffsetDateTime> updatedGte,
            Optional<String> userId) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(updatedGte, "updatedGte");
        Utils.checkNotNull(userId, "userId");
        this.connectionId = connectionId;
        this.customerId = customerId;
        this.fields = fields;
        this.limit = limit;
        this.offset = offset;
        this.order = order;
        this.query = query;
        this.sort = sort;
        this.updatedGte = updatedGte;
        this.userId = userId;
    }
    
    public ListTicketingTicketsRequest(
            String connectionId) {
        this(connectionId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    @JsonIgnore
    public Optional<Double> limit() {
        return limit;
    }

    @JsonIgnore
    public Optional<Double> offset() {
        return offset;
    }

    @JsonIgnore
    public Optional<String> order() {
        return order;
    }

    /**
     * Query string to search. eg. email address or name
     */
    @JsonIgnore
    public Optional<String> query() {
        return query;
    }

    @JsonIgnore
    public Optional<String> sort() {
        return sort;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @JsonIgnore
    public Optional<OffsetDateTime> updatedGte() {
        return updatedGte;
    }

    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the connection
     */
    public ListTicketingTicketsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public ListTicketingTicketsRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    public ListTicketingTicketsRequest withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListTicketingTicketsRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListTicketingTicketsRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public ListTicketingTicketsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public ListTicketingTicketsRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListTicketingTicketsRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public ListTicketingTicketsRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListTicketingTicketsRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }

    public ListTicketingTicketsRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListTicketingTicketsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListTicketingTicketsRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    public ListTicketingTicketsRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public ListTicketingTicketsRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListTicketingTicketsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListTicketingTicketsRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = updatedGte;
        return this;
    }

    public ListTicketingTicketsRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public ListTicketingTicketsRequest withUserId(Optional<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        ListTicketingTicketsRequest other = (ListTicketingTicketsRequest) o;
        return 
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.order, other.order) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionId,
            customerId,
            fields,
            limit,
            offset,
            order,
            query,
            sort,
            updatedGte,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTicketingTicketsRequest.class,
                "connectionId", connectionId,
                "customerId", customerId,
                "fields", fields,
                "limit", limit,
                "offset", offset,
                "order", order,
                "query", query,
                "sort", sort,
                "updatedGte", updatedGte,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String connectionId;
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<String> order = Optional.empty();
 
        private Optional<String> query = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();
 
        private Optional<String> userId = Optional.empty();  
        
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

        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
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

        public Builder limit(double limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        public Builder limit(Optional<Double> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder offset(double offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        public Builder offset(Optional<Double> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        public Builder order(String order) {
            Utils.checkNotNull(order, "order");
            this.order = Optional.ofNullable(order);
            return this;
        }

        public Builder order(Optional<String> order) {
            Utils.checkNotNull(order, "order");
            this.order = order;
            return this;
        }

        /**
         * Query string to search. eg. email address or name
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Query string to search. eg. email address or name
         */
        public Builder query(Optional<String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        public Builder sort(String sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        public Builder sort(Optional<String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        /**
         * Return only results whose updated date is equal or greater to this value
         */
        public Builder updatedGte(OffsetDateTime updatedGte) {
            Utils.checkNotNull(updatedGte, "updatedGte");
            this.updatedGte = Optional.ofNullable(updatedGte);
            return this;
        }

        /**
         * Return only results whose updated date is equal or greater to this value
         */
        public Builder updatedGte(Optional<OffsetDateTime> updatedGte) {
            Utils.checkNotNull(updatedGte, "updatedGte");
            this.updatedGte = updatedGte;
            return this;
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public ListTicketingTicketsRequest build() {
            return new ListTicketingTicketsRequest(
                connectionId,
                customerId,
                fields,
                limit,
                offset,
                order,
                query,
                sort,
                updatedGte,
                userId);
        }
    }
}

