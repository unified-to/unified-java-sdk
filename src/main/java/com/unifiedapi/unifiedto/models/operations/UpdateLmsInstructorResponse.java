/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.LmsInstructor;
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


public class UpdateLmsInstructorResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends LmsInstructor> lmsInstructor;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public UpdateLmsInstructorResponse(
            String contentType,
            Optional<? extends LmsInstructor> lmsInstructor,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(lmsInstructor, "lmsInstructor");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.lmsInstructor = lmsInstructor;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public UpdateLmsInstructorResponse(
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
    public Optional<LmsInstructor> lmsInstructor() {
        return (Optional<LmsInstructor>) lmsInstructor;
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
    public UpdateLmsInstructorResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public UpdateLmsInstructorResponse withLmsInstructor(LmsInstructor lmsInstructor) {
        Utils.checkNotNull(lmsInstructor, "lmsInstructor");
        this.lmsInstructor = Optional.ofNullable(lmsInstructor);
        return this;
    }

    /**
     * Successful
     */
    public UpdateLmsInstructorResponse withLmsInstructor(Optional<? extends LmsInstructor> lmsInstructor) {
        Utils.checkNotNull(lmsInstructor, "lmsInstructor");
        this.lmsInstructor = lmsInstructor;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateLmsInstructorResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateLmsInstructorResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        UpdateLmsInstructorResponse other = (UpdateLmsInstructorResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.lmsInstructor, other.lmsInstructor) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            lmsInstructor,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateLmsInstructorResponse.class,
                "contentType", contentType,
                "lmsInstructor", lmsInstructor,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends LmsInstructor> lmsInstructor = Optional.empty();
 
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
        public Builder lmsInstructor(LmsInstructor lmsInstructor) {
            Utils.checkNotNull(lmsInstructor, "lmsInstructor");
            this.lmsInstructor = Optional.ofNullable(lmsInstructor);
            return this;
        }

        /**
         * Successful
         */
        public Builder lmsInstructor(Optional<? extends LmsInstructor> lmsInstructor) {
            Utils.checkNotNull(lmsInstructor, "lmsInstructor");
            this.lmsInstructor = lmsInstructor;
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
        
        public UpdateLmsInstructorResponse build() {
            return new UpdateLmsInstructorResponse(
                contentType,
                lmsInstructor,
                statusCode,
                rawResponse);
        }
    }
}

