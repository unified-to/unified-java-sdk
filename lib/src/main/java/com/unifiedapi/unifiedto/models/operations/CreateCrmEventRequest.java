/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateCrmEventRequest {
    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.CrmEvent crmEvent;

    public CreateCrmEventRequest withCrmEvent(com.unifiedapi.unifiedto.models.shared.CrmEvent crmEvent) {
        this.crmEvent = crmEvent;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateCrmEventRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateCrmEventRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}