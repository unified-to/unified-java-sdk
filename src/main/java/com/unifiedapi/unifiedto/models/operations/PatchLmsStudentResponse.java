/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.LmsStudent;
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

public class PatchLmsStudentResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends LmsStudent> lmsStudent;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public PatchLmsStudentResponse(
            String contentType,
            Optional<? extends LmsStudent> lmsStudent,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(lmsStudent, "lmsStudent");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.lmsStudent = lmsStudent;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public PatchLmsStudentResponse(
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
    public Optional<LmsStudent> lmsStudent() {
        return (Optional<LmsStudent>) lmsStudent;
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
    public PatchLmsStudentResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public PatchLmsStudentResponse withLmsStudent(LmsStudent lmsStudent) {
        Utils.checkNotNull(lmsStudent, "lmsStudent");
        this.lmsStudent = Optional.ofNullable(lmsStudent);
        return this;
    }

    /**
     * Successful
     */
    public PatchLmsStudentResponse withLmsStudent(Optional<? extends LmsStudent> lmsStudent) {
        Utils.checkNotNull(lmsStudent, "lmsStudent");
        this.lmsStudent = lmsStudent;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PatchLmsStudentResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PatchLmsStudentResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        PatchLmsStudentResponse other = (PatchLmsStudentResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.lmsStudent, other.lmsStudent) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            lmsStudent,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchLmsStudentResponse.class,
                "contentType", contentType,
                "lmsStudent", lmsStudent,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends LmsStudent> lmsStudent = Optional.empty();
 
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
        public Builder lmsStudent(LmsStudent lmsStudent) {
            Utils.checkNotNull(lmsStudent, "lmsStudent");
            this.lmsStudent = Optional.ofNullable(lmsStudent);
            return this;
        }

        /**
         * Successful
         */
        public Builder lmsStudent(Optional<? extends LmsStudent> lmsStudent) {
            Utils.checkNotNull(lmsStudent, "lmsStudent");
            this.lmsStudent = lmsStudent;
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
        
        public PatchLmsStudentResponse build() {
            return new PatchLmsStudentResponse(
                contentType,
                lmsStudent,
                statusCode,
                rawResponse);
        }
    }
}

