/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class UpdateHrisEmployeeRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.HrisEmployee hrisEmployee;

    public UpdateHrisEmployeeRequest withHrisEmployee(com.unifiedapi.unifiedto.models.shared.HrisEmployee hrisEmployee) {
        this.hrisEmployee = hrisEmployee;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public UpdateHrisEmployeeRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Employee
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public UpdateHrisEmployeeRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public UpdateHrisEmployeeRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}
