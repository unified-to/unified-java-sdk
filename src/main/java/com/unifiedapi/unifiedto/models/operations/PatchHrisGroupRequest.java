/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PatchHrisGroupRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends HrisGroup> hrisGroup;

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
     * ID of the Group
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchHrisGroupRequest(
            Optional<? extends HrisGroup> hrisGroup,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(hrisGroup, "hrisGroup");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.hrisGroup = hrisGroup;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public PatchHrisGroupRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisGroup> hrisGroup() {
        return (Optional<HrisGroup>) hrisGroup;
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
     * ID of the Group
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchHrisGroupRequest withHrisGroup(HrisGroup hrisGroup) {
        Utils.checkNotNull(hrisGroup, "hrisGroup");
        this.hrisGroup = Optional.ofNullable(hrisGroup);
        return this;
    }

    public PatchHrisGroupRequest withHrisGroup(Optional<? extends HrisGroup> hrisGroup) {
        Utils.checkNotNull(hrisGroup, "hrisGroup");
        this.hrisGroup = hrisGroup;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchHrisGroupRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchHrisGroupRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchHrisGroupRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Group
     */
    public PatchHrisGroupRequest withId(String id) {
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
        PatchHrisGroupRequest other = (PatchHrisGroupRequest) o;
        return 
            Objects.deepEquals(this.hrisGroup, other.hrisGroup) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hrisGroup,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchHrisGroupRequest.class,
                "hrisGroup", hrisGroup,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends HrisGroup> hrisGroup = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hrisGroup(HrisGroup hrisGroup) {
            Utils.checkNotNull(hrisGroup, "hrisGroup");
            this.hrisGroup = Optional.ofNullable(hrisGroup);
            return this;
        }

        public Builder hrisGroup(Optional<? extends HrisGroup> hrisGroup) {
            Utils.checkNotNull(hrisGroup, "hrisGroup");
            this.hrisGroup = hrisGroup;
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
         * ID of the Group
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchHrisGroupRequest build() {
            return new PatchHrisGroupRequest(
                hrisGroup,
                connectionId,
                fields,
                id);
        }
    }
}

