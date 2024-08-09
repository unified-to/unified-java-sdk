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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class GenaiModel {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_temperature")
    private Optional<Boolean> hasTemperature;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_tokens")
    private Optional<Double> maxTokens;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    private Optional<String> webUrl;

    @JsonCreator
    public GenaiModel(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("has_temperature") Optional<Boolean> hasTemperature,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("max_tokens") Optional<Double> maxTokens,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("web_url") Optional<String> webUrl) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(hasTemperature, "hasTemperature");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(maxTokens, "maxTokens");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(webUrl, "webUrl");
        this.description = description;
        this.hasTemperature = hasTemperature;
        this.id = id;
        this.maxTokens = maxTokens;
        this.name = name;
        this.raw = raw;
        this.webUrl = webUrl;
    }
    
    public GenaiModel() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<Boolean> hasTemperature() {
        return hasTemperature;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Double> maxTokens() {
        return maxTokens;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> webUrl() {
        return webUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GenaiModel withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public GenaiModel withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public GenaiModel withHasTemperature(boolean hasTemperature) {
        Utils.checkNotNull(hasTemperature, "hasTemperature");
        this.hasTemperature = Optional.ofNullable(hasTemperature);
        return this;
    }

    public GenaiModel withHasTemperature(Optional<Boolean> hasTemperature) {
        Utils.checkNotNull(hasTemperature, "hasTemperature");
        this.hasTemperature = hasTemperature;
        return this;
    }

    public GenaiModel withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GenaiModel withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GenaiModel withMaxTokens(double maxTokens) {
        Utils.checkNotNull(maxTokens, "maxTokens");
        this.maxTokens = Optional.ofNullable(maxTokens);
        return this;
    }

    public GenaiModel withMaxTokens(Optional<Double> maxTokens) {
        Utils.checkNotNull(maxTokens, "maxTokens");
        this.maxTokens = maxTokens;
        return this;
    }

    public GenaiModel withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public GenaiModel withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GenaiModel withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public GenaiModel withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public GenaiModel withWebUrl(String webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = Optional.ofNullable(webUrl);
        return this;
    }

    public GenaiModel withWebUrl(Optional<String> webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = webUrl;
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
        GenaiModel other = (GenaiModel) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.hasTemperature, other.hasTemperature) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.maxTokens, other.maxTokens) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.webUrl, other.webUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            hasTemperature,
            id,
            maxTokens,
            name,
            raw,
            webUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenaiModel.class,
                "description", description,
                "hasTemperature", hasTemperature,
                "id", id,
                "maxTokens", maxTokens,
                "name", name,
                "raw", raw,
                "webUrl", webUrl);
    }
    
    public final static class Builder {
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Boolean> hasTemperature = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Double> maxTokens = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<String> webUrl = Optional.empty();  
        
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

        public Builder hasTemperature(boolean hasTemperature) {
            Utils.checkNotNull(hasTemperature, "hasTemperature");
            this.hasTemperature = Optional.ofNullable(hasTemperature);
            return this;
        }

        public Builder hasTemperature(Optional<Boolean> hasTemperature) {
            Utils.checkNotNull(hasTemperature, "hasTemperature");
            this.hasTemperature = hasTemperature;
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

        public Builder maxTokens(double maxTokens) {
            Utils.checkNotNull(maxTokens, "maxTokens");
            this.maxTokens = Optional.ofNullable(maxTokens);
            return this;
        }

        public Builder maxTokens(Optional<Double> maxTokens) {
            Utils.checkNotNull(maxTokens, "maxTokens");
            this.maxTokens = maxTokens;
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

        public Builder webUrl(String webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = Optional.ofNullable(webUrl);
            return this;
        }

        public Builder webUrl(Optional<String> webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = webUrl;
            return this;
        }
        
        public GenaiModel build() {
            return new GenaiModel(
                description,
                hasTemperature,
                id,
                maxTokens,
                name,
                raw,
                webUrl);
        }
    }
}

