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
import to.unified.unified_java_sdk.models.shared.AccountingOrder;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class UpdateAccountingOrderResponse implements Response {
    /**
     * Successful
     */
    private Optional<? extends AccountingOrder> accountingOrder;

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
    public UpdateAccountingOrderResponse(
            Optional<? extends AccountingOrder> accountingOrder,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingOrder, "accountingOrder");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingOrder = accountingOrder;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public UpdateAccountingOrderResponse(
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
    public Optional<AccountingOrder> accountingOrder() {
        return (Optional<AccountingOrder>) accountingOrder;
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
    public UpdateAccountingOrderResponse withAccountingOrder(AccountingOrder accountingOrder) {
        Utils.checkNotNull(accountingOrder, "accountingOrder");
        this.accountingOrder = Optional.ofNullable(accountingOrder);
        return this;
    }


    /**
     * Successful
     */
    public UpdateAccountingOrderResponse withAccountingOrder(Optional<? extends AccountingOrder> accountingOrder) {
        Utils.checkNotNull(accountingOrder, "accountingOrder");
        this.accountingOrder = accountingOrder;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateAccountingOrderResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateAccountingOrderResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateAccountingOrderResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        UpdateAccountingOrderResponse other = (UpdateAccountingOrderResponse) o;
        return 
            Utils.enhancedDeepEquals(this.accountingOrder, other.accountingOrder) &&
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountingOrder, contentType, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateAccountingOrderResponse.class,
                "accountingOrder", accountingOrder,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends AccountingOrder> accountingOrder = Optional.empty();

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Successful
         */
        public Builder accountingOrder(AccountingOrder accountingOrder) {
            Utils.checkNotNull(accountingOrder, "accountingOrder");
            this.accountingOrder = Optional.ofNullable(accountingOrder);
            return this;
        }

        /**
         * Successful
         */
        public Builder accountingOrder(Optional<? extends AccountingOrder> accountingOrder) {
            Utils.checkNotNull(accountingOrder, "accountingOrder");
            this.accountingOrder = accountingOrder;
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

        public UpdateAccountingOrderResponse build() {

            return new UpdateAccountingOrderResponse(
                accountingOrder, contentType, statusCode,
                rawResponse);
        }

    }
}
