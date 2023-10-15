/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateTicketingTicketRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.TicketingTicket ticketingTicket;

    public CreateTicketingTicketRequest withTicketingTicket(com.unifiedapi.unifiedto.models.shared.TicketingTicket ticketingTicket) {
        this.ticketingTicket = ticketingTicket;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateTicketingTicketRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateTicketingTicketRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
