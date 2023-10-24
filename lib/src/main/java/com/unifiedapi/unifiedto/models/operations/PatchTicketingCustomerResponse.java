/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PatchTicketingCustomerResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PatchTicketingCustomerResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PatchTicketingCustomerResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PatchTicketingCustomerResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.TicketingCustomer ticketingCustomer;

    public PatchTicketingCustomerResponse withTicketingCustomer(com.unifiedapi.unifiedto.models.shared.TicketingCustomer ticketingCustomer) {
        this.ticketingCustomer = ticketingCustomer;
        return this;
    }
    
    public PatchTicketingCustomerResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}