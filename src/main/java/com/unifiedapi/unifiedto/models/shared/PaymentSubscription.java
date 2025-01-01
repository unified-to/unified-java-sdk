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


public class PaymentSubscription {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canceled_at")
    private Optional<OffsetDateTime> canceledAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    private Optional<String> contactId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("current_period_end_at")
    private Optional<OffsetDateTime> currentPeriodEndAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("current_period_start_at")
    private Optional<OffsetDateTime> currentPeriodStartAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("day_of_month")
    private Optional<Double> dayOfMonth;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("day_of_week")
    private Optional<Double> dayOfWeek;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_at")
    private Optional<OffsetDateTime> endAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    private Optional<Double> interval;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval_unit")
    private Optional<? extends IntervalUnit> intervalUnit;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invoice_id")
    private Optional<String> invoiceId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineitems")
    private Optional<? extends List<PaymentLineitem>> lineitems;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("month")
    private Optional<Double> month;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_at")
    private Optional<OffsetDateTime> startAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends PaymentSubscriptionStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public PaymentSubscription(
            @JsonProperty("canceled_at") Optional<OffsetDateTime> canceledAt,
            @JsonProperty("contact_id") Optional<String> contactId,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("current_period_end_at") Optional<OffsetDateTime> currentPeriodEndAt,
            @JsonProperty("current_period_start_at") Optional<OffsetDateTime> currentPeriodStartAt,
            @JsonProperty("day_of_month") Optional<Double> dayOfMonth,
            @JsonProperty("day_of_week") Optional<Double> dayOfWeek,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("end_at") Optional<OffsetDateTime> endAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("interval") Optional<Double> interval,
            @JsonProperty("interval_unit") Optional<? extends IntervalUnit> intervalUnit,
            @JsonProperty("invoice_id") Optional<String> invoiceId,
            @JsonProperty("lineitems") Optional<? extends List<PaymentLineitem>> lineitems,
            @JsonProperty("month") Optional<Double> month,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("start_at") Optional<OffsetDateTime> startAt,
            @JsonProperty("status") Optional<? extends PaymentSubscriptionStatus> status,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(canceledAt, "canceledAt");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(currentPeriodEndAt, "currentPeriodEndAt");
        Utils.checkNotNull(currentPeriodStartAt, "currentPeriodStartAt");
        Utils.checkNotNull(dayOfMonth, "dayOfMonth");
        Utils.checkNotNull(dayOfWeek, "dayOfWeek");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(endAt, "endAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(interval, "interval");
        Utils.checkNotNull(intervalUnit, "intervalUnit");
        Utils.checkNotNull(invoiceId, "invoiceId");
        Utils.checkNotNull(lineitems, "lineitems");
        Utils.checkNotNull(month, "month");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(startAt, "startAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.canceledAt = canceledAt;
        this.contactId = contactId;
        this.createdAt = createdAt;
        this.currency = currency;
        this.currentPeriodEndAt = currentPeriodEndAt;
        this.currentPeriodStartAt = currentPeriodStartAt;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.description = description;
        this.endAt = endAt;
        this.id = id;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.invoiceId = invoiceId;
        this.lineitems = lineitems;
        this.month = month;
        this.raw = raw;
        this.startAt = startAt;
        this.status = status;
        this.updatedAt = updatedAt;
    }
    
    public PaymentSubscription() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> canceledAt() {
        return canceledAt;
    }

    @JsonIgnore
    public Optional<String> contactId() {
        return contactId;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> currentPeriodEndAt() {
        return currentPeriodEndAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> currentPeriodStartAt() {
        return currentPeriodStartAt;
    }

    @JsonIgnore
    public Optional<Double> dayOfMonth() {
        return dayOfMonth;
    }

    @JsonIgnore
    public Optional<Double> dayOfWeek() {
        return dayOfWeek;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> endAt() {
        return endAt;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Double> interval() {
        return interval;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IntervalUnit> intervalUnit() {
        return (Optional<IntervalUnit>) intervalUnit;
    }

    @JsonIgnore
    public Optional<String> invoiceId() {
        return invoiceId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PaymentLineitem>> lineitems() {
        return (Optional<List<PaymentLineitem>>) lineitems;
    }

    @JsonIgnore
    public Optional<Double> month() {
        return month;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startAt() {
        return startAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentSubscriptionStatus> status() {
        return (Optional<PaymentSubscriptionStatus>) status;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentSubscription withCanceledAt(OffsetDateTime canceledAt) {
        Utils.checkNotNull(canceledAt, "canceledAt");
        this.canceledAt = Optional.ofNullable(canceledAt);
        return this;
    }

    public PaymentSubscription withCanceledAt(Optional<OffsetDateTime> canceledAt) {
        Utils.checkNotNull(canceledAt, "canceledAt");
        this.canceledAt = canceledAt;
        return this;
    }

    public PaymentSubscription withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }

    public PaymentSubscription withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    public PaymentSubscription withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public PaymentSubscription withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public PaymentSubscription withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    public PaymentSubscription withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public PaymentSubscription withCurrentPeriodEndAt(OffsetDateTime currentPeriodEndAt) {
        Utils.checkNotNull(currentPeriodEndAt, "currentPeriodEndAt");
        this.currentPeriodEndAt = Optional.ofNullable(currentPeriodEndAt);
        return this;
    }

    public PaymentSubscription withCurrentPeriodEndAt(Optional<OffsetDateTime> currentPeriodEndAt) {
        Utils.checkNotNull(currentPeriodEndAt, "currentPeriodEndAt");
        this.currentPeriodEndAt = currentPeriodEndAt;
        return this;
    }

    public PaymentSubscription withCurrentPeriodStartAt(OffsetDateTime currentPeriodStartAt) {
        Utils.checkNotNull(currentPeriodStartAt, "currentPeriodStartAt");
        this.currentPeriodStartAt = Optional.ofNullable(currentPeriodStartAt);
        return this;
    }

    public PaymentSubscription withCurrentPeriodStartAt(Optional<OffsetDateTime> currentPeriodStartAt) {
        Utils.checkNotNull(currentPeriodStartAt, "currentPeriodStartAt");
        this.currentPeriodStartAt = currentPeriodStartAt;
        return this;
    }

    public PaymentSubscription withDayOfMonth(double dayOfMonth) {
        Utils.checkNotNull(dayOfMonth, "dayOfMonth");
        this.dayOfMonth = Optional.ofNullable(dayOfMonth);
        return this;
    }

    public PaymentSubscription withDayOfMonth(Optional<Double> dayOfMonth) {
        Utils.checkNotNull(dayOfMonth, "dayOfMonth");
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    public PaymentSubscription withDayOfWeek(double dayOfWeek) {
        Utils.checkNotNull(dayOfWeek, "dayOfWeek");
        this.dayOfWeek = Optional.ofNullable(dayOfWeek);
        return this;
    }

    public PaymentSubscription withDayOfWeek(Optional<Double> dayOfWeek) {
        Utils.checkNotNull(dayOfWeek, "dayOfWeek");
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public PaymentSubscription withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public PaymentSubscription withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public PaymentSubscription withEndAt(OffsetDateTime endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = Optional.ofNullable(endAt);
        return this;
    }

    public PaymentSubscription withEndAt(Optional<OffsetDateTime> endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = endAt;
        return this;
    }

    public PaymentSubscription withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public PaymentSubscription withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PaymentSubscription withInterval(double interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = Optional.ofNullable(interval);
        return this;
    }

    public PaymentSubscription withInterval(Optional<Double> interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
        return this;
    }

    public PaymentSubscription withIntervalUnit(IntervalUnit intervalUnit) {
        Utils.checkNotNull(intervalUnit, "intervalUnit");
        this.intervalUnit = Optional.ofNullable(intervalUnit);
        return this;
    }

    public PaymentSubscription withIntervalUnit(Optional<? extends IntervalUnit> intervalUnit) {
        Utils.checkNotNull(intervalUnit, "intervalUnit");
        this.intervalUnit = intervalUnit;
        return this;
    }

    public PaymentSubscription withInvoiceId(String invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = Optional.ofNullable(invoiceId);
        return this;
    }

    public PaymentSubscription withInvoiceId(Optional<String> invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = invoiceId;
        return this;
    }

    public PaymentSubscription withLineitems(List<PaymentLineitem> lineitems) {
        Utils.checkNotNull(lineitems, "lineitems");
        this.lineitems = Optional.ofNullable(lineitems);
        return this;
    }

    public PaymentSubscription withLineitems(Optional<? extends List<PaymentLineitem>> lineitems) {
        Utils.checkNotNull(lineitems, "lineitems");
        this.lineitems = lineitems;
        return this;
    }

    public PaymentSubscription withMonth(double month) {
        Utils.checkNotNull(month, "month");
        this.month = Optional.ofNullable(month);
        return this;
    }

    public PaymentSubscription withMonth(Optional<Double> month) {
        Utils.checkNotNull(month, "month");
        this.month = month;
        return this;
    }

    public PaymentSubscription withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public PaymentSubscription withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public PaymentSubscription withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = Optional.ofNullable(startAt);
        return this;
    }

    public PaymentSubscription withStartAt(Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
        return this;
    }

    public PaymentSubscription withStatus(PaymentSubscriptionStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public PaymentSubscription withStatus(Optional<? extends PaymentSubscriptionStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public PaymentSubscription withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public PaymentSubscription withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        PaymentSubscription other = (PaymentSubscription) o;
        return 
            Objects.deepEquals(this.canceledAt, other.canceledAt) &&
            Objects.deepEquals(this.contactId, other.contactId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.currentPeriodEndAt, other.currentPeriodEndAt) &&
            Objects.deepEquals(this.currentPeriodStartAt, other.currentPeriodStartAt) &&
            Objects.deepEquals(this.dayOfMonth, other.dayOfMonth) &&
            Objects.deepEquals(this.dayOfWeek, other.dayOfWeek) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.endAt, other.endAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.interval, other.interval) &&
            Objects.deepEquals(this.intervalUnit, other.intervalUnit) &&
            Objects.deepEquals(this.invoiceId, other.invoiceId) &&
            Objects.deepEquals(this.lineitems, other.lineitems) &&
            Objects.deepEquals(this.month, other.month) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.startAt, other.startAt) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            canceledAt,
            contactId,
            createdAt,
            currency,
            currentPeriodEndAt,
            currentPeriodStartAt,
            dayOfMonth,
            dayOfWeek,
            description,
            endAt,
            id,
            interval,
            intervalUnit,
            invoiceId,
            lineitems,
            month,
            raw,
            startAt,
            status,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentSubscription.class,
                "canceledAt", canceledAt,
                "contactId", contactId,
                "createdAt", createdAt,
                "currency", currency,
                "currentPeriodEndAt", currentPeriodEndAt,
                "currentPeriodStartAt", currentPeriodStartAt,
                "dayOfMonth", dayOfMonth,
                "dayOfWeek", dayOfWeek,
                "description", description,
                "endAt", endAt,
                "id", id,
                "interval", interval,
                "intervalUnit", intervalUnit,
                "invoiceId", invoiceId,
                "lineitems", lineitems,
                "month", month,
                "raw", raw,
                "startAt", startAt,
                "status", status,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> canceledAt = Optional.empty();
 
        private Optional<String> contactId = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<OffsetDateTime> currentPeriodEndAt = Optional.empty();
 
        private Optional<OffsetDateTime> currentPeriodStartAt = Optional.empty();
 
        private Optional<Double> dayOfMonth = Optional.empty();
 
        private Optional<Double> dayOfWeek = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<OffsetDateTime> endAt = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Double> interval = Optional.empty();
 
        private Optional<? extends IntervalUnit> intervalUnit = Optional.empty();
 
        private Optional<String> invoiceId = Optional.empty();
 
        private Optional<? extends List<PaymentLineitem>> lineitems = Optional.empty();
 
        private Optional<Double> month = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<OffsetDateTime> startAt = Optional.empty();
 
        private Optional<? extends PaymentSubscriptionStatus> status = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder canceledAt(OffsetDateTime canceledAt) {
            Utils.checkNotNull(canceledAt, "canceledAt");
            this.canceledAt = Optional.ofNullable(canceledAt);
            return this;
        }

        public Builder canceledAt(Optional<OffsetDateTime> canceledAt) {
            Utils.checkNotNull(canceledAt, "canceledAt");
            this.canceledAt = canceledAt;
            return this;
        }

        public Builder contactId(String contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = Optional.ofNullable(contactId);
            return this;
        }

        public Builder contactId(Optional<String> contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = contactId;
            return this;
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

        public Builder currentPeriodEndAt(OffsetDateTime currentPeriodEndAt) {
            Utils.checkNotNull(currentPeriodEndAt, "currentPeriodEndAt");
            this.currentPeriodEndAt = Optional.ofNullable(currentPeriodEndAt);
            return this;
        }

        public Builder currentPeriodEndAt(Optional<OffsetDateTime> currentPeriodEndAt) {
            Utils.checkNotNull(currentPeriodEndAt, "currentPeriodEndAt");
            this.currentPeriodEndAt = currentPeriodEndAt;
            return this;
        }

        public Builder currentPeriodStartAt(OffsetDateTime currentPeriodStartAt) {
            Utils.checkNotNull(currentPeriodStartAt, "currentPeriodStartAt");
            this.currentPeriodStartAt = Optional.ofNullable(currentPeriodStartAt);
            return this;
        }

        public Builder currentPeriodStartAt(Optional<OffsetDateTime> currentPeriodStartAt) {
            Utils.checkNotNull(currentPeriodStartAt, "currentPeriodStartAt");
            this.currentPeriodStartAt = currentPeriodStartAt;
            return this;
        }

        public Builder dayOfMonth(double dayOfMonth) {
            Utils.checkNotNull(dayOfMonth, "dayOfMonth");
            this.dayOfMonth = Optional.ofNullable(dayOfMonth);
            return this;
        }

        public Builder dayOfMonth(Optional<Double> dayOfMonth) {
            Utils.checkNotNull(dayOfMonth, "dayOfMonth");
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        public Builder dayOfWeek(double dayOfWeek) {
            Utils.checkNotNull(dayOfWeek, "dayOfWeek");
            this.dayOfWeek = Optional.ofNullable(dayOfWeek);
            return this;
        }

        public Builder dayOfWeek(Optional<Double> dayOfWeek) {
            Utils.checkNotNull(dayOfWeek, "dayOfWeek");
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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

        public Builder interval(double interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = Optional.ofNullable(interval);
            return this;
        }

        public Builder interval(Optional<Double> interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }

        public Builder intervalUnit(IntervalUnit intervalUnit) {
            Utils.checkNotNull(intervalUnit, "intervalUnit");
            this.intervalUnit = Optional.ofNullable(intervalUnit);
            return this;
        }

        public Builder intervalUnit(Optional<? extends IntervalUnit> intervalUnit) {
            Utils.checkNotNull(intervalUnit, "intervalUnit");
            this.intervalUnit = intervalUnit;
            return this;
        }

        public Builder invoiceId(String invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = Optional.ofNullable(invoiceId);
            return this;
        }

        public Builder invoiceId(Optional<String> invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder lineitems(List<PaymentLineitem> lineitems) {
            Utils.checkNotNull(lineitems, "lineitems");
            this.lineitems = Optional.ofNullable(lineitems);
            return this;
        }

        public Builder lineitems(Optional<? extends List<PaymentLineitem>> lineitems) {
            Utils.checkNotNull(lineitems, "lineitems");
            this.lineitems = lineitems;
            return this;
        }

        public Builder month(double month) {
            Utils.checkNotNull(month, "month");
            this.month = Optional.ofNullable(month);
            return this;
        }

        public Builder month(Optional<Double> month) {
            Utils.checkNotNull(month, "month");
            this.month = month;
            return this;
        }

        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends Map<String, Object>> raw) {
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

        public Builder status(PaymentSubscriptionStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends PaymentSubscriptionStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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
        
        public PaymentSubscription build() {
            return new PaymentSubscription(
                canceledAt,
                contactId,
                createdAt,
                currency,
                currentPeriodEndAt,
                currentPeriodStartAt,
                dayOfMonth,
                dayOfWeek,
                description,
                endAt,
                id,
                interval,
                intervalUnit,
                invoiceId,
                lineitems,
                month,
                raw,
                startAt,
                status,
                updatedAt);
        }
    }
}
