/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingTelephone {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephone")
    public String telephone;

    public AccountingTelephone withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public AccountingTelephoneType type;

    public AccountingTelephone withType(AccountingTelephoneType type) {
        this.type = type;
        return this;
    }
    
    public AccountingTelephone(){}
}
