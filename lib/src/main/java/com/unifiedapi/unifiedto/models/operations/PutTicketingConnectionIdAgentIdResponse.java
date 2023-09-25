/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PutTicketingConnectionIdAgentIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PutTicketingConnectionIdAgentIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PutTicketingConnectionIdAgentIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PutTicketingConnectionIdAgentIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.TicketingAgent ticketingAgent;

    public PutTicketingConnectionIdAgentIdResponse withTicketingAgent(com.unifiedapi.unifiedto.models.shared.TicketingAgent ticketingAgent) {
        this.ticketingAgent = ticketingAgent;
        return this;
    }
    
    public PutTicketingConnectionIdAgentIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
