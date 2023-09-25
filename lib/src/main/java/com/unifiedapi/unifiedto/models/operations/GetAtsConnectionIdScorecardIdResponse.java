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
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetAtsConnectionIdScorecardIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetAtsConnectionIdScorecardIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
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
