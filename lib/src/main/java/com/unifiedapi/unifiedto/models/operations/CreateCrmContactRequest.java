/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateCrmContactRequest {
    /**
     * A contact represents a person that optionally is associated with a deal and/or a company
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.CrmContact crmContact;

    public CreateCrmContactRequest withCrmContact(com.unifiedapi.unifiedto.models.shared.CrmContact crmContact) {
        this.crmContact = crmContact;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateCrmContactRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateCrmContactRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
