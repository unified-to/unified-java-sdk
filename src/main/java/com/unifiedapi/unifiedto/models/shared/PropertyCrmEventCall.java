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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * PropertyCrmEventCall - The call object, when type = call
 */

public class PropertyCrmEventCall {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Double> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_at")
    private Optional<OffsetDateTime> startAt;

    @JsonCreator
    public PropertyCrmEventCall(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("duration") Optional<Double> duration,
            @JsonProperty("start_at") Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(startAt, "startAt");
        this.description = description;
        this.duration = duration;
        this.startAt = startAt;
    }
    
    public PropertyCrmEventCall() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<Double> duration() {
        return duration;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startAt() {
        return startAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PropertyCrmEventCall withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public PropertyCrmEventCall withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public PropertyCrmEventCall withDuration(double duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public PropertyCrmEventCall withDuration(Optional<Double> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public PropertyCrmEventCall withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = Optional.ofNullable(startAt);
        return this;
    }

    public PropertyCrmEventCall withStartAt(Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
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
        PropertyCrmEventCall other = (PropertyCrmEventCall) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.startAt, other.startAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            duration,
            startAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PropertyCrmEventCall.class,
                "description", description,
                "duration", duration,
                "startAt", startAt);
    }
    
    public final static class Builder {
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Double> duration = Optional.empty();
 
        private Optional<OffsetDateTime> startAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder duration(double duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<Double> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder startAt(OffsetDateTime startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = Optional.ofNullable(startAt);
            return this;
        }

        public Builder startAt(Optional<OffsetDateTime> startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = startAt;
            return this;
        }
        
        public PropertyCrmEventCall build() {
            return new PropertyCrmEventCall(
                description,
                duration,
                startAt);
        }
    }
}

