/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetUnifiedIntegrationWorkspaceWorkspaceIdResponse {
    
    public String contentType;

    public GetUnifiedIntegrationWorkspaceWorkspaceIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.Integration[] integrations;

    public GetUnifiedIntegrationWorkspaceWorkspaceIdResponse withIntegrations(com.unifiedapi.unifiedto.models.shared.Integration[] integrations) {
        this.integrations = integrations;
        return this;
    }
    
    
    public Integer statusCode;

    public GetUnifiedIntegrationWorkspaceWorkspaceIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetUnifiedIntegrationWorkspaceWorkspaceIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetUnifiedIntegrationWorkspaceWorkspaceIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
