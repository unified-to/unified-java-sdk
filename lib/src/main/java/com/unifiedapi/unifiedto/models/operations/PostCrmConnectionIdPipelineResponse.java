/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostCrmConnectionIdPipelineResponse {
    
    public String contentType;

    public PostCrmConnectionIdPipelineResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmPipeline crmPipeline;

    public PostCrmConnectionIdPipelineResponse withCrmPipeline(com.unifiedapi.unifiedto.models.shared.CrmPipeline crmPipeline) {
        this.crmPipeline = crmPipeline;
        return this;
    }
    
    
    public Integer statusCode;

    public PostCrmConnectionIdPipelineResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostCrmConnectionIdPipelineResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostCrmConnectionIdPipelineResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}