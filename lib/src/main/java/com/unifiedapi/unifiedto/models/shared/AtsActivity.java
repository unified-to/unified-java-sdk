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


public class AtsActivity {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("application_id")
    public String applicationId;

    public AtsActivity withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("candidate_id")
    public String candidateId;

    public AtsActivity withCandidateId(String candidateId) {
        this.candidateId = candidateId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public AtsActivity withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AtsActivity withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_id")
    public String documentId;

    public AtsActivity withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AtsActivity withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interview_id")
    public String interviewId;

    public AtsActivity withInterviewId(String interviewId) {
        this.interviewId = interviewId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_private")
    public Boolean isPrivate;

    public AtsActivity withIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_id")
    public String jobId;

    public AtsActivity withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public AtsActivity withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonProperty("title")
    public String title;

    public AtsActivity withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public AtsActivityType type;

    public AtsActivity withType(AtsActivityType type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public AtsActivity withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_ids")
    public String[] userIds;

    public AtsActivity withUserIds(String[] userIds) {
        this.userIds = userIds;
        return this;
    }
    
    public AtsActivity(@JsonProperty("title") String title) {
        this.title = title;
  }
}