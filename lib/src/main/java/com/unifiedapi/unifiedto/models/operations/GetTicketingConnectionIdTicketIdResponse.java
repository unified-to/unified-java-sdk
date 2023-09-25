/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetTicketingConnectionIdTicketIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetTicketingConnectionIdTicketIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetTicketingConnectionIdTicketIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetTicketingConnectionIdTicketIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.TicketingTicket ticketingTicket;

    public GetTicketingConnectionIdTicketIdResponse withTicketingTicket(com.unifiedapi.unifiedto.models.shared.TicketingTicket ticketingTicket) {
        this.ticketingTicket = ticketingTicket;
        return this;
    }
    
    public GetTicketingConnectionIdTicketIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
