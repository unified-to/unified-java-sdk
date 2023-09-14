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
 * Integration - Informational object for supported integrations.
 */

public class Integration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_docs_url")
    public String apiDocsUrl;

    public Integration withApiDocsUrl(String apiDocsUrl) {
        this.apiDocsUrl = apiDocsUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("beta")
    public Boolean beta;

    public Integration withBeta(Boolean beta) {
        this.beta = beta;
        return this;
    }
    
    /**
     * The categories of support solutions that this integration has
     */
    @JsonProperty("categories")
    public PropertyIntegrationCategories[] categories;

    public Integration withCategories(PropertyIntegrationCategories[] categories) {
        this.categories = categories;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("color")
    public String color;

    public Integration withColor(String color) {
        this.color = color;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public Integration withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fa_icon")
    public String faIcon;

    public Integration withFaIcon(String faIcon) {
        this.faIcon = faIcon;
        return this;
    }
    
    @JsonProperty("in_progress")
    public Boolean inProgress;

    public Integration withInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    public Boolean isActive;

    public Integration withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo_url")
    public String logoUrl;

    public Integration withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public Integration withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate_limit_description")
    public String rateLimitDescription;

    public Integration withRateLimitDescription(String rateLimitDescription) {
        this.rateLimitDescription = rateLimitDescription;
        return this;
    }
    
    @JsonProperty("support")
    public java.util.Map<String, IntegrationSupport> support;

    public Integration withSupport(java.util.Map<String, IntegrationSupport> support) {
        this.support = support;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("tested_at")
    public OffsetDateTime testedAt;

    public Integration withTestedAt(OffsetDateTime testedAt) {
        this.testedAt = testedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_color")
    public String textColor;

    public Integration withTextColor(String textColor) {
        this.textColor = textColor;
        return this;
    }
    
    /**
     * instructions for the user on how to find the token/key
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_instructions")
    public String[] tokenInstructions;

    public Integration withTokenInstructions(String[] tokenInstructions) {
        this.tokenInstructions = tokenInstructions;
        return this;
    }
    
    /**
     * if auth_types = 'token'
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_names")
    public String[] tokenNames;

    public Integration withTokenNames(String[] tokenNames) {
        this.tokenNames = tokenNames;
        return this;
    }
    
    @JsonProperty("type")
    public String type;

    public Integration withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public Integration withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    public String webUrl;

    public Integration withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    
    public Integration(@JsonProperty("categories") PropertyIntegrationCategories[] categories, @JsonProperty("in_progress") Boolean inProgress, @JsonProperty("name") String name, @JsonProperty("support") java.util.Map<String, IntegrationSupport> support, @JsonProperty("type") String type) {
        this.categories = categories;
        this.inProgress = inProgress;
        this.name = name;
        this.support = support;
        this.type = type;
  }
}