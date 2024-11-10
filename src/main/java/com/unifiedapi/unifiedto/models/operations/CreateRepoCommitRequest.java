/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.RepoCommit;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateRepoCommitRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends RepoCommit> repoCommit;

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
    public CreateRepoCommitRequest(
            Optional<? extends RepoCommit> repoCommit,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(repoCommit, "repoCommit");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.repoCommit = repoCommit;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateRepoCommitRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RepoCommit> repoCommit() {
        return (Optional<RepoCommit>) repoCommit;
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

    public CreateRepoCommitRequest withRepoCommit(RepoCommit repoCommit) {
        Utils.checkNotNull(repoCommit, "repoCommit");
        this.repoCommit = Optional.ofNullable(repoCommit);
        return this;
    }

    public CreateRepoCommitRequest withRepoCommit(Optional<? extends RepoCommit> repoCommit) {
        Utils.checkNotNull(repoCommit, "repoCommit");
        this.repoCommit = repoCommit;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateRepoCommitRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateRepoCommitRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateRepoCommitRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateRepoCommitRequest other = (CreateRepoCommitRequest) o;
        return 
            Objects.deepEquals(this.repoCommit, other.repoCommit) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            repoCommit,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRepoCommitRequest.class,
                "repoCommit", repoCommit,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private Optional<? extends RepoCommit> repoCommit = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder repoCommit(RepoCommit repoCommit) {
            Utils.checkNotNull(repoCommit, "repoCommit");
            this.repoCommit = Optional.ofNullable(repoCommit);
            return this;
        }

        public Builder repoCommit(Optional<? extends RepoCommit> repoCommit) {
            Utils.checkNotNull(repoCommit, "repoCommit");
            this.repoCommit = repoCommit;
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
        
        public CreateRepoCommitRequest build() {
            return new CreateRepoCommitRequest(
                repoCommit,
                connectionId,
                fields);
        }
    }
}

