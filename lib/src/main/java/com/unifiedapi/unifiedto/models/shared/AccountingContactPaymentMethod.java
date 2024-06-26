/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingContactPaymentMethod {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    public Boolean default_;

    public AccountingContactPaymentMethod withDefault(Boolean default_) {
        this.default_ = default_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AccountingContactPaymentMethod withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public AccountingContactPaymentMethod withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("type")
    public AccountingContactPaymentMethodType type;

    public AccountingContactPaymentMethod withType(AccountingContactPaymentMethodType type) {
        this.type = type;
        return this;
    }
    
    public AccountingContactPaymentMethod(@JsonProperty("type") AccountingContactPaymentMethodType type) {
        this.type = type;
  }
}
