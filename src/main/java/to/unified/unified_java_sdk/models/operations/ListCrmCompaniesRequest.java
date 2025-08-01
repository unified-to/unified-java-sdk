/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.SpeakeasyMetadata;
import to.unified.unified_java_sdk.utils.Utils;


public class ListCrmCompaniesRequest {
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * The contact ID to filter by
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=contact_id")
    private Optional<String> contactId;

    /**
     * The deal ID to filter by
     */
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

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<String> raw;


    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<String> sort;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<String> updatedGte;

    /**
     * The user/employee ID to filter by
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user_id")
    private Optional<String> userId;

    @JsonCreator
    public ListCrmCompaniesRequest(
            String connectionId,
            Optional<String> contactId,
            Optional<String> dealId,
            Optional<? extends List<String>> fields,
            Optional<Double> limit,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> query,
            Optional<String> raw,
            Optional<String> sort,
            Optional<String> updatedGte,
            Optional<String> userId) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(dealId, "dealId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(updatedGte, "updatedGte");
        Utils.checkNotNull(userId, "userId");
        this.connectionId = connectionId;
        this.contactId = contactId;
        this.dealId = dealId;
        this.fields = fields;
        this.limit = limit;
        this.offset = offset;
        this.order = order;
        this.query = query;
        this.raw = raw;
        this.sort = sort;
        this.updatedGte = updatedGte;
        this.userId = userId;
    }
    
    public ListCrmCompaniesRequest(
            String connectionId) {
        this(connectionId, Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * The contact ID to filter by
     */
    @JsonIgnore
    public Optional<String> contactId() {
        return contactId;
    }

    /**
     * The deal ID to filter by
     */
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

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @JsonIgnore
    public Optional<String> raw() {
        return raw;
    }

    @JsonIgnore
    public Optional<String> sort() {
        return sort;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @JsonIgnore
    public Optional<String> updatedGte() {
        return updatedGte;
    }

    /**
     * The user/employee ID to filter by
     */
    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the connection
     */
    public ListCrmCompaniesRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The contact ID to filter by
     */
    public ListCrmCompaniesRequest withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }


    /**
     * The contact ID to filter by
     */
    public ListCrmCompaniesRequest withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    /**
     * The deal ID to filter by
     */
    public ListCrmCompaniesRequest withDealId(String dealId) {
        Utils.checkNotNull(dealId, "dealId");
        this.dealId = Optional.ofNullable(dealId);
        return this;
    }


    /**
     * The deal ID to filter by
     */
    public ListCrmCompaniesRequest withDealId(Optional<String> dealId) {
        Utils.checkNotNull(dealId, "dealId");
        this.dealId = dealId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListCrmCompaniesRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }


    /**
     * Comma-delimited fields to return
     */
    public ListCrmCompaniesRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public ListCrmCompaniesRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }


    public ListCrmCompaniesRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListCrmCompaniesRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }


    public ListCrmCompaniesRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListCrmCompaniesRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }


    public ListCrmCompaniesRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListCrmCompaniesRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }


    /**
     * Query string to search. eg. email address or name
     */
    public ListCrmCompaniesRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public ListCrmCompaniesRequest withRaw(String raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public ListCrmCompaniesRequest withRaw(Optional<String> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public ListCrmCompaniesRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }


    public ListCrmCompaniesRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListCrmCompaniesRequest withUpdatedGte(String updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }


    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListCrmCompaniesRequest withUpdatedGte(Optional<String> updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = updatedGte;
        return this;
    }

    /**
     * The user/employee ID to filter by
     */
    public ListCrmCompaniesRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }


    /**
     * The user/employee ID to filter by
     */
    public ListCrmCompaniesRequest withUserId(Optional<String> userId) {
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
        ListCrmCompaniesRequest other = (ListCrmCompaniesRequest) o;
        return 
            Utils.enhancedDeepEquals(this.connectionId, other.connectionId) &&
            Utils.enhancedDeepEquals(this.contactId, other.contactId) &&
            Utils.enhancedDeepEquals(this.dealId, other.dealId) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.limit, other.limit) &&
            Utils.enhancedDeepEquals(this.offset, other.offset) &&
            Utils.enhancedDeepEquals(this.order, other.order) &&
            Utils.enhancedDeepEquals(this.query, other.query) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.sort, other.sort) &&
            Utils.enhancedDeepEquals(this.updatedGte, other.updatedGte) &&
            Utils.enhancedDeepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            connectionId, contactId, dealId,
            fields, limit, offset,
            order, query, raw,
            sort, updatedGte, userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCrmCompaniesRequest.class,
                "connectionId", connectionId,
                "contactId", contactId,
                "dealId", dealId,
                "fields", fields,
                "limit", limit,
                "offset", offset,
                "order", order,
                "query", query,
                "raw", raw,
                "sort", sort,
                "updatedGte", updatedGte,
                "userId", userId);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String connectionId;

        private Optional<String> contactId = Optional.empty();

        private Optional<String> dealId = Optional.empty();

        private Optional<? extends List<String>> fields = Optional.empty();

        private Optional<Double> limit = Optional.empty();

        private Optional<Double> offset = Optional.empty();

        private Optional<String> order = Optional.empty();

        private Optional<String> query = Optional.empty();

        private Optional<String> raw = Optional.empty();

        private Optional<String> sort = Optional.empty();

        private Optional<String> updatedGte = Optional.empty();

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


        /**
         * The contact ID to filter by
         */
        public Builder contactId(String contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = Optional.ofNullable(contactId);
            return this;
        }

        /**
         * The contact ID to filter by
         */
        public Builder contactId(Optional<String> contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = contactId;
            return this;
        }


        /**
         * The deal ID to filter by
         */
        public Builder dealId(String dealId) {
            Utils.checkNotNull(dealId, "dealId");
            this.dealId = Optional.ofNullable(dealId);
            return this;
        }

        /**
         * The deal ID to filter by
         */
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


        /**
         * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
         */
        public Builder raw(String raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        /**
         * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
         */
        public Builder raw(Optional<String> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
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
        public Builder updatedGte(String updatedGte) {
            Utils.checkNotNull(updatedGte, "updatedGte");
            this.updatedGte = Optional.ofNullable(updatedGte);
            return this;
        }

        /**
         * Return only results whose updated date is equal or greater to this value
         */
        public Builder updatedGte(Optional<String> updatedGte) {
            Utils.checkNotNull(updatedGte, "updatedGte");
            this.updatedGte = updatedGte;
            return this;
        }


        /**
         * The user/employee ID to filter by
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        /**
         * The user/employee ID to filter by
         */
        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public ListCrmCompaniesRequest build() {

            return new ListCrmCompaniesRequest(
                connectionId, contactId, dealId,
                fields, limit, offset,
                order, query, raw,
                sort, updatedGte, userId);
        }

    }
}
