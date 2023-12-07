/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListAtsJobsResponse {
    /**
     * Successful
     */
    
    public com.unifiedapi.unifiedto.models.shared.AtsJob[] atsJobs;

    public ListAtsJobsResponse withAtsJobs(com.unifiedapi.unifiedto.models.shared.AtsJob[] atsJobs) {
        this.atsJobs = atsJobs;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ListAtsJobsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ListAtsJobsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ListAtsJobsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListAtsJobsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
