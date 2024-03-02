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


public class PaymentLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    public Double amount;

    public PaymentLink withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    public String contactId;

    public PaymentLink withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public PaymentLink withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public PaymentLink withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public PaymentLink withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("is_active")
    public Boolean isActive;

    public PaymentLink withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    
    @JsonProperty("lineitems")
    public PaymenntLinkLineitem[] lineitems;

    public PaymentLink withLineitems(PaymenntLinkLineitem[] lineitems) {
        this.lineitems = lineitems;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_id")
    public String paymentId;

    public PaymentLink withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public PaymentLink withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public PaymentLink withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("url")
    public String url;

    public PaymentLink withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public PaymentLink(@JsonProperty("is_active") Boolean isActive, @JsonProperty("lineitems") PaymenntLinkLineitem[] lineitems, @JsonProperty("url") String url) {
        this.isActive = isActive;
        this.lineitems = lineitems;
        this.url = url;
  }
}