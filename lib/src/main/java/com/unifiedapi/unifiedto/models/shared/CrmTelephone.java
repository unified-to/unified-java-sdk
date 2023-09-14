/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CrmTelephone {
    @JsonProperty("telephone")
    public String telephone;

    public CrmTelephone withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CrmTelephoneType type;

    public CrmTelephone withType(CrmTelephoneType type) {
        this.type = type;
        return this;
    }
    
    public CrmTelephone(@JsonProperty("telephone") String telephone) {
        this.telephone = telephone;
  }
}