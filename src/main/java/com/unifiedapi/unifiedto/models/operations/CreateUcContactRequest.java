/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.UcContact;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateUcContactRequest {

    /**
     * A contact represents a person that optionally is associated with a call
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends UcContact> ucContact;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateUcContactRequest(
            Optional<? extends UcContact> ucContact,
            String connectionId) {
        Utils.checkNotNull(ucContact, "ucContact");
        Utils.checkNotNull(connectionId, "connectionId");
        this.ucContact = ucContact;
        this.connectionId = connectionId;
    }
    
    public CreateUcContactRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    /**
     * A contact represents a person that optionally is associated with a call
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UcContact> ucContact() {
        return (Optional<UcContact>) ucContact;
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

    /**
     * A contact represents a person that optionally is associated with a call
     */
    public CreateUcContactRequest withUcContact(UcContact ucContact) {
        Utils.checkNotNull(ucContact, "ucContact");
        this.ucContact = Optional.ofNullable(ucContact);
        return this;
    }

    /**
     * A contact represents a person that optionally is associated with a call
     */
    public CreateUcContactRequest withUcContact(Optional<? extends UcContact> ucContact) {
        Utils.checkNotNull(ucContact, "ucContact");
        this.ucContact = ucContact;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateUcContactRequest withConnectionId(String connectionId) {
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
        CreateUcContactRequest other = (CreateUcContactRequest) o;
        return 
            Objects.deepEquals(this.ucContact, other.ucContact) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ucContact,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateUcContactRequest.class,
                "ucContact", ucContact,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends UcContact> ucContact = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A contact represents a person that optionally is associated with a call
         */
        public Builder ucContact(UcContact ucContact) {
            Utils.checkNotNull(ucContact, "ucContact");
            this.ucContact = Optional.ofNullable(ucContact);
            return this;
        }

        /**
         * A contact represents a person that optionally is associated with a call
         */
        public Builder ucContact(Optional<? extends UcContact> ucContact) {
            Utils.checkNotNull(ucContact, "ucContact");
            this.ucContact = ucContact;
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
        
        public CreateUcContactRequest build() {
            return new CreateUcContactRequest(
                ucContact,
                connectionId);
        }
    }
}

