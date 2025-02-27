/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.Response;
import com.unifiedapi.unifiedto.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class UpdatePassthroughRawResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private Map<String, List<String>> headers;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Successful
     */
    private Optional<? extends InputStream> defaultWildcardWildcardResponseStream;

    /**
     * Successful
     */
    private Optional<? extends Object> defaultApplicationJsonAny;

    /**
     * Successful
     */
    private Optional<String> defaultApplicationXmlRes;

    /**
     * Successful
     */
    private Optional<String> defaultTextCsvRes;

    /**
     * Successful
     */
    private Optional<String> defaultTextPlainRes;

    @JsonCreator
    public UpdatePassthroughRawResponse(
            String contentType,
            Map<String, List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends InputStream> defaultWildcardWildcardResponseStream,
            Optional<? extends Object> defaultApplicationJsonAny,
            Optional<String> defaultApplicationXmlRes,
            Optional<String> defaultTextCsvRes,
            Optional<String> defaultTextPlainRes) {
        Utils.checkNotNull(contentType, "contentType");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(defaultWildcardWildcardResponseStream, "defaultWildcardWildcardResponseStream");
        Utils.checkNotNull(defaultApplicationJsonAny, "defaultApplicationJsonAny");
        Utils.checkNotNull(defaultApplicationXmlRes, "defaultApplicationXmlRes");
        Utils.checkNotNull(defaultTextCsvRes, "defaultTextCsvRes");
        Utils.checkNotNull(defaultTextPlainRes, "defaultTextPlainRes");
        this.contentType = contentType;
        this.headers = headers;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.defaultWildcardWildcardResponseStream = defaultWildcardWildcardResponseStream;
        this.defaultApplicationJsonAny = defaultApplicationJsonAny;
        this.defaultApplicationXmlRes = defaultApplicationXmlRes;
        this.defaultTextCsvRes = defaultTextCsvRes;
        this.defaultTextPlainRes = defaultTextPlainRes;
    }
    
    public UpdatePassthroughRawResponse(
            String contentType,
            Map<String, List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, headers, statusCode, rawResponse, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    @JsonIgnore
    public Map<String, List<String>> headers() {
        return headers;
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

    /**
     * Successful
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> defaultWildcardWildcardResponseStream() {
        return (Optional<InputStream>) defaultWildcardWildcardResponseStream;
    }

    /**
     * Successful
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Object> defaultApplicationJsonAny() {
        return (Optional<Object>) defaultApplicationJsonAny;
    }

    /**
     * Successful
     */
    @JsonIgnore
    public Optional<String> defaultApplicationXmlRes() {
        return defaultApplicationXmlRes;
    }

    /**
     * Successful
     */
    @JsonIgnore
    public Optional<String> defaultTextCsvRes() {
        return defaultTextCsvRes;
    }

    /**
     * Successful
     */
    @JsonIgnore
    public Optional<String> defaultTextPlainRes() {
        return defaultTextPlainRes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdatePassthroughRawResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public UpdatePassthroughRawResponse withHeaders(Map<String, List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdatePassthroughRawResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdatePassthroughRawResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultWildcardWildcardResponseStream(InputStream defaultWildcardWildcardResponseStream) {
        Utils.checkNotNull(defaultWildcardWildcardResponseStream, "defaultWildcardWildcardResponseStream");
        this.defaultWildcardWildcardResponseStream = Optional.ofNullable(defaultWildcardWildcardResponseStream);
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultWildcardWildcardResponseStream(Optional<? extends InputStream> defaultWildcardWildcardResponseStream) {
        Utils.checkNotNull(defaultWildcardWildcardResponseStream, "defaultWildcardWildcardResponseStream");
        this.defaultWildcardWildcardResponseStream = defaultWildcardWildcardResponseStream;
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultApplicationJsonAny(Object defaultApplicationJsonAny) {
        Utils.checkNotNull(defaultApplicationJsonAny, "defaultApplicationJsonAny");
        this.defaultApplicationJsonAny = Optional.ofNullable(defaultApplicationJsonAny);
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultApplicationJsonAny(Optional<? extends Object> defaultApplicationJsonAny) {
        Utils.checkNotNull(defaultApplicationJsonAny, "defaultApplicationJsonAny");
        this.defaultApplicationJsonAny = defaultApplicationJsonAny;
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultApplicationXmlRes(String defaultApplicationXmlRes) {
        Utils.checkNotNull(defaultApplicationXmlRes, "defaultApplicationXmlRes");
        this.defaultApplicationXmlRes = Optional.ofNullable(defaultApplicationXmlRes);
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultApplicationXmlRes(Optional<String> defaultApplicationXmlRes) {
        Utils.checkNotNull(defaultApplicationXmlRes, "defaultApplicationXmlRes");
        this.defaultApplicationXmlRes = defaultApplicationXmlRes;
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultTextCsvRes(String defaultTextCsvRes) {
        Utils.checkNotNull(defaultTextCsvRes, "defaultTextCsvRes");
        this.defaultTextCsvRes = Optional.ofNullable(defaultTextCsvRes);
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultTextCsvRes(Optional<String> defaultTextCsvRes) {
        Utils.checkNotNull(defaultTextCsvRes, "defaultTextCsvRes");
        this.defaultTextCsvRes = defaultTextCsvRes;
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultTextPlainRes(String defaultTextPlainRes) {
        Utils.checkNotNull(defaultTextPlainRes, "defaultTextPlainRes");
        this.defaultTextPlainRes = Optional.ofNullable(defaultTextPlainRes);
        return this;
    }

    /**
     * Successful
     */
    public UpdatePassthroughRawResponse withDefaultTextPlainRes(Optional<String> defaultTextPlainRes) {
        Utils.checkNotNull(defaultTextPlainRes, "defaultTextPlainRes");
        this.defaultTextPlainRes = defaultTextPlainRes;
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
        UpdatePassthroughRawResponse other = (UpdatePassthroughRawResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.headers, other.headers) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.defaultWildcardWildcardResponseStream, other.defaultWildcardWildcardResponseStream) &&
            Objects.deepEquals(this.defaultApplicationJsonAny, other.defaultApplicationJsonAny) &&
            Objects.deepEquals(this.defaultApplicationXmlRes, other.defaultApplicationXmlRes) &&
            Objects.deepEquals(this.defaultTextCsvRes, other.defaultTextCsvRes) &&
            Objects.deepEquals(this.defaultTextPlainRes, other.defaultTextPlainRes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            headers,
            statusCode,
            rawResponse,
            defaultWildcardWildcardResponseStream,
            defaultApplicationJsonAny,
            defaultApplicationXmlRes,
            defaultTextCsvRes,
            defaultTextPlainRes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdatePassthroughRawResponse.class,
                "contentType", contentType,
                "headers", headers,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "defaultWildcardWildcardResponseStream", defaultWildcardWildcardResponseStream,
                "defaultApplicationJsonAny", defaultApplicationJsonAny,
                "defaultApplicationXmlRes", defaultApplicationXmlRes,
                "defaultTextCsvRes", defaultTextCsvRes,
                "defaultTextPlainRes", defaultTextPlainRes);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Map<String, List<String>> headers;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends InputStream> defaultWildcardWildcardResponseStream = Optional.empty();
 
        private Optional<? extends Object> defaultApplicationJsonAny = Optional.empty();
 
        private Optional<String> defaultApplicationXmlRes = Optional.empty();
 
        private Optional<String> defaultTextCsvRes = Optional.empty();
 
        private Optional<String> defaultTextPlainRes = Optional.empty();  
        
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

        public Builder headers(Map<String, List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
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

        /**
         * Successful
         */
        public Builder defaultWildcardWildcardResponseStream(InputStream defaultWildcardWildcardResponseStream) {
            Utils.checkNotNull(defaultWildcardWildcardResponseStream, "defaultWildcardWildcardResponseStream");
            this.defaultWildcardWildcardResponseStream = Optional.ofNullable(defaultWildcardWildcardResponseStream);
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultWildcardWildcardResponseStream(Optional<? extends InputStream> defaultWildcardWildcardResponseStream) {
            Utils.checkNotNull(defaultWildcardWildcardResponseStream, "defaultWildcardWildcardResponseStream");
            this.defaultWildcardWildcardResponseStream = defaultWildcardWildcardResponseStream;
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultApplicationJsonAny(Object defaultApplicationJsonAny) {
            Utils.checkNotNull(defaultApplicationJsonAny, "defaultApplicationJsonAny");
            this.defaultApplicationJsonAny = Optional.ofNullable(defaultApplicationJsonAny);
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultApplicationJsonAny(Optional<? extends Object> defaultApplicationJsonAny) {
            Utils.checkNotNull(defaultApplicationJsonAny, "defaultApplicationJsonAny");
            this.defaultApplicationJsonAny = defaultApplicationJsonAny;
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultApplicationXmlRes(String defaultApplicationXmlRes) {
            Utils.checkNotNull(defaultApplicationXmlRes, "defaultApplicationXmlRes");
            this.defaultApplicationXmlRes = Optional.ofNullable(defaultApplicationXmlRes);
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultApplicationXmlRes(Optional<String> defaultApplicationXmlRes) {
            Utils.checkNotNull(defaultApplicationXmlRes, "defaultApplicationXmlRes");
            this.defaultApplicationXmlRes = defaultApplicationXmlRes;
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultTextCsvRes(String defaultTextCsvRes) {
            Utils.checkNotNull(defaultTextCsvRes, "defaultTextCsvRes");
            this.defaultTextCsvRes = Optional.ofNullable(defaultTextCsvRes);
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultTextCsvRes(Optional<String> defaultTextCsvRes) {
            Utils.checkNotNull(defaultTextCsvRes, "defaultTextCsvRes");
            this.defaultTextCsvRes = defaultTextCsvRes;
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultTextPlainRes(String defaultTextPlainRes) {
            Utils.checkNotNull(defaultTextPlainRes, "defaultTextPlainRes");
            this.defaultTextPlainRes = Optional.ofNullable(defaultTextPlainRes);
            return this;
        }

        /**
         * Successful
         */
        public Builder defaultTextPlainRes(Optional<String> defaultTextPlainRes) {
            Utils.checkNotNull(defaultTextPlainRes, "defaultTextPlainRes");
            this.defaultTextPlainRes = defaultTextPlainRes;
            return this;
        }
        
        public UpdatePassthroughRawResponse build() {
            return new UpdatePassthroughRawResponse(
                contentType,
                headers,
                statusCode,
                rawResponse,
                defaultWildcardWildcardResponseStream,
                defaultApplicationJsonAny,
                defaultApplicationXmlRes,
                defaultTextCsvRes,
                defaultTextPlainRes);
        }
    }
}

