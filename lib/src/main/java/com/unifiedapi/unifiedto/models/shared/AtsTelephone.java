/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AtsTelephone {
    @JsonProperty("telephone")
    public String telephone;

    public AtsTelephone withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public AtsTelephoneType type;

    public AtsTelephone withType(AtsTelephoneType type) {
        this.type = type;
        return this;
    }
    
    public AtsTelephone(@JsonProperty("telephone") String telephone) {
        this.telephone = telephone;
  }
}
