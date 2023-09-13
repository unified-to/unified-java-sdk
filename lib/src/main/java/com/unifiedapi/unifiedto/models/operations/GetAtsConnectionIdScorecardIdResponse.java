/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetAtsConnectionIdScorecardIdResponse {
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.AtsScorecard atsScorecard;

    public GetAtsConnectionIdScorecardIdResponse withAtsScorecard(com.unifiedapi.unifiedto.models.shared.AtsScorecard atsScorecard) {
        this.atsScorecard = atsScorecard;
        return this;
    }
    
    
    public String contentType;

    public GetAtsConnectionIdScorecardIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetAtsConnectionIdScorecardIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetAtsConnectionIdScorecardIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetAtsConnectionIdScorecardIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
