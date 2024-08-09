/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.HrisGroup;
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


public class PatchHrisGroupResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends HrisGroup> hrisGroup;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public PatchHrisGroupResponse(
            String contentType,
            Optional<? extends HrisGroup> hrisGroup,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(hrisGroup, "hrisGroup");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.hrisGroup = hrisGroup;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public PatchHrisGroupResponse(
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
    public Optional<HrisGroup> hrisGroup() {
        return (Optional<HrisGroup>) hrisGroup;
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
    public PatchHrisGroupResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public PatchHrisGroupResponse withHrisGroup(HrisGroup hrisGroup) {
        Utils.checkNotNull(hrisGroup, "hrisGroup");
        this.hrisGroup = Optional.ofNullable(hrisGroup);
        return this;
    }

    /**
     * Successful
     */
    public PatchHrisGroupResponse withHrisGroup(Optional<? extends HrisGroup> hrisGroup) {
        Utils.checkNotNull(hrisGroup, "hrisGroup");
        this.hrisGroup = hrisGroup;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PatchHrisGroupResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PatchHrisGroupResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        PatchHrisGroupResponse other = (PatchHrisGroupResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.hrisGroup, other.hrisGroup) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            hrisGroup,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchHrisGroupResponse.class,
                "contentType", contentType,
                "hrisGroup", hrisGroup,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends HrisGroup> hrisGroup = Optional.empty();
 
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
        public Builder hrisGroup(HrisGroup hrisGroup) {
            Utils.checkNotNull(hrisGroup, "hrisGroup");
            this.hrisGroup = Optional.ofNullable(hrisGroup);
            return this;
        }

        /**
         * Successful
         */
        public Builder hrisGroup(Optional<? extends HrisGroup> hrisGroup) {
            Utils.checkNotNull(hrisGroup, "hrisGroup");
            this.hrisGroup = hrisGroup;
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
        
        public PatchHrisGroupResponse build() {
            return new PatchHrisGroupResponse(
                contentType,
                hrisGroup,
                statusCode,
                rawResponse);
        }
    }
}

