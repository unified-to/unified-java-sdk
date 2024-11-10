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
import java.util.Objects;
import java.util.Optional;


public class ScimRole {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display")
    private Optional<String> display;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary")
    private Optional<Boolean> primary;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonProperty("value")
    private String value;

    @JsonCreator
    public ScimRole(
            @JsonProperty("display") Optional<String> display,
            @JsonProperty("primary") Optional<Boolean> primary,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(display, "display");
        Utils.checkNotNull(primary, "primary");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.display = display;
        this.primary = primary;
        this.type = type;
        this.value = value;
    }
    
    public ScimRole(
            String value) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), value);
    }

    @JsonIgnore
    public Optional<String> display() {
        return display;
    }

    @JsonIgnore
    public Optional<Boolean> primary() {
        return primary;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public String value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ScimRole withDisplay(String display) {
        Utils.checkNotNull(display, "display");
        this.display = Optional.ofNullable(display);
        return this;
    }

    public ScimRole withDisplay(Optional<String> display) {
        Utils.checkNotNull(display, "display");
        this.display = display;
        return this;
    }

    public ScimRole withPrimary(boolean primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = Optional.ofNullable(primary);
        return this;
    }

    public ScimRole withPrimary(Optional<Boolean> primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = primary;
        return this;
    }

    public ScimRole withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public ScimRole withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public ScimRole withValue(String value) {
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
        ScimRole other = (ScimRole) o;
        return 
            Objects.deepEquals(this.display, other.display) &&
            Objects.deepEquals(this.primary, other.primary) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            display,
            primary,
            type,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScimRole.class,
                "display", display,
                "primary", primary,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> display = Optional.empty();
 
        private Optional<Boolean> primary = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder primary(boolean primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = Optional.ofNullable(primary);
            return this;
        }

        public Builder primary(Optional<Boolean> primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = primary;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public ScimRole build() {
            return new ScimRole(
                display,
                primary,
                type,
                value);
        }
    }
}

