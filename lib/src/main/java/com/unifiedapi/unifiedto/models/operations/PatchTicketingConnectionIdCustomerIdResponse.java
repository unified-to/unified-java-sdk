/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PatchTicketingConnectionIdCustomerIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PatchTicketingConnectionIdCustomerIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PatchTicketingConnectionIdCustomerIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PatchTicketingConnectionIdCustomerIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.TicketingCustomer ticketingCustomer;

    public PatchTicketingConnectionIdCustomerIdResponse withTicketingCustomer(com.unifiedapi.unifiedto.models.shared.TicketingCustomer ticketingCustomer) {
        this.ticketingCustomer = ticketingCustomer;
        return this;
    }
    
    public PatchTicketingConnectionIdCustomerIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
