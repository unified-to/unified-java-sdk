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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class MessagingChannel {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_subchannels")
    private Optional<Boolean> hasSubchannels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    private Optional<Boolean> isActive;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_private")
    private Optional<Boolean> isPrivate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("members")
    private Optional<? extends List<MessagingMember>> members;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_channel_id")
    private Optional<String> parentChannelId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<String> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    private Optional<String> webUrl;

    @JsonCreator
    public MessagingChannel(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("has_subchannels") Optional<Boolean> hasSubchannels,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("is_active") Optional<Boolean> isActive,
            @JsonProperty("is_private") Optional<Boolean> isPrivate,
            @JsonProperty("members") Optional<? extends List<MessagingMember>> members,
            @JsonProperty("name") String name,
            @JsonProperty("parent_channel_id") Optional<String> parentChannelId,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("updated_at") Optional<String> updatedAt,
            @JsonProperty("web_url") Optional<String> webUrl) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(hasSubchannels, "hasSubchannels");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isActive, "isActive");
        Utils.checkNotNull(isPrivate, "isPrivate");
        Utils.checkNotNull(members, "members");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(parentChannelId, "parentChannelId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(webUrl, "webUrl");
        this.createdAt = createdAt;
        this.description = description;
        this.hasSubchannels = hasSubchannels;
        this.id = id;
        this.isActive = isActive;
        this.isPrivate = isPrivate;
        this.members = members;
        this.name = name;
        this.parentChannelId = parentChannelId;
        this.raw = raw;
        this.updatedAt = updatedAt;
        this.webUrl = webUrl;
    }
    
    public MessagingChannel(
            String name) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<Boolean> hasSubchannels() {
        return hasSubchannels;
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
    public Optional<Boolean> isPrivate() {
        return isPrivate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MessagingMember>> members() {
        return (Optional<List<MessagingMember>>) members;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> parentChannelId() {
        return parentChannelId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> webUrl() {
        return webUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MessagingChannel withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public MessagingChannel withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public MessagingChannel withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public MessagingChannel withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public MessagingChannel withHasSubchannels(boolean hasSubchannels) {
        Utils.checkNotNull(hasSubchannels, "hasSubchannels");
        this.hasSubchannels = Optional.ofNullable(hasSubchannels);
        return this;
    }

    public MessagingChannel withHasSubchannels(Optional<Boolean> hasSubchannels) {
        Utils.checkNotNull(hasSubchannels, "hasSubchannels");
        this.hasSubchannels = hasSubchannels;
        return this;
    }

    public MessagingChannel withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public MessagingChannel withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MessagingChannel withIsActive(boolean isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = Optional.ofNullable(isActive);
        return this;
    }

    public MessagingChannel withIsActive(Optional<Boolean> isActive) {
        Utils.checkNotNull(isActive, "isActive");
        this.isActive = isActive;
        return this;
    }

    public MessagingChannel withIsPrivate(boolean isPrivate) {
        Utils.checkNotNull(isPrivate, "isPrivate");
        this.isPrivate = Optional.ofNullable(isPrivate);
        return this;
    }

    public MessagingChannel withIsPrivate(Optional<Boolean> isPrivate) {
        Utils.checkNotNull(isPrivate, "isPrivate");
        this.isPrivate = isPrivate;
        return this;
    }

    public MessagingChannel withMembers(List<MessagingMember> members) {
        Utils.checkNotNull(members, "members");
        this.members = Optional.ofNullable(members);
        return this;
    }

    public MessagingChannel withMembers(Optional<? extends List<MessagingMember>> members) {
        Utils.checkNotNull(members, "members");
        this.members = members;
        return this;
    }

    public MessagingChannel withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public MessagingChannel withParentChannelId(String parentChannelId) {
        Utils.checkNotNull(parentChannelId, "parentChannelId");
        this.parentChannelId = Optional.ofNullable(parentChannelId);
        return this;
    }

    public MessagingChannel withParentChannelId(Optional<String> parentChannelId) {
        Utils.checkNotNull(parentChannelId, "parentChannelId");
        this.parentChannelId = parentChannelId;
        return this;
    }

    public MessagingChannel withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public MessagingChannel withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public MessagingChannel withUpdatedAt(String updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public MessagingChannel withUpdatedAt(Optional<String> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public MessagingChannel withWebUrl(String webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = Optional.ofNullable(webUrl);
        return this;
    }

    public MessagingChannel withWebUrl(Optional<String> webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = webUrl;
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
        MessagingChannel other = (MessagingChannel) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.hasSubchannels, other.hasSubchannels) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.isActive, other.isActive) &&
            Objects.deepEquals(this.isPrivate, other.isPrivate) &&
            Objects.deepEquals(this.members, other.members) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.parentChannelId, other.parentChannelId) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.webUrl, other.webUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            description,
            hasSubchannels,
            id,
            isActive,
            isPrivate,
            members,
            name,
            parentChannelId,
            raw,
            updatedAt,
            webUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessagingChannel.class,
                "createdAt", createdAt,
                "description", description,
                "hasSubchannels", hasSubchannels,
                "id", id,
                "isActive", isActive,
                "isPrivate", isPrivate,
                "members", members,
                "name", name,
                "parentChannelId", parentChannelId,
                "raw", raw,
                "updatedAt", updatedAt,
                "webUrl", webUrl);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Boolean> hasSubchannels = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Boolean> isActive = Optional.empty();
 
        private Optional<Boolean> isPrivate = Optional.empty();
 
        private Optional<? extends List<MessagingMember>> members = Optional.empty();
 
        private String name;
 
        private Optional<String> parentChannelId = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<String> updatedAt = Optional.empty();
 
        private Optional<String> webUrl = Optional.empty();  
        
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

        public Builder hasSubchannels(boolean hasSubchannels) {
            Utils.checkNotNull(hasSubchannels, "hasSubchannels");
            this.hasSubchannels = Optional.ofNullable(hasSubchannels);
            return this;
        }

        public Builder hasSubchannels(Optional<Boolean> hasSubchannels) {
            Utils.checkNotNull(hasSubchannels, "hasSubchannels");
            this.hasSubchannels = hasSubchannels;
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

        public Builder isPrivate(boolean isPrivate) {
            Utils.checkNotNull(isPrivate, "isPrivate");
            this.isPrivate = Optional.ofNullable(isPrivate);
            return this;
        }

        public Builder isPrivate(Optional<Boolean> isPrivate) {
            Utils.checkNotNull(isPrivate, "isPrivate");
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder members(List<MessagingMember> members) {
            Utils.checkNotNull(members, "members");
            this.members = Optional.ofNullable(members);
            return this;
        }

        public Builder members(Optional<? extends List<MessagingMember>> members) {
            Utils.checkNotNull(members, "members");
            this.members = members;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder parentChannelId(String parentChannelId) {
            Utils.checkNotNull(parentChannelId, "parentChannelId");
            this.parentChannelId = Optional.ofNullable(parentChannelId);
            return this;
        }

        public Builder parentChannelId(Optional<String> parentChannelId) {
            Utils.checkNotNull(parentChannelId, "parentChannelId");
            this.parentChannelId = parentChannelId;
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

        public Builder updatedAt(String updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<String> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder webUrl(String webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = Optional.ofNullable(webUrl);
            return this;
        }

        public Builder webUrl(Optional<String> webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = webUrl;
            return this;
        }
        
        public MessagingChannel build() {
            return new MessagingChannel(
                createdAt,
                description,
                hasSubchannels,
                id,
                isActive,
                isPrivate,
                members,
                name,
                parentChannelId,
                raw,
                updatedAt,
                webUrl);
        }
    }
}

