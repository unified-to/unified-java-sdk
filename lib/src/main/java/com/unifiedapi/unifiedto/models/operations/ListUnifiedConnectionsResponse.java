/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListUnifiedConnectionsResponse {
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.Connection[] connections;

    public ListUnifiedConnectionsResponse withConnections(com.unifiedapi.unifiedto.models.shared.Connection[] connections) {
        this.connections = connections;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ListUnifiedConnectionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ListUnifiedConnectionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ListUnifiedConnectionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListUnifiedConnectionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}