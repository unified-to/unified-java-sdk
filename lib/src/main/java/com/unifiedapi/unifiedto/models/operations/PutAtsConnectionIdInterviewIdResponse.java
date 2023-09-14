/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PutAtsConnectionIdInterviewIdResponse {
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.AtsInterview atsInterview;

    public PutAtsConnectionIdInterviewIdResponse withAtsInterview(com.unifiedapi.unifiedto.models.shared.AtsInterview atsInterview) {
        this.atsInterview = atsInterview;
        return this;
    }
    
    
    public String contentType;

    public PutAtsConnectionIdInterviewIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public PutAtsConnectionIdInterviewIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PutAtsConnectionIdInterviewIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PutAtsConnectionIdInterviewIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}