/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostUnifiedWebhookConnectionIdObjectResponse {
    
    public String contentType;

    public PostUnifiedWebhookConnectionIdObjectResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public PostUnifiedWebhookConnectionIdObjectResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostUnifiedWebhookConnectionIdObjectResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.Webhook webhook;

    public PostUnifiedWebhookConnectionIdObjectResponse withWebhook(com.unifiedapi.unifiedto.models.shared.Webhook webhook) {
        this.webhook = webhook;
        return this;
    }
    
    public PostUnifiedWebhookConnectionIdObjectResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
