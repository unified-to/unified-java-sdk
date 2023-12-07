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


public class AtsCandidate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public PropertyAtsCandidateAddress address;

    public AtsCandidate withAddress(PropertyAtsCandidateAddress address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    public String companyName;

    public AtsCandidate withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public AtsCandidate withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    public AtsEmail[] emails;

    public AtsCandidate withEmails(AtsEmail[] emails) {
        this.emails = emails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    public String externalId;

    public AtsCandidate withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AtsCandidate withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    public String imageUrl;

    public AtsCandidate withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    /**
     * a list of social media links associated with the candidate. eg. LinkedIn URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_urls")
    public String[] linkUrls;

    public AtsCandidate withLinkUrls(String[] linkUrls) {
        this.linkUrls = linkUrls;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public AtsCandidate withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyAtsCandidateRaw raw;

    public AtsCandidate withRaw(PropertyAtsCandidateRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public String[] tags;

    public AtsCandidate withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    public AtsTelephone[] telephones;

    public AtsCandidate withTelephones(AtsTelephone[] telephones) {
        this.telephones = telephones;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public AtsCandidate withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public AtsCandidate withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public AtsCandidate(){}
}
