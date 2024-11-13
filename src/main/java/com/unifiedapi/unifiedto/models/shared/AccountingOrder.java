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


public class AccountingOrder {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billing_address")
    private Optional<? extends PropertyAccountingOrderBillingAddress> billingAddress;

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
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineitems")
    private Optional<? extends List<AccountingLineitem>> lineitems;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipping_address")
    private Optional<? extends PropertyAccountingOrderShippingAddress> shippingAddress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends AccountingOrderStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private Optional<Double> totalAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AccountingOrderType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public AccountingOrder(
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("billing_address") Optional<? extends PropertyAccountingOrderBillingAddress> billingAddress,
            @JsonProperty("contact_id") Optional<String> contactId,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("lineitems") Optional<? extends List<AccountingLineitem>> lineitems,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("shipping_address") Optional<? extends PropertyAccountingOrderShippingAddress> shippingAddress,
            @JsonProperty("status") Optional<? extends AccountingOrderStatus> status,
            @JsonProperty("total_amount") Optional<Double> totalAmount,
            @JsonProperty("type") Optional<? extends AccountingOrderType> type,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(billingAddress, "billingAddress");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lineitems, "lineitems");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(shippingAddress, "shippingAddress");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.accountId = accountId;
        this.billingAddress = billingAddress;
        this.contactId = contactId;
        this.createdAt = createdAt;
        this.currency = currency;
        this.id = id;
        this.lineitems = lineitems;
        this.raw = raw;
        this.shippingAddress = shippingAddress;
        this.status = status;
        this.totalAmount = totalAmount;
        this.type = type;
        this.updatedAt = updatedAt;
    }
    
    public AccountingOrder() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyAccountingOrderBillingAddress> billingAddress() {
        return (Optional<PropertyAccountingOrderBillingAddress>) billingAddress;
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
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AccountingLineitem>> lineitems() {
        return (Optional<List<AccountingLineitem>>) lineitems;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyAccountingOrderShippingAddress> shippingAddress() {
        return (Optional<PropertyAccountingOrderShippingAddress>) shippingAddress;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingOrderStatus> status() {
        return (Optional<AccountingOrderStatus>) status;
    }

    @JsonIgnore
    public Optional<Double> totalAmount() {
        return totalAmount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingOrderType> type() {
        return (Optional<AccountingOrderType>) type;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountingOrder withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    public AccountingOrder withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public AccountingOrder withBillingAddress(PropertyAccountingOrderBillingAddress billingAddress) {
        Utils.checkNotNull(billingAddress, "billingAddress");
        this.billingAddress = Optional.ofNullable(billingAddress);
        return this;
    }

    public AccountingOrder withBillingAddress(Optional<? extends PropertyAccountingOrderBillingAddress> billingAddress) {
        Utils.checkNotNull(billingAddress, "billingAddress");
        this.billingAddress = billingAddress;
        return this;
    }

    public AccountingOrder withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }

    public AccountingOrder withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    public AccountingOrder withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public AccountingOrder withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AccountingOrder withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    public AccountingOrder withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public AccountingOrder withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AccountingOrder withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingOrder withLineitems(List<AccountingLineitem> lineitems) {
        Utils.checkNotNull(lineitems, "lineitems");
        this.lineitems = Optional.ofNullable(lineitems);
        return this;
    }

    public AccountingOrder withLineitems(Optional<? extends List<AccountingLineitem>> lineitems) {
        Utils.checkNotNull(lineitems, "lineitems");
        this.lineitems = lineitems;
        return this;
    }

    public AccountingOrder withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public AccountingOrder withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public AccountingOrder withShippingAddress(PropertyAccountingOrderShippingAddress shippingAddress) {
        Utils.checkNotNull(shippingAddress, "shippingAddress");
        this.shippingAddress = Optional.ofNullable(shippingAddress);
        return this;
    }

    public AccountingOrder withShippingAddress(Optional<? extends PropertyAccountingOrderShippingAddress> shippingAddress) {
        Utils.checkNotNull(shippingAddress, "shippingAddress");
        this.shippingAddress = shippingAddress;
        return this;
    }

    public AccountingOrder withStatus(AccountingOrderStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public AccountingOrder withStatus(Optional<? extends AccountingOrderStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public AccountingOrder withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }

    public AccountingOrder withTotalAmount(Optional<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public AccountingOrder withType(AccountingOrderType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AccountingOrder withType(Optional<? extends AccountingOrderType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public AccountingOrder withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public AccountingOrder withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        AccountingOrder other = (AccountingOrder) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.billingAddress, other.billingAddress) &&
            Objects.deepEquals(this.contactId, other.contactId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.lineitems, other.lineitems) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.shippingAddress, other.shippingAddress) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            billingAddress,
            contactId,
            createdAt,
            currency,
            id,
            lineitems,
            raw,
            shippingAddress,
            status,
            totalAmount,
            type,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingOrder.class,
                "accountId", accountId,
                "billingAddress", billingAddress,
                "contactId", contactId,
                "createdAt", createdAt,
                "currency", currency,
                "id", id,
                "lineitems", lineitems,
                "raw", raw,
                "shippingAddress", shippingAddress,
                "status", status,
                "totalAmount", totalAmount,
                "type", type,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<String> accountId = Optional.empty();
 
        private Optional<? extends PropertyAccountingOrderBillingAddress> billingAddress = Optional.empty();
 
        private Optional<String> contactId = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends List<AccountingLineitem>> lineitems = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<? extends PropertyAccountingOrderShippingAddress> shippingAddress = Optional.empty();
 
        private Optional<? extends AccountingOrderStatus> status = Optional.empty();
 
        private Optional<Double> totalAmount = Optional.empty();
 
        private Optional<? extends AccountingOrderType> type = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        public Builder accountId(Optional<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder billingAddress(PropertyAccountingOrderBillingAddress billingAddress) {
            Utils.checkNotNull(billingAddress, "billingAddress");
            this.billingAddress = Optional.ofNullable(billingAddress);
            return this;
        }

        public Builder billingAddress(Optional<? extends PropertyAccountingOrderBillingAddress> billingAddress) {
            Utils.checkNotNull(billingAddress, "billingAddress");
            this.billingAddress = billingAddress;
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

        public Builder lineitems(List<AccountingLineitem> lineitems) {
            Utils.checkNotNull(lineitems, "lineitems");
            this.lineitems = Optional.ofNullable(lineitems);
            return this;
        }

        public Builder lineitems(Optional<? extends List<AccountingLineitem>> lineitems) {
            Utils.checkNotNull(lineitems, "lineitems");
            this.lineitems = lineitems;
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

        public Builder shippingAddress(PropertyAccountingOrderShippingAddress shippingAddress) {
            Utils.checkNotNull(shippingAddress, "shippingAddress");
            this.shippingAddress = Optional.ofNullable(shippingAddress);
            return this;
        }

        public Builder shippingAddress(Optional<? extends PropertyAccountingOrderShippingAddress> shippingAddress) {
            Utils.checkNotNull(shippingAddress, "shippingAddress");
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder status(AccountingOrderStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends AccountingOrderStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = Optional.ofNullable(totalAmount);
            return this;
        }

        public Builder totalAmount(Optional<Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder type(AccountingOrderType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends AccountingOrderType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
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
        
        public AccountingOrder build() {
            return new AccountingOrder(
                accountId,
                billingAddress,
                contactId,
                createdAt,
                currency,
                id,
                lineitems,
                raw,
                shippingAddress,
                status,
                totalAmount,
                type,
                updatedAt);
        }
    }
}
