/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetUnifiedApicallIdResponse {
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.ApiCall apiCall;

    public GetUnifiedApicallIdResponse withApiCall(com.unifiedapi.unifiedto.models.shared.ApiCall apiCall) {
        this.apiCall = apiCall;
        return this;
    }
    
    
    public String contentType;

    public GetUnifiedApicallIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetUnifiedApicallIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetUnifiedApicallIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetUnifiedApicallIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
