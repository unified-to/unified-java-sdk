/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Job Level")
    private Optional<String> jobLevel;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("People Manager (Reviews)")
    private Optional<String> peopleManagerReviews;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Remote Work - Location")
    private Optional<String> remoteWorkLocation;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Salary Information")
    private Optional<String> salaryInformation;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Sub Departments")
    private Optional<String> subDepartments;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("birthDate")
    private Optional<OffsetDateTime> birthDate;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ethnicity")
    private Optional<? extends Ethnicity> ethnicity;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gender")
    private Optional<? extends PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender> gender;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sexualOrientation")
    private Optional<? extends SexualOrientation> sexualOrientation;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("startDate")
    private Optional<OffsetDateTime> startDate;

    @JsonCreator
    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User(
            @JsonProperty("Job Level") Optional<String> jobLevel,
            @JsonProperty("People Manager (Reviews)") Optional<String> peopleManagerReviews,
            @JsonProperty("Remote Work - Location") Optional<String> remoteWorkLocation,
            @JsonProperty("Salary Information") Optional<String> salaryInformation,
            @JsonProperty("Sub Departments") Optional<String> subDepartments,
            @JsonProperty("birthDate") Optional<OffsetDateTime> birthDate,
            @JsonProperty("ethnicity") Optional<? extends Ethnicity> ethnicity,
            @JsonProperty("gender") Optional<? extends PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender> gender,
            @JsonProperty("sexualOrientation") Optional<? extends SexualOrientation> sexualOrientation,
            @JsonProperty("startDate") Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(jobLevel, "jobLevel");
        Utils.checkNotNull(peopleManagerReviews, "peopleManagerReviews");
        Utils.checkNotNull(remoteWorkLocation, "remoteWorkLocation");
        Utils.checkNotNull(salaryInformation, "salaryInformation");
        Utils.checkNotNull(subDepartments, "subDepartments");
        Utils.checkNotNull(birthDate, "birthDate");
        Utils.checkNotNull(ethnicity, "ethnicity");
        Utils.checkNotNull(gender, "gender");
        Utils.checkNotNull(sexualOrientation, "sexualOrientation");
        Utils.checkNotNull(startDate, "startDate");
        this.jobLevel = jobLevel;
        this.peopleManagerReviews = peopleManagerReviews;
        this.remoteWorkLocation = remoteWorkLocation;
        this.salaryInformation = salaryInformation;
        this.subDepartments = subDepartments;
        this.birthDate = birthDate;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.sexualOrientation = sexualOrientation;
        this.startDate = startDate;
    }
    
    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public Optional<String> jobLevel() {
        return jobLevel;
    }

    @JsonIgnore
    public Optional<String> peopleManagerReviews() {
        return peopleManagerReviews;
    }

    @JsonIgnore
    public Optional<String> remoteWorkLocation() {
        return remoteWorkLocation;
    }

    @JsonIgnore
    public Optional<String> salaryInformation() {
        return salaryInformation;
    }

    @JsonIgnore
    public Optional<String> subDepartments() {
        return subDepartments;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> birthDate() {
        return birthDate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Ethnicity> ethnicity() {
        return (Optional<Ethnicity>) ethnicity;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender> gender() {
        return (Optional<PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender>) gender;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SexualOrientation> sexualOrientation() {
        return (Optional<SexualOrientation>) sexualOrientation;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return startDate;
    }

    public static Builder builder() {
        return new Builder();
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withJobLevel(String jobLevel) {
        Utils.checkNotNull(jobLevel, "jobLevel");
        this.jobLevel = Optional.ofNullable(jobLevel);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withJobLevel(Optional<String> jobLevel) {
        Utils.checkNotNull(jobLevel, "jobLevel");
        this.jobLevel = jobLevel;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withPeopleManagerReviews(String peopleManagerReviews) {
        Utils.checkNotNull(peopleManagerReviews, "peopleManagerReviews");
        this.peopleManagerReviews = Optional.ofNullable(peopleManagerReviews);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withPeopleManagerReviews(Optional<String> peopleManagerReviews) {
        Utils.checkNotNull(peopleManagerReviews, "peopleManagerReviews");
        this.peopleManagerReviews = peopleManagerReviews;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withRemoteWorkLocation(String remoteWorkLocation) {
        Utils.checkNotNull(remoteWorkLocation, "remoteWorkLocation");
        this.remoteWorkLocation = Optional.ofNullable(remoteWorkLocation);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withRemoteWorkLocation(Optional<String> remoteWorkLocation) {
        Utils.checkNotNull(remoteWorkLocation, "remoteWorkLocation");
        this.remoteWorkLocation = remoteWorkLocation;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withSalaryInformation(String salaryInformation) {
        Utils.checkNotNull(salaryInformation, "salaryInformation");
        this.salaryInformation = Optional.ofNullable(salaryInformation);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withSalaryInformation(Optional<String> salaryInformation) {
        Utils.checkNotNull(salaryInformation, "salaryInformation");
        this.salaryInformation = salaryInformation;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withSubDepartments(String subDepartments) {
        Utils.checkNotNull(subDepartments, "subDepartments");
        this.subDepartments = Optional.ofNullable(subDepartments);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withSubDepartments(Optional<String> subDepartments) {
        Utils.checkNotNull(subDepartments, "subDepartments");
        this.subDepartments = subDepartments;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withBirthDate(OffsetDateTime birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = Optional.ofNullable(birthDate);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withBirthDate(Optional<OffsetDateTime> birthDate) {
        Utils.checkNotNull(birthDate, "birthDate");
        this.birthDate = birthDate;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withEthnicity(Ethnicity ethnicity) {
        Utils.checkNotNull(ethnicity, "ethnicity");
        this.ethnicity = Optional.ofNullable(ethnicity);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withEthnicity(Optional<? extends Ethnicity> ethnicity) {
        Utils.checkNotNull(ethnicity, "ethnicity");
        this.ethnicity = ethnicity;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withGender(PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender gender) {
        Utils.checkNotNull(gender, "gender");
        this.gender = Optional.ofNullable(gender);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withGender(Optional<? extends PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender> gender) {
        Utils.checkNotNull(gender, "gender");
        this.gender = gender;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withSexualOrientation(SexualOrientation sexualOrientation) {
        Utils.checkNotNull(sexualOrientation, "sexualOrientation");
        this.sexualOrientation = Optional.ofNullable(sexualOrientation);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withSexualOrientation(Optional<? extends SexualOrientation> sexualOrientation) {
        Utils.checkNotNull(sexualOrientation, "sexualOrientation");
        this.sexualOrientation = sexualOrientation;
        return this;
    }

    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }


    public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User withStartDate(Optional<OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User other = (PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User) o;
        return 
            Utils.enhancedDeepEquals(this.jobLevel, other.jobLevel) &&
            Utils.enhancedDeepEquals(this.peopleManagerReviews, other.peopleManagerReviews) &&
            Utils.enhancedDeepEquals(this.remoteWorkLocation, other.remoteWorkLocation) &&
            Utils.enhancedDeepEquals(this.salaryInformation, other.salaryInformation) &&
            Utils.enhancedDeepEquals(this.subDepartments, other.subDepartments) &&
            Utils.enhancedDeepEquals(this.birthDate, other.birthDate) &&
            Utils.enhancedDeepEquals(this.ethnicity, other.ethnicity) &&
            Utils.enhancedDeepEquals(this.gender, other.gender) &&
            Utils.enhancedDeepEquals(this.sexualOrientation, other.sexualOrientation) &&
            Utils.enhancedDeepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            jobLevel, peopleManagerReviews, remoteWorkLocation,
            salaryInformation, subDepartments, birthDate,
            ethnicity, gender, sexualOrientation,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User.class,
                "jobLevel", jobLevel,
                "peopleManagerReviews", peopleManagerReviews,
                "remoteWorkLocation", remoteWorkLocation,
                "salaryInformation", salaryInformation,
                "subDepartments", subDepartments,
                "birthDate", birthDate,
                "ethnicity", ethnicity,
                "gender", gender,
                "sexualOrientation", sexualOrientation,
                "startDate", startDate);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> jobLevel = Optional.empty();

        private Optional<String> peopleManagerReviews = Optional.empty();

        private Optional<String> remoteWorkLocation = Optional.empty();

        private Optional<String> salaryInformation = Optional.empty();

        private Optional<String> subDepartments = Optional.empty();

        private Optional<OffsetDateTime> birthDate = Optional.empty();

        private Optional<? extends Ethnicity> ethnicity = Optional.empty();

        private Optional<? extends PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender> gender = Optional.empty();

        private Optional<? extends SexualOrientation> sexualOrientation = Optional.empty();

        private Optional<OffsetDateTime> startDate = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder jobLevel(String jobLevel) {
            Utils.checkNotNull(jobLevel, "jobLevel");
            this.jobLevel = Optional.ofNullable(jobLevel);
            return this;
        }

        public Builder jobLevel(Optional<String> jobLevel) {
            Utils.checkNotNull(jobLevel, "jobLevel");
            this.jobLevel = jobLevel;
            return this;
        }


        public Builder peopleManagerReviews(String peopleManagerReviews) {
            Utils.checkNotNull(peopleManagerReviews, "peopleManagerReviews");
            this.peopleManagerReviews = Optional.ofNullable(peopleManagerReviews);
            return this;
        }

        public Builder peopleManagerReviews(Optional<String> peopleManagerReviews) {
            Utils.checkNotNull(peopleManagerReviews, "peopleManagerReviews");
            this.peopleManagerReviews = peopleManagerReviews;
            return this;
        }


        public Builder remoteWorkLocation(String remoteWorkLocation) {
            Utils.checkNotNull(remoteWorkLocation, "remoteWorkLocation");
            this.remoteWorkLocation = Optional.ofNullable(remoteWorkLocation);
            return this;
        }

        public Builder remoteWorkLocation(Optional<String> remoteWorkLocation) {
            Utils.checkNotNull(remoteWorkLocation, "remoteWorkLocation");
            this.remoteWorkLocation = remoteWorkLocation;
            return this;
        }


        public Builder salaryInformation(String salaryInformation) {
            Utils.checkNotNull(salaryInformation, "salaryInformation");
            this.salaryInformation = Optional.ofNullable(salaryInformation);
            return this;
        }

        public Builder salaryInformation(Optional<String> salaryInformation) {
            Utils.checkNotNull(salaryInformation, "salaryInformation");
            this.salaryInformation = salaryInformation;
            return this;
        }


        public Builder subDepartments(String subDepartments) {
            Utils.checkNotNull(subDepartments, "subDepartments");
            this.subDepartments = Optional.ofNullable(subDepartments);
            return this;
        }

        public Builder subDepartments(Optional<String> subDepartments) {
            Utils.checkNotNull(subDepartments, "subDepartments");
            this.subDepartments = subDepartments;
            return this;
        }


        public Builder birthDate(OffsetDateTime birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = Optional.ofNullable(birthDate);
            return this;
        }

        public Builder birthDate(Optional<OffsetDateTime> birthDate) {
            Utils.checkNotNull(birthDate, "birthDate");
            this.birthDate = birthDate;
            return this;
        }


        public Builder ethnicity(Ethnicity ethnicity) {
            Utils.checkNotNull(ethnicity, "ethnicity");
            this.ethnicity = Optional.ofNullable(ethnicity);
            return this;
        }

        public Builder ethnicity(Optional<? extends Ethnicity> ethnicity) {
            Utils.checkNotNull(ethnicity, "ethnicity");
            this.ethnicity = ethnicity;
            return this;
        }


        public Builder gender(PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender gender) {
            Utils.checkNotNull(gender, "gender");
            this.gender = Optional.ofNullable(gender);
            return this;
        }

        public Builder gender(Optional<? extends PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender> gender) {
            Utils.checkNotNull(gender, "gender");
            this.gender = gender;
            return this;
        }


        public Builder sexualOrientation(SexualOrientation sexualOrientation) {
            Utils.checkNotNull(sexualOrientation, "sexualOrientation");
            this.sexualOrientation = Optional.ofNullable(sexualOrientation);
            return this;
        }

        public Builder sexualOrientation(Optional<? extends SexualOrientation> sexualOrientation) {
            Utils.checkNotNull(sexualOrientation, "sexualOrientation");
            this.sexualOrientation = sexualOrientation;
            return this;
        }


        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        public Builder startDate(Optional<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        public PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User build() {

            return new PropertyScimUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10User(
                jobLevel, peopleManagerReviews, remoteWorkLocation,
                salaryInformation, subDepartments, birthDate,
                ethnicity, gender, sexualOrientation,
                startDate);
        }

    }
}
