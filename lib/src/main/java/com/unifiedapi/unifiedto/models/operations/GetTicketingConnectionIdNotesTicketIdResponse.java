/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetTicketingConnectionIdNotesTicketIdResponse {
    
    public String contentType;

    public GetTicketingConnectionIdNotesTicketIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetTicketingConnectionIdNotesTicketIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetTicketingConnectionIdNotesTicketIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.TicketingNote[] ticketingNotes;

    public GetTicketingConnectionIdNotesTicketIdResponse withTicketingNotes(com.unifiedapi.unifiedto.models.shared.TicketingNote[] ticketingNotes) {
        this.ticketingNotes = ticketingNotes;
        return this;
    }
    
    public GetTicketingConnectionIdNotesTicketIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}