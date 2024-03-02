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


public class PaymenntLinkLineitem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    public String accountId;

    public PaymenntLinkLineitem withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public PaymenntLinkLineitem withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount_amount")
    public Double discountAmount;

    public PaymenntLinkLineitem withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public PaymenntLinkLineitem withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_description")
    public String itemDescription;

    public PaymenntLinkLineitem withItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_id")
    public String itemId;

    public PaymenntLinkLineitem withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_name")
    public String itemName;

    public PaymenntLinkLineitem withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_sku")
    public String itemSku;

    public PaymenntLinkLineitem withItemSku(String itemSku) {
        this.itemSku = itemSku;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notes")
    public String notes;

    public PaymenntLinkLineitem withNotes(String notes) {
        this.notes = notes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refund_amount")
    public Double refundAmount;

    public PaymenntLinkLineitem withRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("refunded_at")
    public OffsetDateTime refundedAt;

    public PaymenntLinkLineitem withRefundedAt(OffsetDateTime refundedAt) {
        this.refundedAt = refundedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    public Double taxAmount;

    public PaymenntLinkLineitem withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxrate_id")
    public String taxrateId;

    public PaymenntLinkLineitem withTaxrateId(String taxrateId) {
        this.taxrateId = taxrateId;
        return this;
    }
    
    @JsonProperty("total_amount")
    public Double totalAmount;

    public PaymenntLinkLineitem withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_amount")
    public Double unitAmount;

    public PaymenntLinkLineitem withUnitAmount(Double unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_quantity")
    public Double unitQuantity;

    public PaymenntLinkLineitem withUnitQuantity(Double unitQuantity) {
        this.unitQuantity = unitQuantity;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public PaymenntLinkLineitem withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public PaymenntLinkLineitem(@JsonProperty("total_amount") Double totalAmount) {
        this.totalAmount = totalAmount;
  }
}