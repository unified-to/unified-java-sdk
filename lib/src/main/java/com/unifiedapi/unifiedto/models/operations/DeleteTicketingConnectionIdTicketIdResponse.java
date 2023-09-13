/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteTicketingConnectionIdTicketIdResponse {
    
    public String contentType;

    public DeleteTicketingConnectionIdTicketIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteTicketingConnectionIdTicketIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteTicketingConnectionIdTicketIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteTicketingConnectionIdTicketIdDefaultApplicationJSONString;

    public DeleteTicketingConnectionIdTicketIdResponse withDeleteTicketingConnectionIdTicketIdDefaultApplicationJSONString(String deleteTicketingConnectionIdTicketIdDefaultApplicationJSONString) {
        this.deleteTicketingConnectionIdTicketIdDefaultApplicationJSONString = deleteTicketingConnectionIdTicketIdDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteTicketingConnectionIdTicketIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
