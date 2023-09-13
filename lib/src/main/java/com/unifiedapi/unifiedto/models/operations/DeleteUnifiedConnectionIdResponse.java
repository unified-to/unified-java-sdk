/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteUnifiedConnectionIdResponse {
    
    public String contentType;

    public DeleteUnifiedConnectionIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteUnifiedConnectionIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteUnifiedConnectionIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteUnifiedConnectionIdDefaultApplicationJSONString;

    public DeleteUnifiedConnectionIdResponse withDeleteUnifiedConnectionIdDefaultApplicationJSONString(String deleteUnifiedConnectionIdDefaultApplicationJSONString) {
        this.deleteUnifiedConnectionIdDefaultApplicationJSONString = deleteUnifiedConnectionIdDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteUnifiedConnectionIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
