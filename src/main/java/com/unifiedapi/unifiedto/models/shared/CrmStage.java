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
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class CrmStage {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deal_probability")
    private Optional<Double> dealProbability;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_order")
    private Optional<Double> displayOrder;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public CrmStage(
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("deal_probability") Optional<Double> dealProbability,
            @JsonProperty("display_order") Optional<Double> displayOrder,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(dealProbability, "dealProbability");
        Utils.checkNotNull(displayOrder, "displayOrder");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.active = active;
        this.createdAt = createdAt;
        this.dealProbability = dealProbability;
        this.displayOrder = displayOrder;
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
    }
    
    public CrmStage() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<Double> dealProbability() {
        return dealProbability;
    }

    @JsonIgnore
    public Optional<Double> displayOrder() {
        return displayOrder;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CrmStage withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    public CrmStage withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    public CrmStage withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public CrmStage withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public CrmStage withDealProbability(double dealProbability) {
        Utils.checkNotNull(dealProbability, "dealProbability");
        this.dealProbability = Optional.ofNullable(dealProbability);
        return this;
    }

    public CrmStage withDealProbability(Optional<Double> dealProbability) {
        Utils.checkNotNull(dealProbability, "dealProbability");
        this.dealProbability = dealProbability;
        return this;
    }

    public CrmStage withDisplayOrder(double displayOrder) {
        Utils.checkNotNull(displayOrder, "displayOrder");
        this.displayOrder = Optional.ofNullable(displayOrder);
        return this;
    }

    public CrmStage withDisplayOrder(Optional<Double> displayOrder) {
        Utils.checkNotNull(displayOrder, "displayOrder");
        this.displayOrder = displayOrder;
        return this;
    }

    public CrmStage withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public CrmStage withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CrmStage withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public CrmStage withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CrmStage withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public CrmStage withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        CrmStage other = (CrmStage) o;
        return 
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.dealProbability, other.dealProbability) &&
            Objects.deepEquals(this.displayOrder, other.displayOrder) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            active,
            createdAt,
            dealProbability,
            displayOrder,
            id,
            name,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmStage.class,
                "active", active,
                "createdAt", createdAt,
                "dealProbability", dealProbability,
                "displayOrder", displayOrder,
                "id", id,
                "name", name,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> active = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<Double> dealProbability = Optional.empty();
 
        private Optional<Double> displayOrder = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
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

        public Builder dealProbability(double dealProbability) {
            Utils.checkNotNull(dealProbability, "dealProbability");
            this.dealProbability = Optional.ofNullable(dealProbability);
            return this;
        }

        public Builder dealProbability(Optional<Double> dealProbability) {
            Utils.checkNotNull(dealProbability, "dealProbability");
            this.dealProbability = dealProbability;
            return this;
        }

        public Builder displayOrder(double displayOrder) {
            Utils.checkNotNull(displayOrder, "displayOrder");
            this.displayOrder = Optional.ofNullable(displayOrder);
            return this;
        }

        public Builder displayOrder(Optional<Double> displayOrder) {
            Utils.checkNotNull(displayOrder, "displayOrder");
            this.displayOrder = displayOrder;
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
        
        public CrmStage build() {
            return new CrmStage(
                active,
                createdAt,
                dealProbability,
                displayOrder,
                id,
                name,
                updatedAt);
        }
    }
}
