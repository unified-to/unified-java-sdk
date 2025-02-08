/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class AtsActivity {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("application_id")
    private Optional<String> applicationId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bcc")
    private Optional<? extends List<AtsEmail>> bcc;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("candidate_id")
    private Optional<String> candidateId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cc")
    private Optional<? extends List<AtsEmail>> cc;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_id")
    private Optional<String> documentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    private Optional<? extends PropertyAtsActivityFrom> from;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interview_id")
    private Optional<String> interviewId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_private")
    private Optional<Boolean> isPrivate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_id")
    private Optional<String> jobId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Raw> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sub_type")
    private Optional<String> subType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    private Optional<? extends List<AtsEmail>> to;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AtsActivityType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    /**
     * id values of the recruiters associated with the activity.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_ids")
    private Optional<? extends List<String>> userIds;

    @JsonCreator
    public AtsActivity(
            @JsonProperty("application_id") Optional<String> applicationId,
            @JsonProperty("bcc") Optional<? extends List<AtsEmail>> bcc,
            @JsonProperty("candidate_id") Optional<String> candidateId,
            @JsonProperty("cc") Optional<? extends List<AtsEmail>> cc,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("document_id") Optional<String> documentId,
            @JsonProperty("from") Optional<? extends PropertyAtsActivityFrom> from,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("interview_id") Optional<String> interviewId,
            @JsonProperty("is_private") Optional<Boolean> isPrivate,
            @JsonProperty("job_id") Optional<String> jobId,
            @JsonProperty("raw") Optional<? extends Raw> raw,
            @JsonProperty("sub_type") Optional<String> subType,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("to") Optional<? extends List<AtsEmail>> to,
            @JsonProperty("type") Optional<? extends AtsActivityType> type,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_ids") Optional<? extends List<String>> userIds) {
        Utils.checkNotNull(applicationId, "applicationId");
        Utils.checkNotNull(bcc, "bcc");
        Utils.checkNotNull(candidateId, "candidateId");
        Utils.checkNotNull(cc, "cc");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(documentId, "documentId");
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(interviewId, "interviewId");
        Utils.checkNotNull(isPrivate, "isPrivate");
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(subType, "subType");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(to, "to");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userIds, "userIds");
        this.applicationId = applicationId;
        this.bcc = bcc;
        this.candidateId = candidateId;
        this.cc = cc;
        this.createdAt = createdAt;
        this.description = description;
        this.documentId = documentId;
        this.from = from;
        this.id = id;
        this.interviewId = interviewId;
        this.isPrivate = isPrivate;
        this.jobId = jobId;
        this.raw = raw;
        this.subType = subType;
        this.title = title;
        this.to = to;
        this.type = type;
        this.updatedAt = updatedAt;
        this.userIds = userIds;
    }
    
    public AtsActivity() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> applicationId() {
        return applicationId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsEmail>> bcc() {
        return (Optional<List<AtsEmail>>) bcc;
    }

    @JsonIgnore
    public Optional<String> candidateId() {
        return candidateId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsEmail>> cc() {
        return (Optional<List<AtsEmail>>) cc;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> documentId() {
        return documentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyAtsActivityFrom> from() {
        return (Optional<PropertyAtsActivityFrom>) from;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> interviewId() {
        return interviewId;
    }

    @JsonIgnore
    public Optional<Boolean> isPrivate() {
        return isPrivate;
    }

    @JsonIgnore
    public Optional<String> jobId() {
        return jobId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Raw> raw() {
        return (Optional<Raw>) raw;
    }

    @JsonIgnore
    public Optional<String> subType() {
        return subType;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsEmail>> to() {
        return (Optional<List<AtsEmail>>) to;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsActivityType> type() {
        return (Optional<AtsActivityType>) type;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    /**
     * id values of the recruiters associated with the activity.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> userIds() {
        return (Optional<List<String>>) userIds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AtsActivity withApplicationId(String applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = Optional.ofNullable(applicationId);
        return this;
    }

    public AtsActivity withApplicationId(Optional<String> applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = applicationId;
        return this;
    }

    public AtsActivity withBcc(List<AtsEmail> bcc) {
        Utils.checkNotNull(bcc, "bcc");
        this.bcc = Optional.ofNullable(bcc);
        return this;
    }

    public AtsActivity withBcc(Optional<? extends List<AtsEmail>> bcc) {
        Utils.checkNotNull(bcc, "bcc");
        this.bcc = bcc;
        return this;
    }

    public AtsActivity withCandidateId(String candidateId) {
        Utils.checkNotNull(candidateId, "candidateId");
        this.candidateId = Optional.ofNullable(candidateId);
        return this;
    }

    public AtsActivity withCandidateId(Optional<String> candidateId) {
        Utils.checkNotNull(candidateId, "candidateId");
        this.candidateId = candidateId;
        return this;
    }

    public AtsActivity withCc(List<AtsEmail> cc) {
        Utils.checkNotNull(cc, "cc");
        this.cc = Optional.ofNullable(cc);
        return this;
    }

    public AtsActivity withCc(Optional<? extends List<AtsEmail>> cc) {
        Utils.checkNotNull(cc, "cc");
        this.cc = cc;
        return this;
    }

    public AtsActivity withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public AtsActivity withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AtsActivity withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public AtsActivity withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public AtsActivity withDocumentId(String documentId) {
        Utils.checkNotNull(documentId, "documentId");
        this.documentId = Optional.ofNullable(documentId);
        return this;
    }

    public AtsActivity withDocumentId(Optional<String> documentId) {
        Utils.checkNotNull(documentId, "documentId");
        this.documentId = documentId;
        return this;
    }

    public AtsActivity withFrom(PropertyAtsActivityFrom from) {
        Utils.checkNotNull(from, "from");
        this.from = Optional.ofNullable(from);
        return this;
    }

    public AtsActivity withFrom(Optional<? extends PropertyAtsActivityFrom> from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    public AtsActivity withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AtsActivity withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsActivity withInterviewId(String interviewId) {
        Utils.checkNotNull(interviewId, "interviewId");
        this.interviewId = Optional.ofNullable(interviewId);
        return this;
    }

    public AtsActivity withInterviewId(Optional<String> interviewId) {
        Utils.checkNotNull(interviewId, "interviewId");
        this.interviewId = interviewId;
        return this;
    }

    public AtsActivity withIsPrivate(boolean isPrivate) {
        Utils.checkNotNull(isPrivate, "isPrivate");
        this.isPrivate = Optional.ofNullable(isPrivate);
        return this;
    }

    public AtsActivity withIsPrivate(Optional<Boolean> isPrivate) {
        Utils.checkNotNull(isPrivate, "isPrivate");
        this.isPrivate = isPrivate;
        return this;
    }

    public AtsActivity withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = Optional.ofNullable(jobId);
        return this;
    }

    public AtsActivity withJobId(Optional<String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    public AtsActivity withRaw(Raw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public AtsActivity withRaw(Optional<? extends Raw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public AtsActivity withSubType(String subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = Optional.ofNullable(subType);
        return this;
    }

    public AtsActivity withSubType(Optional<String> subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = subType;
        return this;
    }

    public AtsActivity withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public AtsActivity withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public AtsActivity withTo(List<AtsEmail> to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.ofNullable(to);
        return this;
    }

    public AtsActivity withTo(Optional<? extends List<AtsEmail>> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }

    public AtsActivity withType(AtsActivityType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AtsActivity withType(Optional<? extends AtsActivityType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public AtsActivity withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public AtsActivity withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * id values of the recruiters associated with the activity.
     */
    public AtsActivity withUserIds(List<String> userIds) {
        Utils.checkNotNull(userIds, "userIds");
        this.userIds = Optional.ofNullable(userIds);
        return this;
    }

    /**
     * id values of the recruiters associated with the activity.
     */
    public AtsActivity withUserIds(Optional<? extends List<String>> userIds) {
        Utils.checkNotNull(userIds, "userIds");
        this.userIds = userIds;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtsActivity other = (AtsActivity) o;
        return 
            Objects.deepEquals(this.applicationId, other.applicationId) &&
            Objects.deepEquals(this.bcc, other.bcc) &&
            Objects.deepEquals(this.candidateId, other.candidateId) &&
            Objects.deepEquals(this.cc, other.cc) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.documentId, other.documentId) &&
            Objects.deepEquals(this.from, other.from) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.interviewId, other.interviewId) &&
            Objects.deepEquals(this.isPrivate, other.isPrivate) &&
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.subType, other.subType) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.to, other.to) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userIds, other.userIds);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            applicationId,
            bcc,
            candidateId,
            cc,
            createdAt,
            description,
            documentId,
            from,
            id,
            interviewId,
            isPrivate,
            jobId,
            raw,
            subType,
            title,
            to,
            type,
            updatedAt,
            userIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsActivity.class,
                "applicationId", applicationId,
                "bcc", bcc,
                "candidateId", candidateId,
                "cc", cc,
                "createdAt", createdAt,
                "description", description,
                "documentId", documentId,
                "from", from,
                "id", id,
                "interviewId", interviewId,
                "isPrivate", isPrivate,
                "jobId", jobId,
                "raw", raw,
                "subType", subType,
                "title", title,
                "to", to,
                "type", type,
                "updatedAt", updatedAt,
                "userIds", userIds);
    }
    
    public final static class Builder {
 
        private Optional<String> applicationId = Optional.empty();
 
        private Optional<? extends List<AtsEmail>> bcc = Optional.empty();
 
        private Optional<String> candidateId = Optional.empty();
 
        private Optional<? extends List<AtsEmail>> cc = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> documentId = Optional.empty();
 
        private Optional<? extends PropertyAtsActivityFrom> from = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> interviewId = Optional.empty();
 
        private Optional<Boolean> isPrivate = Optional.empty();
 
        private Optional<String> jobId = Optional.empty();
 
        private Optional<? extends Raw> raw = Optional.empty();
 
        private Optional<String> subType = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<? extends List<AtsEmail>> to = Optional.empty();
 
        private Optional<? extends AtsActivityType> type = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<? extends List<String>> userIds = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder applicationId(String applicationId) {
            Utils.checkNotNull(applicationId, "applicationId");
            this.applicationId = Optional.ofNullable(applicationId);
            return this;
        }

        public Builder applicationId(Optional<String> applicationId) {
            Utils.checkNotNull(applicationId, "applicationId");
            this.applicationId = applicationId;
            return this;
        }

        public Builder bcc(List<AtsEmail> bcc) {
            Utils.checkNotNull(bcc, "bcc");
            this.bcc = Optional.ofNullable(bcc);
            return this;
        }

        public Builder bcc(Optional<? extends List<AtsEmail>> bcc) {
            Utils.checkNotNull(bcc, "bcc");
            this.bcc = bcc;
            return this;
        }

        public Builder candidateId(String candidateId) {
            Utils.checkNotNull(candidateId, "candidateId");
            this.candidateId = Optional.ofNullable(candidateId);
            return this;
        }

        public Builder candidateId(Optional<String> candidateId) {
            Utils.checkNotNull(candidateId, "candidateId");
            this.candidateId = candidateId;
            return this;
        }

        public Builder cc(List<AtsEmail> cc) {
            Utils.checkNotNull(cc, "cc");
            this.cc = Optional.ofNullable(cc);
            return this;
        }

        public Builder cc(Optional<? extends List<AtsEmail>> cc) {
            Utils.checkNotNull(cc, "cc");
            this.cc = cc;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder documentId(String documentId) {
            Utils.checkNotNull(documentId, "documentId");
            this.documentId = Optional.ofNullable(documentId);
            return this;
        }

        public Builder documentId(Optional<String> documentId) {
            Utils.checkNotNull(documentId, "documentId");
            this.documentId = documentId;
            return this;
        }

        public Builder from(PropertyAtsActivityFrom from) {
            Utils.checkNotNull(from, "from");
            this.from = Optional.ofNullable(from);
            return this;
        }

        public Builder from(Optional<? extends PropertyAtsActivityFrom> from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder interviewId(String interviewId) {
            Utils.checkNotNull(interviewId, "interviewId");
            this.interviewId = Optional.ofNullable(interviewId);
            return this;
        }

        public Builder interviewId(Optional<String> interviewId) {
            Utils.checkNotNull(interviewId, "interviewId");
            this.interviewId = interviewId;
            return this;
        }

        public Builder isPrivate(boolean isPrivate) {
            Utils.checkNotNull(isPrivate, "isPrivate");
            this.isPrivate = Optional.ofNullable(isPrivate);
            return this;
        }

        public Builder isPrivate(Optional<Boolean> isPrivate) {
            Utils.checkNotNull(isPrivate, "isPrivate");
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = Optional.ofNullable(jobId);
            return this;
        }

        public Builder jobId(Optional<String> jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }

        public Builder raw(Raw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends Raw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder subType(String subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = Optional.ofNullable(subType);
            return this;
        }

        public Builder subType(Optional<String> subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = subType;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder to(List<AtsEmail> to) {
            Utils.checkNotNull(to, "to");
            this.to = Optional.ofNullable(to);
            return this;
        }

        public Builder to(Optional<? extends List<AtsEmail>> to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }

        public Builder type(AtsActivityType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends AtsActivityType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * id values of the recruiters associated with the activity.
         */
        public Builder userIds(List<String> userIds) {
            Utils.checkNotNull(userIds, "userIds");
            this.userIds = Optional.ofNullable(userIds);
            return this;
        }

        /**
         * id values of the recruiters associated with the activity.
         */
        public Builder userIds(Optional<? extends List<String>> userIds) {
            Utils.checkNotNull(userIds, "userIds");
            this.userIds = userIds;
            return this;
        }
        
        public AtsActivity build() {
            return new AtsActivity(
                applicationId,
                bcc,
                candidateId,
                cc,
                createdAt,
                description,
                documentId,
                from,
                id,
                interviewId,
                isPrivate,
                jobId,
                raw,
                subType,
                title,
                to,
                type,
                updatedAt,
                userIds);
        }
    }
}

