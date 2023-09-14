/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetCrmConnectionIdEventResponse {
    
    public String contentType;

    public GetCrmConnectionIdEventResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmEvent[] crmEvents;

    public GetCrmConnectionIdEventResponse withCrmEvents(com.unifiedapi.unifiedto.models.shared.CrmEvent[] crmEvents) {
        this.crmEvents = crmEvents;
        return this;
    }
    
    
    public Integer statusCode;

    public GetCrmConnectionIdEventResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetCrmConnectionIdEventResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetCrmConnectionIdEventResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}