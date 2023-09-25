/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteMartechConnectionIdListIdResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public DeleteMartechConnectionIdListIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public DeleteMartechConnectionIdListIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteMartechConnectionIdListIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteMartechConnectionIdListIdDefaultApplicationJSONString;

    public DeleteMartechConnectionIdListIdResponse withDeleteMartechConnectionIdListIdDefaultApplicationJSONString(String deleteMartechConnectionIdListIdDefaultApplicationJSONString) {
        this.deleteMartechConnectionIdListIdDefaultApplicationJSONString = deleteMartechConnectionIdListIdDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteMartechConnectionIdListIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
