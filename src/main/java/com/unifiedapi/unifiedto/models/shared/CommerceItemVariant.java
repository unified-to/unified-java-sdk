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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CommerceItemVariant {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("available_at")
    private Optional<OffsetDateTime> availableAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    private Optional<Double> height;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inventory_id")
    private Optional<String> inventoryId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    private Optional<Boolean> isActive;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_featured")
    private Optional<Boolean> isFeatured;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_visible")
    private Optional<Boolean> isVisible;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("length")
    private Optional<Double> length;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("media")
    private Optional<? extends List<CommerceItemMedia>> media;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends List<CommerceItemOption>> options;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prices")
    private Optional<? extends List<CommerceItemPrice>> prices;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_description")
    private Optional<String> publicDescription;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_name")
    private Optional<String> publicName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requires_shipping")
    private Optional<Boolean> requiresShipping;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size_unit")
    private Optional<? extends SizeUnit> sizeUnit;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sku")
    private Optional<String> sku;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<String>> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_stock")
    private Optional<Double> totalStock;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weight")
    private Optional<Double> weight;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weight_unit")
    private Optional<? extends WeightUnit> weightUnit;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    private Optional<Double> width;

    @JsonCreator
    public CommerceItemVariant(
            @JsonProperty("available_at") Optional<OffsetDateTime> availableAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("height") Optional<Double> height,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("inventory_id") Optional<String> inventoryId,
            @JsonProperty("is_active") Optional<Boolean> isActive,
            @JsonProperty("is_featured") Optional<Boolean> isFeatured,
            @JsonProperty("is_visible") Optional<Boolean> isVisible,
            @JsonProperty("length") Optional<Double> length,
            @JsonProperty("media") Optional<? extends List<CommerceItemMedia>> media,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("options") Optional<? extends List<CommerceItemOption>> options,
            @JsonProperty("prices") Optional<? extends List<CommerceItemPrice>> prices,
            @JsonProperty("public_description") Optional<String> publicDescription,
            @JsonProperty("public_name") Optional<String> publicName,
            @JsonProperty("requires_shipping") Optional<Boolean> requiresShipping,
            @JsonProperty("size_unit") Optional<? extends SizeUnit> sizeUnit,
            @JsonProperty("sku") Optional<String> sku,
            @JsonProperty("tags") Optional<? extends List<String>> tags,
            @JsonProperty("total_stock") Optional<Double> totalStock,
            @JsonProperty("weight") Optional<Double> weight,
            @JsonProperty("weight_unit") Optional<? extends WeightUnit> weightUnit,
            @JsonProperty("width") Optional<Double> width) {
        Utils.checkNotNull(availableAt, "availableAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(height, "height");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(inventoryId, "inventoryId");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(isFeatured, "isFeatured");
        Utils.checkNotNull(isVisible, "isVisible");
        Utils.checkNotNull(length, "length");
        Utils.checkNotNull(media, "media");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(prices, "prices");
        Utils.checkNotNull(publicDescription, "publicDescription");
        Utils.checkNotNull(publicName, "publicName");
        Utils.checkNotNull(requiresShipping, "requiresShipping");
        Utils.checkNotNull(sizeUnit, "sizeUnit");
        Utils.checkNotNull(sku, "sku");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(totalStock, "totalStock");
        Utils.checkNotNull(weight, "weight");
        Utils.checkNotNull(weightUnit, "weightUnit");
        Utils.checkNotNull(width, "width");
        this.availableAt = availableAt;
        this.description = description;
        this.height = height;
        this.id = id;
        this.inventoryId = inventoryId;
        this.isActive = isActive;
        this.isFeatured = isFeatured;
        this.isVisible = isVisible;
        this.length = length;
        this.media = media;
        this.name = name;
        this.options = options;
        this.prices = prices;
        this.publicDescription = publicDescription;
        this.publicName = publicName;
        this.requiresShipping = requiresShipping;
        this.sizeUnit = sizeUnit;
        this.sku = sku;
        this.tags = tags;
        this.totalStock = totalStock;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.width = width;
    }
    
    public CommerceItemVariant() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> availableAt() {
        return availableAt;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<Double> height() {
        return height;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> inventoryId() {
        return inventoryId;
    }

    @JsonIgnore
    public Optional<Boolean> isActive() {
        return isActive;
    }

    @JsonIgnore
    public Optional<Boolean> isFeatured() {
        return isFeatured;
    }

    @JsonIgnore
    public Optional<Boolean> isVisible() {
        return isVisible;
    }

    @JsonIgnore
    public Optional<Double> length() {
        return length;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CommerceItemMedia>> media() {
        return (Optional<List<CommerceItemMedia>>) media;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CommerceItemOption>> options() {
        return (Optional<List<CommerceItemOption>>) options;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CommerceItemPrice>> prices() {
        return (Optional<List<CommerceItemPrice>>) prices;
    }

    @JsonIgnore
    public Optional<String> publicDescription() {
        return publicDescription;
    }

    @JsonIgnore
    public Optional<String> publicName() {
        return publicName;
    }

    @JsonIgnore
    public Optional<Boolean> requiresShipping() {
        return requiresShipping;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SizeUnit> sizeUnit() {
        return (Optional<SizeUnit>) sizeUnit;
    }

    @JsonIgnore
    public Optional<String> sku() {
        return sku;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> tags() {
        return (Optional<List<String>>) tags;
    }

    @JsonIgnore
    public Optional<Double> totalStock() {
        return totalStock;
    }

    @JsonIgnore
    public Optional<Double> weight() {
        return weight;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WeightUnit> weightUnit() {
        return (Optional<WeightUnit>) weightUnit;
    }

    @JsonIgnore
    public Optional<Double> width() {
        return width;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CommerceItemVariant withAvailableAt(OffsetDateTime availableAt) {
        Utils.checkNotNull(availableAt, "availableAt");
        this.availableAt = Optional.ofNullable(availableAt);
        return this;
    }

    public CommerceItemVariant withAvailableAt(Optional<OffsetDateTime> availableAt) {
        Utils.checkNotNull(availableAt, "availableAt");
        this.availableAt = availableAt;
        return this;
    }

    public CommerceItemVariant withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public CommerceItemVariant withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public CommerceItemVariant withHeight(double height) {
        Utils.checkNotNull(height, "height");
        this.height = Optional.ofNullable(height);
        return this;
    }

    public CommerceItemVariant withHeight(Optional<Double> height) {
        Utils.checkNotNull(height, "height");
        this.height = height;
        return this;
    }

    public CommerceItemVariant withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public CommerceItemVariant withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CommerceItemVariant withInventoryId(String inventoryId) {
        Utils.checkNotNull(inventoryId, "inventoryId");
        this.inventoryId = Optional.ofNullable(inventoryId);
        return this;
    }

    public CommerceItemVariant withInventoryId(Optional<String> inventoryId) {
        Utils.checkNotNull(inventoryId, "inventoryId");
        this.inventoryId = inventoryId;
        return this;
    }

    public CommerceItemVariant withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = Optional.ofNullable(isActive);
        return this;
    }

    public CommerceItemVariant withIsActive(Optional<Boolean> isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public CommerceItemVariant withIsFeatured(boolean isFeatured) {
        Utils.checkNotNull(isFeatured, "isFeatured");
        this.isFeatured = Optional.ofNullable(isFeatured);
        return this;
    }

    public CommerceItemVariant withIsFeatured(Optional<Boolean> isFeatured) {
        Utils.checkNotNull(isFeatured, "isFeatured");
        this.isFeatured = isFeatured;
        return this;
    }

    public CommerceItemVariant withIsVisible(boolean isVisible) {
        Utils.checkNotNull(isVisible, "isVisible");
        this.isVisible = Optional.ofNullable(isVisible);
        return this;
    }

    public CommerceItemVariant withIsVisible(Optional<Boolean> isVisible) {
        Utils.checkNotNull(isVisible, "isVisible");
        this.isVisible = isVisible;
        return this;
    }

    public CommerceItemVariant withLength(double length) {
        Utils.checkNotNull(length, "length");
        this.length = Optional.ofNullable(length);
        return this;
    }

    public CommerceItemVariant withLength(Optional<Double> length) {
        Utils.checkNotNull(length, "length");
        this.length = length;
        return this;
    }

    public CommerceItemVariant withMedia(List<CommerceItemMedia> media) {
        Utils.checkNotNull(media, "media");
        this.media = Optional.ofNullable(media);
        return this;
    }

    public CommerceItemVariant withMedia(Optional<? extends List<CommerceItemMedia>> media) {
        Utils.checkNotNull(media, "media");
        this.media = media;
        return this;
    }

    public CommerceItemVariant withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public CommerceItemVariant withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CommerceItemVariant withOptions(List<CommerceItemOption> options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    public CommerceItemVariant withOptions(Optional<? extends List<CommerceItemOption>> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    public CommerceItemVariant withPrices(List<CommerceItemPrice> prices) {
        Utils.checkNotNull(prices, "prices");
        this.prices = Optional.ofNullable(prices);
        return this;
    }

    public CommerceItemVariant withPrices(Optional<? extends List<CommerceItemPrice>> prices) {
        Utils.checkNotNull(prices, "prices");
        this.prices = prices;
        return this;
    }

    public CommerceItemVariant withPublicDescription(String publicDescription) {
        Utils.checkNotNull(publicDescription, "publicDescription");
        this.publicDescription = Optional.ofNullable(publicDescription);
        return this;
    }

    public CommerceItemVariant withPublicDescription(Optional<String> publicDescription) {
        Utils.checkNotNull(publicDescription, "publicDescription");
        this.publicDescription = publicDescription;
        return this;
    }

    public CommerceItemVariant withPublicName(String publicName) {
        Utils.checkNotNull(publicName, "publicName");
        this.publicName = Optional.ofNullable(publicName);
        return this;
    }

    public CommerceItemVariant withPublicName(Optional<String> publicName) {
        Utils.checkNotNull(publicName, "publicName");
        this.publicName = publicName;
        return this;
    }

    public CommerceItemVariant withRequiresShipping(boolean requiresShipping) {
        Utils.checkNotNull(requiresShipping, "requiresShipping");
        this.requiresShipping = Optional.ofNullable(requiresShipping);
        return this;
    }

    public CommerceItemVariant withRequiresShipping(Optional<Boolean> requiresShipping) {
        Utils.checkNotNull(requiresShipping, "requiresShipping");
        this.requiresShipping = requiresShipping;
        return this;
    }

    public CommerceItemVariant withSizeUnit(SizeUnit sizeUnit) {
        Utils.checkNotNull(sizeUnit, "sizeUnit");
        this.sizeUnit = Optional.ofNullable(sizeUnit);
        return this;
    }

    public CommerceItemVariant withSizeUnit(Optional<? extends SizeUnit> sizeUnit) {
        Utils.checkNotNull(sizeUnit, "sizeUnit");
        this.sizeUnit = sizeUnit;
        return this;
    }

    public CommerceItemVariant withSku(String sku) {
        Utils.checkNotNull(sku, "sku");
        this.sku = Optional.ofNullable(sku);
        return this;
    }

    public CommerceItemVariant withSku(Optional<String> sku) {
        Utils.checkNotNull(sku, "sku");
        this.sku = sku;
        return this;
    }

    public CommerceItemVariant withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public CommerceItemVariant withTags(Optional<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public CommerceItemVariant withTotalStock(double totalStock) {
        Utils.checkNotNull(totalStock, "totalStock");
        this.totalStock = Optional.ofNullable(totalStock);
        return this;
    }

    public CommerceItemVariant withTotalStock(Optional<Double> totalStock) {
        Utils.checkNotNull(totalStock, "totalStock");
        this.totalStock = totalStock;
        return this;
    }

    public CommerceItemVariant withWeight(double weight) {
        Utils.checkNotNull(weight, "weight");
        this.weight = Optional.ofNullable(weight);
        return this;
    }

    public CommerceItemVariant withWeight(Optional<Double> weight) {
        Utils.checkNotNull(weight, "weight");
        this.weight = weight;
        return this;
    }

    public CommerceItemVariant withWeightUnit(WeightUnit weightUnit) {
        Utils.checkNotNull(weightUnit, "weightUnit");
        this.weightUnit = Optional.ofNullable(weightUnit);
        return this;
    }

    public CommerceItemVariant withWeightUnit(Optional<? extends WeightUnit> weightUnit) {
        Utils.checkNotNull(weightUnit, "weightUnit");
        this.weightUnit = weightUnit;
        return this;
    }

    public CommerceItemVariant withWidth(double width) {
        Utils.checkNotNull(width, "width");
        this.width = Optional.ofNullable(width);
        return this;
    }

    public CommerceItemVariant withWidth(Optional<Double> width) {
        Utils.checkNotNull(width, "width");
        this.width = width;
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
        CommerceItemVariant other = (CommerceItemVariant) o;
        return 
            Objects.deepEquals(this.availableAt, other.availableAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.height, other.height) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.inventoryId, other.inventoryId) &&
            Objects.deepEquals(this.isActive, other.isActive) &&
            Objects.deepEquals(this.isFeatured, other.isFeatured) &&
            Objects.deepEquals(this.isVisible, other.isVisible) &&
            Objects.deepEquals(this.length, other.length) &&
            Objects.deepEquals(this.media, other.media) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.options, other.options) &&
            Objects.deepEquals(this.prices, other.prices) &&
            Objects.deepEquals(this.publicDescription, other.publicDescription) &&
            Objects.deepEquals(this.publicName, other.publicName) &&
            Objects.deepEquals(this.requiresShipping, other.requiresShipping) &&
            Objects.deepEquals(this.sizeUnit, other.sizeUnit) &&
            Objects.deepEquals(this.sku, other.sku) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.totalStock, other.totalStock) &&
            Objects.deepEquals(this.weight, other.weight) &&
            Objects.deepEquals(this.weightUnit, other.weightUnit) &&
            Objects.deepEquals(this.width, other.width);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            availableAt,
            description,
            height,
            id,
            inventoryId,
            isActive,
            isFeatured,
            isVisible,
            length,
            media,
            name,
            options,
            prices,
            publicDescription,
            publicName,
            requiresShipping,
            sizeUnit,
            sku,
            tags,
            totalStock,
            weight,
            weightUnit,
            width);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceItemVariant.class,
                "availableAt", availableAt,
                "description", description,
                "height", height,
                "id", id,
                "inventoryId", inventoryId,
                "isActive", isActive,
                "isFeatured", isFeatured,
                "isVisible", isVisible,
                "length", length,
                "media", media,
                "name", name,
                "options", options,
                "prices", prices,
                "publicDescription", publicDescription,
                "publicName", publicName,
                "requiresShipping", requiresShipping,
                "sizeUnit", sizeUnit,
                "sku", sku,
                "tags", tags,
                "totalStock", totalStock,
                "weight", weight,
                "weightUnit", weightUnit,
                "width", width);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> availableAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Double> height = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> inventoryId = Optional.empty();
 
        private Optional<Boolean> isActive = Optional.empty();
 
        private Optional<Boolean> isFeatured = Optional.empty();
 
        private Optional<Boolean> isVisible = Optional.empty();
 
        private Optional<Double> length = Optional.empty();
 
        private Optional<? extends List<CommerceItemMedia>> media = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends List<CommerceItemOption>> options = Optional.empty();
 
        private Optional<? extends List<CommerceItemPrice>> prices = Optional.empty();
 
        private Optional<String> publicDescription = Optional.empty();
 
        private Optional<String> publicName = Optional.empty();
 
        private Optional<Boolean> requiresShipping = Optional.empty();
 
        private Optional<? extends SizeUnit> sizeUnit = Optional.empty();
 
        private Optional<String> sku = Optional.empty();
 
        private Optional<? extends List<String>> tags = Optional.empty();
 
        private Optional<Double> totalStock = Optional.empty();
 
        private Optional<Double> weight = Optional.empty();
 
        private Optional<? extends WeightUnit> weightUnit = Optional.empty();
 
        private Optional<Double> width = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder availableAt(OffsetDateTime availableAt) {
            Utils.checkNotNull(availableAt, "availableAt");
            this.availableAt = Optional.ofNullable(availableAt);
            return this;
        }

        public Builder availableAt(Optional<OffsetDateTime> availableAt) {
            Utils.checkNotNull(availableAt, "availableAt");
            this.availableAt = availableAt;
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

        public Builder height(double height) {
            Utils.checkNotNull(height, "height");
            this.height = Optional.ofNullable(height);
            return this;
        }

        public Builder height(Optional<Double> height) {
            Utils.checkNotNull(height, "height");
            this.height = height;
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

        public Builder inventoryId(String inventoryId) {
            Utils.checkNotNull(inventoryId, "inventoryId");
            this.inventoryId = Optional.ofNullable(inventoryId);
            return this;
        }

        public Builder inventoryId(Optional<String> inventoryId) {
            Utils.checkNotNull(inventoryId, "inventoryId");
            this.inventoryId = inventoryId;
            return this;
        }

        public Builder isActive(boolean isActive) {
            Utils.checkNotNull(isActive, "isActive");
            this.isActive = Optional.ofNullable(isActive);
            return this;
        }

        public Builder isActive(Optional<Boolean> isActive) {
            Utils.checkNotNull(isActive, "isActive");
            this.isActive = isActive;
            return this;
        }

        public Builder isFeatured(boolean isFeatured) {
            Utils.checkNotNull(isFeatured, "isFeatured");
            this.isFeatured = Optional.ofNullable(isFeatured);
            return this;
        }

        public Builder isFeatured(Optional<Boolean> isFeatured) {
            Utils.checkNotNull(isFeatured, "isFeatured");
            this.isFeatured = isFeatured;
            return this;
        }

        public Builder isVisible(boolean isVisible) {
            Utils.checkNotNull(isVisible, "isVisible");
            this.isVisible = Optional.ofNullable(isVisible);
            return this;
        }

        public Builder isVisible(Optional<Boolean> isVisible) {
            Utils.checkNotNull(isVisible, "isVisible");
            this.isVisible = isVisible;
            return this;
        }

        public Builder length(double length) {
            Utils.checkNotNull(length, "length");
            this.length = Optional.ofNullable(length);
            return this;
        }

        public Builder length(Optional<Double> length) {
            Utils.checkNotNull(length, "length");
            this.length = length;
            return this;
        }

        public Builder media(List<CommerceItemMedia> media) {
            Utils.checkNotNull(media, "media");
            this.media = Optional.ofNullable(media);
            return this;
        }

        public Builder media(Optional<? extends List<CommerceItemMedia>> media) {
            Utils.checkNotNull(media, "media");
            this.media = media;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder options(List<CommerceItemOption> options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        public Builder options(Optional<? extends List<CommerceItemOption>> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }

        public Builder prices(List<CommerceItemPrice> prices) {
            Utils.checkNotNull(prices, "prices");
            this.prices = Optional.ofNullable(prices);
            return this;
        }

        public Builder prices(Optional<? extends List<CommerceItemPrice>> prices) {
            Utils.checkNotNull(prices, "prices");
            this.prices = prices;
            return this;
        }

        public Builder publicDescription(String publicDescription) {
            Utils.checkNotNull(publicDescription, "publicDescription");
            this.publicDescription = Optional.ofNullable(publicDescription);
            return this;
        }

        public Builder publicDescription(Optional<String> publicDescription) {
            Utils.checkNotNull(publicDescription, "publicDescription");
            this.publicDescription = publicDescription;
            return this;
        }

        public Builder publicName(String publicName) {
            Utils.checkNotNull(publicName, "publicName");
            this.publicName = Optional.ofNullable(publicName);
            return this;
        }

        public Builder publicName(Optional<String> publicName) {
            Utils.checkNotNull(publicName, "publicName");
            this.publicName = publicName;
            return this;
        }

        public Builder requiresShipping(boolean requiresShipping) {
            Utils.checkNotNull(requiresShipping, "requiresShipping");
            this.requiresShipping = Optional.ofNullable(requiresShipping);
            return this;
        }

        public Builder requiresShipping(Optional<Boolean> requiresShipping) {
            Utils.checkNotNull(requiresShipping, "requiresShipping");
            this.requiresShipping = requiresShipping;
            return this;
        }

        public Builder sizeUnit(SizeUnit sizeUnit) {
            Utils.checkNotNull(sizeUnit, "sizeUnit");
            this.sizeUnit = Optional.ofNullable(sizeUnit);
            return this;
        }

        public Builder sizeUnit(Optional<? extends SizeUnit> sizeUnit) {
            Utils.checkNotNull(sizeUnit, "sizeUnit");
            this.sizeUnit = sizeUnit;
            return this;
        }

        public Builder sku(String sku) {
            Utils.checkNotNull(sku, "sku");
            this.sku = Optional.ofNullable(sku);
            return this;
        }

        public Builder sku(Optional<String> sku) {
            Utils.checkNotNull(sku, "sku");
            this.sku = sku;
            return this;
        }

        public Builder tags(List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends List<String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        public Builder totalStock(double totalStock) {
            Utils.checkNotNull(totalStock, "totalStock");
            this.totalStock = Optional.ofNullable(totalStock);
            return this;
        }

        public Builder totalStock(Optional<Double> totalStock) {
            Utils.checkNotNull(totalStock, "totalStock");
            this.totalStock = totalStock;
            return this;
        }

        public Builder weight(double weight) {
            Utils.checkNotNull(weight, "weight");
            this.weight = Optional.ofNullable(weight);
            return this;
        }

        public Builder weight(Optional<Double> weight) {
            Utils.checkNotNull(weight, "weight");
            this.weight = weight;
            return this;
        }

        public Builder weightUnit(WeightUnit weightUnit) {
            Utils.checkNotNull(weightUnit, "weightUnit");
            this.weightUnit = Optional.ofNullable(weightUnit);
            return this;
        }

        public Builder weightUnit(Optional<? extends WeightUnit> weightUnit) {
            Utils.checkNotNull(weightUnit, "weightUnit");
            this.weightUnit = weightUnit;
            return this;
        }

        public Builder width(double width) {
            Utils.checkNotNull(width, "width");
            this.width = Optional.ofNullable(width);
            return this;
        }

        public Builder width(Optional<Double> width) {
            Utils.checkNotNull(width, "width");
            this.width = width;
            return this;
        }
        
        public CommerceItemVariant build() {
            return new CommerceItemVariant(
                availableAt,
                description,
                height,
                id,
                inventoryId,
                isActive,
                isFeatured,
                isVisible,
                length,
                media,
                name,
                options,
                prices,
                publicDescription,
                publicName,
                requiresShipping,
                sizeUnit,
                sku,
                tags,
                totalStock,
                weight,
                weightUnit,
                width);
        }
    }
}
