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


public class ListUnifiedConnectionsRequest {

    /**
     * Filter the results on these categories
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=categories")
    private Optional<? extends List<Categories>> categories;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    private Optional<String> env;

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=external_xref")
    private Optional<String> externalXref;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Double> offset;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    private Optional<String> order;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<String> sort;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<OffsetDateTime> updatedGte;

    @JsonCreator
    public ListUnifiedConnectionsRequest(
            Optional<? extends List<Categories>> categories,
            Optional<String> env,
            Optional<String> externalXref,
            Optional<Double> limit,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> sort,
            Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(categories, "categories");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(externalXref, "externalXref");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.categories = categories;
        this.env = env;
        this.externalXref = externalXref;
        this.limit = limit;
        this.offset = offset;
        this.order = order;
        this.sort = sort;
        this.updatedGte = updatedGte;
    }
    
    public ListUnifiedConnectionsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter the results on these categories
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Categories>> categories() {
        return (Optional<List<Categories>>) categories;
    }

    @JsonIgnore
    public Optional<String> env() {
        return env;
    }

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    @JsonIgnore
    public Optional<String> externalXref() {
        return externalXref;
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
     * Filter the results on these categories
     */
    public ListUnifiedConnectionsRequest withCategories(List<Categories> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = Optional.ofNullable(categories);
        return this;
    }

    /**
     * Filter the results on these categories
     */
    public ListUnifiedConnectionsRequest withCategories(Optional<? extends List<Categories>> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = categories;
        return this;
    }

    public ListUnifiedConnectionsRequest withEnv(String env) {
        Utils.checkNotNull(env, "env");
        this.env = Optional.ofNullable(env);
        return this;
    }

    public ListUnifiedConnectionsRequest withEnv(Optional<String> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    public ListUnifiedConnectionsRequest withExternalXref(String externalXref) {
        Utils.checkNotNull(externalXref, "externalXref");
        this.externalXref = Optional.ofNullable(externalXref);
        return this;
    }

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    public ListUnifiedConnectionsRequest withExternalXref(Optional<String> externalXref) {
        Utils.checkNotNull(externalXref, "externalXref");
        this.externalXref = externalXref;
        return this;
    }

    public ListUnifiedConnectionsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public ListUnifiedConnectionsRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListUnifiedConnectionsRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public ListUnifiedConnectionsRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListUnifiedConnectionsRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }

    public ListUnifiedConnectionsRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    public ListUnifiedConnectionsRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public ListUnifiedConnectionsRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedConnectionsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedConnectionsRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
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
        ListUnifiedConnectionsRequest other = (ListUnifiedConnectionsRequest) o;
        return 
            Objects.deepEquals(this.categories, other.categories) &&
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.externalXref, other.externalXref) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.order, other.order) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            categories,
            env,
            externalXref,
            limit,
            offset,
            order,
            sort,
            updatedGte);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUnifiedConnectionsRequest.class,
                "categories", categories,
                "env", env,
                "externalXref", externalXref,
                "limit", limit,
                "offset", offset,
                "order", order,
                "sort", sort,
                "updatedGte", updatedGte);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Categories>> categories = Optional.empty();
 
        private Optional<String> env = Optional.empty();
 
        private Optional<String> externalXref = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<String> order = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter the results on these categories
         */
        public Builder categories(List<Categories> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = Optional.ofNullable(categories);
            return this;
        }

        /**
         * Filter the results on these categories
         */
        public Builder categories(Optional<? extends List<Categories>> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = categories;
            return this;
        }

        public Builder env(String env) {
            Utils.checkNotNull(env, "env");
            this.env = Optional.ofNullable(env);
            return this;
        }

        public Builder env(Optional<String> env) {
            Utils.checkNotNull(env, "env");
            this.env = env;
            return this;
        }

        /**
         * Filter the results to only those integrations for your user referenced by this value
         */
        public Builder externalXref(String externalXref) {
            Utils.checkNotNull(externalXref, "externalXref");
            this.externalXref = Optional.ofNullable(externalXref);
            return this;
        }

        /**
         * Filter the results to only those integrations for your user referenced by this value
         */
        public Builder externalXref(Optional<String> externalXref) {
            Utils.checkNotNull(externalXref, "externalXref");
            this.externalXref = externalXref;
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
        
        public ListUnifiedConnectionsRequest build() {
            return new ListUnifiedConnectionsRequest(
                categories,
                env,
                externalXref,
                limit,
                offset,
                order,
                sort,
                updatedGte);
        }
    }
}
