/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class UpdatePaymentLinkResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public UpdatePaymentLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.PaymentLink paymentLink;

    public UpdatePaymentLinkResponse withPaymentLink(com.unifiedapi.unifiedto.models.shared.PaymentLink paymentLink) {
        this.paymentLink = paymentLink;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public UpdatePaymentLinkResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public UpdatePaymentLinkResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public UpdatePaymentLinkResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
