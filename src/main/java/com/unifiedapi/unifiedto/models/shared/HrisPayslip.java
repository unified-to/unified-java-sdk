/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class HrisPayslip {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    private Optional<? extends List<HrisPayslipDetail>> details;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_at")
    private Optional<OffsetDateTime> endAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gross_amount")
    private Optional<Double> grossAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("net_amount")
    private Optional<Double> netAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paid_at")
    private Optional<OffsetDateTime> paidAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_type")
    private Optional<? extends PaymentType> paymentType;

    @JsonProperty("raw")
    private Map<String, Object> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_at")
    private Optional<OffsetDateTime> startAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonProperty("user_id")
    private String userId;

    @JsonCreator
    public HrisPayslip(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("details") Optional<? extends List<HrisPayslipDetail>> details,
            @JsonProperty("end_at") Optional<OffsetDateTime> endAt,
            @JsonProperty("gross_amount") Optional<Double> grossAmount,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("net_amount") Optional<Double> netAmount,
            @JsonProperty("paid_at") Optional<OffsetDateTime> paidAt,
            @JsonProperty("payment_type") Optional<? extends PaymentType> paymentType,
            @JsonProperty("raw") Map<String, Object> raw,
            @JsonProperty("start_at") Optional<OffsetDateTime> startAt,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") String userId) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(details, "details");
        Utils.checkNotNull(endAt, "endAt");
        Utils.checkNotNull(grossAmount, "grossAmount");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(netAmount, "netAmount");
        Utils.checkNotNull(paidAt, "paidAt");
        Utils.checkNotNull(paymentType, "paymentType");
        raw = Utils.emptyMapIfNull(raw);
        Utils.checkNotNull(startAt, "startAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        this.createdAt = createdAt;
        this.currency = currency;
        this.details = details;
        this.endAt = endAt;
        this.grossAmount = grossAmount;
        this.id = id;
        this.netAmount = netAmount;
        this.paidAt = paidAt;
        this.paymentType = paymentType;
        this.raw = raw;
        this.startAt = startAt;
        this.updatedAt = updatedAt;
        this.userId = userId;
    }
    
    public HrisPayslip(
            Map<String, Object> raw,
            String userId) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), raw, Optional.empty(), Optional.empty(), userId);
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<HrisPayslipDetail>> details() {
        return (Optional<List<HrisPayslipDetail>>) details;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> endAt() {
        return endAt;
    }

    @JsonIgnore
    public Optional<Double> grossAmount() {
        return grossAmount;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Double> netAmount() {
        return netAmount;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> paidAt() {
        return paidAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentType> paymentType() {
        return (Optional<PaymentType>) paymentType;
    }

    @JsonIgnore
    public Map<String, Object> raw() {
        return raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startAt() {
        return startAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HrisPayslip withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public HrisPayslip withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public HrisPayslip withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    public HrisPayslip withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public HrisPayslip withDetails(List<HrisPayslipDetail> details) {
        Utils.checkNotNull(details, "details");
        this.details = Optional.ofNullable(details);
        return this;
    }

    public HrisPayslip withDetails(Optional<? extends List<HrisPayslipDetail>> details) {
        Utils.checkNotNull(details, "details");
        this.details = details;
        return this;
    }

    public HrisPayslip withEndAt(OffsetDateTime endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = Optional.ofNullable(endAt);
        return this;
    }

    public HrisPayslip withEndAt(Optional<OffsetDateTime> endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = endAt;
        return this;
    }

    public HrisPayslip withGrossAmount(double grossAmount) {
        Utils.checkNotNull(grossAmount, "grossAmount");
        this.grossAmount = Optional.ofNullable(grossAmount);
        return this;
    }

    public HrisPayslip withGrossAmount(Optional<Double> grossAmount) {
        Utils.checkNotNull(grossAmount, "grossAmount");
        this.grossAmount = grossAmount;
        return this;
    }

    public HrisPayslip withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public HrisPayslip withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisPayslip withNetAmount(double netAmount) {
        Utils.checkNotNull(netAmount, "netAmount");
        this.netAmount = Optional.ofNullable(netAmount);
        return this;
    }

    public HrisPayslip withNetAmount(Optional<Double> netAmount) {
        Utils.checkNotNull(netAmount, "netAmount");
        this.netAmount = netAmount;
        return this;
    }

    public HrisPayslip withPaidAt(OffsetDateTime paidAt) {
        Utils.checkNotNull(paidAt, "paidAt");
        this.paidAt = Optional.ofNullable(paidAt);
        return this;
    }

    public HrisPayslip withPaidAt(Optional<OffsetDateTime> paidAt) {
        Utils.checkNotNull(paidAt, "paidAt");
        this.paidAt = paidAt;
        return this;
    }

    public HrisPayslip withPaymentType(PaymentType paymentType) {
        Utils.checkNotNull(paymentType, "paymentType");
        this.paymentType = Optional.ofNullable(paymentType);
        return this;
    }

    public HrisPayslip withPaymentType(Optional<? extends PaymentType> paymentType) {
        Utils.checkNotNull(paymentType, "paymentType");
        this.paymentType = paymentType;
        return this;
    }

    public HrisPayslip withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public HrisPayslip withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = Optional.ofNullable(startAt);
        return this;
    }

    public HrisPayslip withStartAt(Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
        return this;
    }

    public HrisPayslip withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public HrisPayslip withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public HrisPayslip withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HrisPayslip other = (HrisPayslip) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.details, other.details) &&
            Objects.deepEquals(this.endAt, other.endAt) &&
            Objects.deepEquals(this.grossAmount, other.grossAmount) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.netAmount, other.netAmount) &&
            Objects.deepEquals(this.paidAt, other.paidAt) &&
            Objects.deepEquals(this.paymentType, other.paymentType) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.startAt, other.startAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            currency,
            details,
            endAt,
            grossAmount,
            id,
            netAmount,
            paidAt,
            paymentType,
            raw,
            startAt,
            updatedAt,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisPayslip.class,
                "createdAt", createdAt,
                "currency", currency,
                "details", details,
                "endAt", endAt,
                "grossAmount", grossAmount,
                "id", id,
                "netAmount", netAmount,
                "paidAt", paidAt,
                "paymentType", paymentType,
                "raw", raw,
                "startAt", startAt,
                "updatedAt", updatedAt,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<? extends List<HrisPayslipDetail>> details = Optional.empty();
 
        private Optional<OffsetDateTime> endAt = Optional.empty();
 
        private Optional<Double> grossAmount = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Double> netAmount = Optional.empty();
 
        private Optional<OffsetDateTime> paidAt = Optional.empty();
 
        private Optional<? extends PaymentType> paymentType = Optional.empty();
 
        private Map<String, Object> raw;
 
        private Optional<OffsetDateTime> startAt = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        public Builder details(List<HrisPayslipDetail> details) {
            Utils.checkNotNull(details, "details");
            this.details = Optional.ofNullable(details);
            return this;
        }

        public Builder details(Optional<? extends List<HrisPayslipDetail>> details) {
            Utils.checkNotNull(details, "details");
            this.details = details;
            return this;
        }

        public Builder endAt(OffsetDateTime endAt) {
            Utils.checkNotNull(endAt, "endAt");
            this.endAt = Optional.ofNullable(endAt);
            return this;
        }

        public Builder endAt(Optional<OffsetDateTime> endAt) {
            Utils.checkNotNull(endAt, "endAt");
            this.endAt = endAt;
            return this;
        }

        public Builder grossAmount(double grossAmount) {
            Utils.checkNotNull(grossAmount, "grossAmount");
            this.grossAmount = Optional.ofNullable(grossAmount);
            return this;
        }

        public Builder grossAmount(Optional<Double> grossAmount) {
            Utils.checkNotNull(grossAmount, "grossAmount");
            this.grossAmount = grossAmount;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder netAmount(double netAmount) {
            Utils.checkNotNull(netAmount, "netAmount");
            this.netAmount = Optional.ofNullable(netAmount);
            return this;
        }

        public Builder netAmount(Optional<Double> netAmount) {
            Utils.checkNotNull(netAmount, "netAmount");
            this.netAmount = netAmount;
            return this;
        }

        public Builder paidAt(OffsetDateTime paidAt) {
            Utils.checkNotNull(paidAt, "paidAt");
            this.paidAt = Optional.ofNullable(paidAt);
            return this;
        }

        public Builder paidAt(Optional<OffsetDateTime> paidAt) {
            Utils.checkNotNull(paidAt, "paidAt");
            this.paidAt = paidAt;
            return this;
        }

        public Builder paymentType(PaymentType paymentType) {
            Utils.checkNotNull(paymentType, "paymentType");
            this.paymentType = Optional.ofNullable(paymentType);
            return this;
        }

        public Builder paymentType(Optional<? extends PaymentType> paymentType) {
            Utils.checkNotNull(paymentType, "paymentType");
            this.paymentType = paymentType;
            return this;
        }

        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder startAt(OffsetDateTime startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = Optional.ofNullable(startAt);
            return this;
        }

        public Builder startAt(Optional<OffsetDateTime> startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = startAt;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public HrisPayslip build() {
            return new HrisPayslip(
                createdAt,
                currency,
                details,
                endAt,
                grossAmount,
                id,
                netAmount,
                paidAt,
                paymentType,
                raw,
                startAt,
                updatedAt,
                userId);
        }
    }
}

