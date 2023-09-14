/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteCrmConnectionIdEventIdResponse {
    
    public String contentType;

    public DeleteCrmConnectionIdEventIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteCrmConnectionIdEventIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteCrmConnectionIdEventIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteCrmConnectionIdEventIdDefaultApplicationJSONString;

    public DeleteCrmConnectionIdEventIdResponse withDeleteCrmConnectionIdEventIdDefaultApplicationJSONString(String deleteCrmConnectionIdEventIdDefaultApplicationJSONString) {
        this.deleteCrmConnectionIdEventIdDefaultApplicationJSONString = deleteCrmConnectionIdEventIdDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteCrmConnectionIdEventIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}