/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingTransactionLineitem {
    @JsonProperty("account_id")
    public String accountId;

    public AccountingTransactionLineitem withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    public String contactId;

    public AccountingTransactionLineitem withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AccountingTransactionLineitem withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AccountingTransactionLineitem withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invoice_id")
    public String invoiceId;

    public AccountingTransactionLineitem withInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_id")
    public String paymentId;

    public AccountingTransactionLineitem withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    public Double taxAmount;

    public AccountingTransactionLineitem withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }
    
    @JsonProperty("total_amount")
    public Double totalAmount;

    public AccountingTransactionLineitem withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    
    public AccountingTransactionLineitem(@JsonProperty("account_id") String accountId, @JsonProperty("total_amount") Double totalAmount) {
        this.accountId = accountId;
        this.totalAmount = totalAmount;
  }
}
