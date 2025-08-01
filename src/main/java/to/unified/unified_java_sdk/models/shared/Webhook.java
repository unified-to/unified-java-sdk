/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.LazySingletonValue;
import to.unified.unified_java_sdk.utils.Utils;

/**
 * Webhook
 * 
 * <p>A webhook is used to POST new/updated information to your server.
 */
public class Webhook {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("checked_at")
    private Optional<OffsetDateTime> checkedAt;


    @JsonProperty("connection_id")
    private String connectionId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("db_name_prefix")
    private Optional<String> dbNamePrefix;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("db_type")
    private Optional<? extends DbType> dbType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("db_url")
    private Optional<String> dbUrl;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("environment")
    private Optional<String> environment;


    @JsonProperty("event")
    private Event event;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    private Optional<String> fields;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filters")
    private Optional<? extends Map<String, Object>> filters;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hook_url")
    private Optional<String> hookUrl;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("integration_type")
    private Optional<String> integrationType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    private Optional<Double> interval;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_healthy")
    private Optional<Boolean> isHealthy;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_paused")
    private Optional<Boolean> isPaused;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends Map<String, Object>> meta;


    @JsonProperty("object_type")
    private ObjectType objectType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_max_limit")
    private Optional<Double> pageMaxLimit;

    /**
     * An array of the most revent virtual webhook runs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("runs")
    private Optional<? extends List<String>> runs;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhook_type")
    private Optional<? extends WebhookType> webhookType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workspace_id")
    private Optional<String> workspaceId;

    @JsonCreator
    public Webhook(
            @JsonProperty("checked_at") Optional<OffsetDateTime> checkedAt,
            @JsonProperty("connection_id") String connectionId,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("db_name_prefix") Optional<String> dbNamePrefix,
            @JsonProperty("db_type") Optional<? extends DbType> dbType,
            @JsonProperty("db_url") Optional<String> dbUrl,
            @JsonProperty("environment") Optional<String> environment,
            @JsonProperty("event") Event event,
            @JsonProperty("fields") Optional<String> fields,
            @JsonProperty("filters") Optional<? extends Map<String, Object>> filters,
            @JsonProperty("hook_url") Optional<String> hookUrl,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("integration_type") Optional<String> integrationType,
            @JsonProperty("interval") Optional<Double> interval,
            @JsonProperty("is_healthy") Optional<Boolean> isHealthy,
            @JsonProperty("is_paused") Optional<Boolean> isPaused,
            @JsonProperty("meta") Optional<? extends Map<String, Object>> meta,
            @JsonProperty("object_type") ObjectType objectType,
            @JsonProperty("page_max_limit") Optional<Double> pageMaxLimit,
            @JsonProperty("runs") Optional<? extends List<String>> runs,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("webhook_type") Optional<? extends WebhookType> webhookType,
            @JsonProperty("workspace_id") Optional<String> workspaceId) {
        Utils.checkNotNull(checkedAt, "checkedAt");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(dbNamePrefix, "dbNamePrefix");
        Utils.checkNotNull(dbType, "dbType");
        Utils.checkNotNull(dbUrl, "dbUrl");
        Utils.checkNotNull(environment, "environment");
        Utils.checkNotNull(event, "event");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(filters, "filters");
        Utils.checkNotNull(hookUrl, "hookUrl");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(integrationType, "integrationType");
        Utils.checkNotNull(interval, "interval");
        Utils.checkNotNull(isHealthy, "isHealthy");
        Utils.checkNotNull(isPaused, "isPaused");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(objectType, "objectType");
        Utils.checkNotNull(pageMaxLimit, "pageMaxLimit");
        Utils.checkNotNull(runs, "runs");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(webhookType, "webhookType");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.checkedAt = checkedAt;
        this.connectionId = connectionId;
        this.createdAt = createdAt;
        this.dbNamePrefix = dbNamePrefix;
        this.dbType = dbType;
        this.dbUrl = dbUrl;
        this.environment = environment;
        this.event = event;
        this.fields = fields;
        this.filters = filters;
        this.hookUrl = hookUrl;
        this.id = id;
        this.integrationType = integrationType;
        this.interval = interval;
        this.isHealthy = isHealthy;
        this.isPaused = isPaused;
        this.meta = meta;
        this.objectType = objectType;
        this.pageMaxLimit = pageMaxLimit;
        this.runs = runs;
        this.updatedAt = updatedAt;
        this.webhookType = webhookType;
        this.workspaceId = workspaceId;
    }
    
    public Webhook(
            String connectionId,
            Event event,
            ObjectType objectType) {
        this(Optional.empty(), connectionId, Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), event, Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), objectType,
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> checkedAt() {
        return checkedAt;
    }

    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> dbNamePrefix() {
        return dbNamePrefix;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DbType> dbType() {
        return (Optional<DbType>) dbType;
    }

    @JsonIgnore
    public Optional<String> dbUrl() {
        return dbUrl;
    }

    @JsonIgnore
    public Optional<String> environment() {
        return environment;
    }

    @JsonIgnore
    public Event event() {
        return event;
    }

    @JsonIgnore
    public Optional<String> fields() {
        return fields;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> filters() {
        return (Optional<Map<String, Object>>) filters;
    }

    @JsonIgnore
    public Optional<String> hookUrl() {
        return hookUrl;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> integrationType() {
        return integrationType;
    }

    @JsonIgnore
    public Optional<Double> interval() {
        return interval;
    }

    @JsonIgnore
    public Optional<Boolean> isHealthy() {
        return isHealthy;
    }

    @JsonIgnore
    public Optional<Boolean> isPaused() {
        return isPaused;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> meta() {
        return (Optional<Map<String, Object>>) meta;
    }

    @JsonIgnore
    public ObjectType objectType() {
        return objectType;
    }

    @JsonIgnore
    public Optional<Double> pageMaxLimit() {
        return pageMaxLimit;
    }

    /**
     * An array of the most revent virtual webhook runs
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> runs() {
        return (Optional<List<String>>) runs;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WebhookType> webhookType() {
        return (Optional<WebhookType>) webhookType;
    }

    @JsonIgnore
    public Optional<String> workspaceId() {
        return workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }


    public Webhook withCheckedAt(OffsetDateTime checkedAt) {
        Utils.checkNotNull(checkedAt, "checkedAt");
        this.checkedAt = Optional.ofNullable(checkedAt);
        return this;
    }


    public Webhook withCheckedAt(Optional<OffsetDateTime> checkedAt) {
        Utils.checkNotNull(checkedAt, "checkedAt");
        this.checkedAt = checkedAt;
        return this;
    }

    public Webhook withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public Webhook withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public Webhook withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Webhook withDbNamePrefix(String dbNamePrefix) {
        Utils.checkNotNull(dbNamePrefix, "dbNamePrefix");
        this.dbNamePrefix = Optional.ofNullable(dbNamePrefix);
        return this;
    }


    public Webhook withDbNamePrefix(Optional<String> dbNamePrefix) {
        Utils.checkNotNull(dbNamePrefix, "dbNamePrefix");
        this.dbNamePrefix = dbNamePrefix;
        return this;
    }

    public Webhook withDbType(DbType dbType) {
        Utils.checkNotNull(dbType, "dbType");
        this.dbType = Optional.ofNullable(dbType);
        return this;
    }


    public Webhook withDbType(Optional<? extends DbType> dbType) {
        Utils.checkNotNull(dbType, "dbType");
        this.dbType = dbType;
        return this;
    }

    public Webhook withDbUrl(String dbUrl) {
        Utils.checkNotNull(dbUrl, "dbUrl");
        this.dbUrl = Optional.ofNullable(dbUrl);
        return this;
    }


    public Webhook withDbUrl(Optional<String> dbUrl) {
        Utils.checkNotNull(dbUrl, "dbUrl");
        this.dbUrl = dbUrl;
        return this;
    }

    public Webhook withEnvironment(String environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = Optional.ofNullable(environment);
        return this;
    }


    public Webhook withEnvironment(Optional<String> environment) {
        Utils.checkNotNull(environment, "environment");
        this.environment = environment;
        return this;
    }

    public Webhook withEvent(Event event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
        return this;
    }

    public Webhook withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }


    public Webhook withFields(Optional<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public Webhook withFilters(Map<String, Object> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = Optional.ofNullable(filters);
        return this;
    }


    public Webhook withFilters(Optional<? extends Map<String, Object>> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
        return this;
    }

    public Webhook withHookUrl(String hookUrl) {
        Utils.checkNotNull(hookUrl, "hookUrl");
        this.hookUrl = Optional.ofNullable(hookUrl);
        return this;
    }


    public Webhook withHookUrl(Optional<String> hookUrl) {
        Utils.checkNotNull(hookUrl, "hookUrl");
        this.hookUrl = hookUrl;
        return this;
    }

    public Webhook withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public Webhook withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Webhook withIntegrationType(String integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = Optional.ofNullable(integrationType);
        return this;
    }


    public Webhook withIntegrationType(Optional<String> integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = integrationType;
        return this;
    }

    public Webhook withInterval(double interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = Optional.ofNullable(interval);
        return this;
    }


    public Webhook withInterval(Optional<Double> interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
        return this;
    }

    public Webhook withIsHealthy(boolean isHealthy) {
        Utils.checkNotNull(isHealthy, "isHealthy");
        this.isHealthy = Optional.ofNullable(isHealthy);
        return this;
    }


    public Webhook withIsHealthy(Optional<Boolean> isHealthy) {
        Utils.checkNotNull(isHealthy, "isHealthy");
        this.isHealthy = isHealthy;
        return this;
    }

    public Webhook withIsPaused(boolean isPaused) {
        Utils.checkNotNull(isPaused, "isPaused");
        this.isPaused = Optional.ofNullable(isPaused);
        return this;
    }


    public Webhook withIsPaused(Optional<Boolean> isPaused) {
        Utils.checkNotNull(isPaused, "isPaused");
        this.isPaused = isPaused;
        return this;
    }

    public Webhook withMeta(Map<String, Object> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }


    public Webhook withMeta(Optional<? extends Map<String, Object>> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    public Webhook withObjectType(ObjectType objectType) {
        Utils.checkNotNull(objectType, "objectType");
        this.objectType = objectType;
        return this;
    }

    public Webhook withPageMaxLimit(double pageMaxLimit) {
        Utils.checkNotNull(pageMaxLimit, "pageMaxLimit");
        this.pageMaxLimit = Optional.ofNullable(pageMaxLimit);
        return this;
    }


    public Webhook withPageMaxLimit(Optional<Double> pageMaxLimit) {
        Utils.checkNotNull(pageMaxLimit, "pageMaxLimit");
        this.pageMaxLimit = pageMaxLimit;
        return this;
    }

    /**
     * An array of the most revent virtual webhook runs
     */
    public Webhook withRuns(List<String> runs) {
        Utils.checkNotNull(runs, "runs");
        this.runs = Optional.ofNullable(runs);
        return this;
    }


    /**
     * An array of the most revent virtual webhook runs
     */
    public Webhook withRuns(Optional<? extends List<String>> runs) {
        Utils.checkNotNull(runs, "runs");
        this.runs = runs;
        return this;
    }

    public Webhook withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public Webhook withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public Webhook withWebhookType(WebhookType webhookType) {
        Utils.checkNotNull(webhookType, "webhookType");
        this.webhookType = Optional.ofNullable(webhookType);
        return this;
    }


    public Webhook withWebhookType(Optional<? extends WebhookType> webhookType) {
        Utils.checkNotNull(webhookType, "webhookType");
        this.webhookType = webhookType;
        return this;
    }

    public Webhook withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = Optional.ofNullable(workspaceId);
        return this;
    }


    public Webhook withWorkspaceId(Optional<String> workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        Webhook other = (Webhook) o;
        return 
            Utils.enhancedDeepEquals(this.checkedAt, other.checkedAt) &&
            Utils.enhancedDeepEquals(this.connectionId, other.connectionId) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.dbNamePrefix, other.dbNamePrefix) &&
            Utils.enhancedDeepEquals(this.dbType, other.dbType) &&
            Utils.enhancedDeepEquals(this.dbUrl, other.dbUrl) &&
            Utils.enhancedDeepEquals(this.environment, other.environment) &&
            Utils.enhancedDeepEquals(this.event, other.event) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.filters, other.filters) &&
            Utils.enhancedDeepEquals(this.hookUrl, other.hookUrl) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.integrationType, other.integrationType) &&
            Utils.enhancedDeepEquals(this.interval, other.interval) &&
            Utils.enhancedDeepEquals(this.isHealthy, other.isHealthy) &&
            Utils.enhancedDeepEquals(this.isPaused, other.isPaused) &&
            Utils.enhancedDeepEquals(this.meta, other.meta) &&
            Utils.enhancedDeepEquals(this.objectType, other.objectType) &&
            Utils.enhancedDeepEquals(this.pageMaxLimit, other.pageMaxLimit) &&
            Utils.enhancedDeepEquals(this.runs, other.runs) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt) &&
            Utils.enhancedDeepEquals(this.webhookType, other.webhookType) &&
            Utils.enhancedDeepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            checkedAt, connectionId, createdAt,
            dbNamePrefix, dbType, dbUrl,
            environment, event, fields,
            filters, hookUrl, id,
            integrationType, interval, isHealthy,
            isPaused, meta, objectType,
            pageMaxLimit, runs, updatedAt,
            webhookType, workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Webhook.class,
                "checkedAt", checkedAt,
                "connectionId", connectionId,
                "createdAt", createdAt,
                "dbNamePrefix", dbNamePrefix,
                "dbType", dbType,
                "dbUrl", dbUrl,
                "environment", environment,
                "event", event,
                "fields", fields,
                "filters", filters,
                "hookUrl", hookUrl,
                "id", id,
                "integrationType", integrationType,
                "interval", interval,
                "isHealthy", isHealthy,
                "isPaused", isPaused,
                "meta", meta,
                "objectType", objectType,
                "pageMaxLimit", pageMaxLimit,
                "runs", runs,
                "updatedAt", updatedAt,
                "webhookType", webhookType,
                "workspaceId", workspaceId);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<OffsetDateTime> checkedAt = Optional.empty();

        private String connectionId;

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> dbNamePrefix = Optional.empty();

        private Optional<? extends DbType> dbType = Optional.empty();

        private Optional<String> dbUrl = Optional.empty();

        private Optional<String> environment;

        private Event event;

        private Optional<String> fields = Optional.empty();

        private Optional<? extends Map<String, Object>> filters = Optional.empty();

        private Optional<String> hookUrl = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> integrationType = Optional.empty();

        private Optional<Double> interval = Optional.empty();

        private Optional<Boolean> isHealthy = Optional.empty();

        private Optional<Boolean> isPaused = Optional.empty();

        private Optional<? extends Map<String, Object>> meta = Optional.empty();

        private ObjectType objectType;

        private Optional<Double> pageMaxLimit = Optional.empty();

        private Optional<? extends List<String>> runs = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<? extends WebhookType> webhookType = Optional.empty();

        private Optional<String> workspaceId = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder checkedAt(OffsetDateTime checkedAt) {
            Utils.checkNotNull(checkedAt, "checkedAt");
            this.checkedAt = Optional.ofNullable(checkedAt);
            return this;
        }

        public Builder checkedAt(Optional<OffsetDateTime> checkedAt) {
            Utils.checkNotNull(checkedAt, "checkedAt");
            this.checkedAt = checkedAt;
            return this;
        }


        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }


        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        public Builder dbNamePrefix(String dbNamePrefix) {
            Utils.checkNotNull(dbNamePrefix, "dbNamePrefix");
            this.dbNamePrefix = Optional.ofNullable(dbNamePrefix);
            return this;
        }

        public Builder dbNamePrefix(Optional<String> dbNamePrefix) {
            Utils.checkNotNull(dbNamePrefix, "dbNamePrefix");
            this.dbNamePrefix = dbNamePrefix;
            return this;
        }


        public Builder dbType(DbType dbType) {
            Utils.checkNotNull(dbType, "dbType");
            this.dbType = Optional.ofNullable(dbType);
            return this;
        }

        public Builder dbType(Optional<? extends DbType> dbType) {
            Utils.checkNotNull(dbType, "dbType");
            this.dbType = dbType;
            return this;
        }


        public Builder dbUrl(String dbUrl) {
            Utils.checkNotNull(dbUrl, "dbUrl");
            this.dbUrl = Optional.ofNullable(dbUrl);
            return this;
        }

        public Builder dbUrl(Optional<String> dbUrl) {
            Utils.checkNotNull(dbUrl, "dbUrl");
            this.dbUrl = dbUrl;
            return this;
        }


        public Builder environment(String environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = Optional.ofNullable(environment);
            return this;
        }

        public Builder environment(Optional<String> environment) {
            Utils.checkNotNull(environment, "environment");
            this.environment = environment;
            return this;
        }


        public Builder event(Event event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }


        public Builder fields(String fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        public Builder fields(Optional<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }


        public Builder filters(Map<String, Object> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = Optional.ofNullable(filters);
            return this;
        }

        public Builder filters(Optional<? extends Map<String, Object>> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = filters;
            return this;
        }


        public Builder hookUrl(String hookUrl) {
            Utils.checkNotNull(hookUrl, "hookUrl");
            this.hookUrl = Optional.ofNullable(hookUrl);
            return this;
        }

        public Builder hookUrl(Optional<String> hookUrl) {
            Utils.checkNotNull(hookUrl, "hookUrl");
            this.hookUrl = hookUrl;
            return this;
        }


        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        public Builder integrationType(String integrationType) {
            Utils.checkNotNull(integrationType, "integrationType");
            this.integrationType = Optional.ofNullable(integrationType);
            return this;
        }

        public Builder integrationType(Optional<String> integrationType) {
            Utils.checkNotNull(integrationType, "integrationType");
            this.integrationType = integrationType;
            return this;
        }


        public Builder interval(double interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = Optional.ofNullable(interval);
            return this;
        }

        public Builder interval(Optional<Double> interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }


        public Builder isHealthy(boolean isHealthy) {
            Utils.checkNotNull(isHealthy, "isHealthy");
            this.isHealthy = Optional.ofNullable(isHealthy);
            return this;
        }

        public Builder isHealthy(Optional<Boolean> isHealthy) {
            Utils.checkNotNull(isHealthy, "isHealthy");
            this.isHealthy = isHealthy;
            return this;
        }


        public Builder isPaused(boolean isPaused) {
            Utils.checkNotNull(isPaused, "isPaused");
            this.isPaused = Optional.ofNullable(isPaused);
            return this;
        }

        public Builder isPaused(Optional<Boolean> isPaused) {
            Utils.checkNotNull(isPaused, "isPaused");
            this.isPaused = isPaused;
            return this;
        }


        public Builder meta(Map<String, Object> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        public Builder meta(Optional<? extends Map<String, Object>> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }


        public Builder objectType(ObjectType objectType) {
            Utils.checkNotNull(objectType, "objectType");
            this.objectType = objectType;
            return this;
        }


        public Builder pageMaxLimit(double pageMaxLimit) {
            Utils.checkNotNull(pageMaxLimit, "pageMaxLimit");
            this.pageMaxLimit = Optional.ofNullable(pageMaxLimit);
            return this;
        }

        public Builder pageMaxLimit(Optional<Double> pageMaxLimit) {
            Utils.checkNotNull(pageMaxLimit, "pageMaxLimit");
            this.pageMaxLimit = pageMaxLimit;
            return this;
        }


        /**
         * An array of the most revent virtual webhook runs
         */
        public Builder runs(List<String> runs) {
            Utils.checkNotNull(runs, "runs");
            this.runs = Optional.ofNullable(runs);
            return this;
        }

        /**
         * An array of the most revent virtual webhook runs
         */
        public Builder runs(Optional<? extends List<String>> runs) {
            Utils.checkNotNull(runs, "runs");
            this.runs = runs;
            return this;
        }


        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }


        public Builder webhookType(WebhookType webhookType) {
            Utils.checkNotNull(webhookType, "webhookType");
            this.webhookType = Optional.ofNullable(webhookType);
            return this;
        }

        public Builder webhookType(Optional<? extends WebhookType> webhookType) {
            Utils.checkNotNull(webhookType, "webhookType");
            this.webhookType = webhookType;
            return this;
        }


        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = Optional.ofNullable(workspaceId);
            return this;
        }

        public Builder workspaceId(Optional<String> workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }

        public Webhook build() {
            if (environment == null) {
                environment = _SINGLETON_VALUE_Environment.value();
            }

            return new Webhook(
                checkedAt, connectionId, createdAt,
                dbNamePrefix, dbType, dbUrl,
                environment, event, fields,
                filters, hookUrl, id,
                integrationType, interval, isHealthy,
                isPaused, meta, objectType,
                pageMaxLimit, runs, updatedAt,
                webhookType, workspaceId);
        }


        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Environment =
                new LazySingletonValue<>(
                        "environment",
                        "\"Production\"",
                        new TypeReference<Optional<String>>() {});
    }
}
