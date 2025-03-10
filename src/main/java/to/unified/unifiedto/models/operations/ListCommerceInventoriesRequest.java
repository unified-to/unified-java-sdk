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

public class ListCommerceInventoriesRequest {

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

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=item_variant_id")
    private Optional<String> itemVariantId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=location_id")
    private Optional<String> locationId;

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

    @JsonCreator
    public ListCommerceInventoriesRequest(
            String connectionId,
            Optional<? extends List<String>> fields,
            Optional<String> itemVariantId,
            Optional<Double> limit,
            Optional<String> locationId,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> query,
            Optional<String> sort,
            Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(itemVariantId, "itemVariantId");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(locationId, "locationId");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.connectionId = connectionId;
        this.fields = fields;
        this.itemVariantId = itemVariantId;
        this.limit = limit;
        this.locationId = locationId;
        this.offset = offset;
        this.order = order;
        this.query = query;
        this.sort = sort;
        this.updatedGte = updatedGte;
    }
    
    public ListCommerceInventoriesRequest(
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

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    @JsonIgnore
    public Optional<String> itemVariantId() {
        return itemVariantId;
    }

    @JsonIgnore
    public Optional<Double> limit() {
        return limit;
    }

    @JsonIgnore
    public Optional<String> locationId() {
        return locationId;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the connection
     */
    public ListCommerceInventoriesRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListCommerceInventoriesRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListCommerceInventoriesRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public ListCommerceInventoriesRequest withItemVariantId(String itemVariantId) {
        Utils.checkNotNull(itemVariantId, "itemVariantId");
        this.itemVariantId = Optional.ofNullable(itemVariantId);
        return this;
    }

    public ListCommerceInventoriesRequest withItemVariantId(Optional<String> itemVariantId) {
        Utils.checkNotNull(itemVariantId, "itemVariantId");
        this.itemVariantId = itemVariantId;
        return this;
    }

    public ListCommerceInventoriesRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public ListCommerceInventoriesRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListCommerceInventoriesRequest withLocationId(String locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = Optional.ofNullable(locationId);
        return this;
    }

    public ListCommerceInventoriesRequest withLocationId(Optional<String> locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = locationId;
        return this;
    }

    public ListCommerceInventoriesRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public ListCommerceInventoriesRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListCommerceInventoriesRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }

    public ListCommerceInventoriesRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListCommerceInventoriesRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListCommerceInventoriesRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    public ListCommerceInventoriesRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public ListCommerceInventoriesRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListCommerceInventoriesRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListCommerceInventoriesRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = updatedGte;
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
        ListCommerceInventoriesRequest other = (ListCommerceInventoriesRequest) o;
        return 
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.itemVariantId, other.itemVariantId) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.locationId, other.locationId) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.order, other.order) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionId,
            fields,
            itemVariantId,
            limit,
            locationId,
            offset,
            order,
            query,
            sort,
            updatedGte);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCommerceInventoriesRequest.class,
                "connectionId", connectionId,
                "fields", fields,
                "itemVariantId", itemVariantId,
                "limit", limit,
                "locationId", locationId,
                "offset", offset,
                "order", order,
                "query", query,
                "sort", sort,
                "updatedGte", updatedGte);
    }
    
    public final static class Builder {
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private Optional<String> itemVariantId = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<String> locationId = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<String> order = Optional.empty();
 
        private Optional<String> query = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();  
        
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

        public Builder itemVariantId(String itemVariantId) {
            Utils.checkNotNull(itemVariantId, "itemVariantId");
            this.itemVariantId = Optional.ofNullable(itemVariantId);
            return this;
        }

        public Builder itemVariantId(Optional<String> itemVariantId) {
            Utils.checkNotNull(itemVariantId, "itemVariantId");
            this.itemVariantId = itemVariantId;
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

        public Builder locationId(String locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = Optional.ofNullable(locationId);
            return this;
        }

        public Builder locationId(Optional<String> locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = locationId;
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
        
        public ListCommerceInventoriesRequest build() {
            return new ListCommerceInventoriesRequest(
                connectionId,
                fields,
                itemVariantId,
                limit,
                locationId,
                offset,
                order,
                query,
                sort,
                updatedGte);
        }
    }
}

