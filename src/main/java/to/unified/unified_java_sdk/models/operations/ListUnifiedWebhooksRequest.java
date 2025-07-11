/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.SpeakeasyMetadata;
import to.unified.unified_java_sdk.utils.Utils;


public class ListUnifiedWebhooksRequest {
    /**
     * Filter the results to just this integration
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connection_id")
    private Optional<String> connectionId;

    /**
     * Return only results whose created date is equal or less to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=created_lte")
    private Optional<String> createdLte;


    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    private Optional<String> env;

    /**
     * Filter the results to just this integration
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=integration_type")
    private Optional<String> integrationType;


    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    /**
     * Filter the results for webhooks for only this object
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=object")
    private Optional<String> object;


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
    private Optional<String> updatedGte;

    @JsonCreator
    public ListUnifiedWebhooksRequest(
            Optional<String> connectionId,
            Optional<String> createdLte,
            Optional<String> env,
            Optional<String> integrationType,
            Optional<Double> limit,
            Optional<String> object,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> sort,
            Optional<String> updatedGte) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(createdLte, "createdLte");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(integrationType, "integrationType");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.connectionId = connectionId;
        this.createdLte = createdLte;
        this.env = env;
        this.integrationType = integrationType;
        this.limit = limit;
        this.object = object;
        this.offset = offset;
        this.order = order;
        this.sort = sort;
        this.updatedGte = updatedGte;
    }
    
    public ListUnifiedWebhooksRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    /**
     * Filter the results to just this integration
     */
    @JsonIgnore
    public Optional<String> connectionId() {
        return connectionId;
    }

    /**
     * Return only results whose created date is equal or less to this value
     */
    @JsonIgnore
    public Optional<String> createdLte() {
        return createdLte;
    }

    @JsonIgnore
    public Optional<String> env() {
        return env;
    }

    /**
     * Filter the results to just this integration
     */
    @JsonIgnore
    public Optional<String> integrationType() {
        return integrationType;
    }

    @JsonIgnore
    public Optional<Double> limit() {
        return limit;
    }

    /**
     * Filter the results for webhooks for only this object
     */
    @JsonIgnore
    public Optional<String> object() {
        return object;
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
    public Optional<String> updatedGte() {
        return updatedGte;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Filter the results to just this integration
     */
    public ListUnifiedWebhooksRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = Optional.ofNullable(connectionId);
        return this;
    }


    /**
     * Filter the results to just this integration
     */
    public ListUnifiedWebhooksRequest withConnectionId(Optional<String> connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Return only results whose created date is equal or less to this value
     */
    public ListUnifiedWebhooksRequest withCreatedLte(String createdLte) {
        Utils.checkNotNull(createdLte, "createdLte");
        this.createdLte = Optional.ofNullable(createdLte);
        return this;
    }


    /**
     * Return only results whose created date is equal or less to this value
     */
    public ListUnifiedWebhooksRequest withCreatedLte(Optional<String> createdLte) {
        Utils.checkNotNull(createdLte, "createdLte");
        this.createdLte = createdLte;
        return this;
    }

    public ListUnifiedWebhooksRequest withEnv(String env) {
        Utils.checkNotNull(env, "env");
        this.env = Optional.ofNullable(env);
        return this;
    }


    public ListUnifiedWebhooksRequest withEnv(Optional<String> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * Filter the results to just this integration
     */
    public ListUnifiedWebhooksRequest withIntegrationType(String integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = Optional.ofNullable(integrationType);
        return this;
    }


    /**
     * Filter the results to just this integration
     */
    public ListUnifiedWebhooksRequest withIntegrationType(Optional<String> integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = integrationType;
        return this;
    }

    public ListUnifiedWebhooksRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }


    public ListUnifiedWebhooksRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Filter the results for webhooks for only this object
     */
    public ListUnifiedWebhooksRequest withObject(String object) {
        Utils.checkNotNull(object, "object");
        this.object = Optional.ofNullable(object);
        return this;
    }


    /**
     * Filter the results for webhooks for only this object
     */
    public ListUnifiedWebhooksRequest withObject(Optional<String> object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public ListUnifiedWebhooksRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }


    public ListUnifiedWebhooksRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListUnifiedWebhooksRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }


    public ListUnifiedWebhooksRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    public ListUnifiedWebhooksRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }


    public ListUnifiedWebhooksRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedWebhooksRequest withUpdatedGte(String updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }


    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedWebhooksRequest withUpdatedGte(Optional<String> updatedGte) {
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
        ListUnifiedWebhooksRequest other = (ListUnifiedWebhooksRequest) o;
        return 
            Utils.enhancedDeepEquals(this.connectionId, other.connectionId) &&
            Utils.enhancedDeepEquals(this.createdLte, other.createdLte) &&
            Utils.enhancedDeepEquals(this.env, other.env) &&
            Utils.enhancedDeepEquals(this.integrationType, other.integrationType) &&
            Utils.enhancedDeepEquals(this.limit, other.limit) &&
            Utils.enhancedDeepEquals(this.object, other.object) &&
            Utils.enhancedDeepEquals(this.offset, other.offset) &&
            Utils.enhancedDeepEquals(this.order, other.order) &&
            Utils.enhancedDeepEquals(this.sort, other.sort) &&
            Utils.enhancedDeepEquals(this.updatedGte, other.updatedGte);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            connectionId, createdLte, env,
            integrationType, limit, object,
            offset, order, sort,
            updatedGte);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUnifiedWebhooksRequest.class,
                "connectionId", connectionId,
                "createdLte", createdLte,
                "env", env,
                "integrationType", integrationType,
                "limit", limit,
                "object", object,
                "offset", offset,
                "order", order,
                "sort", sort,
                "updatedGte", updatedGte);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> connectionId = Optional.empty();

        private Optional<String> createdLte = Optional.empty();

        private Optional<String> env = Optional.empty();

        private Optional<String> integrationType = Optional.empty();

        private Optional<Double> limit = Optional.empty();

        private Optional<String> object = Optional.empty();

        private Optional<Double> offset = Optional.empty();

        private Optional<String> order = Optional.empty();

        private Optional<String> sort = Optional.empty();

        private Optional<String> updatedGte = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Filter the results to just this integration
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = Optional.ofNullable(connectionId);
            return this;
        }

        /**
         * Filter the results to just this integration
         */
        public Builder connectionId(Optional<String> connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }


        /**
         * Return only results whose created date is equal or less to this value
         */
        public Builder createdLte(String createdLte) {
            Utils.checkNotNull(createdLte, "createdLte");
            this.createdLte = Optional.ofNullable(createdLte);
            return this;
        }

        /**
         * Return only results whose created date is equal or less to this value
         */
        public Builder createdLte(Optional<String> createdLte) {
            Utils.checkNotNull(createdLte, "createdLte");
            this.createdLte = createdLte;
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
         * Filter the results to just this integration
         */
        public Builder integrationType(String integrationType) {
            Utils.checkNotNull(integrationType, "integrationType");
            this.integrationType = Optional.ofNullable(integrationType);
            return this;
        }

        /**
         * Filter the results to just this integration
         */
        public Builder integrationType(Optional<String> integrationType) {
            Utils.checkNotNull(integrationType, "integrationType");
            this.integrationType = integrationType;
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


        /**
         * Filter the results for webhooks for only this object
         */
        public Builder object(String object) {
            Utils.checkNotNull(object, "object");
            this.object = Optional.ofNullable(object);
            return this;
        }

        /**
         * Filter the results for webhooks for only this object
         */
        public Builder object(Optional<String> object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
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

        public ListUnifiedWebhooksRequest build() {

            return new ListUnifiedWebhooksRequest(
                connectionId, createdLte, env,
                integrationType, limit, object,
                offset, order, sort,
                updatedGte);
        }

    }
}
