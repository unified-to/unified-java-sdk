/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PutCrmConnectionIdEventIdContactContactIdRequest {
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PutCrmConnectionIdEventIdContactContactIdRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the contact
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=contact_id")
    public String contactId;

    public PutCrmConnectionIdEventIdContactContactIdRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    
    /**
     * ID of the Event
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PutCrmConnectionIdEventIdContactContactIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PutCrmConnectionIdEventIdContactContactIdRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("contact_id") String contactId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.contactId = contactId;
        this.id = id;
  }
}
