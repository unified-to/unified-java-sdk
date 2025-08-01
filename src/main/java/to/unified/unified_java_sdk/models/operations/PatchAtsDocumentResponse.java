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
import java.util.Optional;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class PatchAtsDocumentResponse implements Response {
    /**
     * Successful
     */
    private Optional<? extends AtsDocument> atsDocument;

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
    public PatchAtsDocumentResponse(
            Optional<? extends AtsDocument> atsDocument,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.atsDocument = atsDocument;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public PatchAtsDocumentResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode,
            rawResponse);
    }

    /**
     * Successful
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsDocument> atsDocument() {
        return (Optional<AtsDocument>) atsDocument;
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

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Successful
     */
    public PatchAtsDocumentResponse withAtsDocument(AtsDocument atsDocument) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        this.atsDocument = Optional.ofNullable(atsDocument);
        return this;
    }


    /**
     * Successful
     */
    public PatchAtsDocumentResponse withAtsDocument(Optional<? extends AtsDocument> atsDocument) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        this.atsDocument = atsDocument;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public PatchAtsDocumentResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PatchAtsDocumentResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PatchAtsDocumentResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        PatchAtsDocumentResponse other = (PatchAtsDocumentResponse) o;
        return 
            Utils.enhancedDeepEquals(this.atsDocument, other.atsDocument) &&
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            atsDocument, contentType, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchAtsDocumentResponse.class,
                "atsDocument", atsDocument,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends AtsDocument> atsDocument = Optional.empty();

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Successful
         */
        public Builder atsDocument(AtsDocument atsDocument) {
            Utils.checkNotNull(atsDocument, "atsDocument");
            this.atsDocument = Optional.ofNullable(atsDocument);
            return this;
        }

        /**
         * Successful
         */
        public Builder atsDocument(Optional<? extends AtsDocument> atsDocument) {
            Utils.checkNotNull(atsDocument, "atsDocument");
            this.atsDocument = atsDocument;
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

        public PatchAtsDocumentResponse build() {

            return new PatchAtsDocumentResponse(
                atsDocument, contentType, statusCode,
                rawResponse);
        }

    }
}
