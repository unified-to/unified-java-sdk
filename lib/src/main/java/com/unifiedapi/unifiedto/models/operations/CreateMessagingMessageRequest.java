/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateMessagingMessageRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.MessagingMessage messagingMessage;

    public CreateMessagingMessageRequest withMessagingMessage(com.unifiedapi.unifiedto.models.shared.MessagingMessage messagingMessage) {
        this.messagingMessage = messagingMessage;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateMessagingMessageRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateMessagingMessageRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}