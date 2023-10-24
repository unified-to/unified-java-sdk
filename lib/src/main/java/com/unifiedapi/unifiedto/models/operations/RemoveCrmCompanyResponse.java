/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RemoveCrmCompanyResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public RemoveCrmCompanyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public RemoveCrmCompanyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public RemoveCrmCompanyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful
     */
    
    public String removeCrmCompanyDefaultApplicationJSONString;

    public RemoveCrmCompanyResponse withRemoveCrmCompanyDefaultApplicationJSONString(String removeCrmCompanyDefaultApplicationJSONString) {
        this.removeCrmCompanyDefaultApplicationJSONString = removeCrmCompanyDefaultApplicationJSONString;
        return this;
    }
    
    public RemoveCrmCompanyResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}