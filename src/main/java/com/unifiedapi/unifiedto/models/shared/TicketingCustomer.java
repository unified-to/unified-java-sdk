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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class TicketingCustomer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    private Optional<? extends List<TicketingEmail>> emails;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<String>> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    private Optional<? extends List<TicketingTelephone>> telephones;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public TicketingCustomer(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("emails") Optional<? extends List<TicketingEmail>> emails,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("tags") Optional<? extends List<String>> tags,
            @JsonProperty("telephones") Optional<? extends List<TicketingTelephone>> telephones,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(telephones, "telephones");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.createdAt = createdAt;
        this.emails = emails;
        this.id = id;
        this.name = name;
        this.raw = raw;
        this.tags = tags;
        this.telephones = telephones;
        this.updatedAt = updatedAt;
    }
    
    public TicketingCustomer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TicketingEmail>> emails() {
        return (Optional<List<TicketingEmail>>) emails;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> tags() {
        return (Optional<List<String>>) tags;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TicketingTelephone>> telephones() {
        return (Optional<List<TicketingTelephone>>) telephones;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TicketingCustomer withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public TicketingCustomer withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TicketingCustomer withEmails(List<TicketingEmail> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = Optional.ofNullable(emails);
        return this;
    }

    public TicketingCustomer withEmails(Optional<? extends List<TicketingEmail>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    public TicketingCustomer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public TicketingCustomer withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TicketingCustomer withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public TicketingCustomer withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public TicketingCustomer withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public TicketingCustomer withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public TicketingCustomer withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public TicketingCustomer withTags(Optional<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public TicketingCustomer withTelephones(List<TicketingTelephone> telephones) {
        Utils.checkNotNull(telephones, "telephones");
        this.telephones = Optional.ofNullable(telephones);
        return this;
    }

    public TicketingCustomer withTelephones(Optional<? extends List<TicketingTelephone>> telephones) {
        Utils.checkNotNull(telephones, "telephones");
        this.telephones = telephones;
        return this;
    }

    public TicketingCustomer withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public TicketingCustomer withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        TicketingCustomer other = (TicketingCustomer) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.emails, other.emails) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.telephones, other.telephones) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            emails,
            id,
            name,
            raw,
            tags,
            telephones,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TicketingCustomer.class,
                "createdAt", createdAt,
                "emails", emails,
                "id", id,
                "name", name,
                "raw", raw,
                "tags", tags,
                "telephones", telephones,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends List<TicketingEmail>> emails = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<? extends List<String>> tags = Optional.empty();
 
        private Optional<? extends List<TicketingTelephone>> telephones = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
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

        public Builder emails(List<TicketingEmail> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = Optional.ofNullable(emails);
            return this;
        }

        public Builder emails(Optional<? extends List<TicketingEmail>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
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

        public Builder telephones(List<TicketingTelephone> telephones) {
            Utils.checkNotNull(telephones, "telephones");
            this.telephones = Optional.ofNullable(telephones);
            return this;
        }

        public Builder telephones(Optional<? extends List<TicketingTelephone>> telephones) {
            Utils.checkNotNull(telephones, "telephones");
            this.telephones = telephones;
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
        
        public TicketingCustomer build() {
            return new TicketingCustomer(
                createdAt,
                emails,
                id,
                name,
                raw,
                tags,
                telephones,
                updatedAt);
        }
    }
}
