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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CrmEventFormField {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends List<CrmEventFormOption>> options;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<Boolean> required;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends CrmEventFormFieldType> type;

    @JsonCreator
    public CrmEventFormField(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("options") Optional<? extends List<CrmEventFormOption>> options,
            @JsonProperty("required") Optional<Boolean> required,
            @JsonProperty("type") Optional<? extends CrmEventFormFieldType> type) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(type, "type");
        this.name = name;
        this.options = options;
        this.required = required;
        this.type = type;
    }
    
    public CrmEventFormField() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CrmEventFormOption>> options() {
        return (Optional<List<CrmEventFormOption>>) options;
    }

    @JsonIgnore
    public Optional<Boolean> required() {
        return required;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CrmEventFormFieldType> type() {
        return (Optional<CrmEventFormFieldType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CrmEventFormField withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public CrmEventFormField withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CrmEventFormField withOptions(List<CrmEventFormOption> options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    public CrmEventFormField withOptions(Optional<? extends List<CrmEventFormOption>> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    public CrmEventFormField withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    public CrmEventFormField withRequired(Optional<Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    public CrmEventFormField withType(CrmEventFormFieldType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public CrmEventFormField withType(Optional<? extends CrmEventFormFieldType> type) {
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
        CrmEventFormField other = (CrmEventFormField) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.options, other.options) &&
            Objects.deepEquals(this.required, other.required) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            options,
            required,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmEventFormField.class,
                "name", name,
                "options", options,
                "required", required,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends List<CrmEventFormOption>> options = Optional.empty();
 
        private Optional<Boolean> required = Optional.empty();
 
        private Optional<? extends CrmEventFormFieldType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder options(List<CrmEventFormOption> options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        public Builder options(Optional<? extends List<CrmEventFormOption>> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }

        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }

        public Builder required(Optional<Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        public Builder type(CrmEventFormFieldType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends CrmEventFormFieldType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public CrmEventFormField build() {
            return new CrmEventFormField(
                name,
                options,
                required,
                type);
        }
    }
}

