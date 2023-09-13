/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse {
    
    public String contentType;

    public GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String getUnifiedIntegrationLoginWorkspaceIdIntegrationType200ApplicationJSONString;

    public GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse withGetUnifiedIntegrationLoginWorkspaceIdIntegrationType200ApplicationJSONString(String getUnifiedIntegrationLoginWorkspaceIdIntegrationType200ApplicationJSONString) {
        this.getUnifiedIntegrationLoginWorkspaceIdIntegrationType200ApplicationJSONString = getUnifiedIntegrationLoginWorkspaceIdIntegrationType200ApplicationJSONString;
        return this;
    }
    
    public GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
