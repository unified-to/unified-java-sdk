/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PatchPassthroughRequest {
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PatchPassthroughRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=path")
    public String path;

    public PatchPassthroughRequest withPath(String path) {
        this.path = path;
        return this;
    }
    
    /**
     * integration-specific payload
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.Undefined undefined;

    public PatchPassthroughRequest withUndefined(com.unifiedapi.unifiedto.models.shared.Undefined undefined) {
        this.undefined = undefined;
        return this;
    }
    
    public PatchPassthroughRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("path") String path) {
        this.connectionId = connectionId;
        this.path = path;
  }
}
