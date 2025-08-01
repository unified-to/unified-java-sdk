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
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class GetAccountingAccountResponse implements Response {
    /**
     * Successful
     */
    private Optional<? extends AccountingAccount> accountingAccount;

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
    public GetAccountingAccountResponse(
            Optional<? extends AccountingAccount> accountingAccount,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingAccount, "accountingAccount");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingAccount = accountingAccount;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingAccountResponse(
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
    public Optional<AccountingAccount> accountingAccount() {
        return (Optional<AccountingAccount>) accountingAccount;
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
    public GetAccountingAccountResponse withAccountingAccount(AccountingAccount accountingAccount) {
        Utils.checkNotNull(accountingAccount, "accountingAccount");
        this.accountingAccount = Optional.ofNullable(accountingAccount);
        return this;
    }


    /**
     * Successful
     */
    public GetAccountingAccountResponse withAccountingAccount(Optional<? extends AccountingAccount> accountingAccount) {
        Utils.checkNotNull(accountingAccount, "accountingAccount");
        this.accountingAccount = accountingAccount;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingAccountResponse other = (GetAccountingAccountResponse) o;
        return 
            Utils.enhancedDeepEquals(this.accountingAccount, other.accountingAccount) &&
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountingAccount, contentType, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingAccountResponse.class,
                "accountingAccount", accountingAccount,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends AccountingAccount> accountingAccount = Optional.empty();

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Successful
         */
        public Builder accountingAccount(AccountingAccount accountingAccount) {
            Utils.checkNotNull(accountingAccount, "accountingAccount");
            this.accountingAccount = Optional.ofNullable(accountingAccount);
            return this;
        }

        /**
         * Successful
         */
        public Builder accountingAccount(Optional<? extends AccountingAccount> accountingAccount) {
            Utils.checkNotNull(accountingAccount, "accountingAccount");
            this.accountingAccount = accountingAccount;
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

        public GetAccountingAccountResponse build() {

            return new GetAccountingAccountResponse(
                accountingAccount, contentType, statusCode,
                rawResponse);
        }

    }
}
