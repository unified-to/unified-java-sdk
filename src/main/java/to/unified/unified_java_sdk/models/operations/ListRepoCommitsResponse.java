/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import to.unified.unified_java_sdk.models.shared.RepoCommit;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class ListRepoCommitsResponse implements Response {
    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends List<RepoCommit>> repoCommits;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListRepoCommitsResponse(
            String contentType,
            Optional<? extends List<RepoCommit>> repoCommits,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(repoCommits, "repoCommits");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.repoCommits = repoCommits;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListRepoCommitsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode,
            rawResponse);
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
    public Optional<List<RepoCommit>> repoCommits() {
        return (Optional<List<RepoCommit>>) repoCommits;
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

    public static Builder builder() {
        return new Builder();
    }


    /**
     * HTTP response content type for this operation
     */
    public ListRepoCommitsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public ListRepoCommitsResponse withRepoCommits(List<RepoCommit> repoCommits) {
        Utils.checkNotNull(repoCommits, "repoCommits");
        this.repoCommits = Optional.ofNullable(repoCommits);
        return this;
    }


    /**
     * Successful
     */
    public ListRepoCommitsResponse withRepoCommits(Optional<? extends List<RepoCommit>> repoCommits) {
        Utils.checkNotNull(repoCommits, "repoCommits");
        this.repoCommits = repoCommits;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListRepoCommitsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListRepoCommitsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListRepoCommitsResponse other = (ListRepoCommitsResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.repoCommits, other.repoCommits) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, repoCommits, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListRepoCommitsResponse.class,
                "contentType", contentType,
                "repoCommits", repoCommits,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Optional<? extends List<RepoCommit>> repoCommits = Optional.empty();

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
        public Builder repoCommits(List<RepoCommit> repoCommits) {
            Utils.checkNotNull(repoCommits, "repoCommits");
            this.repoCommits = Optional.ofNullable(repoCommits);
            return this;
        }

        /**
         * Successful
         */
        public Builder repoCommits(Optional<? extends List<RepoCommit>> repoCommits) {
            Utils.checkNotNull(repoCommits, "repoCommits");
            this.repoCommits = repoCommits;
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

        public ListRepoCommitsResponse build() {

            return new ListRepoCommitsResponse(
                contentType, repoCommits, statusCode,
                rawResponse);
        }

    }
}
