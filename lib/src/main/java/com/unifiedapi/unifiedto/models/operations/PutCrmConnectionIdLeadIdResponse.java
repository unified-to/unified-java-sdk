/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PutCrmConnectionIdLeadIdResponse {
    
    public String contentType;

    public PutCrmConnectionIdLeadIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmLead crmLead;

    public PutCrmConnectionIdLeadIdResponse withCrmLead(com.unifiedapi.unifiedto.models.shared.CrmLead crmLead) {
        this.crmLead = crmLead;
        return this;
    }
    
    
    public Integer statusCode;

    public PutCrmConnectionIdLeadIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PutCrmConnectionIdLeadIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PutCrmConnectionIdLeadIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
