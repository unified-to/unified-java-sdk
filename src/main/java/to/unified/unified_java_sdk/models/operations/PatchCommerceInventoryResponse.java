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
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class PatchCommerceInventoryResponse implements Response {
    /**
     * Successful
     */
    private Optional<? extends CommerceInventory> commerceInventory;

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
    public PatchCommerceInventoryResponse(
            Optional<? extends CommerceInventory> commerceInventory,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(commerceInventory, "commerceInventory");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.commerceInventory = commerceInventory;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public PatchCommerceInventoryResponse(
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
    public Optional<CommerceInventory> commerceInventory() {
        return (Optional<CommerceInventory>) commerceInventory;
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
    public PatchCommerceInventoryResponse withCommerceInventory(CommerceInventory commerceInventory) {
        Utils.checkNotNull(commerceInventory, "commerceInventory");
        this.commerceInventory = Optional.ofNullable(commerceInventory);
        return this;
    }


    /**
     * Successful
     */
    public PatchCommerceInventoryResponse withCommerceInventory(Optional<? extends CommerceInventory> commerceInventory) {
        Utils.checkNotNull(commerceInventory, "commerceInventory");
        this.commerceInventory = commerceInventory;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public PatchCommerceInventoryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PatchCommerceInventoryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PatchCommerceInventoryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        PatchCommerceInventoryResponse other = (PatchCommerceInventoryResponse) o;
        return 
            Utils.enhancedDeepEquals(this.commerceInventory, other.commerceInventory) &&
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            commerceInventory, contentType, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchCommerceInventoryResponse.class,
                "commerceInventory", commerceInventory,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends CommerceInventory> commerceInventory = Optional.empty();

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Successful
         */
        public Builder commerceInventory(CommerceInventory commerceInventory) {
            Utils.checkNotNull(commerceInventory, "commerceInventory");
            this.commerceInventory = Optional.ofNullable(commerceInventory);
            return this;
        }

        /**
         * Successful
         */
        public Builder commerceInventory(Optional<? extends CommerceInventory> commerceInventory) {
            Utils.checkNotNull(commerceInventory, "commerceInventory");
            this.commerceInventory = commerceInventory;
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

        public PatchCommerceInventoryResponse build() {

            return new PatchCommerceInventoryResponse(
                commerceInventory, contentType, statusCode,
                rawResponse);
        }

    }
}
