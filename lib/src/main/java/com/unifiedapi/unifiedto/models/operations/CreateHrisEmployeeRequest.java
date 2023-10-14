/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateHrisEmployeeRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.HrisEmployee hrisEmployee;

    public CreateHrisEmployeeRequest withHrisEmployee(com.unifiedapi.unifiedto.models.shared.HrisEmployee hrisEmployee) {
        this.hrisEmployee = hrisEmployee;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateHrisEmployeeRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String[] fields;

    public CreateHrisEmployeeRequest withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    
    public CreateHrisEmployeeRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
