/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostMartechConnectionIdListIdMemberResponse {
    
    public String contentType;

    public PostMartechConnectionIdListIdMemberResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember;

    public PostMartechConnectionIdListIdMemberResponse withMarketingMember(com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember) {
        this.marketingMember = marketingMember;
        return this;
    }
    
    
    public Integer statusCode;

    public PostMartechConnectionIdListIdMemberResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostMartechConnectionIdListIdMemberResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostMartechConnectionIdListIdMemberResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
