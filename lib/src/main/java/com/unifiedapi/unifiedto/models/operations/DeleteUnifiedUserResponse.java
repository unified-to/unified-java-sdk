/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteUnifiedUserResponse {
    
    public String contentType;

    public DeleteUnifiedUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteUnifiedUserResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteUnifiedUserResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteUnifiedUserDefaultApplicationJSONString;

    public DeleteUnifiedUserResponse withDeleteUnifiedUserDefaultApplicationJSONString(String deleteUnifiedUserDefaultApplicationJSONString) {
        this.deleteUnifiedUserDefaultApplicationJSONString = deleteUnifiedUserDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteUnifiedUserResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
