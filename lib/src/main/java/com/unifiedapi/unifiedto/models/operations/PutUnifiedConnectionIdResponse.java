/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PutUnifiedConnectionIdResponse {
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.Connection connection;

    public PutUnifiedConnectionIdResponse withConnection(com.unifiedapi.unifiedto.models.shared.Connection connection) {
        this.connection = connection;
        return this;
    }
    
    
    public String contentType;

    public PutUnifiedConnectionIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public PutUnifiedConnectionIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PutUnifiedConnectionIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PutUnifiedConnectionIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}