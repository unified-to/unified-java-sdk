/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PropertyUcCallTelephone - The telephone number called
 */

public class PropertyUcCallTelephone {
    @JsonProperty("telephone")
    public String telephone;

    public PropertyUcCallTelephone withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PropertyUcCallTelephoneType type;

    public PropertyUcCallTelephone withType(PropertyUcCallTelephoneType type) {
        this.type = type;
        return this;
    }
    
    public PropertyUcCallTelephone(@JsonProperty("telephone") String telephone) {
        this.telephone = telephone;
  }
}