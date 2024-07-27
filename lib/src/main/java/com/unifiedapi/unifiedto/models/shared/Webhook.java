/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.unifiedapi.unifiedto.utils.DateTimeDeserializer;
import com.unifiedapi.unifiedto.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * Webhook - A webhook is used to POST new/updated information to your server.
 */

public class Webhook {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("checked_at")
    public OffsetDateTime checkedAt;

    public Webhook withCheckedAt(OffsetDateTime checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }
    
    @JsonProperty("connection_id")
    public String connectionId;

    public Webhook withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public Webhook withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("environment")
    public String environment;

    public Webhook withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    
    @JsonProperty("event")
    public Event event;

    public Webhook withEvent(Event event) {
        this.event = event;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public String fields;

    public Webhook withFields(String fields) {
        this.fields = fields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filters")
    public java.util.Map<String, String> filters;

    public Webhook withFilters(java.util.Map<String, String> filters) {
        this.filters = filters;
        return this;
    }
    
    @JsonProperty("hook_url")
    public String hookUrl;

    public Webhook withHookUrl(String hookUrl) {
        this.hookUrl = hookUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public Webhook withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("integration_type")
    public String integrationType;

    public Webhook withIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    public Double interval;

    public Webhook withInterval(Double interval) {
        this.interval = interval;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_healthy")
    public Boolean isHealthy;

    public Webhook withIsHealthy(Boolean isHealthy) {
        this.isHealthy = isHealthy;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    public java.util.Map<String, java.lang.Object> meta;

    public Webhook withMeta(java.util.Map<String, java.lang.Object> meta) {
        this.meta = meta;
        return this;
    }
    
    @JsonProperty("object_type")
    public ObjectType objectType;

    public Webhook withObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_max_limit")
    public Double pageMaxLimit;

    public Webhook withPageMaxLimit(Double pageMaxLimit) {
        this.pageMaxLimit = pageMaxLimit;
        return this;
    }
    
    /**
     * An array of the most revent virtual webhook runs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("runs")
    public String[] runs;

    public Webhook withRuns(String[] runs) {
        this.runs = runs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public Webhook withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhook_type")
    public WebhookType webhookType;

    public Webhook withWebhookType(WebhookType webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workspace_id")
    public String workspaceId;

    public Webhook withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public Webhook(@JsonProperty("connection_id") String connectionId, @JsonProperty("event") Event event, @JsonProperty("hook_url") String hookUrl, @JsonProperty("object_type") ObjectType objectType) {
        this.connectionId = connectionId;
        this.event = event;
        this.hookUrl = hookUrl;
        this.objectType = objectType;
  }
}
