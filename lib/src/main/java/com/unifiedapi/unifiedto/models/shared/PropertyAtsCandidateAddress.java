/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PropertyAtsCandidateAddress {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address1")
    public String address1;

    public PropertyAtsCandidateAddress withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address2")
    public String address2;

    public PropertyAtsCandidateAddress withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;

    public PropertyAtsCandidateAddress withCity(String city) {
        this.city = city;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    public String country;

    public PropertyAtsCandidateAddress withCountry(String country) {
        this.country = country;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_code")
    public String countryCode;

    public PropertyAtsCandidateAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postal_code")
    public String postalCode;

    public PropertyAtsCandidateAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public String region;

    public PropertyAtsCandidateAddress withRegion(String region) {
        this.region = region;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region_code")
    public String regionCode;

    public PropertyAtsCandidateAddress withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    
    public PropertyAtsCandidateAddress(){}
}
