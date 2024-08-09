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
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class AtsJob {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private Optional<? extends List<AtsAddress>> addresses;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("closed_at")
    private Optional<OffsetDateTime> closedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_id")
    private Optional<String> companyId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compensation")
    private Optional<? extends List<AtsCompensation>> compensation;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("departments")
    private Optional<? extends List<String>> departments;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_type")
    private Optional<? extends EmploymentType> employmentType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hiring_manager_ids")
    private Optional<? extends List<String>> hiringManagerIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language_locale")
    private Optional<String> languageLocale;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number_of_openings")
    private Optional<Double> numberOfOpenings;

    /**
     * URLs for pages containing public listings for the job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_job_urls")
    private Optional<? extends List<String>> publicJobUrls;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("questions")
    private Optional<? extends List<AtsJobQuestion>> questions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recruiter_ids")
    private Optional<? extends List<String>> recruiterIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remote")
    private Optional<Boolean> remote;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends AtsJobStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public AtsJob(
            @JsonProperty("addresses") Optional<? extends List<AtsAddress>> addresses,
            @JsonProperty("closed_at") Optional<OffsetDateTime> closedAt,
            @JsonProperty("company_id") Optional<String> companyId,
            @JsonProperty("compensation") Optional<? extends List<AtsCompensation>> compensation,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("departments") Optional<? extends List<String>> departments,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("employment_type") Optional<? extends EmploymentType> employmentType,
            @JsonProperty("hiring_manager_ids") Optional<? extends List<String>> hiringManagerIds,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("language_locale") Optional<String> languageLocale,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("number_of_openings") Optional<Double> numberOfOpenings,
            @JsonProperty("public_job_urls") Optional<? extends List<String>> publicJobUrls,
            @JsonProperty("questions") Optional<? extends List<AtsJobQuestion>> questions,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("recruiter_ids") Optional<? extends List<String>> recruiterIds,
            @JsonProperty("remote") Optional<Boolean> remote,
            @JsonProperty("status") Optional<? extends AtsJobStatus> status,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(closedAt, "closedAt");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(compensation, "compensation");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(departments, "departments");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(employmentType, "employmentType");
        Utils.checkNotNull(hiringManagerIds, "hiringManagerIds");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(languageLocale, "languageLocale");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(numberOfOpenings, "numberOfOpenings");
        Utils.checkNotNull(publicJobUrls, "publicJobUrls");
        Utils.checkNotNull(questions, "questions");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(recruiterIds, "recruiterIds");
        Utils.checkNotNull(remote, "remote");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.addresses = addresses;
        this.closedAt = closedAt;
        this.companyId = companyId;
        this.compensation = compensation;
        this.createdAt = createdAt;
        this.departments = departments;
        this.description = description;
        this.employmentType = employmentType;
        this.hiringManagerIds = hiringManagerIds;
        this.id = id;
        this.languageLocale = languageLocale;
        this.name = name;
        this.numberOfOpenings = numberOfOpenings;
        this.publicJobUrls = publicJobUrls;
        this.questions = questions;
        this.raw = raw;
        this.recruiterIds = recruiterIds;
        this.remote = remote;
        this.status = status;
        this.updatedAt = updatedAt;
    }
    
    public AtsJob() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsAddress>> addresses() {
        return (Optional<List<AtsAddress>>) addresses;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> closedAt() {
        return closedAt;
    }

    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsCompensation>> compensation() {
        return (Optional<List<AtsCompensation>>) compensation;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> departments() {
        return (Optional<List<String>>) departments;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmploymentType> employmentType() {
        return (Optional<EmploymentType>) employmentType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> hiringManagerIds() {
        return (Optional<List<String>>) hiringManagerIds;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> languageLocale() {
        return languageLocale;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<Double> numberOfOpenings() {
        return numberOfOpenings;
    }

    /**
     * URLs for pages containing public listings for the job
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> publicJobUrls() {
        return (Optional<List<String>>) publicJobUrls;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsJobQuestion>> questions() {
        return (Optional<List<AtsJobQuestion>>) questions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> recruiterIds() {
        return (Optional<List<String>>) recruiterIds;
    }

    @JsonIgnore
    public Optional<Boolean> remote() {
        return remote;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsJobStatus> status() {
        return (Optional<AtsJobStatus>) status;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AtsJob withAddresses(List<AtsAddress> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = Optional.ofNullable(addresses);
        return this;
    }

    public AtsJob withAddresses(Optional<? extends List<AtsAddress>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    public AtsJob withClosedAt(OffsetDateTime closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = Optional.ofNullable(closedAt);
        return this;
    }

    public AtsJob withClosedAt(Optional<OffsetDateTime> closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = closedAt;
        return this;
    }

    public AtsJob withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    public AtsJob withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public AtsJob withCompensation(List<AtsCompensation> compensation) {
        Utils.checkNotNull(compensation, "compensation");
        this.compensation = Optional.ofNullable(compensation);
        return this;
    }

    public AtsJob withCompensation(Optional<? extends List<AtsCompensation>> compensation) {
        Utils.checkNotNull(compensation, "compensation");
        this.compensation = compensation;
        return this;
    }

    public AtsJob withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public AtsJob withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AtsJob withDepartments(List<String> departments) {
        Utils.checkNotNull(departments, "departments");
        this.departments = Optional.ofNullable(departments);
        return this;
    }

    public AtsJob withDepartments(Optional<? extends List<String>> departments) {
        Utils.checkNotNull(departments, "departments");
        this.departments = departments;
        return this;
    }

    public AtsJob withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public AtsJob withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public AtsJob withEmploymentType(EmploymentType employmentType) {
        Utils.checkNotNull(employmentType, "employmentType");
        this.employmentType = Optional.ofNullable(employmentType);
        return this;
    }

    public AtsJob withEmploymentType(Optional<? extends EmploymentType> employmentType) {
        Utils.checkNotNull(employmentType, "employmentType");
        this.employmentType = employmentType;
        return this;
    }

    public AtsJob withHiringManagerIds(List<String> hiringManagerIds) {
        Utils.checkNotNull(hiringManagerIds, "hiringManagerIds");
        this.hiringManagerIds = Optional.ofNullable(hiringManagerIds);
        return this;
    }

    public AtsJob withHiringManagerIds(Optional<? extends List<String>> hiringManagerIds) {
        Utils.checkNotNull(hiringManagerIds, "hiringManagerIds");
        this.hiringManagerIds = hiringManagerIds;
        return this;
    }

    public AtsJob withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AtsJob withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsJob withLanguageLocale(String languageLocale) {
        Utils.checkNotNull(languageLocale, "languageLocale");
        this.languageLocale = Optional.ofNullable(languageLocale);
        return this;
    }

    public AtsJob withLanguageLocale(Optional<String> languageLocale) {
        Utils.checkNotNull(languageLocale, "languageLocale");
        this.languageLocale = languageLocale;
        return this;
    }

    public AtsJob withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public AtsJob withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public AtsJob withNumberOfOpenings(double numberOfOpenings) {
        Utils.checkNotNull(numberOfOpenings, "numberOfOpenings");
        this.numberOfOpenings = Optional.ofNullable(numberOfOpenings);
        return this;
    }

    public AtsJob withNumberOfOpenings(Optional<Double> numberOfOpenings) {
        Utils.checkNotNull(numberOfOpenings, "numberOfOpenings");
        this.numberOfOpenings = numberOfOpenings;
        return this;
    }

    /**
     * URLs for pages containing public listings for the job
     */
    public AtsJob withPublicJobUrls(List<String> publicJobUrls) {
        Utils.checkNotNull(publicJobUrls, "publicJobUrls");
        this.publicJobUrls = Optional.ofNullable(publicJobUrls);
        return this;
    }

    /**
     * URLs for pages containing public listings for the job
     */
    public AtsJob withPublicJobUrls(Optional<? extends List<String>> publicJobUrls) {
        Utils.checkNotNull(publicJobUrls, "publicJobUrls");
        this.publicJobUrls = publicJobUrls;
        return this;
    }

    public AtsJob withQuestions(List<AtsJobQuestion> questions) {
        Utils.checkNotNull(questions, "questions");
        this.questions = Optional.ofNullable(questions);
        return this;
    }

    public AtsJob withQuestions(Optional<? extends List<AtsJobQuestion>> questions) {
        Utils.checkNotNull(questions, "questions");
        this.questions = questions;
        return this;
    }

    public AtsJob withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public AtsJob withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public AtsJob withRecruiterIds(List<String> recruiterIds) {
        Utils.checkNotNull(recruiterIds, "recruiterIds");
        this.recruiterIds = Optional.ofNullable(recruiterIds);
        return this;
    }

    public AtsJob withRecruiterIds(Optional<? extends List<String>> recruiterIds) {
        Utils.checkNotNull(recruiterIds, "recruiterIds");
        this.recruiterIds = recruiterIds;
        return this;
    }

    public AtsJob withRemote(boolean remote) {
        Utils.checkNotNull(remote, "remote");
        this.remote = Optional.ofNullable(remote);
        return this;
    }

    public AtsJob withRemote(Optional<Boolean> remote) {
        Utils.checkNotNull(remote, "remote");
        this.remote = remote;
        return this;
    }

    public AtsJob withStatus(AtsJobStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public AtsJob withStatus(Optional<? extends AtsJobStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public AtsJob withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public AtsJob withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        AtsJob other = (AtsJob) o;
        return 
            Objects.deepEquals(this.addresses, other.addresses) &&
            Objects.deepEquals(this.closedAt, other.closedAt) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.compensation, other.compensation) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.departments, other.departments) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.employmentType, other.employmentType) &&
            Objects.deepEquals(this.hiringManagerIds, other.hiringManagerIds) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.languageLocale, other.languageLocale) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.numberOfOpenings, other.numberOfOpenings) &&
            Objects.deepEquals(this.publicJobUrls, other.publicJobUrls) &&
            Objects.deepEquals(this.questions, other.questions) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.recruiterIds, other.recruiterIds) &&
            Objects.deepEquals(this.remote, other.remote) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addresses,
            closedAt,
            companyId,
            compensation,
            createdAt,
            departments,
            description,
            employmentType,
            hiringManagerIds,
            id,
            languageLocale,
            name,
            numberOfOpenings,
            publicJobUrls,
            questions,
            raw,
            recruiterIds,
            remote,
            status,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsJob.class,
                "addresses", addresses,
                "closedAt", closedAt,
                "companyId", companyId,
                "compensation", compensation,
                "createdAt", createdAt,
                "departments", departments,
                "description", description,
                "employmentType", employmentType,
                "hiringManagerIds", hiringManagerIds,
                "id", id,
                "languageLocale", languageLocale,
                "name", name,
                "numberOfOpenings", numberOfOpenings,
                "publicJobUrls", publicJobUrls,
                "questions", questions,
                "raw", raw,
                "recruiterIds", recruiterIds,
                "remote", remote,
                "status", status,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<AtsAddress>> addresses = Optional.empty();
 
        private Optional<OffsetDateTime> closedAt = Optional.empty();
 
        private Optional<String> companyId = Optional.empty();
 
        private Optional<? extends List<AtsCompensation>> compensation = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends List<String>> departments = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<? extends EmploymentType> employmentType = Optional.empty();
 
        private Optional<? extends List<String>> hiringManagerIds = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> languageLocale = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Double> numberOfOpenings = Optional.empty();
 
        private Optional<? extends List<String>> publicJobUrls = Optional.empty();
 
        private Optional<? extends List<AtsJobQuestion>> questions = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<? extends List<String>> recruiterIds = Optional.empty();
 
        private Optional<Boolean> remote = Optional.empty();
 
        private Optional<? extends AtsJobStatus> status = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder addresses(List<AtsAddress> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = Optional.ofNullable(addresses);
            return this;
        }

        public Builder addresses(Optional<? extends List<AtsAddress>> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = addresses;
            return this;
        }

        public Builder closedAt(OffsetDateTime closedAt) {
            Utils.checkNotNull(closedAt, "closedAt");
            this.closedAt = Optional.ofNullable(closedAt);
            return this;
        }

        public Builder closedAt(Optional<OffsetDateTime> closedAt) {
            Utils.checkNotNull(closedAt, "closedAt");
            this.closedAt = closedAt;
            return this;
        }

        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        public Builder compensation(List<AtsCompensation> compensation) {
            Utils.checkNotNull(compensation, "compensation");
            this.compensation = Optional.ofNullable(compensation);
            return this;
        }

        public Builder compensation(Optional<? extends List<AtsCompensation>> compensation) {
            Utils.checkNotNull(compensation, "compensation");
            this.compensation = compensation;
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

        public Builder departments(List<String> departments) {
            Utils.checkNotNull(departments, "departments");
            this.departments = Optional.ofNullable(departments);
            return this;
        }

        public Builder departments(Optional<? extends List<String>> departments) {
            Utils.checkNotNull(departments, "departments");
            this.departments = departments;
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

        public Builder employmentType(EmploymentType employmentType) {
            Utils.checkNotNull(employmentType, "employmentType");
            this.employmentType = Optional.ofNullable(employmentType);
            return this;
        }

        public Builder employmentType(Optional<? extends EmploymentType> employmentType) {
            Utils.checkNotNull(employmentType, "employmentType");
            this.employmentType = employmentType;
            return this;
        }

        public Builder hiringManagerIds(List<String> hiringManagerIds) {
            Utils.checkNotNull(hiringManagerIds, "hiringManagerIds");
            this.hiringManagerIds = Optional.ofNullable(hiringManagerIds);
            return this;
        }

        public Builder hiringManagerIds(Optional<? extends List<String>> hiringManagerIds) {
            Utils.checkNotNull(hiringManagerIds, "hiringManagerIds");
            this.hiringManagerIds = hiringManagerIds;
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

        public Builder languageLocale(String languageLocale) {
            Utils.checkNotNull(languageLocale, "languageLocale");
            this.languageLocale = Optional.ofNullable(languageLocale);
            return this;
        }

        public Builder languageLocale(Optional<String> languageLocale) {
            Utils.checkNotNull(languageLocale, "languageLocale");
            this.languageLocale = languageLocale;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder numberOfOpenings(double numberOfOpenings) {
            Utils.checkNotNull(numberOfOpenings, "numberOfOpenings");
            this.numberOfOpenings = Optional.ofNullable(numberOfOpenings);
            return this;
        }

        public Builder numberOfOpenings(Optional<Double> numberOfOpenings) {
            Utils.checkNotNull(numberOfOpenings, "numberOfOpenings");
            this.numberOfOpenings = numberOfOpenings;
            return this;
        }

        /**
         * URLs for pages containing public listings for the job
         */
        public Builder publicJobUrls(List<String> publicJobUrls) {
            Utils.checkNotNull(publicJobUrls, "publicJobUrls");
            this.publicJobUrls = Optional.ofNullable(publicJobUrls);
            return this;
        }

        /**
         * URLs for pages containing public listings for the job
         */
        public Builder publicJobUrls(Optional<? extends List<String>> publicJobUrls) {
            Utils.checkNotNull(publicJobUrls, "publicJobUrls");
            this.publicJobUrls = publicJobUrls;
            return this;
        }

        public Builder questions(List<AtsJobQuestion> questions) {
            Utils.checkNotNull(questions, "questions");
            this.questions = Optional.ofNullable(questions);
            return this;
        }

        public Builder questions(Optional<? extends List<AtsJobQuestion>> questions) {
            Utils.checkNotNull(questions, "questions");
            this.questions = questions;
            return this;
        }

        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends Map<String, Object>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder recruiterIds(List<String> recruiterIds) {
            Utils.checkNotNull(recruiterIds, "recruiterIds");
            this.recruiterIds = Optional.ofNullable(recruiterIds);
            return this;
        }

        public Builder recruiterIds(Optional<? extends List<String>> recruiterIds) {
            Utils.checkNotNull(recruiterIds, "recruiterIds");
            this.recruiterIds = recruiterIds;
            return this;
        }

        public Builder remote(boolean remote) {
            Utils.checkNotNull(remote, "remote");
            this.remote = Optional.ofNullable(remote);
            return this;
        }

        public Builder remote(Optional<Boolean> remote) {
            Utils.checkNotNull(remote, "remote");
            this.remote = remote;
            return this;
        }

        public Builder status(AtsJobStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends AtsJobStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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
        
        public AtsJob build() {
            return new AtsJob(
                addresses,
                closedAt,
                companyId,
                compensation,
                createdAt,
                departments,
                description,
                employmentType,
                hiringManagerIds,
                id,
                languageLocale,
                name,
                numberOfOpenings,
                publicJobUrls,
                questions,
                raw,
                recruiterIds,
                remote,
                status,
                updatedAt);
        }
    }
}

