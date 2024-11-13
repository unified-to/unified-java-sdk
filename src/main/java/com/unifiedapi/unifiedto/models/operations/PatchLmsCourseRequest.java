/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.LmsCourse;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PatchLmsCourseRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends LmsCourse> lmsCourse;

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
     * ID of the Course
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchLmsCourseRequest(
            Optional<? extends LmsCourse> lmsCourse,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(lmsCourse, "lmsCourse");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.lmsCourse = lmsCourse;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public PatchLmsCourseRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LmsCourse> lmsCourse() {
        return (Optional<LmsCourse>) lmsCourse;
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
     * ID of the Course
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchLmsCourseRequest withLmsCourse(LmsCourse lmsCourse) {
        Utils.checkNotNull(lmsCourse, "lmsCourse");
        this.lmsCourse = Optional.ofNullable(lmsCourse);
        return this;
    }

    public PatchLmsCourseRequest withLmsCourse(Optional<? extends LmsCourse> lmsCourse) {
        Utils.checkNotNull(lmsCourse, "lmsCourse");
        this.lmsCourse = lmsCourse;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchLmsCourseRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchLmsCourseRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public PatchLmsCourseRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Course
     */
    public PatchLmsCourseRequest withId(String id) {
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
        PatchLmsCourseRequest other = (PatchLmsCourseRequest) o;
        return 
            Objects.deepEquals(this.lmsCourse, other.lmsCourse) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lmsCourse,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchLmsCourseRequest.class,
                "lmsCourse", lmsCourse,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends LmsCourse> lmsCourse = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lmsCourse(LmsCourse lmsCourse) {
            Utils.checkNotNull(lmsCourse, "lmsCourse");
            this.lmsCourse = Optional.ofNullable(lmsCourse);
            return this;
        }

        public Builder lmsCourse(Optional<? extends LmsCourse> lmsCourse) {
            Utils.checkNotNull(lmsCourse, "lmsCourse");
            this.lmsCourse = lmsCourse;
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
         * ID of the Course
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchLmsCourseRequest build() {
            return new PatchLmsCourseRequest(
                lmsCourse,
                connectionId,
                fields,
                id);
        }
    }
}
