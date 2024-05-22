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


public class MessagingChannel {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public MessagingChannel withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public MessagingChannel withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_subchannels")
    public Boolean hasSubchannels;

    public MessagingChannel withHasSubchannels(Boolean hasSubchannels) {
        this.hasSubchannels = hasSubchannels;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public MessagingChannel withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    public Boolean isActive;

    public MessagingChannel withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_private")
    public Boolean isPrivate;

    public MessagingChannel withIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("members")
    public MessagingMember[] members;

    public MessagingChannel withMembers(MessagingMember[] members) {
        this.members = members;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public MessagingChannel withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_channel_id")
    public String parentChannelId;

    public MessagingChannel withParentChannelId(String parentChannelId) {
        this.parentChannelId = parentChannelId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public MessagingChannel withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;

    public MessagingChannel withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    public String webUrl;

    public MessagingChannel withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    
    public MessagingChannel(@JsonProperty("name") String name) {
        this.name = name;
  }
}
