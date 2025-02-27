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
import java.util.Objects;
import java.util.Optional;

public class AtsCompensation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("frequency")
    private Optional<? extends Frequency> frequency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max")
    private Optional<Double> max;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("min")
    private Optional<Double> min;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AtsCompensationType> type;

    @JsonCreator
    public AtsCompensation(
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("frequency") Optional<? extends Frequency> frequency,
            @JsonProperty("max") Optional<Double> max,
            @JsonProperty("min") Optional<Double> min,
            @JsonProperty("type") Optional<? extends AtsCompensationType> type) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(frequency, "frequency");
        Utils.checkNotNull(max, "max");
        Utils.checkNotNull(min, "min");
        Utils.checkNotNull(type, "type");
        this.currency = currency;
        this.frequency = frequency;
        this.max = max;
        this.min = min;
        this.type = type;
    }
    
    public AtsCompensation() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Frequency> frequency() {
        return (Optional<Frequency>) frequency;
    }

    @JsonIgnore
    public Optional<Double> max() {
        return max;
    }

    @JsonIgnore
    public Optional<Double> min() {
        return min;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsCompensationType> type() {
        return (Optional<AtsCompensationType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AtsCompensation withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    public AtsCompensation withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public AtsCompensation withFrequency(Frequency frequency) {
        Utils.checkNotNull(frequency, "frequency");
        this.frequency = Optional.ofNullable(frequency);
        return this;
    }

    public AtsCompensation withFrequency(Optional<? extends Frequency> frequency) {
        Utils.checkNotNull(frequency, "frequency");
        this.frequency = frequency;
        return this;
    }

    public AtsCompensation withMax(double max) {
        Utils.checkNotNull(max, "max");
        this.max = Optional.ofNullable(max);
        return this;
    }

    public AtsCompensation withMax(Optional<Double> max) {
        Utils.checkNotNull(max, "max");
        this.max = max;
        return this;
    }

    public AtsCompensation withMin(double min) {
        Utils.checkNotNull(min, "min");
        this.min = Optional.ofNullable(min);
        return this;
    }

    public AtsCompensation withMin(Optional<Double> min) {
        Utils.checkNotNull(min, "min");
        this.min = min;
        return this;
    }

    public AtsCompensation withType(AtsCompensationType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AtsCompensation withType(Optional<? extends AtsCompensationType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        AtsCompensation other = (AtsCompensation) o;
        return 
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.frequency, other.frequency) &&
            Objects.deepEquals(this.max, other.max) &&
            Objects.deepEquals(this.min, other.min) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            currency,
            frequency,
            max,
            min,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsCompensation.class,
                "currency", currency,
                "frequency", frequency,
                "max", max,
                "min", min,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<? extends Frequency> frequency = Optional.empty();
 
        private Optional<Double> max = Optional.empty();
 
        private Optional<Double> min = Optional.empty();
 
        private Optional<? extends AtsCompensationType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder frequency(Frequency frequency) {
            Utils.checkNotNull(frequency, "frequency");
            this.frequency = Optional.ofNullable(frequency);
            return this;
        }

        public Builder frequency(Optional<? extends Frequency> frequency) {
            Utils.checkNotNull(frequency, "frequency");
            this.frequency = frequency;
            return this;
        }

        public Builder max(double max) {
            Utils.checkNotNull(max, "max");
            this.max = Optional.ofNullable(max);
            return this;
        }

        public Builder max(Optional<Double> max) {
            Utils.checkNotNull(max, "max");
            this.max = max;
            return this;
        }

        public Builder min(double min) {
            Utils.checkNotNull(min, "min");
            this.min = Optional.ofNullable(min);
            return this;
        }

        public Builder min(Optional<Double> min) {
            Utils.checkNotNull(min, "min");
            this.min = min;
            return this;
        }

        public Builder type(AtsCompensationType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends AtsCompensationType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public AtsCompensation build() {
            return new AtsCompensation(
                currency,
                frequency,
                max,
                min,
                type);
        }
    }
}

