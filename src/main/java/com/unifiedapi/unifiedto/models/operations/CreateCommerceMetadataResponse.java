/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.CommerceMetadata;
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


public class CreateCommerceMetadataResponse implements Response {

    /**
     * Successful
     */
    private Optional<? extends CommerceMetadata> commerceMetadata;

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
    public CreateCommerceMetadataResponse(
            Optional<? extends CommerceMetadata> commerceMetadata,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(commerceMetadata, "commerceMetadata");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.commerceMetadata = commerceMetadata;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateCommerceMetadataResponse(
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
    public Optional<CommerceMetadata> commerceMetadata() {
        return (Optional<CommerceMetadata>) commerceMetadata;
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
    public CreateCommerceMetadataResponse withCommerceMetadata(CommerceMetadata commerceMetadata) {
        Utils.checkNotNull(commerceMetadata, "commerceMetadata");
        this.commerceMetadata = Optional.ofNullable(commerceMetadata);
        return this;
    }

    /**
     * Successful
     */
    public CreateCommerceMetadataResponse withCommerceMetadata(Optional<? extends CommerceMetadata> commerceMetadata) {
        Utils.checkNotNull(commerceMetadata, "commerceMetadata");
        this.commerceMetadata = commerceMetadata;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateCommerceMetadataResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateCommerceMetadataResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateCommerceMetadataResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateCommerceMetadataResponse other = (CreateCommerceMetadataResponse) o;
        return 
            Objects.deepEquals(this.commerceMetadata, other.commerceMetadata) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceMetadata,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCommerceMetadataResponse.class,
                "commerceMetadata", commerceMetadata,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceMetadata> commerceMetadata = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Successful
         */
        public Builder commerceMetadata(CommerceMetadata commerceMetadata) {
            Utils.checkNotNull(commerceMetadata, "commerceMetadata");
            this.commerceMetadata = Optional.ofNullable(commerceMetadata);
            return this;
        }

        /**
         * Successful
         */
        public Builder commerceMetadata(Optional<? extends CommerceMetadata> commerceMetadata) {
            Utils.checkNotNull(commerceMetadata, "commerceMetadata");
            this.commerceMetadata = commerceMetadata;
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
        
        public CreateCommerceMetadataResponse build() {
            return new CreateCommerceMetadataResponse(
                commerceMetadata,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

