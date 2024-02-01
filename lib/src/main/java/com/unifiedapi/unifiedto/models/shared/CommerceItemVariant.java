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


public class CommerceItemVariant {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("available_at")
    public OffsetDateTime availableAt;

    public CommerceItemVariant withAvailableAt(OffsetDateTime availableAt) {
        this.availableAt = availableAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public CommerceItemVariant withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    public Double height;

    public CommerceItemVariant withHeight(Double height) {
        this.height = height;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CommerceItemVariant withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inventory_id")
    public String inventoryId;

    public CommerceItemVariant withInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    public Boolean isActive;

    public CommerceItemVariant withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_featured")
    public Boolean isFeatured;

    public CommerceItemVariant withIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_visible")
    public Boolean isVisible;

    public CommerceItemVariant withIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("length")
    public Double length;

    public CommerceItemVariant withLength(Double length) {
        this.length = length;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("media")
    public CommerceItemMedia[] media;

    public CommerceItemVariant withMedia(CommerceItemMedia[] media) {
        this.media = media;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public CommerceItemVariant withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public CommerceItemOption[] options;

    public CommerceItemVariant withOptions(CommerceItemOption[] options) {
        this.options = options;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prices")
    public CommerceItemPrice[] prices;

    public CommerceItemVariant withPrices(CommerceItemPrice[] prices) {
        this.prices = prices;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_description")
    public String publicDescription;

    public CommerceItemVariant withPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_name")
    public String publicName;

    public CommerceItemVariant withPublicName(String publicName) {
        this.publicName = publicName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requires_shipping")
    public Boolean requiresShipping;

    public CommerceItemVariant withRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size_unit")
    public SizeUnit sizeUnit;

    public CommerceItemVariant withSizeUnit(SizeUnit sizeUnit) {
        this.sizeUnit = sizeUnit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sku")
    public String sku;

    public CommerceItemVariant withSku(String sku) {
        this.sku = sku;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public String[] tags;

    public CommerceItemVariant withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_stock")
    public Double totalStock;

    public CommerceItemVariant withTotalStock(Double totalStock) {
        this.totalStock = totalStock;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weight")
    public Double weight;

    public CommerceItemVariant withWeight(Double weight) {
        this.weight = weight;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weight_unit")
    public WeightUnit weightUnit;

    public CommerceItemVariant withWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    public Double width;

    public CommerceItemVariant withWidth(Double width) {
        this.width = width;
        return this;
    }
    
    public CommerceItemVariant(@JsonProperty("name") String name) {
        this.name = name;
  }
}
