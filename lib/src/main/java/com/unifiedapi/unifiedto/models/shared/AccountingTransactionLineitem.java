/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountingTransactionLineitem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    public String customerId;

    public AccountingTransactionLineitem withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AccountingTransactionLineitem withDescription(String description) {
        this.description = description;
        return this;
    }
    
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
    
    public AccountingTransactionLineitem(@JsonProperty("id") String id, @JsonProperty("total_amount") Double totalAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
  }
}
