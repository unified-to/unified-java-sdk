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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Date of Birth")
    private Optional<OffsetDateTime> dateOfBirth;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Gender")
    private Optional<? extends PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender> gender;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Manager")
    private Optional<String> manager;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Team")
    private Optional<String> team;

    @JsonCreator
    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User(
            @JsonProperty("Date of Birth") Optional<OffsetDateTime> dateOfBirth,
            @JsonProperty("Gender") Optional<? extends PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender> gender,
            @JsonProperty("Manager") Optional<String> manager,
            @JsonProperty("Team") Optional<String> team) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        Utils.checkNotNull(gender, "gender");
        Utils.checkNotNull(manager, "manager");
        Utils.checkNotNull(team, "team");
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.manager = manager;
        this.team = team;
    }
    
    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> dateOfBirth() {
        return dateOfBirth;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender> gender() {
        return (Optional<PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender>) gender;
    }

    @JsonIgnore
    public Optional<String> manager() {
        return manager;
    }

    @JsonIgnore
    public Optional<String> team() {
        return team;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withDateOfBirth(OffsetDateTime dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = Optional.ofNullable(dateOfBirth);
        return this;
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withDateOfBirth(Optional<OffsetDateTime> dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withGender(PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender gender) {
        Utils.checkNotNull(gender, "gender");
        this.gender = Optional.ofNullable(gender);
        return this;
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withGender(Optional<? extends PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender> gender) {
        Utils.checkNotNull(gender, "gender");
        this.gender = gender;
        return this;
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withManager(String manager) {
        Utils.checkNotNull(manager, "manager");
        this.manager = Optional.ofNullable(manager);
        return this;
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withManager(Optional<String> manager) {
        Utils.checkNotNull(manager, "manager");
        this.manager = manager;
        return this;
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withTeam(String team) {
        Utils.checkNotNull(team, "team");
        this.team = Optional.ofNullable(team);
        return this;
    }

    public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User withTeam(Optional<String> team) {
        Utils.checkNotNull(team, "team");
        this.team = team;
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
        PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User other = (PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User) o;
        return 
            Objects.deepEquals(this.dateOfBirth, other.dateOfBirth) &&
            Objects.deepEquals(this.gender, other.gender) &&
            Objects.deepEquals(this.manager, other.manager) &&
            Objects.deepEquals(this.team, other.team);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dateOfBirth,
            gender,
            manager,
            team);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User.class,
                "dateOfBirth", dateOfBirth,
                "gender", gender,
                "manager", manager,
                "team", team);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> dateOfBirth = Optional.empty();
 
        private Optional<? extends PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender> gender = Optional.empty();
 
        private Optional<String> manager = Optional.empty();
 
        private Optional<String> team = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dateOfBirth(OffsetDateTime dateOfBirth) {
            Utils.checkNotNull(dateOfBirth, "dateOfBirth");
            this.dateOfBirth = Optional.ofNullable(dateOfBirth);
            return this;
        }

        public Builder dateOfBirth(Optional<OffsetDateTime> dateOfBirth) {
            Utils.checkNotNull(dateOfBirth, "dateOfBirth");
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder gender(PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender gender) {
            Utils.checkNotNull(gender, "gender");
            this.gender = Optional.ofNullable(gender);
            return this;
        }

        public Builder gender(Optional<? extends PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender> gender) {
            Utils.checkNotNull(gender, "gender");
            this.gender = gender;
            return this;
        }

        public Builder manager(String manager) {
            Utils.checkNotNull(manager, "manager");
            this.manager = Optional.ofNullable(manager);
            return this;
        }

        public Builder manager(Optional<String> manager) {
            Utils.checkNotNull(manager, "manager");
            this.manager = manager;
            return this;
        }

        public Builder team(String team) {
            Utils.checkNotNull(team, "team");
            this.team = Optional.ofNullable(team);
            return this;
        }

        public Builder team(Optional<String> team) {
            Utils.checkNotNull(team, "team");
            this.team = team;
            return this;
        }
        
        public PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User build() {
            return new PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20User(
                dateOfBirth,
                gender,
                manager,
                team);
        }
    }
}
