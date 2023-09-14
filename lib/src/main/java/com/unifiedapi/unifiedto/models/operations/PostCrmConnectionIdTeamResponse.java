/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostCrmConnectionIdTeamResponse {
    
    public String contentType;

    public PostCrmConnectionIdTeamResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.CrmTeam crmTeam;

    public PostCrmConnectionIdTeamResponse withCrmTeam(com.unifiedapi.unifiedto.models.shared.CrmTeam crmTeam) {
        this.crmTeam = crmTeam;
        return this;
    }
    
    
    public Integer statusCode;

    public PostCrmConnectionIdTeamResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostCrmConnectionIdTeamResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostCrmConnectionIdTeamResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}