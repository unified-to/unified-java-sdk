/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingTransaction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    public String createdAt;

    public AccountingTransaction withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public AccountingTransaction withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AccountingTransaction withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public AccountingTransaction withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line_items")
    public AccountingTransactionLineitem[] lineItems;

    public AccountingTransaction withLineItems(AccountingTransactionLineitem[] lineItems) {
        this.lineItems = lineItems;
        return this;
    }
    
    /**
     * new field name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineitems")
    public AccountingTransactionLineitem[] lineitems;

    public AccountingTransaction withLineitems(AccountingTransactionLineitem[] lineitems) {
        this.lineitems = lineitems;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public AccountingTransaction withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;

    public AccountingTransaction withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    public Double taxAmount;

    public AccountingTransaction withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxrate_id")
    public String taxrateId;

    public AccountingTransaction withTaxrateId(String taxrateId) {
        this.taxrateId = taxrateId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;

    public AccountingTransaction withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public AccountingTransaction(@JsonProperty("id") String id) {
        this.id = id;
  }
}
