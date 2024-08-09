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
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class PaymentLinkLineitem {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount_amount")
    private Optional<Double> discountAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_description")
    private Optional<String> itemDescription;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_id")
    private Optional<String> itemId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_name")
    private Optional<String> itemName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_sku")
    private Optional<String> itemSku;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notes")
    private Optional<String> notes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refund_amount")
    private Optional<Double> refundAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refunded_at")
    private Optional<OffsetDateTime> refundedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    private Optional<Double> taxAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxrate_id")
    private Optional<String> taxrateId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private Optional<Double> totalAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_amount")
    private Optional<Double> unitAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_quantity")
    private Optional<Double> unitQuantity;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public PaymentLinkLineitem(
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("discount_amount") Optional<Double> discountAmount,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("item_description") Optional<String> itemDescription,
            @JsonProperty("item_id") Optional<String> itemId,
            @JsonProperty("item_name") Optional<String> itemName,
            @JsonProperty("item_sku") Optional<String> itemSku,
            @JsonProperty("notes") Optional<String> notes,
            @JsonProperty("refund_amount") Optional<Double> refundAmount,
            @JsonProperty("refunded_at") Optional<OffsetDateTime> refundedAt,
            @JsonProperty("tax_amount") Optional<Double> taxAmount,
            @JsonProperty("taxrate_id") Optional<String> taxrateId,
            @JsonProperty("total_amount") Optional<Double> totalAmount,
            @JsonProperty("unit_amount") Optional<Double> unitAmount,
            @JsonProperty("unit_quantity") Optional<Double> unitQuantity,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(discountAmount, "discountAmount");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(itemDescription, "itemDescription");
        Utils.checkNotNull(itemId, "itemId");
        Utils.checkNotNull(itemName, "itemName");
        Utils.checkNotNull(itemSku, "itemSku");
        Utils.checkNotNull(notes, "notes");
        Utils.checkNotNull(refundAmount, "refundAmount");
        Utils.checkNotNull(refundedAt, "refundedAt");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(taxrateId, "taxrateId");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(unitAmount, "unitAmount");
        Utils.checkNotNull(unitQuantity, "unitQuantity");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.accountId = accountId;
        this.createdAt = createdAt;
        this.discountAmount = discountAmount;
        this.id = id;
        this.itemDescription = itemDescription;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemSku = itemSku;
        this.notes = notes;
        this.refundAmount = refundAmount;
        this.refundedAt = refundedAt;
        this.taxAmount = taxAmount;
        this.taxrateId = taxrateId;
        this.totalAmount = totalAmount;
        this.unitAmount = unitAmount;
        this.unitQuantity = unitQuantity;
        this.updatedAt = updatedAt;
    }
    
    public PaymentLinkLineitem() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<Double> discountAmount() {
        return discountAmount;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> itemDescription() {
        return itemDescription;
    }

    @JsonIgnore
    public Optional<String> itemId() {
        return itemId;
    }

    @JsonIgnore
    public Optional<String> itemName() {
        return itemName;
    }

    @JsonIgnore
    public Optional<String> itemSku() {
        return itemSku;
    }

    @JsonIgnore
    public Optional<String> notes() {
        return notes;
    }

    @JsonIgnore
    public Optional<Double> refundAmount() {
        return refundAmount;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> refundedAt() {
        return refundedAt;
    }

    @JsonIgnore
    public Optional<Double> taxAmount() {
        return taxAmount;
    }

    @JsonIgnore
    public Optional<String> taxrateId() {
        return taxrateId;
    }

    @JsonIgnore
    public Optional<Double> totalAmount() {
        return totalAmount;
    }

    @JsonIgnore
    public Optional<Double> unitAmount() {
        return unitAmount;
    }

    @JsonIgnore
    public Optional<Double> unitQuantity() {
        return unitQuantity;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentLinkLineitem withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    public PaymentLinkLineitem withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public PaymentLinkLineitem withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public PaymentLinkLineitem withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public PaymentLinkLineitem withDiscountAmount(double discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = Optional.ofNullable(discountAmount);
        return this;
    }

    public PaymentLinkLineitem withDiscountAmount(Optional<Double> discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = discountAmount;
        return this;
    }

    public PaymentLinkLineitem withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public PaymentLinkLineitem withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PaymentLinkLineitem withItemDescription(String itemDescription) {
        Utils.checkNotNull(itemDescription, "itemDescription");
        this.itemDescription = Optional.ofNullable(itemDescription);
        return this;
    }

    public PaymentLinkLineitem withItemDescription(Optional<String> itemDescription) {
        Utils.checkNotNull(itemDescription, "itemDescription");
        this.itemDescription = itemDescription;
        return this;
    }

    public PaymentLinkLineitem withItemId(String itemId) {
        Utils.checkNotNull(itemId, "itemId");
        this.itemId = Optional.ofNullable(itemId);
        return this;
    }

    public PaymentLinkLineitem withItemId(Optional<String> itemId) {
        Utils.checkNotNull(itemId, "itemId");
        this.itemId = itemId;
        return this;
    }

    public PaymentLinkLineitem withItemName(String itemName) {
        Utils.checkNotNull(itemName, "itemName");
        this.itemName = Optional.ofNullable(itemName);
        return this;
    }

    public PaymentLinkLineitem withItemName(Optional<String> itemName) {
        Utils.checkNotNull(itemName, "itemName");
        this.itemName = itemName;
        return this;
    }

    public PaymentLinkLineitem withItemSku(String itemSku) {
        Utils.checkNotNull(itemSku, "itemSku");
        this.itemSku = Optional.ofNullable(itemSku);
        return this;
    }

    public PaymentLinkLineitem withItemSku(Optional<String> itemSku) {
        Utils.checkNotNull(itemSku, "itemSku");
        this.itemSku = itemSku;
        return this;
    }

    public PaymentLinkLineitem withNotes(String notes) {
        Utils.checkNotNull(notes, "notes");
        this.notes = Optional.ofNullable(notes);
        return this;
    }

    public PaymentLinkLineitem withNotes(Optional<String> notes) {
        Utils.checkNotNull(notes, "notes");
        this.notes = notes;
        return this;
    }

    public PaymentLinkLineitem withRefundAmount(double refundAmount) {
        Utils.checkNotNull(refundAmount, "refundAmount");
        this.refundAmount = Optional.ofNullable(refundAmount);
        return this;
    }

    public PaymentLinkLineitem withRefundAmount(Optional<Double> refundAmount) {
        Utils.checkNotNull(refundAmount, "refundAmount");
        this.refundAmount = refundAmount;
        return this;
    }

    public PaymentLinkLineitem withRefundedAt(OffsetDateTime refundedAt) {
        Utils.checkNotNull(refundedAt, "refundedAt");
        this.refundedAt = Optional.ofNullable(refundedAt);
        return this;
    }

    public PaymentLinkLineitem withRefundedAt(Optional<OffsetDateTime> refundedAt) {
        Utils.checkNotNull(refundedAt, "refundedAt");
        this.refundedAt = refundedAt;
        return this;
    }

    public PaymentLinkLineitem withTaxAmount(double taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = Optional.ofNullable(taxAmount);
        return this;
    }

    public PaymentLinkLineitem withTaxAmount(Optional<Double> taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = taxAmount;
        return this;
    }

    public PaymentLinkLineitem withTaxrateId(String taxrateId) {
        Utils.checkNotNull(taxrateId, "taxrateId");
        this.taxrateId = Optional.ofNullable(taxrateId);
        return this;
    }

    public PaymentLinkLineitem withTaxrateId(Optional<String> taxrateId) {
        Utils.checkNotNull(taxrateId, "taxrateId");
        this.taxrateId = taxrateId;
        return this;
    }

    public PaymentLinkLineitem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }

    public PaymentLinkLineitem withTotalAmount(Optional<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public PaymentLinkLineitem withUnitAmount(double unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = Optional.ofNullable(unitAmount);
        return this;
    }

    public PaymentLinkLineitem withUnitAmount(Optional<Double> unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = unitAmount;
        return this;
    }

    public PaymentLinkLineitem withUnitQuantity(double unitQuantity) {
        Utils.checkNotNull(unitQuantity, "unitQuantity");
        this.unitQuantity = Optional.ofNullable(unitQuantity);
        return this;
    }

    public PaymentLinkLineitem withUnitQuantity(Optional<Double> unitQuantity) {
        Utils.checkNotNull(unitQuantity, "unitQuantity");
        this.unitQuantity = unitQuantity;
        return this;
    }

    public PaymentLinkLineitem withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public PaymentLinkLineitem withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        PaymentLinkLineitem other = (PaymentLinkLineitem) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.discountAmount, other.discountAmount) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.itemDescription, other.itemDescription) &&
            Objects.deepEquals(this.itemId, other.itemId) &&
            Objects.deepEquals(this.itemName, other.itemName) &&
            Objects.deepEquals(this.itemSku, other.itemSku) &&
            Objects.deepEquals(this.notes, other.notes) &&
            Objects.deepEquals(this.refundAmount, other.refundAmount) &&
            Objects.deepEquals(this.refundedAt, other.refundedAt) &&
            Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            Objects.deepEquals(this.taxrateId, other.taxrateId) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.unitAmount, other.unitAmount) &&
            Objects.deepEquals(this.unitQuantity, other.unitQuantity) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            createdAt,
            discountAmount,
            id,
            itemDescription,
            itemId,
            itemName,
            itemSku,
            notes,
            refundAmount,
            refundedAt,
            taxAmount,
            taxrateId,
            totalAmount,
            unitAmount,
            unitQuantity,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentLinkLineitem.class,
                "accountId", accountId,
                "createdAt", createdAt,
                "discountAmount", discountAmount,
                "id", id,
                "itemDescription", itemDescription,
                "itemId", itemId,
                "itemName", itemName,
                "itemSku", itemSku,
                "notes", notes,
                "refundAmount", refundAmount,
                "refundedAt", refundedAt,
                "taxAmount", taxAmount,
                "taxrateId", taxrateId,
                "totalAmount", totalAmount,
                "unitAmount", unitAmount,
                "unitQuantity", unitQuantity,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<String> accountId = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<Double> discountAmount = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> itemDescription = Optional.empty();
 
        private Optional<String> itemId = Optional.empty();
 
        private Optional<String> itemName = Optional.empty();
 
        private Optional<String> itemSku = Optional.empty();
 
        private Optional<String> notes = Optional.empty();
 
        private Optional<Double> refundAmount = Optional.empty();
 
        private Optional<OffsetDateTime> refundedAt = Optional.empty();
 
        private Optional<Double> taxAmount = Optional.empty();
 
        private Optional<String> taxrateId = Optional.empty();
 
        private Optional<Double> totalAmount = Optional.empty();
 
        private Optional<Double> unitAmount = Optional.empty();
 
        private Optional<Double> unitQuantity = Optional.empty();
 
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

        public Builder discountAmount(double discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = Optional.ofNullable(discountAmount);
            return this;
        }

        public Builder discountAmount(Optional<Double> discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = discountAmount;
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

        public Builder itemDescription(String itemDescription) {
            Utils.checkNotNull(itemDescription, "itemDescription");
            this.itemDescription = Optional.ofNullable(itemDescription);
            return this;
        }

        public Builder itemDescription(Optional<String> itemDescription) {
            Utils.checkNotNull(itemDescription, "itemDescription");
            this.itemDescription = itemDescription;
            return this;
        }

        public Builder itemId(String itemId) {
            Utils.checkNotNull(itemId, "itemId");
            this.itemId = Optional.ofNullable(itemId);
            return this;
        }

        public Builder itemId(Optional<String> itemId) {
            Utils.checkNotNull(itemId, "itemId");
            this.itemId = itemId;
            return this;
        }

        public Builder itemName(String itemName) {
            Utils.checkNotNull(itemName, "itemName");
            this.itemName = Optional.ofNullable(itemName);
            return this;
        }

        public Builder itemName(Optional<String> itemName) {
            Utils.checkNotNull(itemName, "itemName");
            this.itemName = itemName;
            return this;
        }

        public Builder itemSku(String itemSku) {
            Utils.checkNotNull(itemSku, "itemSku");
            this.itemSku = Optional.ofNullable(itemSku);
            return this;
        }

        public Builder itemSku(Optional<String> itemSku) {
            Utils.checkNotNull(itemSku, "itemSku");
            this.itemSku = itemSku;
            return this;
        }

        public Builder notes(String notes) {
            Utils.checkNotNull(notes, "notes");
            this.notes = Optional.ofNullable(notes);
            return this;
        }

        public Builder notes(Optional<String> notes) {
            Utils.checkNotNull(notes, "notes");
            this.notes = notes;
            return this;
        }

        public Builder refundAmount(double refundAmount) {
            Utils.checkNotNull(refundAmount, "refundAmount");
            this.refundAmount = Optional.ofNullable(refundAmount);
            return this;
        }

        public Builder refundAmount(Optional<Double> refundAmount) {
            Utils.checkNotNull(refundAmount, "refundAmount");
            this.refundAmount = refundAmount;
            return this;
        }

        public Builder refundedAt(OffsetDateTime refundedAt) {
            Utils.checkNotNull(refundedAt, "refundedAt");
            this.refundedAt = Optional.ofNullable(refundedAt);
            return this;
        }

        public Builder refundedAt(Optional<OffsetDateTime> refundedAt) {
            Utils.checkNotNull(refundedAt, "refundedAt");
            this.refundedAt = refundedAt;
            return this;
        }

        public Builder taxAmount(double taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = Optional.ofNullable(taxAmount);
            return this;
        }

        public Builder taxAmount(Optional<Double> taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = taxAmount;
            return this;
        }

        public Builder taxrateId(String taxrateId) {
            Utils.checkNotNull(taxrateId, "taxrateId");
            this.taxrateId = Optional.ofNullable(taxrateId);
            return this;
        }

        public Builder taxrateId(Optional<String> taxrateId) {
            Utils.checkNotNull(taxrateId, "taxrateId");
            this.taxrateId = taxrateId;
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

        public Builder unitAmount(double unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = Optional.ofNullable(unitAmount);
            return this;
        }

        public Builder unitAmount(Optional<Double> unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = unitAmount;
            return this;
        }

        public Builder unitQuantity(double unitQuantity) {
            Utils.checkNotNull(unitQuantity, "unitQuantity");
            this.unitQuantity = Optional.ofNullable(unitQuantity);
            return this;
        }

        public Builder unitQuantity(Optional<Double> unitQuantity) {
            Utils.checkNotNull(unitQuantity, "unitQuantity");
            this.unitQuantity = unitQuantity;
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
        
        public PaymentLinkLineitem build() {
            return new PaymentLinkLineitem(
                accountId,
                createdAt,
                discountAmount,
                id,
                itemDescription,
                itemId,
                itemName,
                itemSku,
                notes,
                refundAmount,
                refundedAt,
                taxAmount,
                taxrateId,
                totalAmount,
                unitAmount,
                unitQuantity,
                updatedAt);
        }
    }
}

