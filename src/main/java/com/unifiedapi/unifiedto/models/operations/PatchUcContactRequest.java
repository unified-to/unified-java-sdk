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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PatchUcContactRequest {

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

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    /**
     * ID of the Contact
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchUcContactRequest(
            Optional<? extends UcContact> ucContact,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(ucContact, "ucContact");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.ucContact = ucContact;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public PatchUcContactRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
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

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    /**
     * ID of the Contact
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A contact represents a person that optionally is associated with a call
     */
    public PatchUcContactRequest withUcContact(UcContact ucContact) {
        Utils.checkNotNull(ucContact, "ucContact");
        this.ucContact = Optional.ofNullable(ucContact);
        return this;
    }

    /**
     * A contact represents a person that optionally is associated with a call
     */
    public PatchUcContactRequest withUcContact(Optional<? extends UcContact> ucContact) {
        Utils.checkNotNull(ucContact, "ucContact");
        this.ucContact = ucContact;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchUcContactRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchUcContactRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchUcContactRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Contact
     */
    public PatchUcContactRequest withId(String id) {
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
        PatchUcContactRequest other = (PatchUcContactRequest) o;
        return 
            Objects.deepEquals(this.ucContact, other.ucContact) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ucContact,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchUcContactRequest.class,
                "ucContact", ucContact,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends UcContact> ucContact = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
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

        /**
         * ID of the Contact
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchUcContactRequest build() {
            return new PatchUcContactRequest(
                ucContact,
                connectionId,
                fields,
                id);
        }
    }
}

