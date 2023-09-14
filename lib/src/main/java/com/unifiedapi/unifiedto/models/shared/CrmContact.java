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
 * CrmContact - A contact represents a person that optionally is associated with a deal and/or a company
 */

public class CrmContact {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public PropertyCrmContactAddress address;

    public CrmContact withAddress(PropertyCrmContactAddress address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company")
    public String company;

    public CrmContact withCompany(String company) {
        this.company = company;
        return this;
    }
    
    /**
     * An array of company IDs associated with this contact
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_ids")
    public String[] companyIds;

    public CrmContact withCompanyIds(String[] companyIds) {
        this.companyIds = companyIds;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public CrmContact withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * An array of deal IDs associated with this contact
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deal_ids")
    public String[] dealIds;

    public CrmContact withDealIds(String[] dealIds) {
        this.dealIds = dealIds;
        return this;
    }
    
    /**
     * An array of email addresses for this contact
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    public CrmEmail[] emails;

    public CrmContact withEmails(CrmEmail[] emails) {
        this.emails = emails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CrmContact withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public CrmContact withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The raw data returned by the integration for this contact
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyCrmContactRaw raw;

    public CrmContact withRaw(PropertyCrmContactRaw raw) {
        this.raw = raw;
        return this;
    }
    
    /**
     * An array of telephones for this contact
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    public CrmTelephone[] telephones;

    public CrmContact withTelephones(CrmTelephone[] telephones) {
        this.telephones = telephones;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public CrmContact withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public CrmContact withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public CrmContact(){}
}
