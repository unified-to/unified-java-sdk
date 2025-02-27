/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
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

public class ListAtsCandidatesResponse implements Response {

    /**
     * Successful
     */
    private Optional<? extends List<AtsCandidate>> atsCandidates;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListAtsCandidatesResponse(
            Optional<? extends List<AtsCandidate>> atsCandidates,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(atsCandidates, "atsCandidates");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.atsCandidates = atsCandidates;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListAtsCandidatesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Successful
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsCandidate>> atsCandidates() {
        return (Optional<List<AtsCandidate>>) atsCandidates;
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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
     * Successful
     */
    public ListAtsCandidatesResponse withAtsCandidates(List<AtsCandidate> atsCandidates) {
        Utils.checkNotNull(atsCandidates, "atsCandidates");
        this.atsCandidates = Optional.ofNullable(atsCandidates);
        return this;
    }

    /**
     * Successful
     */
    public ListAtsCandidatesResponse withAtsCandidates(Optional<? extends List<AtsCandidate>> atsCandidates) {
        Utils.checkNotNull(atsCandidates, "atsCandidates");
        this.atsCandidates = atsCandidates;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListAtsCandidatesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListAtsCandidatesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAtsCandidatesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListAtsCandidatesResponse other = (ListAtsCandidatesResponse) o;
        return 
            Objects.deepEquals(this.atsCandidates, other.atsCandidates) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            atsCandidates,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAtsCandidatesResponse.class,
                "atsCandidates", atsCandidates,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<AtsCandidate>> atsCandidates = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Successful
         */
        public Builder atsCandidates(List<AtsCandidate> atsCandidates) {
            Utils.checkNotNull(atsCandidates, "atsCandidates");
            this.atsCandidates = Optional.ofNullable(atsCandidates);
            return this;
        }

        /**
         * Successful
         */
        public Builder atsCandidates(Optional<? extends List<AtsCandidate>> atsCandidates) {
            Utils.checkNotNull(atsCandidates, "atsCandidates");
            this.atsCandidates = atsCandidates;
            return this;
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
        
        public ListAtsCandidatesResponse build() {
            return new ListAtsCandidatesResponse(
                atsCandidates,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

