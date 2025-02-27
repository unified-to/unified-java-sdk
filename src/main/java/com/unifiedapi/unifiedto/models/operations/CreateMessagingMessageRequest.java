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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CreateMessagingMessageRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private MessagingMessage messagingMessage;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    @JsonCreator
    public CreateMessagingMessageRequest(
            MessagingMessage messagingMessage,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(messagingMessage, "messagingMessage");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.messagingMessage = messagingMessage;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateMessagingMessageRequest(
            MessagingMessage messagingMessage,
            String connectionId) {
        this(messagingMessage, connectionId, Optional.empty());
    }

    @JsonIgnore
    public MessagingMessage messagingMessage() {
        return messagingMessage;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateMessagingMessageRequest withMessagingMessage(MessagingMessage messagingMessage) {
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

    /**
     * Comma-delimited fields to return
     */
    public CreateMessagingMessageRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateMessagingMessageRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            messagingMessage,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateMessagingMessageRequest.class,
                "messagingMessage", messagingMessage,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private MessagingMessage messagingMessage;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder messagingMessage(MessagingMessage messagingMessage) {
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

        /**
         * Comma-delimited fields to return
         */
        public Builder fields(List<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * Comma-delimited fields to return
         */
        public Builder fields(Optional<? extends List<String>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }
        
        public CreateMessagingMessageRequest build() {
            return new CreateMessagingMessageRequest(
                messagingMessage,
                connectionId,
                fields);
        }
    }
}

