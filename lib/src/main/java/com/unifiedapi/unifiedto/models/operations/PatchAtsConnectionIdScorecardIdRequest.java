/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PatchAtsConnectionIdScorecardIdRequest {
    /**
     * A scorecard is feedback/assessment of a candidate's interview
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.AtsScorecard atsScorecard;

    public PatchAtsConnectionIdScorecardIdRequest withAtsScorecard(com.unifiedapi.unifiedto.models.shared.AtsScorecard atsScorecard) {
        this.atsScorecard = atsScorecard;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PatchAtsConnectionIdScorecardIdRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Document
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PatchAtsConnectionIdScorecardIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PatchAtsConnectionIdScorecardIdRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}
