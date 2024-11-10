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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class ScimUserGroups {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$ref")
    private Optional<String> dollarRef;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display")
    private Optional<String> display;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends ScimUserGroupsType> type;

    @JsonProperty("value")
    private String value;

    @JsonCreator
    public ScimUserGroups(
            @JsonProperty("$ref") Optional<String> dollarRef,
            @JsonProperty("display") Optional<String> display,
            @JsonProperty("type") Optional<? extends ScimUserGroupsType> type,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        Utils.checkNotNull(display, "display");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.dollarRef = dollarRef;
        this.display = display;
        this.type = type;
        this.value = value;
    }
    
    public ScimUserGroups(
            String value) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), value);
    }

    @JsonIgnore
    public Optional<String> dollarRef() {
        return dollarRef;
    }

    @JsonIgnore
    public Optional<String> display() {
        return display;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScimUserGroupsType> type() {
        return (Optional<ScimUserGroupsType>) type;
    }

    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ScimUserGroups withDollarRef(String dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = Optional.ofNullable(dollarRef);
        return this;
    }

    public ScimUserGroups withDollarRef(Optional<String> dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = dollarRef;
        return this;
    }

    public ScimUserGroups withDisplay(String display) {
        Utils.checkNotNull(display, "display");
        this.display = Optional.ofNullable(display);
        return this;
    }

    public ScimUserGroups withDisplay(Optional<String> display) {
        Utils.checkNotNull(display, "display");
        this.display = display;
        return this;
    }

    public ScimUserGroups withType(ScimUserGroupsType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public ScimUserGroups withType(Optional<? extends ScimUserGroupsType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public ScimUserGroups withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        ScimUserGroups other = (ScimUserGroups) o;
        return 
            Objects.deepEquals(this.dollarRef, other.dollarRef) &&
            Objects.deepEquals(this.display, other.display) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dollarRef,
            display,
            type,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScimUserGroups.class,
                "dollarRef", dollarRef,
                "display", display,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> dollarRef = Optional.empty();
 
        private Optional<String> display = Optional.empty();
 
        private Optional<? extends ScimUserGroupsType> type = Optional.empty();
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dollarRef(String dollarRef) {
            Utils.checkNotNull(dollarRef, "dollarRef");
            this.dollarRef = Optional.ofNullable(dollarRef);
            return this;
        }

        public Builder dollarRef(Optional<String> dollarRef) {
            Utils.checkNotNull(dollarRef, "dollarRef");
            this.dollarRef = dollarRef;
            return this;
        }

        public Builder display(String display) {
            Utils.checkNotNull(display, "display");
            this.display = Optional.ofNullable(display);
            return this;
        }

        public Builder display(Optional<String> display) {
            Utils.checkNotNull(display, "display");
            this.display = display;
            return this;
        }

        public Builder type(ScimUserGroupsType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends ScimUserGroupsType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public ScimUserGroups build() {
            return new ScimUserGroups(
                dollarRef,
                display,
                type,
                value);
        }
    }
}

