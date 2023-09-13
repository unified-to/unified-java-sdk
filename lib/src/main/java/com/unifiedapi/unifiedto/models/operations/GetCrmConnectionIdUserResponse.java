/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetCrmConnectionIdUserResponse {
    
    public String contentType;

    public GetCrmConnectionIdUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmUser[] crmUsers;

    public GetCrmConnectionIdUserResponse withCrmUsers(com.unifiedapi.unifiedto.models.shared.CrmUser[] crmUsers) {
        this.crmUsers = crmUsers;
        return this;
    }
    
    
    public Integer statusCode;

    public GetCrmConnectionIdUserResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetCrmConnectionIdUserResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetCrmConnectionIdUserResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
