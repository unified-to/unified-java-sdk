/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingEmail {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;

    public AccountingEmail withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public AccountingEmailType type;

    public AccountingEmail withType(AccountingEmailType type) {
        this.type = type;
        return this;
    }
    
    public AccountingEmail(){}
}
