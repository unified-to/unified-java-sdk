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

public class ScimAddress {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("formatted")
    private Optional<String> formatted;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("locality")
    private Optional<String> locality;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<String> postalCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<String> region;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streetAddress")
    private Optional<String> streetAddress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends ScimAddressType> type;

    @JsonCreator
    public ScimAddress(
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("formatted") Optional<String> formatted,
            @JsonProperty("locality") Optional<String> locality,
            @JsonProperty("postalCode") Optional<String> postalCode,
            @JsonProperty("region") Optional<String> region,
            @JsonProperty("streetAddress") Optional<String> streetAddress,
            @JsonProperty("type") Optional<? extends ScimAddressType> type) {
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(formatted, "formatted");
        Utils.checkNotNull(locality, "locality");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(streetAddress, "streetAddress");
        Utils.checkNotNull(type, "type");
        this.country = country;
        this.formatted = formatted;
        this.locality = locality;
        this.postalCode = postalCode;
        this.region = region;
        this.streetAddress = streetAddress;
        this.type = type;
    }
    
    public ScimAddress() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    @JsonIgnore
    public Optional<String> formatted() {
        return formatted;
    }

    @JsonIgnore
    public Optional<String> locality() {
        return locality;
    }

    @JsonIgnore
    public Optional<String> postalCode() {
        return postalCode;
    }

    @JsonIgnore
    public Optional<String> region() {
        return region;
    }

    @JsonIgnore
    public Optional<String> streetAddress() {
        return streetAddress;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScimAddressType> type() {
        return (Optional<ScimAddressType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ScimAddress withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public ScimAddress withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    public ScimAddress withFormatted(String formatted) {
        Utils.checkNotNull(formatted, "formatted");
        this.formatted = Optional.ofNullable(formatted);
        return this;
    }

    public ScimAddress withFormatted(Optional<String> formatted) {
        Utils.checkNotNull(formatted, "formatted");
        this.formatted = formatted;
        return this;
    }

    public ScimAddress withLocality(String locality) {
        Utils.checkNotNull(locality, "locality");
        this.locality = Optional.ofNullable(locality);
        return this;
    }

    public ScimAddress withLocality(Optional<String> locality) {
        Utils.checkNotNull(locality, "locality");
        this.locality = locality;
        return this;
    }

    public ScimAddress withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    public ScimAddress withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    public ScimAddress withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    public ScimAddress withRegion(Optional<String> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public ScimAddress withStreetAddress(String streetAddress) {
        Utils.checkNotNull(streetAddress, "streetAddress");
        this.streetAddress = Optional.ofNullable(streetAddress);
        return this;
    }

    public ScimAddress withStreetAddress(Optional<String> streetAddress) {
        Utils.checkNotNull(streetAddress, "streetAddress");
        this.streetAddress = streetAddress;
        return this;
    }

    public ScimAddress withType(ScimAddressType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public ScimAddress withType(Optional<? extends ScimAddressType> type) {
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
        ScimAddress other = (ScimAddress) o;
        return 
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.formatted, other.formatted) &&
            Objects.deepEquals(this.locality, other.locality) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.streetAddress, other.streetAddress) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            country,
            formatted,
            locality,
            postalCode,
            region,
            streetAddress,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScimAddress.class,
                "country", country,
                "formatted", formatted,
                "locality", locality,
                "postalCode", postalCode,
                "region", region,
                "streetAddress", streetAddress,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> country = Optional.empty();
 
        private Optional<String> formatted = Optional.empty();
 
        private Optional<String> locality = Optional.empty();
 
        private Optional<String> postalCode = Optional.empty();
 
        private Optional<String> region = Optional.empty();
 
        private Optional<String> streetAddress = Optional.empty();
 
        private Optional<? extends ScimAddressType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        public Builder formatted(String formatted) {
            Utils.checkNotNull(formatted, "formatted");
            this.formatted = Optional.ofNullable(formatted);
            return this;
        }

        public Builder formatted(Optional<String> formatted) {
            Utils.checkNotNull(formatted, "formatted");
            this.formatted = formatted;
            return this;
        }

        public Builder locality(String locality) {
            Utils.checkNotNull(locality, "locality");
            this.locality = Optional.ofNullable(locality);
            return this;
        }

        public Builder locality(Optional<String> locality) {
            Utils.checkNotNull(locality, "locality");
            this.locality = locality;
            return this;
        }

        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        public Builder postalCode(Optional<String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        public Builder region(String region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        public Builder region(Optional<String> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        public Builder streetAddress(String streetAddress) {
            Utils.checkNotNull(streetAddress, "streetAddress");
            this.streetAddress = Optional.ofNullable(streetAddress);
            return this;
        }

        public Builder streetAddress(Optional<String> streetAddress) {
            Utils.checkNotNull(streetAddress, "streetAddress");
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder type(ScimAddressType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends ScimAddressType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public ScimAddress build() {
            return new ScimAddress(
                country,
                formatted,
                locality,
                postalCode,
                region,
                streetAddress,
                type);
        }
    }
}

