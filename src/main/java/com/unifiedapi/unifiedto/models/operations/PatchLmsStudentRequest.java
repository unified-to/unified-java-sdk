/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.LmsStudent;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PatchLmsStudentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private LmsStudent lmsStudent;

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
     * ID of the Student
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchLmsStudentRequest(
            LmsStudent lmsStudent,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(lmsStudent, "lmsStudent");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.lmsStudent = lmsStudent;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public PatchLmsStudentRequest(
            LmsStudent lmsStudent,
            String connectionId,
            String id) {
        this(lmsStudent, connectionId, Optional.empty(), id);
    }

    @JsonIgnore
    public LmsStudent lmsStudent() {
        return lmsStudent;
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
     * ID of the Student
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchLmsStudentRequest withLmsStudent(LmsStudent lmsStudent) {
        Utils.checkNotNull(lmsStudent, "lmsStudent");
        this.lmsStudent = lmsStudent;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchLmsStudentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchLmsStudentRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchLmsStudentRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Student
     */
    public PatchLmsStudentRequest withId(String id) {
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
        PatchLmsStudentRequest other = (PatchLmsStudentRequest) o;
        return 
            Objects.deepEquals(this.lmsStudent, other.lmsStudent) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lmsStudent,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchLmsStudentRequest.class,
                "lmsStudent", lmsStudent,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private LmsStudent lmsStudent;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lmsStudent(LmsStudent lmsStudent) {
            Utils.checkNotNull(lmsStudent, "lmsStudent");
            this.lmsStudent = lmsStudent;
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
         * ID of the Student
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchLmsStudentRequest build() {
            return new PatchLmsStudentRequest(
                lmsStudent,
                connectionId,
                fields,
                id);
        }
    }
}

