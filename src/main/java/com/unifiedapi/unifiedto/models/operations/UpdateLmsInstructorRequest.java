/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.LmsInstructor;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UpdateLmsInstructorRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private LmsInstructor lmsInstructor;

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
     * ID of the Instructor
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateLmsInstructorRequest(
            LmsInstructor lmsInstructor,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(lmsInstructor, "lmsInstructor");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.lmsInstructor = lmsInstructor;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public UpdateLmsInstructorRequest(
            LmsInstructor lmsInstructor,
            String connectionId,
            String id) {
        this(lmsInstructor, connectionId, Optional.empty(), id);
    }

    @JsonIgnore
    public LmsInstructor lmsInstructor() {
        return lmsInstructor;
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
     * ID of the Instructor
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateLmsInstructorRequest withLmsInstructor(LmsInstructor lmsInstructor) {
        Utils.checkNotNull(lmsInstructor, "lmsInstructor");
        this.lmsInstructor = lmsInstructor;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateLmsInstructorRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateLmsInstructorRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateLmsInstructorRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Instructor
     */
    public UpdateLmsInstructorRequest withId(String id) {
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
        UpdateLmsInstructorRequest other = (UpdateLmsInstructorRequest) o;
        return 
            Objects.deepEquals(this.lmsInstructor, other.lmsInstructor) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lmsInstructor,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateLmsInstructorRequest.class,
                "lmsInstructor", lmsInstructor,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private LmsInstructor lmsInstructor;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lmsInstructor(LmsInstructor lmsInstructor) {
            Utils.checkNotNull(lmsInstructor, "lmsInstructor");
            this.lmsInstructor = lmsInstructor;
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
         * ID of the Instructor
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateLmsInstructorRequest build() {
            return new UpdateLmsInstructorRequest(
                lmsInstructor,
                connectionId,
                fields,
                id);
        }
    }
}

