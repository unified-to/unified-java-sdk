/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PutTicketingConnectionIdTicketIdRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.TicketingTicket ticketingTicket;

    public PutTicketingConnectionIdTicketIdRequest withTicketingTicket(com.unifiedapi.unifiedto.models.shared.TicketingTicket ticketingTicket) {
        this.ticketingTicket = ticketingTicket;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PutTicketingConnectionIdTicketIdRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Ticket
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PutTicketingConnectionIdTicketIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PutTicketingConnectionIdTicketIdRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}
