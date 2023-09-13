/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PostHrisConnectionIdGroupRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.HrisGroup hrisGroup;

    public PostHrisConnectionIdGroupRequest withHrisGroup(com.unifiedapi.unifiedto.models.shared.HrisGroup hrisGroup) {
        this.hrisGroup = hrisGroup;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PostHrisConnectionIdGroupRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public PostHrisConnectionIdGroupRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
