/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import to.unified.unifiedto.utils.SpeakeasyMetadata;
import to.unified.unifiedto.utils.Utils;

public class ListCrmEventsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=company_id")
    private Optional<String> companyId;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=contact_id")
    private Optional<String> contactId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=deal_id")
    private Optional<String> dealId;

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

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    private Optional<String> type;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<OffsetDateTime> updatedGte;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user_id")
    private Optional<String> userId;

    @JsonCreator
    public ListCrmEventsRequest(
            Optional<String> companyId,
            String connectionId,
            Optional<String> contactId,
            Optional<String> dealId,
            Optional<? extends List<String>> fields,
            Optional<Double> limit,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> query,
            Optional<String> sort,
            Optional<String> type,
            Optional<OffsetDateTime> updatedGte,
            Optional<String> userId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(dealId, "dealId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedGte, "updatedGte");
        Utils.checkNotNull(userId, "userId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.contactId = contactId;
        this.dealId = dealId;
        this.fields = fields;
        this.limit = limit;
        this.offset = offset;
        this.order = order;
        this.query = query;
        this.sort = sort;
        this.type = type;
        this.updatedGte = updatedGte;
        this.userId = userId;
    }
    
    public ListCrmEventsRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @JsonIgnore
    public Optional<String> contactId() {
        return contactId;
    }

    @JsonIgnore
    public Optional<String> dealId() {
        return dealId;
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

    @JsonIgnore
    public Optional<String> type() {
        return type;
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

    public ListCrmEventsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    public ListCrmEventsRequest withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * ID of the connection
     */
    public ListCrmEventsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public ListCrmEventsRequest withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }

    public ListCrmEventsRequest withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    public ListCrmEventsRequest withDealId(String dealId) {
        Utils.checkNotNull(dealId, "dealId");
        this.dealId = Optional.ofNullable(dealId);
        return this;
    }

    public ListCrmEventsRequest withDealId(Optional<String> dealId) {
        Utils.checkNotNull(dealId, "dealId");
        this.dealId = dealId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListCrmEventsRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListCrmEventsRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public ListCrmEventsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public ListCrmEventsRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListCrmEventsRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public ListCrmEventsRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListCrmEventsRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }

    public ListCrmEventsRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListCrmEventsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListCrmEventsRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    public ListCrmEventsRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public ListCrmEventsRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    public ListCrmEventsRequest withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public ListCrmEventsRequest withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListCrmEventsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListCrmEventsRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = updatedGte;
        return this;
    }

    public ListCrmEventsRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public ListCrmEventsRequest withUserId(Optional<String> userId) {
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
        ListCrmEventsRequest other = (ListCrmEventsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.contactId, other.contactId) &&
            Objects.deepEquals(this.dealId, other.dealId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.order, other.order) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            contactId,
            dealId,
            fields,
            limit,
            offset,
            order,
            query,
            sort,
            type,
            updatedGte,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCrmEventsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "contactId", contactId,
                "dealId", dealId,
                "fields", fields,
                "limit", limit,
                "offset", offset,
                "order", order,
                "query", query,
                "sort", sort,
                "type", type,
                "updatedGte", updatedGte,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<String> companyId = Optional.empty();
 
        private String connectionId;
 
        private Optional<String> contactId = Optional.empty();
 
        private Optional<String> dealId = Optional.empty();
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<String> order = Optional.empty();
 
        private Optional<String> query = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();
 
        private Optional<String> userId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
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

        public Builder contactId(String contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = Optional.ofNullable(contactId);
            return this;
        }

        public Builder contactId(Optional<String> contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = contactId;
            return this;
        }

        public Builder dealId(String dealId) {
            Utils.checkNotNull(dealId, "dealId");
            this.dealId = Optional.ofNullable(dealId);
            return this;
        }

        public Builder dealId(Optional<String> dealId) {
            Utils.checkNotNull(dealId, "dealId");
            this.dealId = dealId;
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

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
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
        
        public ListCrmEventsRequest build() {
            return new ListCrmEventsRequest(
                companyId,
                connectionId,
                contactId,
                dealId,
                fields,
                limit,
                offset,
                order,
                query,
                sort,
                type,
                updatedGte,
                userId);
        }
    }
}

