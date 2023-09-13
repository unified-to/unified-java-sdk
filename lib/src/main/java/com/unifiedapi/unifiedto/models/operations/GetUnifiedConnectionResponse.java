/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetUnifiedConnectionResponse {
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.Connection[] connections;

    public GetUnifiedConnectionResponse withConnections(com.unifiedapi.unifiedto.models.shared.Connection[] connections) {
        this.connections = connections;
        return this;
    }
    
    
    public String contentType;

    public GetUnifiedConnectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetUnifiedConnectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetUnifiedConnectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetUnifiedConnectionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
