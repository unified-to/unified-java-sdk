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
import java.util.Objects;
import java.util.Optional;


public class ScimPhoto {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display")
    private Optional<String> display;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary")
    private Optional<Boolean> primary;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends ScimPhotoType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<String> value;

    @JsonCreator
    public ScimPhoto(
            @JsonProperty("display") Optional<String> display,
            @JsonProperty("primary") Optional<Boolean> primary,
            @JsonProperty("type") Optional<? extends ScimPhotoType> type,
            @JsonProperty("value") Optional<String> value) {
        Utils.checkNotNull(display, "display");
        Utils.checkNotNull(primary, "primary");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.display = display;
        this.primary = primary;
        this.type = type;
        this.value = value;
    }
    
    public ScimPhoto() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> display() {
        return display;
    }

    @JsonIgnore
    public Optional<Boolean> primary() {
        return primary;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScimPhotoType> type() {
        return (Optional<ScimPhotoType>) type;
    }

    @JsonIgnore
    public Optional<String> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ScimPhoto withDisplay(String display) {
        Utils.checkNotNull(display, "display");
        this.display = Optional.ofNullable(display);
        return this;
    }

    public ScimPhoto withDisplay(Optional<String> display) {
        Utils.checkNotNull(display, "display");
        this.display = display;
        return this;
    }

    public ScimPhoto withPrimary(boolean primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = Optional.ofNullable(primary);
        return this;
    }

    public ScimPhoto withPrimary(Optional<Boolean> primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = primary;
        return this;
    }

    public ScimPhoto withType(ScimPhotoType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public ScimPhoto withType(Optional<? extends ScimPhotoType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public ScimPhoto withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public ScimPhoto withValue(Optional<String> value) {
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
        ScimPhoto other = (ScimPhoto) o;
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
        return Utils.toString(ScimPhoto.class,
                "display", display,
                "primary", primary,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> display = Optional.empty();
 
        private Optional<Boolean> primary = Optional.empty();
 
        private Optional<? extends ScimPhotoType> type = Optional.empty();
 
        private Optional<String> value = Optional.empty();  
        
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

        public Builder type(ScimPhotoType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends ScimPhotoType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public ScimPhoto build() {
            return new ScimPhoto(
                display,
                primary,
                type,
                value);
        }
    }
}
