/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.unifiedapi.unifiedto.utils.DateTimeDeserializer;
import com.unifiedapi.unifiedto.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class AccountingInvoice {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance_amount")
    public Double balanceAmount;

    public AccountingInvoice withBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("cancelled_at")
    public OffsetDateTime cancelledAt;

    public AccountingInvoice withCancelledAt(OffsetDateTime cancelledAt) {
        this.cancelledAt = cancelledAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    public String contactId;

    public AccountingInvoice withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public AccountingInvoice withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public AccountingInvoice withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount_amount")
    public Double discountAmount;

    public AccountingInvoice withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("due_at")
    public OffsetDateTime dueAt;

    public AccountingInvoice withDueAt(OffsetDateTime dueAt) {
        this.dueAt = dueAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AccountingInvoice withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invoice_number")
    public String invoiceNumber;

    public AccountingInvoice withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineitems")
    public AccountingLineitem[] lineitems;

    public AccountingInvoice withLineitems(AccountingLineitem[] lineitems) {
        this.lineitems = lineitems;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notes")
    public String notes;

    public AccountingInvoice withNotes(String notes) {
        this.notes = notes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paid_amount")
    public Double paidAmount;

    public AccountingInvoice withPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("paid_at")
    public OffsetDateTime paidAt;

    public AccountingInvoice withPaidAt(OffsetDateTime paidAt) {
        this.paidAt = paidAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public AccountingInvoice withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refund_amount")
    public Double refundAmount;

    public AccountingInvoice withRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refund_reason")
    public String refundReason;

    public AccountingInvoice withRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("refunded_at")
    public OffsetDateTime refundedAt;

    public AccountingInvoice withRefundedAt(OffsetDateTime refundedAt) {
        this.refundedAt = refundedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public AccountingInvoiceStatus status;

    public AccountingInvoice withStatus(AccountingInvoiceStatus status) {
        this.status = status;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    public Double taxAmount;

    public AccountingInvoice withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    public Double totalAmount;

    public AccountingInvoice withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public AccountingInvoice withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public AccountingInvoice(){}
}
