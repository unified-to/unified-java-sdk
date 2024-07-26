/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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


public class CommerceInventory {
    @JsonProperty("available")
    public Double available;

    public CommerceInventory withAvailable(Double available) {
        this.available = available;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CommerceInventory withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_id")
    public String itemId;

    public CommerceInventory withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_option_id")
    public String itemOptionId;

    public CommerceInventory withItemOptionId(String itemOptionId) {
        this.itemOptionId = itemOptionId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item_variant_id")
    public String itemVariantId;

    public CommerceInventory withItemVariantId(String itemVariantId) {
        this.itemVariantId = itemVariantId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_id")
    public String locationId;

    public CommerceInventory withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public CommerceInventory withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public CommerceInventory withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public CommerceInventory(@JsonProperty("available") Double available) {
        this.available = available;
  }
}
