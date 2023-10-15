/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateAtsCandidateRequest {
    /**
     * A candidate looking for work
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.AtsCandidate atsCandidate;

    public CreateAtsCandidateRequest withAtsCandidate(com.unifiedapi.unifiedto.models.shared.AtsCandidate atsCandidate) {
        this.atsCandidate = atsCandidate;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateAtsCandidateRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateAtsCandidateRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
