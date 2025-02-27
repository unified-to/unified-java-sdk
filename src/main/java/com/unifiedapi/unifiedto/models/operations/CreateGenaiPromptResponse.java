/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.GenaiPrompt;
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

public class CreateGenaiPromptResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends GenaiPrompt> genaiPrompt;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateGenaiPromptResponse(
            String contentType,
            Optional<? extends GenaiPrompt> genaiPrompt,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(genaiPrompt, "genaiPrompt");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.genaiPrompt = genaiPrompt;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateGenaiPromptResponse(
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
    public Optional<GenaiPrompt> genaiPrompt() {
        return (Optional<GenaiPrompt>) genaiPrompt;
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
    public CreateGenaiPromptResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public CreateGenaiPromptResponse withGenaiPrompt(GenaiPrompt genaiPrompt) {
        Utils.checkNotNull(genaiPrompt, "genaiPrompt");
        this.genaiPrompt = Optional.ofNullable(genaiPrompt);
        return this;
    }

    /**
     * Successful
     */
    public CreateGenaiPromptResponse withGenaiPrompt(Optional<? extends GenaiPrompt> genaiPrompt) {
        Utils.checkNotNull(genaiPrompt, "genaiPrompt");
        this.genaiPrompt = genaiPrompt;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateGenaiPromptResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateGenaiPromptResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateGenaiPromptResponse other = (CreateGenaiPromptResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.genaiPrompt, other.genaiPrompt) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            genaiPrompt,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateGenaiPromptResponse.class,
                "contentType", contentType,
                "genaiPrompt", genaiPrompt,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends GenaiPrompt> genaiPrompt = Optional.empty();
 
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
        public Builder genaiPrompt(GenaiPrompt genaiPrompt) {
            Utils.checkNotNull(genaiPrompt, "genaiPrompt");
            this.genaiPrompt = Optional.ofNullable(genaiPrompt);
            return this;
        }

        /**
         * Successful
         */
        public Builder genaiPrompt(Optional<? extends GenaiPrompt> genaiPrompt) {
            Utils.checkNotNull(genaiPrompt, "genaiPrompt");
            this.genaiPrompt = genaiPrompt;
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
        
        public CreateGenaiPromptResponse build() {
            return new CreateGenaiPromptResponse(
                contentType,
                genaiPrompt,
                statusCode,
                rawResponse);
        }
    }
}

