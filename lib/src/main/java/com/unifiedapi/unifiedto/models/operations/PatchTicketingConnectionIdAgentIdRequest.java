/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PatchTicketingConnectionIdAgentIdRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.TicketingAgent ticketingAgent;

    public PatchTicketingConnectionIdAgentIdRequest withTicketingAgent(com.unifiedapi.unifiedto.models.shared.TicketingAgent ticketingAgent) {
        this.ticketingAgent = ticketingAgent;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PatchTicketingConnectionIdAgentIdRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Agent
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PatchTicketingConnectionIdAgentIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PatchTicketingConnectionIdAgentIdRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}
