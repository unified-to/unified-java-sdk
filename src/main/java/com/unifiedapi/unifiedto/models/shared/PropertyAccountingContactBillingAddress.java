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
import java.util.Objects;
import java.util.Optional;


public class PropertyAccountingContactBillingAddress {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address1")
    private Optional<String> address1;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address2")
    private Optional<String> address2;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_code")
    private Optional<String> countryCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postal_code")
    private Optional<String> postalCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<String> region;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region_code")
    private Optional<String> regionCode;

    @JsonCreator
    public PropertyAccountingContactBillingAddress(
            @JsonProperty("address1") Optional<String> address1,
            @JsonProperty("address2") Optional<String> address2,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("country_code") Optional<String> countryCode,
            @JsonProperty("postal_code") Optional<String> postalCode,
            @JsonProperty("region") Optional<String> region,
            @JsonProperty("region_code") Optional<String> regionCode) {
        Utils.checkNotNull(address1, "address1");
        Utils.checkNotNull(address2, "address2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(countryCode, "countryCode");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(regionCode, "regionCode");
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
        this.region = region;
        this.regionCode = regionCode;
    }
    
    public PropertyAccountingContactBillingAddress() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> address1() {
        return address1;
    }

    @JsonIgnore
    public Optional<String> address2() {
        return address2;
    }

    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    @JsonIgnore
    public Optional<String> countryCode() {
        return countryCode;
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
    public Optional<String> regionCode() {
        return regionCode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PropertyAccountingContactBillingAddress withAddress1(String address1) {
        Utils.checkNotNull(address1, "address1");
        this.address1 = Optional.ofNullable(address1);
        return this;
    }

    public PropertyAccountingContactBillingAddress withAddress1(Optional<String> address1) {
        Utils.checkNotNull(address1, "address1");
        this.address1 = address1;
        return this;
    }

    public PropertyAccountingContactBillingAddress withAddress2(String address2) {
        Utils.checkNotNull(address2, "address2");
        this.address2 = Optional.ofNullable(address2);
        return this;
    }

    public PropertyAccountingContactBillingAddress withAddress2(Optional<String> address2) {
        Utils.checkNotNull(address2, "address2");
        this.address2 = address2;
        return this;
    }

    public PropertyAccountingContactBillingAddress withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public PropertyAccountingContactBillingAddress withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public PropertyAccountingContactBillingAddress withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public PropertyAccountingContactBillingAddress withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    public PropertyAccountingContactBillingAddress withCountryCode(String countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = Optional.ofNullable(countryCode);
        return this;
    }

    public PropertyAccountingContactBillingAddress withCountryCode(Optional<String> countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = countryCode;
        return this;
    }

    public PropertyAccountingContactBillingAddress withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    public PropertyAccountingContactBillingAddress withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    public PropertyAccountingContactBillingAddress withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    public PropertyAccountingContactBillingAddress withRegion(Optional<String> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public PropertyAccountingContactBillingAddress withRegionCode(String regionCode) {
        Utils.checkNotNull(regionCode, "regionCode");
        this.regionCode = Optional.ofNullable(regionCode);
        return this;
    }

    public PropertyAccountingContactBillingAddress withRegionCode(Optional<String> regionCode) {
        Utils.checkNotNull(regionCode, "regionCode");
        this.regionCode = regionCode;
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
        PropertyAccountingContactBillingAddress other = (PropertyAccountingContactBillingAddress) o;
        return 
            Objects.deepEquals(this.address1, other.address1) &&
            Objects.deepEquals(this.address2, other.address2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.countryCode, other.countryCode) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.regionCode, other.regionCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address1,
            address2,
            city,
            country,
            countryCode,
            postalCode,
            region,
            regionCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PropertyAccountingContactBillingAddress.class,
                "address1", address1,
                "address2", address2,
                "city", city,
                "country", country,
                "countryCode", countryCode,
                "postalCode", postalCode,
                "region", region,
                "regionCode", regionCode);
    }
    
    public final static class Builder {
 
        private Optional<String> address1 = Optional.empty();
 
        private Optional<String> address2 = Optional.empty();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> country = Optional.empty();
 
        private Optional<String> countryCode = Optional.empty();
 
        private Optional<String> postalCode = Optional.empty();
 
        private Optional<String> region = Optional.empty();
 
        private Optional<String> regionCode = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address1(String address1) {
            Utils.checkNotNull(address1, "address1");
            this.address1 = Optional.ofNullable(address1);
            return this;
        }

        public Builder address1(Optional<String> address1) {
            Utils.checkNotNull(address1, "address1");
            this.address1 = address1;
            return this;
        }

        public Builder address2(String address2) {
            Utils.checkNotNull(address2, "address2");
            this.address2 = Optional.ofNullable(address2);
            return this;
        }

        public Builder address2(Optional<String> address2) {
            Utils.checkNotNull(address2, "address2");
            this.address2 = address2;
            return this;
        }

        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
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

        public Builder countryCode(String countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = Optional.ofNullable(countryCode);
            return this;
        }

        public Builder countryCode(Optional<String> countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = countryCode;
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

        public Builder regionCode(String regionCode) {
            Utils.checkNotNull(regionCode, "regionCode");
            this.regionCode = Optional.ofNullable(regionCode);
            return this;
        }

        public Builder regionCode(Optional<String> regionCode) {
            Utils.checkNotNull(regionCode, "regionCode");
            this.regionCode = regionCode;
            return this;
        }
        
        public PropertyAccountingContactBillingAddress build() {
            return new PropertyAccountingContactBillingAddress(
                address1,
                address2,
                city,
                country,
                countryCode,
                postalCode,
                region,
                regionCode);
        }
    }
}
