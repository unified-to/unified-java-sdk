/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RemoveCrmFileResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public RemoveCrmFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public RemoveCrmFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public RemoveCrmFileResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String removeCrmFileDefaultApplicationJSONString;

    public RemoveCrmFileResponse withRemoveCrmFileDefaultApplicationJSONString(String removeCrmFileDefaultApplicationJSONString) {
        this.removeCrmFileDefaultApplicationJSONString = removeCrmFileDefaultApplicationJSONString;
        return this;
    }
    
    public RemoveCrmFileResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}