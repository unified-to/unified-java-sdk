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


public class ListAtsApplicationsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=candidate_id")
    private Optional<String> candidateId;

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

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=job_id")
    private Optional<String> jobId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Double> limit;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Double> offset;

    /**
     * Query string to search. eg. email address or name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<String> query;

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    private Optional<OffsetDateTime> updatedGte;

    @JsonCreator
    public ListAtsApplicationsRequest(
            Optional<String> candidateId,
            String connectionId,
            Optional<? extends List<String>> fields,
            Optional<String> jobId,
            Optional<Double> limit,
            Optional<Double> offset,
            Optional<String> query,
            Optional<OffsetDateTime> updatedGte) {
        Utils.checkNotNull(candidateId, "candidateId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.candidateId = candidateId;
        this.connectionId = connectionId;
        this.fields = fields;
        this.jobId = jobId;
        this.limit = limit;
        this.offset = offset;
        this.query = query;
        this.updatedGte = updatedGte;
    }
    
    public ListAtsApplicationsRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> candidateId() {
        return candidateId;
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

    @JsonIgnore
    public Optional<String> jobId() {
        return jobId;
    }

    @JsonIgnore
    public Optional<Double> limit() {
        return limit;
    }

    @JsonIgnore
    public Optional<Double> offset() {
        return offset;
    }

    /**
     * Query string to search. eg. email address or name
     */
    @JsonIgnore
    public Optional<String> query() {
        return query;
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

    public ListAtsApplicationsRequest withCandidateId(String candidateId) {
        Utils.checkNotNull(candidateId, "candidateId");
        this.candidateId = Optional.ofNullable(candidateId);
        return this;
    }

    public ListAtsApplicationsRequest withCandidateId(Optional<String> candidateId) {
        Utils.checkNotNull(candidateId, "candidateId");
        this.candidateId = candidateId;
        return this;
    }

    /**
     * ID of the connection
     */
    public ListAtsApplicationsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListAtsApplicationsRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public ListAtsApplicationsRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public ListAtsApplicationsRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = Optional.ofNullable(jobId);
        return this;
    }

    public ListAtsApplicationsRequest withJobId(Optional<String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    public ListAtsApplicationsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public ListAtsApplicationsRequest withLimit(Optional<Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public ListAtsApplicationsRequest withOffset(double offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    public ListAtsApplicationsRequest withOffset(Optional<Double> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListAtsApplicationsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Query string to search. eg. email address or name
     */
    public ListAtsApplicationsRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListAtsApplicationsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        Utils.checkNotNull(updatedGte, "updatedGte");
        this.updatedGte = Optional.ofNullable(updatedGte);
        return this;
    }

    /**
     * Return only results whose updated date is equal or greater to this value
     */
    public ListAtsApplicationsRequest withUpdatedGte(Optional<OffsetDateTime> updatedGte) {
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
        ListAtsApplicationsRequest other = (ListAtsApplicationsRequest) o;
        return 
            Objects.deepEquals(this.candidateId, other.candidateId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.updatedGte, other.updatedGte);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            candidateId,
            connectionId,
            fields,
            jobId,
            limit,
            offset,
            query,
            updatedGte);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAtsApplicationsRequest.class,
                "candidateId", candidateId,
                "connectionId", connectionId,
                "fields", fields,
                "jobId", jobId,
                "limit", limit,
                "offset", offset,
                "query", query,
                "updatedGte", updatedGte);
    }
    
    public final static class Builder {
 
        private Optional<String> candidateId = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private Optional<String> jobId = Optional.empty();
 
        private Optional<Double> limit = Optional.empty();
 
        private Optional<Double> offset = Optional.empty();
 
        private Optional<String> query = Optional.empty();
 
        private Optional<OffsetDateTime> updatedGte = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder candidateId(String candidateId) {
            Utils.checkNotNull(candidateId, "candidateId");
            this.candidateId = Optional.ofNullable(candidateId);
            return this;
        }

        public Builder candidateId(Optional<String> candidateId) {
            Utils.checkNotNull(candidateId, "candidateId");
            this.candidateId = candidateId;
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

        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = Optional.ofNullable(jobId);
            return this;
        }

        public Builder jobId(Optional<String> jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
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
        
        public ListAtsApplicationsRequest build() {
            return new ListAtsApplicationsRequest(
                candidateId,
                connectionId,
                fields,
                jobId,
                limit,
                offset,
                query,
                updatedGte);
        }
    }
}

