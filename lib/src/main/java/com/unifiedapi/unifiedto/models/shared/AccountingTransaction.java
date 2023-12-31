/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingTransaction {
    @JsonProperty("account_id")
    public String accountId;

    public AccountingTransaction withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
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
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyAccountingTransactionRaw raw;

    public AccountingTransaction withRaw(PropertyAccountingTransactionRaw raw) {
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
    
    @JsonProperty("total_amount")
    public Double totalAmount;

    public AccountingTransaction withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    
    @JsonProperty("type")
    public AccountingTransactionType type;

    public AccountingTransaction withType(AccountingTransactionType type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;

    public AccountingTransaction withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public AccountingTransaction(@JsonProperty("account_id") String accountId, @JsonProperty("id") String id, @JsonProperty("total_amount") Double totalAmount, @JsonProperty("type") AccountingTransactionType type) {
        this.accountId = accountId;
        this.id = id;
        this.totalAmount = totalAmount;
        this.type = type;
  }
}
