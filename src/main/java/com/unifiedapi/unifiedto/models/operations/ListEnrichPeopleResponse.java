/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.EnrichPerson;
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


public class ListEnrichPeopleResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends EnrichPerson> enrichPerson;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListEnrichPeopleResponse(
            String contentType,
            Optional<? extends EnrichPerson> enrichPerson,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(enrichPerson, "enrichPerson");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.enrichPerson = enrichPerson;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListEnrichPeopleResponse(
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
    public Optional<EnrichPerson> enrichPerson() {
        return (Optional<EnrichPerson>) enrichPerson;
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
    public ListEnrichPeopleResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public ListEnrichPeopleResponse withEnrichPerson(EnrichPerson enrichPerson) {
        Utils.checkNotNull(enrichPerson, "enrichPerson");
        this.enrichPerson = Optional.ofNullable(enrichPerson);
        return this;
    }

    /**
     * Successful
     */
    public ListEnrichPeopleResponse withEnrichPerson(Optional<? extends EnrichPerson> enrichPerson) {
        Utils.checkNotNull(enrichPerson, "enrichPerson");
        this.enrichPerson = enrichPerson;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListEnrichPeopleResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListEnrichPeopleResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListEnrichPeopleResponse other = (ListEnrichPeopleResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.enrichPerson, other.enrichPerson) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            enrichPerson,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListEnrichPeopleResponse.class,
                "contentType", contentType,
                "enrichPerson", enrichPerson,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends EnrichPerson> enrichPerson = Optional.empty();
 
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
        public Builder enrichPerson(EnrichPerson enrichPerson) {
            Utils.checkNotNull(enrichPerson, "enrichPerson");
            this.enrichPerson = Optional.ofNullable(enrichPerson);
            return this;
        }

        /**
         * Successful
         */
        public Builder enrichPerson(Optional<? extends EnrichPerson> enrichPerson) {
            Utils.checkNotNull(enrichPerson, "enrichPerson");
            this.enrichPerson = enrichPerson;
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
        
        public ListEnrichPeopleResponse build() {
            return new ListEnrichPeopleResponse(
                contentType,
                enrichPerson,
                statusCode,
                rawResponse);
        }
    }
}

