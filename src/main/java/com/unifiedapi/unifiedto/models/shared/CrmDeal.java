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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * CrmDeal - A deal represents an opportunity with companies and/or contacts
 */

public class CrmDeal {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<Double> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("closed_at")
    private Optional<OffsetDateTime> closedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_ids")
    private Optional<? extends List<String>> companyIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_ids")
    private Optional<? extends List<String>> contactIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lost_reason")
    private Optional<String> lostReason;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pipeline")
    private Optional<String> pipeline;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pipeline_id")
    private Optional<String> pipelineId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("probability")
    private Optional<Double> probability;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends CrmDealRaw> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<String> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stage")
    private Optional<String> stage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stage_id")
    private Optional<String> stageId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<String>> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("won_reason")
    private Optional<String> wonReason;

    @JsonCreator
    public CrmDeal(
            @JsonProperty("amount") Optional<Double> amount,
            @JsonProperty("closed_at") Optional<OffsetDateTime> closedAt,
            @JsonProperty("company_ids") Optional<? extends List<String>> companyIds,
            @JsonProperty("contact_ids") Optional<? extends List<String>> contactIds,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("lost_reason") Optional<String> lostReason,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("pipeline") Optional<String> pipeline,
            @JsonProperty("pipeline_id") Optional<String> pipelineId,
            @JsonProperty("probability") Optional<Double> probability,
            @JsonProperty("raw") Optional<? extends CrmDealRaw> raw,
            @JsonProperty("source") Optional<String> source,
            @JsonProperty("stage") Optional<String> stage,
            @JsonProperty("stage_id") Optional<String> stageId,
            @JsonProperty("tags") Optional<? extends List<String>> tags,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") Optional<String> userId,
            @JsonProperty("won_reason") Optional<String> wonReason) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(closedAt, "closedAt");
        Utils.checkNotNull(companyIds, "companyIds");
        Utils.checkNotNull(contactIds, "contactIds");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lostReason, "lostReason");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pipeline, "pipeline");
        Utils.checkNotNull(pipelineId, "pipelineId");
        Utils.checkNotNull(probability, "probability");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(stage, "stage");
        Utils.checkNotNull(stageId, "stageId");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(wonReason, "wonReason");
        this.amount = amount;
        this.closedAt = closedAt;
        this.companyIds = companyIds;
        this.contactIds = contactIds;
        this.createdAt = createdAt;
        this.currency = currency;
        this.id = id;
        this.lostReason = lostReason;
        this.name = name;
        this.pipeline = pipeline;
        this.pipelineId = pipelineId;
        this.probability = probability;
        this.raw = raw;
        this.source = source;
        this.stage = stage;
        this.stageId = stageId;
        this.tags = tags;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.wonReason = wonReason;
    }
    
    public CrmDeal() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Double> amount() {
        return amount;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> closedAt() {
        return closedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> companyIds() {
        return (Optional<List<String>>) companyIds;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> contactIds() {
        return (Optional<List<String>>) contactIds;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> lostReason() {
        return lostReason;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> pipeline() {
        return pipeline;
    }

    @JsonIgnore
    public Optional<String> pipelineId() {
        return pipelineId;
    }

    @JsonIgnore
    public Optional<Double> probability() {
        return probability;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CrmDealRaw> raw() {
        return (Optional<CrmDealRaw>) raw;
    }

    @JsonIgnore
    public Optional<String> source() {
        return source;
    }

    @JsonIgnore
    public Optional<String> stage() {
        return stage;
    }

    @JsonIgnore
    public Optional<String> stageId() {
        return stageId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> tags() {
        return (Optional<List<String>>) tags;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    @JsonIgnore
    public Optional<String> wonReason() {
        return wonReason;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CrmDeal withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public CrmDeal withAmount(Optional<Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public CrmDeal withClosedAt(OffsetDateTime closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = Optional.ofNullable(closedAt);
        return this;
    }

    public CrmDeal withClosedAt(Optional<OffsetDateTime> closedAt) {
        Utils.checkNotNull(closedAt, "closedAt");
        this.closedAt = closedAt;
        return this;
    }

    public CrmDeal withCompanyIds(List<String> companyIds) {
        Utils.checkNotNull(companyIds, "companyIds");
        this.companyIds = Optional.ofNullable(companyIds);
        return this;
    }

    public CrmDeal withCompanyIds(Optional<? extends List<String>> companyIds) {
        Utils.checkNotNull(companyIds, "companyIds");
        this.companyIds = companyIds;
        return this;
    }

    public CrmDeal withContactIds(List<String> contactIds) {
        Utils.checkNotNull(contactIds, "contactIds");
        this.contactIds = Optional.ofNullable(contactIds);
        return this;
    }

    public CrmDeal withContactIds(Optional<? extends List<String>> contactIds) {
        Utils.checkNotNull(contactIds, "contactIds");
        this.contactIds = contactIds;
        return this;
    }

    public CrmDeal withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public CrmDeal withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public CrmDeal withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    public CrmDeal withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public CrmDeal withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public CrmDeal withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CrmDeal withLostReason(String lostReason) {
        Utils.checkNotNull(lostReason, "lostReason");
        this.lostReason = Optional.ofNullable(lostReason);
        return this;
    }

    public CrmDeal withLostReason(Optional<String> lostReason) {
        Utils.checkNotNull(lostReason, "lostReason");
        this.lostReason = lostReason;
        return this;
    }

    public CrmDeal withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public CrmDeal withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CrmDeal withPipeline(String pipeline) {
        Utils.checkNotNull(pipeline, "pipeline");
        this.pipeline = Optional.ofNullable(pipeline);
        return this;
    }

    public CrmDeal withPipeline(Optional<String> pipeline) {
        Utils.checkNotNull(pipeline, "pipeline");
        this.pipeline = pipeline;
        return this;
    }

    public CrmDeal withPipelineId(String pipelineId) {
        Utils.checkNotNull(pipelineId, "pipelineId");
        this.pipelineId = Optional.ofNullable(pipelineId);
        return this;
    }

    public CrmDeal withPipelineId(Optional<String> pipelineId) {
        Utils.checkNotNull(pipelineId, "pipelineId");
        this.pipelineId = pipelineId;
        return this;
    }

    public CrmDeal withProbability(double probability) {
        Utils.checkNotNull(probability, "probability");
        this.probability = Optional.ofNullable(probability);
        return this;
    }

    public CrmDeal withProbability(Optional<Double> probability) {
        Utils.checkNotNull(probability, "probability");
        this.probability = probability;
        return this;
    }

    public CrmDeal withRaw(CrmDealRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public CrmDeal withRaw(Optional<? extends CrmDealRaw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public CrmDeal withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    public CrmDeal withSource(Optional<String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public CrmDeal withStage(String stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = Optional.ofNullable(stage);
        return this;
    }

    public CrmDeal withStage(Optional<String> stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = stage;
        return this;
    }

    public CrmDeal withStageId(String stageId) {
        Utils.checkNotNull(stageId, "stageId");
        this.stageId = Optional.ofNullable(stageId);
        return this;
    }

    public CrmDeal withStageId(Optional<String> stageId) {
        Utils.checkNotNull(stageId, "stageId");
        this.stageId = stageId;
        return this;
    }

    public CrmDeal withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public CrmDeal withTags(Optional<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public CrmDeal withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public CrmDeal withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public CrmDeal withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public CrmDeal withUserId(Optional<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public CrmDeal withWonReason(String wonReason) {
        Utils.checkNotNull(wonReason, "wonReason");
        this.wonReason = Optional.ofNullable(wonReason);
        return this;
    }

    public CrmDeal withWonReason(Optional<String> wonReason) {
        Utils.checkNotNull(wonReason, "wonReason");
        this.wonReason = wonReason;
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
        CrmDeal other = (CrmDeal) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.closedAt, other.closedAt) &&
            Objects.deepEquals(this.companyIds, other.companyIds) &&
            Objects.deepEquals(this.contactIds, other.contactIds) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.lostReason, other.lostReason) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.pipeline, other.pipeline) &&
            Objects.deepEquals(this.pipelineId, other.pipelineId) &&
            Objects.deepEquals(this.probability, other.probability) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.stage, other.stage) &&
            Objects.deepEquals(this.stageId, other.stageId) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.wonReason, other.wonReason);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            closedAt,
            companyIds,
            contactIds,
            createdAt,
            currency,
            id,
            lostReason,
            name,
            pipeline,
            pipelineId,
            probability,
            raw,
            source,
            stage,
            stageId,
            tags,
            updatedAt,
            userId,
            wonReason);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmDeal.class,
                "amount", amount,
                "closedAt", closedAt,
                "companyIds", companyIds,
                "contactIds", contactIds,
                "createdAt", createdAt,
                "currency", currency,
                "id", id,
                "lostReason", lostReason,
                "name", name,
                "pipeline", pipeline,
                "pipelineId", pipelineId,
                "probability", probability,
                "raw", raw,
                "source", source,
                "stage", stage,
                "stageId", stageId,
                "tags", tags,
                "updatedAt", updatedAt,
                "userId", userId,
                "wonReason", wonReason);
    }
    
    public final static class Builder {
 
        private Optional<Double> amount = Optional.empty();
 
        private Optional<OffsetDateTime> closedAt = Optional.empty();
 
        private Optional<? extends List<String>> companyIds = Optional.empty();
 
        private Optional<? extends List<String>> contactIds = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> lostReason = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> pipeline = Optional.empty();
 
        private Optional<String> pipelineId = Optional.empty();
 
        private Optional<Double> probability = Optional.empty();
 
        private Optional<? extends CrmDealRaw> raw = Optional.empty();
 
        private Optional<String> source = Optional.empty();
 
        private Optional<String> stage = Optional.empty();
 
        private Optional<String> stageId = Optional.empty();
 
        private Optional<? extends List<String>> tags = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<String> userId = Optional.empty();
 
        private Optional<String> wonReason = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(Optional<Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
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

        public Builder companyIds(List<String> companyIds) {
            Utils.checkNotNull(companyIds, "companyIds");
            this.companyIds = Optional.ofNullable(companyIds);
            return this;
        }

        public Builder companyIds(Optional<? extends List<String>> companyIds) {
            Utils.checkNotNull(companyIds, "companyIds");
            this.companyIds = companyIds;
            return this;
        }

        public Builder contactIds(List<String> contactIds) {
            Utils.checkNotNull(contactIds, "contactIds");
            this.contactIds = Optional.ofNullable(contactIds);
            return this;
        }

        public Builder contactIds(Optional<? extends List<String>> contactIds) {
            Utils.checkNotNull(contactIds, "contactIds");
            this.contactIds = contactIds;
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

        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
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

        public Builder lostReason(String lostReason) {
            Utils.checkNotNull(lostReason, "lostReason");
            this.lostReason = Optional.ofNullable(lostReason);
            return this;
        }

        public Builder lostReason(Optional<String> lostReason) {
            Utils.checkNotNull(lostReason, "lostReason");
            this.lostReason = lostReason;
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

        public Builder pipeline(String pipeline) {
            Utils.checkNotNull(pipeline, "pipeline");
            this.pipeline = Optional.ofNullable(pipeline);
            return this;
        }

        public Builder pipeline(Optional<String> pipeline) {
            Utils.checkNotNull(pipeline, "pipeline");
            this.pipeline = pipeline;
            return this;
        }

        public Builder pipelineId(String pipelineId) {
            Utils.checkNotNull(pipelineId, "pipelineId");
            this.pipelineId = Optional.ofNullable(pipelineId);
            return this;
        }

        public Builder pipelineId(Optional<String> pipelineId) {
            Utils.checkNotNull(pipelineId, "pipelineId");
            this.pipelineId = pipelineId;
            return this;
        }

        public Builder probability(double probability) {
            Utils.checkNotNull(probability, "probability");
            this.probability = Optional.ofNullable(probability);
            return this;
        }

        public Builder probability(Optional<Double> probability) {
            Utils.checkNotNull(probability, "probability");
            this.probability = probability;
            return this;
        }

        public Builder raw(CrmDealRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends CrmDealRaw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        public Builder source(Optional<String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder stage(String stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = Optional.ofNullable(stage);
            return this;
        }

        public Builder stage(Optional<String> stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = stage;
            return this;
        }

        public Builder stageId(String stageId) {
            Utils.checkNotNull(stageId, "stageId");
            this.stageId = Optional.ofNullable(stageId);
            return this;
        }

        public Builder stageId(Optional<String> stageId) {
            Utils.checkNotNull(stageId, "stageId");
            this.stageId = stageId;
            return this;
        }

        public Builder tags(List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends List<String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
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

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder wonReason(String wonReason) {
            Utils.checkNotNull(wonReason, "wonReason");
            this.wonReason = Optional.ofNullable(wonReason);
            return this;
        }

        public Builder wonReason(Optional<String> wonReason) {
            Utils.checkNotNull(wonReason, "wonReason");
            this.wonReason = wonReason;
            return this;
        }
        
        public CrmDeal build() {
            return new CrmDeal(
                amount,
                closedAt,
                companyIds,
                contactIds,
                createdAt,
                currency,
                id,
                lostReason,
                name,
                pipeline,
                pipelineId,
                probability,
                raw,
                source,
                stage,
                stageId,
                tags,
                updatedAt,
                userId,
                wonReason);
        }
    }
}

