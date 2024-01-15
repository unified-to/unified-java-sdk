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
 * CrmCompany - A company represents an organization that optionally is associated with a deal and/or contacts
 */

public class CrmCompany {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public PropertyCrmCompanyAddress address;

    public CrmCompany withAddress(PropertyCrmCompanyAddress address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public CrmCompany withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * An array of deal IDs associated with this contact
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deal_ids")
    public String[] dealIds;

    public CrmCompany withDealIds(String[] dealIds) {
        this.dealIds = dealIds;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public CrmCompany withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    public CrmEmail[] emails;

    public CrmCompany withEmails(CrmEmail[] emails) {
        this.emails = emails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employees")
    public Double employees;

    public CrmCompany withEmployees(Double employees) {
        this.employees = employees;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CrmCompany withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("industry")
    public String industry;

    public CrmCompany withIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    public Boolean isActive;

    public CrmCompany withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_urls")
    public String[] linkUrls;

    public CrmCompany withLinkUrls(String[] linkUrls) {
        this.linkUrls = linkUrls;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public CrmCompany withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The raw data returned by the integration for this company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyCrmCompanyRaw raw;

    public CrmCompany withRaw(PropertyCrmCompanyRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public String[] tags;

    public CrmCompany withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    public CrmTelephone[] telephones;

    public CrmCompany withTelephones(CrmTelephone[] telephones) {
        this.telephones = telephones;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;

    public CrmCompany withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public CrmCompany withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    public String userId;

    public CrmCompany withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("websites")
    public String[] websites;

    public CrmCompany withWebsites(String[] websites) {
        this.websites = websites;
        return this;
    }
    
    public CrmCompany(){}
}
