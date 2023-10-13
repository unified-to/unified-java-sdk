/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RemoveUnifiedWebhookResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public RemoveUnifiedWebhookResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public RemoveUnifiedWebhookResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public RemoveUnifiedWebhookResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String removeUnifiedWebhookDefaultApplicationJSONString;

    public RemoveUnifiedWebhookResponse withRemoveUnifiedWebhookDefaultApplicationJSONString(String removeUnifiedWebhookDefaultApplicationJSONString) {
        this.removeUnifiedWebhookDefaultApplicationJSONString = removeUnifiedWebhookDefaultApplicationJSONString;
        return this;
    }
    
    public RemoveUnifiedWebhookResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
