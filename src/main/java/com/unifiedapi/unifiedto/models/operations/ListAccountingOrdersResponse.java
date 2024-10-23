/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AccountingOrder;
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


public class ListAccountingOrdersResponse implements Response {

    /**
     * Successful
     */
    private Optional<? extends List<AccountingOrder>> accountingOrders;

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
    public ListAccountingOrdersResponse(
            Optional<? extends List<AccountingOrder>> accountingOrders,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingOrders, "accountingOrders");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingOrders = accountingOrders;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListAccountingOrdersResponse(
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
    public Optional<List<AccountingOrder>> accountingOrders() {
        return (Optional<List<AccountingOrder>>) accountingOrders;
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
    public ListAccountingOrdersResponse withAccountingOrders(List<AccountingOrder> accountingOrders) {
        Utils.checkNotNull(accountingOrders, "accountingOrders");
        this.accountingOrders = Optional.ofNullable(accountingOrders);
        return this;
    }

    /**
     * Successful
     */
    public ListAccountingOrdersResponse withAccountingOrders(Optional<? extends List<AccountingOrder>> accountingOrders) {
        Utils.checkNotNull(accountingOrders, "accountingOrders");
        this.accountingOrders = accountingOrders;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListAccountingOrdersResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListAccountingOrdersResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAccountingOrdersResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListAccountingOrdersResponse other = (ListAccountingOrdersResponse) o;
        return 
            Objects.deepEquals(this.accountingOrders, other.accountingOrders) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingOrders,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountingOrdersResponse.class,
                "accountingOrders", accountingOrders,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<AccountingOrder>> accountingOrders = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Successful
         */
        public Builder accountingOrders(List<AccountingOrder> accountingOrders) {
            Utils.checkNotNull(accountingOrders, "accountingOrders");
            this.accountingOrders = Optional.ofNullable(accountingOrders);
            return this;
        }

        /**
         * Successful
         */
        public Builder accountingOrders(Optional<? extends List<AccountingOrder>> accountingOrders) {
            Utils.checkNotNull(accountingOrders, "accountingOrders");
            this.accountingOrders = accountingOrders;
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
        
        public ListAccountingOrdersResponse build() {
            return new ListAccountingOrdersResponse(
                accountingOrders,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

