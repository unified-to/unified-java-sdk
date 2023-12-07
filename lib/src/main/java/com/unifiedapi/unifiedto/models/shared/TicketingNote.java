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


public class TicketingNote {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("agent_id")
    public String agentId;

    public TicketingNote withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public TicketingNote withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    public String customerId;

    public TicketingNote withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public TicketingNote withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public TicketingNote withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyTicketingNoteRaw raw;

    public TicketingNote withRaw(PropertyTicketingNoteRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ticket_id")
    public String ticketId;

    public TicketingNote withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;

    public TicketingNote withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public TicketingNote(){}
}
