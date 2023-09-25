/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PatchCrmConnectionIdUserIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PatchCrmConnectionIdUserIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmUser crmUser;

    public PatchCrmConnectionIdUserIdResponse withCrmUser(com.unifiedapi.unifiedto.models.shared.CrmUser crmUser) {
        this.crmUser = crmUser;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PatchCrmConnectionIdUserIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PatchCrmConnectionIdUserIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PatchCrmConnectionIdUserIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
