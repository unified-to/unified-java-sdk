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
import to.unified.unified_java_sdk.models.shared.AccountingPurchaseorder;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class PatchAccountingPurchaseorderResponse implements Response {
    /**
     * Successful
     */
    private Optional<? extends AccountingPurchaseorder> accountingPurchaseorder;

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
    public PatchAccountingPurchaseorderResponse(
            Optional<? extends AccountingPurchaseorder> accountingPurchaseorder,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingPurchaseorder, "accountingPurchaseorder");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingPurchaseorder = accountingPurchaseorder;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public PatchAccountingPurchaseorderResponse(
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
    public Optional<AccountingPurchaseorder> accountingPurchaseorder() {
        return (Optional<AccountingPurchaseorder>) accountingPurchaseorder;
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
    public PatchAccountingPurchaseorderResponse withAccountingPurchaseorder(AccountingPurchaseorder accountingPurchaseorder) {
        Utils.checkNotNull(accountingPurchaseorder, "accountingPurchaseorder");
        this.accountingPurchaseorder = Optional.ofNullable(accountingPurchaseorder);
        return this;
    }


    /**
     * Successful
     */
    public PatchAccountingPurchaseorderResponse withAccountingPurchaseorder(Optional<? extends AccountingPurchaseorder> accountingPurchaseorder) {
        Utils.checkNotNull(accountingPurchaseorder, "accountingPurchaseorder");
        this.accountingPurchaseorder = accountingPurchaseorder;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public PatchAccountingPurchaseorderResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PatchAccountingPurchaseorderResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PatchAccountingPurchaseorderResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        PatchAccountingPurchaseorderResponse other = (PatchAccountingPurchaseorderResponse) o;
        return 
            Utils.enhancedDeepEquals(this.accountingPurchaseorder, other.accountingPurchaseorder) &&
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountingPurchaseorder, contentType, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchAccountingPurchaseorderResponse.class,
                "accountingPurchaseorder", accountingPurchaseorder,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends AccountingPurchaseorder> accountingPurchaseorder = Optional.empty();

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Successful
         */
        public Builder accountingPurchaseorder(AccountingPurchaseorder accountingPurchaseorder) {
            Utils.checkNotNull(accountingPurchaseorder, "accountingPurchaseorder");
            this.accountingPurchaseorder = Optional.ofNullable(accountingPurchaseorder);
            return this;
        }

        /**
         * Successful
         */
        public Builder accountingPurchaseorder(Optional<? extends AccountingPurchaseorder> accountingPurchaseorder) {
            Utils.checkNotNull(accountingPurchaseorder, "accountingPurchaseorder");
            this.accountingPurchaseorder = accountingPurchaseorder;
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

        public PatchAccountingPurchaseorderResponse build() {

            return new PatchAccountingPurchaseorderResponse(
                accountingPurchaseorder, contentType, statusCode,
                rawResponse);
        }

    }
}
