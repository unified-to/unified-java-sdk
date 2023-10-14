/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateTicketingNoteRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.TicketingNote ticketingNote;

    public CreateTicketingNoteRequest withTicketingNote(com.unifiedapi.unifiedto.models.shared.TicketingNote ticketingNote) {
        this.ticketingNote = ticketingNote;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateTicketingNoteRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String[] fields;

    public CreateTicketingNoteRequest withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    
    /**
     * ID of the ticket
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ticket_id")
    public String ticketId;

    public CreateTicketingNoteRequest withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    
    public CreateTicketingNoteRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("ticket_id") String ticketId) {
        this.connectionId = connectionId;
        this.ticketId = ticketId;
  }
}
