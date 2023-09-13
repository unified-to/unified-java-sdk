/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostCrmConnectionIdDealResponse {
    
    public String contentType;

    public PostCrmConnectionIdDealResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmDeal crmDeal;

    public PostCrmConnectionIdDealResponse withCrmDeal(com.unifiedapi.unifiedto.models.shared.CrmDeal crmDeal) {
        this.crmDeal = crmDeal;
        return this;
    }
    
    
    public Integer statusCode;

    public PostCrmConnectionIdDealResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostCrmConnectionIdDealResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostCrmConnectionIdDealResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
