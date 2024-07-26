/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EnrichTelephone {
    @JsonProperty("telephone")
    public String telephone;

    public EnrichTelephone withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public EnrichTelephoneType type;

    public EnrichTelephone withType(EnrichTelephoneType type) {
        this.type = type;
        return this;
    }
    
    public EnrichTelephone(@JsonProperty("telephone") String telephone) {
        this.telephone = telephone;
  }
}
