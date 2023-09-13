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
 * EnrichPerson - A person object from an enrichment integration
 */

public class EnrichPerson {
    /**
     * The address of the person
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public PropertyEnrichPersonAddress address;

    public EnrichPerson withAddress(PropertyEnrichPersonAddress address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bio")
    public String bio;

    public EnrichPerson withBio(String bio) {
        this.bio = bio;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("birthdate")
    public String birthdate;

    public EnrichPerson withBirthdate(String birthdate) {
        this.birthdate = birthdate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company")
    public String company;

    public EnrichPerson withCompany(String company) {
        this.company = company;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_domain")
    public String companyDomain;

    public EnrichPerson withCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("created_at")
    public LocalDate createdAt;

    public EnrichPerson withCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * An array of email addresses for this person
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    public EnrichEmail[] emails;

    public EnrichPerson withEmails(EnrichEmail[] emails) {
        this.emails = emails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facebook_url")
    public String facebookUrl;

    public EnrichPerson withFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gender")
    public EnrichPersonGender gender;

    public EnrichPerson withGender(EnrichPersonGender gender) {
        this.gender = gender;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("github_url")
    public String githubUrl;

    public EnrichPerson withGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("github_username")
    public String githubUsername;

    public EnrichPerson withGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public EnrichPerson withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    public String imageUrl;

    public EnrichPerson withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkedin_url")
    public String linkedinUrl;

    public EnrichPerson withLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public EnrichPerson withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The raw data returned by the integration for this person
     */
    @JsonProperty("raw")
    public PropertyEnrichPersonRaw raw;

    public EnrichPerson withRaw(PropertyEnrichPersonRaw raw) {
        this.raw = raw;
        return this;
    }
    
    /**
     * An array of telephones for this person
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    public EnrichTelephone[] telephones;

    public EnrichPerson withTelephones(EnrichTelephone[] telephones) {
        this.telephones = telephones;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;

    public EnrichPerson withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public EnrichPerson withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("twitter_handle")
    public String twitterHandle;

    public EnrichPerson withTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("twitter_url")
    public String twitterUrl;

    public EnrichPerson withTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("updated_at")
    public LocalDate updatedAt;

    public EnrichPerson withUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("utc_offset")
    public Double utcOffset;

    public EnrichPerson withUtcOffset(Double utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("work_histories")
    public EnrichPersonWorkHistory[] workHistories;

    public EnrichPerson withWorkHistories(EnrichPersonWorkHistory[] workHistories) {
        this.workHistories = workHistories;
        return this;
    }
    
    public EnrichPerson(@JsonProperty("raw") PropertyEnrichPersonRaw raw) {
        this.raw = raw;
  }
}
