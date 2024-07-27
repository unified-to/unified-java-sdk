/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

/**
 * CrmEvent - An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
 */

public class CrmEvent {
    /**
     * The call object, when type = call
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("call")
    public PropertyCrmEventCall call;

    public CrmEvent withCall(PropertyCrmEventCall call) {
        this.call = call;
        return this;
    }
    
    /**
     * An array of company IDs associated with this event
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_ids")
    public String[] companyIds;

    public CrmEvent withCompanyIds(String[] companyIds) {
        this.companyIds = companyIds;
        return this;
    }
    
    /**
     * An array of contact IDs associated with this event
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_ids")
    public String[] contactIds;

    public CrmEvent withContactIds(String[] contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public CrmEvent withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * An array of deal IDs associated with this event
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deal_ids")
    public String[] dealIds;

    public CrmEvent withDealIds(String[] dealIds) {
        this.dealIds = dealIds;
        return this;
    }
    
    /**
     * The email object, when type = email
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public PropertyCrmEventEmail email;

    public CrmEvent withEmail(PropertyCrmEventEmail email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CrmEvent withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lead_ids")
    public String[] leadIds;

    public CrmEvent withLeadIds(String[] leadIds) {
        this.leadIds = leadIds;
        return this;
    }
    
    /**
     * The meeting object, when type = meeting
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meeting")
    public PropertyCrmEventMeeting meeting;

    public CrmEvent withMeeting(PropertyCrmEventMeeting meeting) {
        this.meeting = meeting;
        return this;
    }
    
    /**
     * The note object, when type = note
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("note")
    public PropertyCrmEventNote note;

    public CrmEvent withNote(PropertyCrmEventNote note) {
        this.note = note;
        return this;
    }
    
    /**
     * The raw data returned by the integration for this event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public CrmEvent withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    /**
     * The task object, when type = task
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("task")
    public PropertyCrmEventTask task;

    public CrmEvent withTask(PropertyCrmEventTask task) {
        this.task = task;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CrmEventType type;

    public CrmEvent withType(CrmEventType type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public CrmEvent withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    public String userId;

    public CrmEvent withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public CrmEvent(){}
}
