/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.RepoRepository;
import com.unifiedapi.unifiedto.utils.Response;
import com.unifiedapi.unifiedto.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ListRepoRepositoriesResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends List<RepoRepository>> repoRepositories;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListRepoRepositoriesResponse(
            String contentType,
            Optional<? extends List<RepoRepository>> repoRepositories,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(repoRepositories, "repoRepositories");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.repoRepositories = repoRepositories;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListRepoRepositoriesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Successful
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<RepoRepository>> repoRepositories() {
        return (Optional<List<RepoRepository>>) repoRepositories;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListRepoRepositoriesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public ListRepoRepositoriesResponse withRepoRepositories(List<RepoRepository> repoRepositories) {
        Utils.checkNotNull(repoRepositories, "repoRepositories");
        this.repoRepositories = Optional.ofNullable(repoRepositories);
        return this;
    }

    /**
     * Successful
     */
    public ListRepoRepositoriesResponse withRepoRepositories(Optional<? extends List<RepoRepository>> repoRepositories) {
        Utils.checkNotNull(repoRepositories, "repoRepositories");
        this.repoRepositories = repoRepositories;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListRepoRepositoriesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListRepoRepositoriesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        ListRepoRepositoriesResponse other = (ListRepoRepositoriesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.repoRepositories, other.repoRepositories) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            repoRepositories,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListRepoRepositoriesResponse.class,
                "contentType", contentType,
                "repoRepositories", repoRepositories,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends List<RepoRepository>> repoRepositories = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * Successful
         */
        public Builder repoRepositories(List<RepoRepository> repoRepositories) {
            Utils.checkNotNull(repoRepositories, "repoRepositories");
            this.repoRepositories = Optional.ofNullable(repoRepositories);
            return this;
        }

        /**
         * Successful
         */
        public Builder repoRepositories(Optional<? extends List<RepoRepository>> repoRepositories) {
            Utils.checkNotNull(repoRepositories, "repoRepositories");
            this.repoRepositories = repoRepositories;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public ListRepoRepositoriesResponse build() {
            return new ListRepoRepositoriesResponse(
                contentType,
                repoRepositories,
                statusCode,
                rawResponse);
        }
    }
}

