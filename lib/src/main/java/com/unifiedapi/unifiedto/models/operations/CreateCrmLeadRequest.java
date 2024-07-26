/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateCrmLeadRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.CrmLead crmLead;

    public CreateCrmLeadRequest withCrmLead(com.unifiedapi.unifiedto.models.shared.CrmLead crmLead) {
        this.crmLead = crmLead;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateCrmLeadRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateCrmLeadRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
