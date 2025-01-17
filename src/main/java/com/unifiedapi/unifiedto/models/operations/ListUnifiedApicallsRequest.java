/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class ListUnifiedApicallsRequest {

    /**
     * Filter the results to just this integration
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connection_id")
    private Optional<String> connectionId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    private Optional<String> env;

    /**
     * Filter the results for API Calls with errors
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=error")
    private Optional<Boolean> error;

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=external_xref")
    private Optional<String> externalXref;

    /**
     * Filter the results to just this integration
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=integration_type")
    private Optional<String> integrationType;

    /**
     * Filter the results for only billable API Calls
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=is_billable")
    private Optional<Boolean> isBillable;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Double> offset;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    private Optional<String> order;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<String> sort;

    /**
     * Filter the results to just this type
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    private Optional<String> type;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<OffsetDateTime> updatedGte;

    /**
     * Filter the results to just this webhook
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=webhook_id")
    private Optional<String> webhookId;

    @JsonCreator
    public ListUnifiedApicallsRequest(
            Optional<String> connectionId,
            Optional<String> env,
            Optional<Boolean> error,
            Optional<String> externalXref,
            Optional<String> integrationType,
            Optional<Boolean> isBillable,
            Optional<Double> limit,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> sort,
            Optional<String> type,
            Optional<OffsetDateTime> updatedGte,
            Optional<String> webhookId) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(externalXref, "externalXref");
        Utils.checkNotNull(integrationType, "integrationType");
        Utils.checkNotNull(isBillable, "isBillable");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedGte, "updatedGte");
        Utils.checkNotNull(webhookId, "webhookId");
        this.connectionId = connectionId;
        this.env = env;
        this.error = error;
        this.externalXref = externalXref;
        this.integrationType = integrationType;
        this.isBillable = isBillable;
        this.limit = limit;
        this.offset = offset;
        this.order = order;
        this.sort = sort;
        this.type = type;
        this.updatedGte = updatedGte;
        this.webhookId = webhookId;
    }
    
    public ListUnifiedApicallsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter the results to just this integration
     */
    @JsonIgnore
    public Optional<String> connectionId() {
        return connectionId;
    }

    @JsonIgnore
    public Optional<String> env() {
        return env;
    }

    /**
     * Filter the results for API Calls with errors
     */
    @JsonIgnore
    public Optional<Boolean> error() {
        return error;
    }

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    @JsonIgnore
    public Optional<String> externalXref() {
        return externalXref;
    }

    /**
     * Filter the results to just this integration
     */
    @JsonIgnore
    public Optional<String> integrationType() {
        return integrationType;
    }

    /**
     * Filter the results for only billable API Calls
     */
    @JsonIgnore
    public Optional<Boolean> isBillable() {
        return isBillable;
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
     * Filter the results to just this type
     */
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

    /**
     * Filter the results to just this webhook
     */
    @JsonIgnore
    public Optional<String> webhookId() {
        return webhookId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter the results to just this integration
     */
    public ListUnifiedApicallsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = Optional.ofNullable(connectionId);
        return this;
    }

    /**
     * Filter the results to just this integration
     */
    public ListUnifiedApicallsRequest withConnectionId(Optional<String> connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public ListUnifiedApicallsRequest withEnv(String env) {
        Utils.checkNotNull(env, "env");
        this.env = Optional.ofNullable(env);
        return this;
    }

    public ListUnifiedApicallsRequest withEnv(Optional<String> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * Filter the results for API Calls with errors
     */
    public ListUnifiedApicallsRequest withError(boolean error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Filter the results for API Calls with errors
     */
    public ListUnifiedApicallsRequest withError(Optional<Boolean> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    public ListUnifiedApicallsRequest withExternalXref(String externalXref) {
        Utils.checkNotNull(externalXref, "externalXref");
        this.externalXref = Optional.ofNullable(externalXref);
        return this;
    }

    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    public ListUnifiedApicallsRequest withExternalXref(Optional<String> externalXref) {
        Utils.checkNotNull(externalXref, "externalXref");
        this.externalXref = externalXref;
        return this;
    }

    /**
     * Filter the results to just this integration
     */
    public ListUnifiedApicallsRequest withIntegrationType(String integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = Optional.ofNullable(integrationType);
        return this;
    }

    /**
     * Filter the results to just this integration
     */
    public ListUnifiedApicallsRequest withIntegrationType(Optional<String> integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = integrationType;
        return this;
    }

    /**
     * Filter the results for only billable API Calls
     */
    public ListUnifiedApicallsRequest withIsBillable(boolean isBillable) {
        Utils.checkNotNull(isBillable, "isBillable");
        this.isBillable = Optional.ofNullable(isBillable);
        return this;
    }

    /**
     * Filter the results for only billable API Calls
     */
    public ListUnifiedApicallsRequest withIsBillable(Optional<Boolean> isBillable) {
        Utils.checkNotNull(isBillable, "isBillable");
        this.isBillable = isBillable;
        return this;
    }

    public ListUnifiedApicallsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public ListUnifiedApicallsRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListUnifiedApicallsRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public ListUnifiedApicallsRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListUnifiedApicallsRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }

    public ListUnifiedApicallsRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    public ListUnifiedApicallsRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public ListUnifiedApicallsRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Filter the results to just this type
     */
    public ListUnifiedApicallsRequest withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Filter the results to just this type
     */
    public ListUnifiedApicallsRequest withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedApicallsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedApicallsRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = updatedGte;
        return this;
    }

    /**
     * Filter the results to just this webhook
     */
    public ListUnifiedApicallsRequest withWebhookId(String webhookId) {
        Utils.checkNotNull(webhookId, "webhookId");
        this.webhookId = Optional.ofNullable(webhookId);
        return this;
    }

    /**
     * Filter the results to just this webhook
     */
    public ListUnifiedApicallsRequest withWebhookId(Optional<String> webhookId) {
        Utils.checkNotNull(webhookId, "webhookId");
        this.webhookId = webhookId;
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
        ListUnifiedApicallsRequest other = (ListUnifiedApicallsRequest) o;
        return 
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.externalXref, other.externalXref) &&
            Objects.deepEquals(this.integrationType, other.integrationType) &&
            Objects.deepEquals(this.isBillable, other.isBillable) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.order, other.order) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte) &&
            Objects.deepEquals(this.webhookId, other.webhookId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionId,
            env,
            error,
            externalXref,
            integrationType,
            isBillable,
            limit,
            offset,
            order,
            sort,
            type,
            updatedGte,
            webhookId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUnifiedApicallsRequest.class,
                "connectionId", connectionId,
                "env", env,
                "error", error,
                "externalXref", externalXref,
                "integrationType", integrationType,
                "isBillable", isBillable,
                "limit", limit,
                "offset", offset,
                "order", order,
                "sort", sort,
                "type", type,
                "updatedGte", updatedGte,
                "webhookId", webhookId);
    }
    
    public final static class Builder {
 
        private Optional<String> connectionId = Optional.empty();
 
        private Optional<String> env = Optional.empty();
 
        private Optional<Boolean> error = Optional.empty();
 
        private Optional<String> externalXref = Optional.empty();
 
        private Optional<String> integrationType = Optional.empty();
 
        private Optional<Boolean> isBillable = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<String> order = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();
 
        private Optional<String> webhookId = Optional.empty();  
        
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
         * Filter the results for API Calls with errors
         */
        public Builder error(boolean error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Filter the results for API Calls with errors
         */
        public Builder error(Optional<Boolean> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
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

        /**
         * Filter the results for only billable API Calls
         */
        public Builder isBillable(boolean isBillable) {
            Utils.checkNotNull(isBillable, "isBillable");
            this.isBillable = Optional.ofNullable(isBillable);
            return this;
        }

        /**
         * Filter the results for only billable API Calls
         */
        public Builder isBillable(Optional<Boolean> isBillable) {
            Utils.checkNotNull(isBillable, "isBillable");
            this.isBillable = isBillable;
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
         * Filter the results to just this type
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Filter the results to just this type
         */
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

        /**
         * Filter the results to just this webhook
         */
        public Builder webhookId(String webhookId) {
            Utils.checkNotNull(webhookId, "webhookId");
            this.webhookId = Optional.ofNullable(webhookId);
            return this;
        }

        /**
         * Filter the results to just this webhook
         */
        public Builder webhookId(Optional<String> webhookId) {
            Utils.checkNotNull(webhookId, "webhookId");
            this.webhookId = webhookId;
            return this;
        }
        
        public ListUnifiedApicallsRequest build() {
            return new ListUnifiedApicallsRequest(
                connectionId,
                env,
                error,
                externalXref,
                integrationType,
                isBillable,
                limit,
                offset,
                order,
                sort,
                type,
                updatedGte,
                webhookId);
        }
    }
}

