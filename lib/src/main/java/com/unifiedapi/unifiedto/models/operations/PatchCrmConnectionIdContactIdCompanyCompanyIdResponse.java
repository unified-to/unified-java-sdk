/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PatchCrmConnectionIdContactIdCompanyCompanyIdResponse {
    
    public String contentType;

    public PatchCrmConnectionIdContactIdCompanyCompanyIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmContact crmContact;

    public PatchCrmConnectionIdContactIdCompanyCompanyIdResponse withCrmContact(com.unifiedapi.unifiedto.models.shared.CrmContact crmContact) {
        this.crmContact = crmContact;
        return this;
    }
    
    
    public Integer statusCode;

    public PatchCrmConnectionIdContactIdCompanyCompanyIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PatchCrmConnectionIdContactIdCompanyCompanyIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PatchCrmConnectionIdContactIdCompanyCompanyIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
