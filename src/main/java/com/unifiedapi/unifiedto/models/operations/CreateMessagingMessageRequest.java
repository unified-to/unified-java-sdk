/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.MessagingMessage;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateMessagingMessageRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends MessagingMessage> messagingMessage;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateMessagingMessageRequest(
            Optional<? extends MessagingMessage> messagingMessage,
            String connectionId) {
        Utils.checkNotNull(messagingMessage, "messagingMessage");
        Utils.checkNotNull(connectionId, "connectionId");
        this.messagingMessage = messagingMessage;
        this.connectionId = connectionId;
    }
    
    public CreateMessagingMessageRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MessagingMessage> messagingMessage() {
        return (Optional<MessagingMessage>) messagingMessage;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateMessagingMessageRequest withMessagingMessage(MessagingMessage messagingMessage) {
        Utils.checkNotNull(messagingMessage, "messagingMessage");
        this.messagingMessage = Optional.ofNullable(messagingMessage);
        return this;
    }

    public CreateMessagingMessageRequest withMessagingMessage(Optional<? extends MessagingMessage> messagingMessage) {
        Utils.checkNotNull(messagingMessage, "messagingMessage");
        this.messagingMessage = messagingMessage;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateMessagingMessageRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessagingMessageRequest other = (CreateMessagingMessageRequest) o;
        return 
            Objects.deepEquals(this.messagingMessage, other.messagingMessage) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            messagingMessage,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateMessagingMessageRequest.class,
                "messagingMessage", messagingMessage,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends MessagingMessage> messagingMessage = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder messagingMessage(MessagingMessage messagingMessage) {
            Utils.checkNotNull(messagingMessage, "messagingMessage");
            this.messagingMessage = Optional.ofNullable(messagingMessage);
            return this;
        }

        public Builder messagingMessage(Optional<? extends MessagingMessage> messagingMessage) {
            Utils.checkNotNull(messagingMessage, "messagingMessage");
            this.messagingMessage = messagingMessage;
            return this;
        }

        /**
         * ID of the connection
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }
        
        public CreateMessagingMessageRequest build() {
            return new CreateMessagingMessageRequest(
                messagingMessage,
                connectionId);
        }
    }
}

