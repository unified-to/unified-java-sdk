/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetMartechConnectionIdListResponse {
    
    public String contentType;

    public GetMartechConnectionIdListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.MarketingList[] marketingLists;

    public GetMartechConnectionIdListResponse withMarketingLists(com.unifiedapi.unifiedto.models.shared.MarketingList[] marketingLists) {
        this.marketingLists = marketingLists;
        return this;
    }
    
    
    public Integer statusCode;

    public GetMartechConnectionIdListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetMartechConnectionIdListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetMartechConnectionIdListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
