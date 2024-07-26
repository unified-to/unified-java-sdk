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


public class KmsPage {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public KmsPage withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("download_url")
    public String downloadUrl;

    public KmsPage withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public KmsPage withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_active")
    public Boolean isActive;

    public KmsPage withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_page_id")
    public String parentPageId;

    public KmsPage withParentPageId(String parentPageId) {
        this.parentPageId = parentPageId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public KmsPage withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonProperty("space_id")
    public String spaceId;

    public KmsPage withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    
    @JsonProperty("title")
    public String title;

    public KmsPage withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonProperty("type")
    public KmsPageType type;

    public KmsPage withType(KmsPageType type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public KmsPage withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    public String userId;

    public KmsPage withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public KmsPage(@JsonProperty("download_url") String downloadUrl, @JsonProperty("id") String id, @JsonProperty("space_id") String spaceId, @JsonProperty("title") String title, @JsonProperty("type") KmsPageType type) {
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.spaceId = spaceId;
        this.title = title;
        this.type = type;
  }
}
