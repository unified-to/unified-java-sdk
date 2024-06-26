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


public class HrisPayslip {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public HrisPayslip withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public HrisPayslip withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public HrisPayslipDetail[] details;

    public HrisPayslip withDetails(HrisPayslipDetail[] details) {
        this.details = details;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_at")
    public OffsetDateTime endAt;

    public HrisPayslip withEndAt(OffsetDateTime endAt) {
        this.endAt = endAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gross_amount")
    public Double grossAmount;

    public HrisPayslip withGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public HrisPayslip withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("net_amount")
    public Double netAmount;

    public HrisPayslip withNetAmount(Double netAmount) {
        this.netAmount = netAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("paid_at")
    public OffsetDateTime paidAt;

    public HrisPayslip withPaidAt(OffsetDateTime paidAt) {
        this.paidAt = paidAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_type")
    public PaymentType paymentType;

    public HrisPayslip withPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public HrisPayslip withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_at")
    public OffsetDateTime startAt;

    public HrisPayslip withStartAt(OffsetDateTime startAt) {
        this.startAt = startAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public HrisPayslip withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("user_id")
    public String userId;

    public HrisPayslip withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public HrisPayslip(@JsonProperty("raw") java.util.Map<String, java.lang.Object> raw, @JsonProperty("user_id") String userId) {
        this.raw = raw;
        this.userId = userId;
  }
}
