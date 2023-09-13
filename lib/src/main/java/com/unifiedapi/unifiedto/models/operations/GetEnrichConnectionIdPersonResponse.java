/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetEnrichConnectionIdPersonResponse {
    
    public String contentType;

    public GetEnrichConnectionIdPersonResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.EnrichPerson enrichPerson;

    public GetEnrichConnectionIdPersonResponse withEnrichPerson(com.unifiedapi.unifiedto.models.shared.EnrichPerson enrichPerson) {
        this.enrichPerson = enrichPerson;
        return this;
    }
    
    
    public Integer statusCode;

    public GetEnrichConnectionIdPersonResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetEnrichConnectionIdPersonResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetEnrichConnectionIdPersonResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
