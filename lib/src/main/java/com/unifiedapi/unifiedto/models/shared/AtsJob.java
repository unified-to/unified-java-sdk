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


public class AtsJob {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    public AtsAddress[] addresses;

    public AtsJob withAddresses(AtsAddress[] addresses) {
        this.addresses = addresses;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("closed_at")
    public OffsetDateTime closedAt;

    public AtsJob withClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_id")
    public String companyId;

    public AtsJob withCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compensation")
    public AtsCompensation[] compensation;

    public AtsJob withCompensation(AtsCompensation[] compensation) {
        this.compensation = compensation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public AtsJob withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("departments")
    public String[] departments;

    public AtsJob withDepartments(String[] departments) {
        this.departments = departments;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AtsJob withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_type")
    public EmploymentType employmentType;

    public AtsJob withEmploymentType(EmploymentType employmentType) {
        this.employmentType = employmentType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hiring_manager_ids")
    public String[] hiringManagerIds;

    public AtsJob withHiringManagerIds(String[] hiringManagerIds) {
        this.hiringManagerIds = hiringManagerIds;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AtsJob withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language_locale")
    public String languageLocale;

    public AtsJob withLanguageLocale(String languageLocale) {
        this.languageLocale = languageLocale;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public AtsJob withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number_of_openings")
    public Double numberOfOpenings;

    public AtsJob withNumberOfOpenings(Double numberOfOpenings) {
        this.numberOfOpenings = numberOfOpenings;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_job_urls")
    public String[] publicJobUrls;

    public AtsJob withPublicJobUrls(String[] publicJobUrls) {
        this.publicJobUrls = publicJobUrls;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public AtsJob withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recruiter_ids")
    public String[] recruiterIds;

    public AtsJob withRecruiterIds(String[] recruiterIds) {
        this.recruiterIds = recruiterIds;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote")
    public Boolean remote;

    public AtsJob withRemote(Boolean remote) {
        this.remote = remote;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public AtsJobStatus status;

    public AtsJob withStatus(AtsJobStatus status) {
        this.status = status;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public AtsJob withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public AtsJob(){}
}
