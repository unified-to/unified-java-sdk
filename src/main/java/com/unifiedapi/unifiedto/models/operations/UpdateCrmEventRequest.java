/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UpdateCrmEventRequest {

    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CrmEvent> crmEvent;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Event
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateCrmEventRequest(
            Optional<? extends CrmEvent> crmEvent,
            String connectionId,
            String id) {
        Utils.checkNotNull(crmEvent, "crmEvent");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.crmEvent = crmEvent;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public UpdateCrmEventRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CrmEvent> crmEvent() {
        return (Optional<CrmEvent>) crmEvent;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Event
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    public UpdateCrmEventRequest withCrmEvent(CrmEvent crmEvent) {
        Utils.checkNotNull(crmEvent, "crmEvent");
        this.crmEvent = Optional.ofNullable(crmEvent);
        return this;
    }

    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    public UpdateCrmEventRequest withCrmEvent(Optional<? extends CrmEvent> crmEvent) {
        Utils.checkNotNull(crmEvent, "crmEvent");
        this.crmEvent = crmEvent;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateCrmEventRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Event
     */
    public UpdateCrmEventRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        UpdateCrmEventRequest other = (UpdateCrmEventRequest) o;
        return 
            Objects.deepEquals(this.crmEvent, other.crmEvent) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            crmEvent,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCrmEventRequest.class,
                "crmEvent", crmEvent,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends CrmEvent> crmEvent = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
         */
        public Builder crmEvent(CrmEvent crmEvent) {
            Utils.checkNotNull(crmEvent, "crmEvent");
            this.crmEvent = Optional.ofNullable(crmEvent);
            return this;
        }

        /**
         * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
         */
        public Builder crmEvent(Optional<? extends CrmEvent> crmEvent) {
            Utils.checkNotNull(crmEvent, "crmEvent");
            this.crmEvent = crmEvent;
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
         * ID of the Event
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateCrmEventRequest build() {
            return new UpdateCrmEventRequest(
                crmEvent,
                connectionId,
                id);
        }
    }
}

