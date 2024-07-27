/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateUcContactRequest {
    /**
     * A contact represents a person that optionally is associated with a call
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.UcContact ucContact;

    public CreateUcContactRequest withUcContact(com.unifiedapi.unifiedto.models.shared.UcContact ucContact) {
        this.ucContact = ucContact;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateUcContactRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateUcContactRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
