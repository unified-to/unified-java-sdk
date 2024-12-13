/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.MetadataMetadata;
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


public class ListMetadataMetadatasResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends List<MetadataMetadata>> metadataMetadatas;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListMetadataMetadatasResponse(
            String contentType,
            Optional<? extends List<MetadataMetadata>> metadataMetadatas,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(metadataMetadatas, "metadataMetadatas");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.metadataMetadatas = metadataMetadatas;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListMetadataMetadatasResponse(
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
    public Optional<List<MetadataMetadata>> metadataMetadatas() {
        return (Optional<List<MetadataMetadata>>) metadataMetadatas;
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
    public ListMetadataMetadatasResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public ListMetadataMetadatasResponse withMetadataMetadatas(List<MetadataMetadata> metadataMetadatas) {
        Utils.checkNotNull(metadataMetadatas, "metadataMetadatas");
        this.metadataMetadatas = Optional.ofNullable(metadataMetadatas);
        return this;
    }

    /**
     * Successful
     */
    public ListMetadataMetadatasResponse withMetadataMetadatas(Optional<? extends List<MetadataMetadata>> metadataMetadatas) {
        Utils.checkNotNull(metadataMetadatas, "metadataMetadatas");
        this.metadataMetadatas = metadataMetadatas;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListMetadataMetadatasResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListMetadataMetadatasResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListMetadataMetadatasResponse other = (ListMetadataMetadatasResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.metadataMetadatas, other.metadataMetadatas) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            metadataMetadatas,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListMetadataMetadatasResponse.class,
                "contentType", contentType,
                "metadataMetadatas", metadataMetadatas,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends List<MetadataMetadata>> metadataMetadatas = Optional.empty();
 
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
        public Builder metadataMetadatas(List<MetadataMetadata> metadataMetadatas) {
            Utils.checkNotNull(metadataMetadatas, "metadataMetadatas");
            this.metadataMetadatas = Optional.ofNullable(metadataMetadatas);
            return this;
        }

        /**
         * Successful
         */
        public Builder metadataMetadatas(Optional<? extends List<MetadataMetadata>> metadataMetadatas) {
            Utils.checkNotNull(metadataMetadatas, "metadataMetadatas");
            this.metadataMetadatas = metadataMetadatas;
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
        
        public ListMetadataMetadatasResponse build() {
            return new ListMetadataMetadatasResponse(
                contentType,
                metadataMetadatas,
                statusCode,
                rawResponse);
        }
    }
}
