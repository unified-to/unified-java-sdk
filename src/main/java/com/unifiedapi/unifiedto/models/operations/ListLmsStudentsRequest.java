/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ListLmsStudentsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=class_id")
    private Optional<String> classId;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=course_id")
    private Optional<String> courseId;

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=location_id")
    private Optional<String> locationId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Double> offset;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    private Optional<String> order;

    /**
     * Query string to search. eg. email address or name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<String> query;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=session_id")
    private Optional<String> sessionId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<String> sort;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<OffsetDateTime> updatedGte;

    @JsonCreator
    public ListLmsStudentsRequest(
            Optional<String> classId,
            String connectionId,
            Optional<String> courseId,
            Optional<? extends List<String>> fields,
            Optional<Double> limit,
            Optional<String> locationId,
            Optional<Double> offset,
            Optional<String> order,
            Optional<String> query,
            Optional<String> sessionId,
            Optional<String> sort,
            Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(classId, "classId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(courseId, "courseId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(locationId, "locationId");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(order, "order");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(sessionId, "sessionId");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.classId = classId;
        this.connectionId = connectionId;
        this.courseId = courseId;
        this.fields = fields;
        this.limit = limit;
        this.locationId = locationId;
        this.offset = offset;
        this.order = order;
        this.query = query;
        this.sessionId = sessionId;
        this.sort = sort;
        this.updatedGte = updatedGte;
    }
    
    public ListLmsStudentsRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> classId() {
        return classId;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @JsonIgnore
    public Optional<String> courseId() {
        return courseId;
    }

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    @JsonIgnore
    public Optional<Double> limit() {
        return limit;
    }

    @JsonIgnore
    public Optional<String> locationId() {
        return locationId;
    }

    @JsonIgnore
    public Optional<Double> offset() {
        return offset;
    }

    @JsonIgnore
    public Optional<String> order() {
        return order;
    }

    /**
     * Query string to search. eg. email address or name
     */
    @JsonIgnore
    public Optional<String> query() {
        return query;
    }

    @JsonIgnore
    public Optional<String> sessionId() {
        return sessionId;
    }

    @JsonIgnore
    public Optional<String> sort() {
        return sort;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @JsonIgnore
    public Optional<OffsetDateTime> updatedGte() {
        return updatedGte;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListLmsStudentsRequest withClassId(String classId) {
        Utils.checkNotNull(classId, "classId");
        this.classId = Optional.ofNullable(classId);
        return this;
    }

    public ListLmsStudentsRequest withClassId(Optional<String> classId) {
        Utils.checkNotNull(classId, "classId");
        this.classId = classId;
        return this;
    }

    /**
     * ID of the connection
     */
    public ListLmsStudentsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public ListLmsStudentsRequest withCourseId(String courseId) {
        Utils.checkNotNull(courseId, "courseId");
        this.courseId = Optional.ofNullable(courseId);
        return this;
    }

    public ListLmsStudentsRequest withCourseId(Optional<String> courseId) {
        Utils.checkNotNull(courseId, "courseId");
        this.courseId = courseId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListLmsStudentsRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListLmsStudentsRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public ListLmsStudentsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public ListLmsStudentsRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListLmsStudentsRequest withLocationId(String locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = Optional.ofNullable(locationId);
        return this;
    }

    public ListLmsStudentsRequest withLocationId(Optional<String> locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = locationId;
        return this;
    }

    public ListLmsStudentsRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public ListLmsStudentsRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListLmsStudentsRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }

    public ListLmsStudentsRequest withOrder(Optional<String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListLmsStudentsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListLmsStudentsRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    public ListLmsStudentsRequest withSessionId(String sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = Optional.ofNullable(sessionId);
        return this;
    }

    public ListLmsStudentsRequest withSessionId(Optional<String> sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = sessionId;
        return this;
    }

    public ListLmsStudentsRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public ListLmsStudentsRequest withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListLmsStudentsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListLmsStudentsRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = updatedGte;
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
        ListLmsStudentsRequest other = (ListLmsStudentsRequest) o;
        return 
            Objects.deepEquals(this.classId, other.classId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.courseId, other.courseId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.locationId, other.locationId) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.order, other.order) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.sessionId, other.sessionId) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            classId,
            connectionId,
            courseId,
            fields,
            limit,
            locationId,
            offset,
            order,
            query,
            sessionId,
            sort,
            updatedGte);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListLmsStudentsRequest.class,
                "classId", classId,
                "connectionId", connectionId,
                "courseId", courseId,
                "fields", fields,
                "limit", limit,
                "locationId", locationId,
                "offset", offset,
                "order", order,
                "query", query,
                "sessionId", sessionId,
                "sort", sort,
                "updatedGte", updatedGte);
    }
    
    public final static class Builder {
 
        private Optional<String> classId = Optional.empty();
 
        private String connectionId;
 
        private Optional<String> courseId = Optional.empty();
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<String> locationId = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<String> order = Optional.empty();
 
        private Optional<String> query = Optional.empty();
 
        private Optional<String> sessionId = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder classId(String classId) {
            Utils.checkNotNull(classId, "classId");
            this.classId = Optional.ofNullable(classId);
            return this;
        }

        public Builder classId(Optional<String> classId) {
            Utils.checkNotNull(classId, "classId");
            this.classId = classId;
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

        public Builder courseId(String courseId) {
            Utils.checkNotNull(courseId, "courseId");
            this.courseId = Optional.ofNullable(courseId);
            return this;
        }

        public Builder courseId(Optional<String> courseId) {
            Utils.checkNotNull(courseId, "courseId");
            this.courseId = courseId;
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

        public Builder limit(double limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        public Builder limit(Optional<Double> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder locationId(String locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = Optional.ofNullable(locationId);
            return this;
        }

        public Builder locationId(Optional<String> locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = locationId;
            return this;
        }

        public Builder offset(double offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        public Builder offset(Optional<Double> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        public Builder order(String order) {
            Utils.checkNotNull(order, "order");
            this.order = Optional.ofNullable(order);
            return this;
        }

        public Builder order(Optional<String> order) {
            Utils.checkNotNull(order, "order");
            this.order = order;
            return this;
        }

        /**
         * Query string to search. eg. email address or name
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Query string to search. eg. email address or name
         */
        public Builder query(Optional<String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        public Builder sessionId(String sessionId) {
            Utils.checkNotNull(sessionId, "sessionId");
            this.sessionId = Optional.ofNullable(sessionId);
            return this;
        }

        public Builder sessionId(Optional<String> sessionId) {
            Utils.checkNotNull(sessionId, "sessionId");
            this.sessionId = sessionId;
            return this;
        }

        public Builder sort(String sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        public Builder sort(Optional<String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        /**
         * Return only results whose updated date is equal or greater to this value
         */
        public Builder updatedGte(OffsetDateTime updatedGte) {
            Utils.checkNotNull(updatedGte, "updatedGte");
            this.updatedGte = Optional.ofNullable(updatedGte);
            return this;
        }

        /**
         * Return only results whose updated date is equal or greater to this value
         */
        public Builder updatedGte(Optional<OffsetDateTime> updatedGte) {
            Utils.checkNotNull(updatedGte, "updatedGte");
            this.updatedGte = updatedGte;
            return this;
        }
        
        public ListLmsStudentsRequest build() {
            return new ListLmsStudentsRequest(
                classId,
                connectionId,
                courseId,
                fields,
                limit,
                locationId,
                offset,
                order,
                query,
                sessionId,
                sort,
                updatedGte);
        }
    }
}

