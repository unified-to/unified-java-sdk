/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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
 * CrmDeal - A deal represents an opportunity with companies and/or contacts
 */

public class CrmDeal {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    public Double amount;

    public CrmDeal withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("closed_at")
    public OffsetDateTime closedAt;

    public CrmDeal withClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public CrmDeal withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public CrmDeal withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CrmDeal withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lost_reason")
    public String lostReason;

    public CrmDeal withLostReason(String lostReason) {
        this.lostReason = lostReason;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public CrmDeal withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pipeline")
    public String pipeline;

    public CrmDeal withPipeline(String pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("probability")
    public Double probability;

    public CrmDeal withProbability(Double probability) {
        this.probability = probability;
        return this;
    }
    
    /**
     * The raw data returned by the integration for this deal
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public CrmDeal withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    public String source;

    public CrmDeal withSource(String source) {
        this.source = source;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stage")
    public String stage;

    public CrmDeal withStage(String stage) {
        this.stage = stage;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public String[] tags;

    public CrmDeal withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public CrmDeal withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    public String userId;

    public CrmDeal withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("won_reason")
    public String wonReason;

    public CrmDeal withWonReason(String wonReason) {
        this.wonReason = wonReason;
        return this;
    }
    
    public CrmDeal(){}
}
