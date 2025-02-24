/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateCrmContactRequest {

    /**
     * A contact represents a person that optionally is associated with a deal and/or a company
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private CrmContact crmContact;

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
    public CreateCrmContactRequest(
            CrmContact crmContact,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(crmContact, "crmContact");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.crmContact = crmContact;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateCrmContactRequest(
            CrmContact crmContact,
            String connectionId) {
        this(crmContact, connectionId, Optional.empty());
    }

    /**
     * A contact represents a person that optionally is associated with a deal and/or a company
     */
    @JsonIgnore
    public CrmContact crmContact() {
        return crmContact;
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

    /**
     * A contact represents a person that optionally is associated with a deal and/or a company
     */
    public CreateCrmContactRequest withCrmContact(CrmContact crmContact) {
        Utils.checkNotNull(crmContact, "crmContact");
        this.crmContact = crmContact;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateCrmContactRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCrmContactRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCrmContactRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateCrmContactRequest other = (CreateCrmContactRequest) o;
        return 
            Objects.deepEquals(this.crmContact, other.crmContact) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            crmContact,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCrmContactRequest.class,
                "crmContact", crmContact,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private CrmContact crmContact;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A contact represents a person that optionally is associated with a deal and/or a company
         */
        public Builder crmContact(CrmContact crmContact) {
            Utils.checkNotNull(crmContact, "crmContact");
            this.crmContact = crmContact;
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
        
        public CreateCrmContactRequest build() {
            return new CreateCrmContactRequest(
                crmContact,
                connectionId,
                fields);
        }
    }
}

