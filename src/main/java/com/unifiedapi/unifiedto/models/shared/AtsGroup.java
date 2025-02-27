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

public class AtsGroup {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AtsGroupType> type;

    @JsonCreator
    public AtsGroup(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("type") Optional<? extends AtsGroupType> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public AtsGroup() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsGroupType> type() {
        return (Optional<AtsGroupType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AtsGroup withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AtsGroup withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsGroup withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public AtsGroup withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public AtsGroup withType(AtsGroupType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AtsGroup withType(Optional<? extends AtsGroupType> type) {
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
        AtsGroup other = (AtsGroup) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsGroup.class,
                "id", id,
                "name", name,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends AtsGroupType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder type(AtsGroupType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends AtsGroupType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public AtsGroup build() {
            return new AtsGroup(
                id,
                name,
                type);
        }
    }
}

