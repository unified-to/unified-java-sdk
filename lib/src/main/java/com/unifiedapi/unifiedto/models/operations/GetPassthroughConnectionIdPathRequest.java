/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class GetPassthroughConnectionIdPathRequest {
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public GetPassthroughConnectionIdPathRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=path")
    public String path;

    public GetPassthroughConnectionIdPathRequest withPath(String path) {
        this.path = path;
        return this;
    }
    
    public GetPassthroughConnectionIdPathRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("path") String path) {
        this.connectionId = connectionId;
        this.path = path;
  }
}