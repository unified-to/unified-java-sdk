/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class HrisLocation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends PropertyHrisLocationAddress> address;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_identifier")
    private Optional<String> externalIdentifier;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    private Optional<Boolean> isActive;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_hq")
    private Optional<Boolean> isHq;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language_locale")
    private Optional<String> languageLocale;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private Optional<String> parentId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    private Optional<? extends List<HrisTelephone>> telephones;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    private Optional<String> timezone;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public HrisLocation(
            @JsonProperty("address") Optional<? extends PropertyHrisLocationAddress> address,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("external_identifier") Optional<String> externalIdentifier,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("is_active") Optional<Boolean> isActive,
            @JsonProperty("is_hq") Optional<Boolean> isHq,
            @JsonProperty("language_locale") Optional<String> languageLocale,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("parent_id") Optional<String> parentId,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("telephones") Optional<? extends List<HrisTelephone>> telephones,
            @JsonProperty("timezone") Optional<String> timezone,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(externalIdentifier, "externalIdentifier");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(isHq, "isHq");
        Utils.checkNotNull(languageLocale, "languageLocale");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(telephones, "telephones");
        Utils.checkNotNull(timezone, "timezone");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.address = address;
        this.createdAt = createdAt;
        this.currency = currency;
        this.description = description;
        this.externalIdentifier = externalIdentifier;
        this.id = id;
        this.isActive = isActive;
        this.isHq = isHq;
        this.languageLocale = languageLocale;
        this.name = name;
        this.parentId = parentId;
        this.raw = raw;
        this.telephones = telephones;
        this.timezone = timezone;
        this.updatedAt = updatedAt;
    }
    
    public HrisLocation() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyHrisLocationAddress> address() {
        return (Optional<PropertyHrisLocationAddress>) address;
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
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> externalIdentifier() {
        return externalIdentifier;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Boolean> isActive() {
        return isActive;
    }

    @JsonIgnore
    public Optional<Boolean> isHq() {
        return isHq;
    }

    @JsonIgnore
    public Optional<String> languageLocale() {
        return languageLocale;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> parentId() {
        return parentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<HrisTelephone>> telephones() {
        return (Optional<List<HrisTelephone>>) telephones;
    }

    @JsonIgnore
    public Optional<String> timezone() {
        return timezone;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }


    public HrisLocation withAddress(PropertyHrisLocationAddress address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }


    public HrisLocation withAddress(Optional<? extends PropertyHrisLocationAddress> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public HrisLocation withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public HrisLocation withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public HrisLocation withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }


    public HrisLocation withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public HrisLocation withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }


    public HrisLocation withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public HrisLocation withExternalIdentifier(String externalIdentifier) {
        Utils.checkNotNull(externalIdentifier, "externalIdentifier");
        this.externalIdentifier = Optional.ofNullable(externalIdentifier);
        return this;
    }


    public HrisLocation withExternalIdentifier(Optional<String> externalIdentifier) {
        Utils.checkNotNull(externalIdentifier, "externalIdentifier");
        this.externalIdentifier = externalIdentifier;
        return this;
    }

    public HrisLocation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public HrisLocation withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public HrisLocation withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = Optional.ofNullable(isActive);
        return this;
    }


    public HrisLocation withIsActive(Optional<Boolean> isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public HrisLocation withIsHq(boolean isHq) {
        Utils.checkNotNull(isHq, "isHq");
        this.isHq = Optional.ofNullable(isHq);
        return this;
    }


    public HrisLocation withIsHq(Optional<Boolean> isHq) {
        Utils.checkNotNull(isHq, "isHq");
        this.isHq = isHq;
        return this;
    }

    public HrisLocation withLanguageLocale(String languageLocale) {
        Utils.checkNotNull(languageLocale, "languageLocale");
        this.languageLocale = Optional.ofNullable(languageLocale);
        return this;
    }


    public HrisLocation withLanguageLocale(Optional<String> languageLocale) {
        Utils.checkNotNull(languageLocale, "languageLocale");
        this.languageLocale = languageLocale;
        return this;
    }

    public HrisLocation withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }


    public HrisLocation withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public HrisLocation withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = Optional.ofNullable(parentId);
        return this;
    }


    public HrisLocation withParentId(Optional<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public HrisLocation withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    public HrisLocation withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public HrisLocation withTelephones(List<HrisTelephone> telephones) {
        Utils.checkNotNull(telephones, "telephones");
        this.telephones = Optional.ofNullable(telephones);
        return this;
    }


    public HrisLocation withTelephones(Optional<? extends List<HrisTelephone>> telephones) {
        Utils.checkNotNull(telephones, "telephones");
        this.telephones = telephones;
        return this;
    }

    public HrisLocation withTimezone(String timezone) {
        Utils.checkNotNull(timezone, "timezone");
        this.timezone = Optional.ofNullable(timezone);
        return this;
    }


    public HrisLocation withTimezone(Optional<String> timezone) {
        Utils.checkNotNull(timezone, "timezone");
        this.timezone = timezone;
        return this;
    }

    public HrisLocation withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public HrisLocation withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        HrisLocation other = (HrisLocation) o;
        return 
            Utils.enhancedDeepEquals(this.address, other.address) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.currency, other.currency) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.externalIdentifier, other.externalIdentifier) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.isActive, other.isActive) &&
            Utils.enhancedDeepEquals(this.isHq, other.isHq) &&
            Utils.enhancedDeepEquals(this.languageLocale, other.languageLocale) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.parentId, other.parentId) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.telephones, other.telephones) &&
            Utils.enhancedDeepEquals(this.timezone, other.timezone) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            address, createdAt, currency,
            description, externalIdentifier, id,
            isActive, isHq, languageLocale,
            name, parentId, raw,
            telephones, timezone, updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisLocation.class,
                "address", address,
                "createdAt", createdAt,
                "currency", currency,
                "description", description,
                "externalIdentifier", externalIdentifier,
                "id", id,
                "isActive", isActive,
                "isHq", isHq,
                "languageLocale", languageLocale,
                "name", name,
                "parentId", parentId,
                "raw", raw,
                "telephones", telephones,
                "timezone", timezone,
                "updatedAt", updatedAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends PropertyHrisLocationAddress> address = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> currency = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> externalIdentifier = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<Boolean> isActive = Optional.empty();

        private Optional<Boolean> isHq = Optional.empty();

        private Optional<String> languageLocale = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> parentId = Optional.empty();

        private Optional<? extends Map<String, Object>> raw = Optional.empty();

        private Optional<? extends List<HrisTelephone>> telephones = Optional.empty();

        private Optional<String> timezone = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder address(PropertyHrisLocationAddress address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends PropertyHrisLocationAddress> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
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


        public Builder externalIdentifier(String externalIdentifier) {
            Utils.checkNotNull(externalIdentifier, "externalIdentifier");
            this.externalIdentifier = Optional.ofNullable(externalIdentifier);
            return this;
        }

        public Builder externalIdentifier(Optional<String> externalIdentifier) {
            Utils.checkNotNull(externalIdentifier, "externalIdentifier");
            this.externalIdentifier = externalIdentifier;
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


        public Builder isHq(boolean isHq) {
            Utils.checkNotNull(isHq, "isHq");
            this.isHq = Optional.ofNullable(isHq);
            return this;
        }

        public Builder isHq(Optional<Boolean> isHq) {
            Utils.checkNotNull(isHq, "isHq");
            this.isHq = isHq;
            return this;
        }


        public Builder languageLocale(String languageLocale) {
            Utils.checkNotNull(languageLocale, "languageLocale");
            this.languageLocale = Optional.ofNullable(languageLocale);
            return this;
        }

        public Builder languageLocale(Optional<String> languageLocale) {
            Utils.checkNotNull(languageLocale, "languageLocale");
            this.languageLocale = languageLocale;
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


        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = Optional.ofNullable(parentId);
            return this;
        }

        public Builder parentId(Optional<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
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


        public Builder telephones(List<HrisTelephone> telephones) {
            Utils.checkNotNull(telephones, "telephones");
            this.telephones = Optional.ofNullable(telephones);
            return this;
        }

        public Builder telephones(Optional<? extends List<HrisTelephone>> telephones) {
            Utils.checkNotNull(telephones, "telephones");
            this.telephones = telephones;
            return this;
        }


        public Builder timezone(String timezone) {
            Utils.checkNotNull(timezone, "timezone");
            this.timezone = Optional.ofNullable(timezone);
            return this;
        }

        public Builder timezone(Optional<String> timezone) {
            Utils.checkNotNull(timezone, "timezone");
            this.timezone = timezone;
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

        public HrisLocation build() {

            return new HrisLocation(
                address, createdAt, currency,
                description, externalIdentifier, id,
                isActive, isHq, languageLocale,
                name, parentId, raw,
                telephones, timezone, updatedAt);
        }

    }
}
