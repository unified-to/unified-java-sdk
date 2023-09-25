/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteCrmConnectionIdFileIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public DeleteCrmConnectionIdFileIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public DeleteCrmConnectionIdFileIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteCrmConnectionIdFileIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteCrmConnectionIdFileIdDefaultApplicationJSONString;

    public DeleteCrmConnectionIdFileIdResponse withDeleteCrmConnectionIdFileIdDefaultApplicationJSONString(String deleteCrmConnectionIdFileIdDefaultApplicationJSONString) {
        this.deleteCrmConnectionIdFileIdDefaultApplicationJSONString = deleteCrmConnectionIdFileIdDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteCrmConnectionIdFileIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
