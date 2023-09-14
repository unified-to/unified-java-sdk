/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetCrmConnectionIdCompanyResponse {
    
    public String contentType;

    public GetCrmConnectionIdCompanyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmCompany[] crmCompanies;

    public GetCrmConnectionIdCompanyResponse withCrmCompanies(com.unifiedapi.unifiedto.models.shared.CrmCompany[] crmCompanies) {
        this.crmCompanies = crmCompanies;
        return this;
    }
    
    
    public Integer statusCode;

    public GetCrmConnectionIdCompanyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetCrmConnectionIdCompanyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetCrmConnectionIdCompanyResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}