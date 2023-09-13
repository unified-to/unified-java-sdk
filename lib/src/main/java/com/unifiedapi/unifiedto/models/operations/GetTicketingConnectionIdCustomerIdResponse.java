/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetTicketingConnectionIdCustomerIdResponse {
    
    public String contentType;

    public GetTicketingConnectionIdCustomerIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetTicketingConnectionIdCustomerIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetTicketingConnectionIdCustomerIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.TicketingCustomer ticketingCustomer;

    public GetTicketingConnectionIdCustomerIdResponse withTicketingCustomer(com.unifiedapi.unifiedto.models.shared.TicketingCustomer ticketingCustomer) {
        this.ticketingCustomer = ticketingCustomer;
        return this;
    }
    
    public GetTicketingConnectionIdCustomerIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
