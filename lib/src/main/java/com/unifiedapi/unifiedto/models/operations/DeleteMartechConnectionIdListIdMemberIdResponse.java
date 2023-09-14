/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteMartechConnectionIdListIdMemberIdResponse {
    
    public String contentType;

    public DeleteMartechConnectionIdListIdMemberIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteMartechConnectionIdListIdMemberIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteMartechConnectionIdListIdMemberIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String deleteMartechConnectionIdListIdMemberIdDefaultApplicationJSONString;

    public DeleteMartechConnectionIdListIdMemberIdResponse withDeleteMartechConnectionIdListIdMemberIdDefaultApplicationJSONString(String deleteMartechConnectionIdListIdMemberIdDefaultApplicationJSONString) {
        this.deleteMartechConnectionIdListIdMemberIdDefaultApplicationJSONString = deleteMartechConnectionIdListIdMemberIdDefaultApplicationJSONString;
        return this;
    }
    
    public DeleteMartechConnectionIdListIdMemberIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}