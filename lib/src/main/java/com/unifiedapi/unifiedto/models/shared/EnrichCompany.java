/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * EnrichCompany - A company object from an enrichment integration
 */

public class EnrichCompany {
    /**
     * The address of the company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public PropertyEnrichCompanyAddress address;

    public EnrichCompany withAddress(PropertyEnrichCompanyAddress address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alexa_rank")
    public Double alexaRank;

    public EnrichCompany withAlexaRank(Double alexaRank) {
        this.alexaRank = alexaRank;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("created_at")
    public LocalDate createdAt;

    public EnrichCompany withCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("crunchbase_url")
    public String crunchbaseUrl;

    public EnrichCompany withCrunchbaseUrl(String crunchbaseUrl) {
        this.crunchbaseUrl = crunchbaseUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public EnrichCompany withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")
    public String domain;

    public EnrichCompany withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employees")
    public String employees;

    public EnrichCompany withEmployees(String employees) {
        this.employees = employees;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exchange")
    public String exchange;

    public EnrichCompany withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facebook_url")
    public String facebookUrl;

    public EnrichCompany withFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public EnrichCompany withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("industry")
    public String industry;

    public EnrichCompany withIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instagram_url")
    public String instagramUrl;

    public EnrichCompany withInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkedin_url")
    public String linkedinUrl;

    public EnrichCompany withLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo_url")
    public String logoUrl;

    public EnrichCompany withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("naics_code")
    public Double naicsCode;

    public EnrichCompany withNaicsCode(Double naicsCode) {
        this.naicsCode = naicsCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public EnrichCompany withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The raw data returned by the integration for this company
     */
    @JsonProperty("raw")
    public PropertyEnrichCompanyRaw raw;

    public EnrichCompany withRaw(PropertyEnrichCompanyRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("revenue")
    public String revenue;

    public EnrichCompany withRevenue(String revenue) {
        this.revenue = revenue;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sic_code")
    public Double sicCode;

    public EnrichCompany withSicCode(Double sicCode) {
        this.sicCode = sicCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stock")
    public String stock;

    public EnrichCompany withStock(String stock) {
        this.stock = stock;
        return this;
    }
    
    /**
     * An array of telephones for this company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    public EnrichTelephone[] telephones;

    public EnrichCompany withTelephones(EnrichTelephone[] telephones) {
        this.telephones = telephones;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("twitter_handle")
    public String twitterHandle;

    public EnrichCompany withTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("twitter_url")
    public String twitterUrl;

    public EnrichCompany withTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("updated_at")
    public LocalDate updatedAt;

    public EnrichCompany withUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("year_founded")
    public Double yearFounded;

    public EnrichCompany withYearFounded(Double yearFounded) {
        this.yearFounded = yearFounded;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("yelp_url")
    public String yelpUrl;

    public EnrichCompany withYelpUrl(String yelpUrl) {
        this.yelpUrl = yelpUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("youtube_url")
    public String youtubeUrl;

    public EnrichCompany withYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
        return this;
    }
    
    public EnrichCompany(@JsonProperty("raw") PropertyEnrichCompanyRaw raw) {
        this.raw = raw;
  }
}
