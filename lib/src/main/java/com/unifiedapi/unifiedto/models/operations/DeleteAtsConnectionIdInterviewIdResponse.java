/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteAtsConnectionIdInterviewIdResponse {
    
    public String contentType;

    public DeleteAtsConnectionIdInterviewIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteAtsConnectionIdInterviewIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteAtsConnectionIdInterviewIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteAtsConnectionIdInterviewIdDefaultApplicationJSONString;

    public DeleteAtsConnectionIdInterviewIdResponse withDeleteAtsConnectionIdInterviewIdDefaultApplicationJSONString(String deleteAtsConnectionIdInterviewIdDefaultApplicationJSONString) {
        this.deleteAtsConnectionIdInterviewIdDefaultApplicationJSONString = deleteAtsConnectionIdInterviewIdDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteAtsConnectionIdInterviewIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
