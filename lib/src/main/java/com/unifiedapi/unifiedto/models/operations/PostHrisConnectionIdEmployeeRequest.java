/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PostHrisConnectionIdEmployeeRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.HrisEmployee hrisEmployee;

    public PostHrisConnectionIdEmployeeRequest withHrisEmployee(com.unifiedapi.unifiedto.models.shared.HrisEmployee hrisEmployee) {
        this.hrisEmployee = hrisEmployee;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PostHrisConnectionIdEmployeeRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public PostHrisConnectionIdEmployeeRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}