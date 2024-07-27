/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingTransactionLineItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    public String accountId;

    public AccountingTransactionLineItem withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AccountingTransactionLineItem withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AccountingTransactionLineItem withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public AccountingTransactionLineItem withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_type")
    public String objectType;

    public AccountingTransactionLineItem withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    public Double totalAmount;

    public AccountingTransactionLineItem withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_amount")
    public Double unitAmount;

    public AccountingTransactionLineItem withUnitAmount(Double unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_quantity")
    public Double unitQuantity;

    public AccountingTransactionLineItem withUnitQuantity(Double unitQuantity) {
        this.unitQuantity = unitQuantity;
        return this;
    }
    
    public AccountingTransactionLineItem(){}
}
