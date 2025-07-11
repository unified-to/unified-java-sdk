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
import java.util.List;
import java.util.Optional;
import to.unified.unified_java_sdk.models.shared.CommerceItem;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class ListCommerceItemsResponse implements Response {
    /**
     * Successful
     */
    private Optional<? extends List<CommerceItem>> commerceItems;

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
    public ListCommerceItemsResponse(
            Optional<? extends List<CommerceItem>> commerceItems,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(commerceItems, "commerceItems");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.commerceItems = commerceItems;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListCommerceItemsResponse(
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
    public Optional<List<CommerceItem>> commerceItems() {
        return (Optional<List<CommerceItem>>) commerceItems;
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
    public ListCommerceItemsResponse withCommerceItems(List<CommerceItem> commerceItems) {
        Utils.checkNotNull(commerceItems, "commerceItems");
        this.commerceItems = Optional.ofNullable(commerceItems);
        return this;
    }


    /**
     * Successful
     */
    public ListCommerceItemsResponse withCommerceItems(Optional<? extends List<CommerceItem>> commerceItems) {
        Utils.checkNotNull(commerceItems, "commerceItems");
        this.commerceItems = commerceItems;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListCommerceItemsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListCommerceItemsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListCommerceItemsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListCommerceItemsResponse other = (ListCommerceItemsResponse) o;
        return 
            Utils.enhancedDeepEquals(this.commerceItems, other.commerceItems) &&
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            commerceItems, contentType, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCommerceItemsResponse.class,
                "commerceItems", commerceItems,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends List<CommerceItem>> commerceItems = Optional.empty();

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Successful
         */
        public Builder commerceItems(List<CommerceItem> commerceItems) {
            Utils.checkNotNull(commerceItems, "commerceItems");
            this.commerceItems = Optional.ofNullable(commerceItems);
            return this;
        }

        /**
         * Successful
         */
        public Builder commerceItems(Optional<? extends List<CommerceItem>> commerceItems) {
            Utils.checkNotNull(commerceItems, "commerceItems");
            this.commerceItems = commerceItems;
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

        public ListCommerceItemsResponse build() {

            return new ListCommerceItemsResponse(
                commerceItems, contentType, statusCode,
                rawResponse);
        }

    }
}
