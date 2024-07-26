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


public class UcCall {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    public String contactId;

    public UcCall withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public UcCall withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_at")
    public OffsetDateTime endAt;

    public UcCall withEndAt(OffsetDateTime endAt) {
        this.endAt = endAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public UcCall withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The raw data returned by the integration for this call
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public UcCall withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_at")
    public OffsetDateTime startAt;

    public UcCall withStartAt(OffsetDateTime startAt) {
        this.startAt = startAt;
        return this;
    }
    
    /**
     * The telephone number called
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephone")
    public PropertyUcCallTelephone telephone;

    public UcCall withTelephone(PropertyUcCallTelephone telephone) {
        this.telephone = telephone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public UcCall withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    public String userId;

    public UcCall withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public UcCall(){}
}
