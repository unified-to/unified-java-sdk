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
import java.util.Objects;
import java.util.Optional;


public class ListUnifiedWebhooksRequest {

    /**
     * A connection represents a specific authentication of an integration.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connection_id")
    private Optional<? extends ConnectionId> connectionId;

    /**
     * Return only results whose created date is equal or less to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=created_lte")
    private Optional<OffsetDateTime> createdLte;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    private Optional<String> env;

    /**
     * Informational object for supported integrations.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=integration_type")
    private Optional<? extends IntegrationType> integrationType;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    /**
     * Filter the results for webhooks for only this object
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=object")
    private Optional<String> object;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Double> offset;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<OffsetDateTime> updatedGte;

    @JsonCreator
    public ListUnifiedWebhooksRequest(
            Optional<? extends ConnectionId> connectionId,
            Optional<OffsetDateTime> createdLte,
            Optional<String> env,
            Optional<? extends IntegrationType> integrationType,
            Optional<Double> limit,
            Optional<String> object,
            Optional<Double> offset,
            Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(createdLte, "createdLte");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(integrationType, "integrationType");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.connectionId = connectionId;
        this.createdLte = createdLte;
        this.env = env;
        this.integrationType = integrationType;
        this.limit = limit;
        this.object = object;
        this.offset = offset;
        this.updatedGte = updatedGte;
    }
    
    public ListUnifiedWebhooksRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A connection represents a specific authentication of an integration.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectionId> connectionId() {
        return (Optional<ConnectionId>) connectionId;
    }

    /**
     * Return only results whose created date is equal or less to this value
     */
    @JsonIgnore
    public Optional<OffsetDateTime> createdLte() {
        return createdLte;
    }

    @JsonIgnore
    public Optional<String> env() {
        return env;
    }

    /**
     * Informational object for supported integrations.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IntegrationType> integrationType() {
        return (Optional<IntegrationType>) integrationType;
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
     * A connection represents a specific authentication of an integration.
     */
    public ListUnifiedWebhooksRequest withConnectionId(ConnectionId connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = Optional.ofNullable(connectionId);
        return this;
    }

    /**
     * A connection represents a specific authentication of an integration.
     */
    public ListUnifiedWebhooksRequest withConnectionId(Optional<? extends ConnectionId> connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Return only results whose created date is equal or less to this value
     */
    public ListUnifiedWebhooksRequest withCreatedLte(OffsetDateTime createdLte) {
        Utils.checkNotNull(createdLte, "createdLte");
        this.createdLte = Optional.ofNullable(createdLte);
        return this;
    }

    /**
     * Return only results whose created date is equal or less to this value
     */
    public ListUnifiedWebhooksRequest withCreatedLte(Optional<OffsetDateTime> createdLte) {
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
     * Informational object for supported integrations.
     */
    public ListUnifiedWebhooksRequest withIntegrationType(IntegrationType integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = Optional.ofNullable(integrationType);
        return this;
    }

    /**
     * Informational object for supported integrations.
     */
    public ListUnifiedWebhooksRequest withIntegrationType(Optional<? extends IntegrationType> integrationType) {
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

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedWebhooksRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListUnifiedWebhooksRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
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
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.createdLte, other.createdLte) &&
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.integrationType, other.integrationType) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionId,
            createdLte,
            env,
            integrationType,
            limit,
            object,
            offset,
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
                "updatedGte", updatedGte);
    }
    
    public final static class Builder {
 
        private Optional<? extends ConnectionId> connectionId = Optional.empty();
 
        private Optional<OffsetDateTime> createdLte = Optional.empty();
 
        private Optional<String> env = Optional.empty();
 
        private Optional<? extends IntegrationType> integrationType = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<String> object = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A connection represents a specific authentication of an integration.
         */
        public Builder connectionId(ConnectionId connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = Optional.ofNullable(connectionId);
            return this;
        }

        /**
         * A connection represents a specific authentication of an integration.
         */
        public Builder connectionId(Optional<? extends ConnectionId> connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Return only results whose created date is equal or less to this value
         */
        public Builder createdLte(OffsetDateTime createdLte) {
            Utils.checkNotNull(createdLte, "createdLte");
            this.createdLte = Optional.ofNullable(createdLte);
            return this;
        }

        /**
         * Return only results whose created date is equal or less to this value
         */
        public Builder createdLte(Optional<OffsetDateTime> createdLte) {
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
         * Informational object for supported integrations.
         */
        public Builder integrationType(IntegrationType integrationType) {
            Utils.checkNotNull(integrationType, "integrationType");
            this.integrationType = Optional.ofNullable(integrationType);
            return this;
        }

        /**
         * Informational object for supported integrations.
         */
        public Builder integrationType(Optional<? extends IntegrationType> integrationType) {
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
        
        public ListUnifiedWebhooksRequest build() {
            return new ListUnifiedWebhooksRequest(
                connectionId,
                createdLte,
                env,
                integrationType,
                limit,
                object,
                offset,
                updatedGte);
        }
    }
}

