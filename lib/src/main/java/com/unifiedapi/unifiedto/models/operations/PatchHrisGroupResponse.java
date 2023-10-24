/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PatchHrisGroupResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PatchHrisGroupResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.HrisGroup hrisGroup;

    public PatchHrisGroupResponse withHrisGroup(com.unifiedapi.unifiedto.models.shared.HrisGroup hrisGroup) {
        this.hrisGroup = hrisGroup;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PatchHrisGroupResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PatchHrisGroupResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PatchHrisGroupResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}