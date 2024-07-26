/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateTaskProjectRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.TaskProject taskProject;

    public CreateTaskProjectRequest withTaskProject(com.unifiedapi.unifiedto.models.shared.TaskProject taskProject) {
        this.taskProject = taskProject;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateTaskProjectRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateTaskProjectRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
