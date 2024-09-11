/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.HrisCompany;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PatchHrisCompanyRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends HrisCompany> hrisCompany;

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
     * ID of the Company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchHrisCompanyRequest(
            Optional<? extends HrisCompany> hrisCompany,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.hrisCompany = hrisCompany;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public PatchHrisCompanyRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisCompany> hrisCompany() {
        return (Optional<HrisCompany>) hrisCompany;
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
     * ID of the Company
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchHrisCompanyRequest withHrisCompany(HrisCompany hrisCompany) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        this.hrisCompany = Optional.ofNullable(hrisCompany);
        return this;
    }

    public PatchHrisCompanyRequest withHrisCompany(Optional<? extends HrisCompany> hrisCompany) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        this.hrisCompany = hrisCompany;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchHrisCompanyRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchHrisCompanyRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchHrisCompanyRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Company
     */
    public PatchHrisCompanyRequest withId(String id) {
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
        PatchHrisCompanyRequest other = (PatchHrisCompanyRequest) o;
        return 
            Objects.deepEquals(this.hrisCompany, other.hrisCompany) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hrisCompany,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchHrisCompanyRequest.class,
                "hrisCompany", hrisCompany,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends HrisCompany> hrisCompany = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hrisCompany(HrisCompany hrisCompany) {
            Utils.checkNotNull(hrisCompany, "hrisCompany");
            this.hrisCompany = Optional.ofNullable(hrisCompany);
            return this;
        }

        public Builder hrisCompany(Optional<? extends HrisCompany> hrisCompany) {
            Utils.checkNotNull(hrisCompany, "hrisCompany");
            this.hrisCompany = hrisCompany;
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
         * ID of the Company
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchHrisCompanyRequest build() {
            return new PatchHrisCompanyRequest(
                hrisCompany,
                connectionId,
                fields,
                id);
        }
    }
}

