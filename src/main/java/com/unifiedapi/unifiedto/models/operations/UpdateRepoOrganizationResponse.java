/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.RepoOrganization;
import com.unifiedapi.unifiedto.utils.Response;
import com.unifiedapi.unifiedto.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class UpdateRepoOrganizationResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends RepoOrganization> repoOrganization;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public UpdateRepoOrganizationResponse(
            String contentType,
            Optional<? extends RepoOrganization> repoOrganization,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(repoOrganization, "repoOrganization");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.repoOrganization = repoOrganization;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public UpdateRepoOrganizationResponse(
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
    public Optional<RepoOrganization> repoOrganization() {
        return (Optional<RepoOrganization>) repoOrganization;
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
    public UpdateRepoOrganizationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public UpdateRepoOrganizationResponse withRepoOrganization(RepoOrganization repoOrganization) {
        Utils.checkNotNull(repoOrganization, "repoOrganization");
        this.repoOrganization = Optional.ofNullable(repoOrganization);
        return this;
    }

    /**
     * Successful
     */
    public UpdateRepoOrganizationResponse withRepoOrganization(Optional<? extends RepoOrganization> repoOrganization) {
        Utils.checkNotNull(repoOrganization, "repoOrganization");
        this.repoOrganization = repoOrganization;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateRepoOrganizationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateRepoOrganizationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        UpdateRepoOrganizationResponse other = (UpdateRepoOrganizationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.repoOrganization, other.repoOrganization) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            repoOrganization,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateRepoOrganizationResponse.class,
                "contentType", contentType,
                "repoOrganization", repoOrganization,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends RepoOrganization> repoOrganization = Optional.empty();
 
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
        public Builder repoOrganization(RepoOrganization repoOrganization) {
            Utils.checkNotNull(repoOrganization, "repoOrganization");
            this.repoOrganization = Optional.ofNullable(repoOrganization);
            return this;
        }

        /**
         * Successful
         */
        public Builder repoOrganization(Optional<? extends RepoOrganization> repoOrganization) {
            Utils.checkNotNull(repoOrganization, "repoOrganization");
            this.repoOrganization = repoOrganization;
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
        
        public UpdateRepoOrganizationResponse build() {
            return new UpdateRepoOrganizationResponse(
                contentType,
                repoOrganization,
                statusCode,
                rawResponse);
        }
    }
}
