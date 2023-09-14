/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostCrmConnectionIdEventResponse {
    
    public String contentType;

    public PostCrmConnectionIdEventResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmEvent crmEvent;

    public PostCrmConnectionIdEventResponse withCrmEvent(com.unifiedapi.unifiedto.models.shared.CrmEvent crmEvent) {
        this.crmEvent = crmEvent;
        return this;
    }
    
    
    public Integer statusCode;

    public PostCrmConnectionIdEventResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostCrmConnectionIdEventResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostCrmConnectionIdEventResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}