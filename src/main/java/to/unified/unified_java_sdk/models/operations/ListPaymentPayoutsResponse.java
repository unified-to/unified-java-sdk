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
import to.unified.unified_java_sdk.models.shared.PaymentPayout;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class ListPaymentPayoutsResponse implements Response {
    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends List<PaymentPayout>> paymentPayouts;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListPaymentPayoutsResponse(
            String contentType,
            Optional<? extends List<PaymentPayout>> paymentPayouts,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(paymentPayouts, "paymentPayouts");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.paymentPayouts = paymentPayouts;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListPaymentPayoutsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode,
            rawResponse);
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
    public Optional<List<PaymentPayout>> paymentPayouts() {
        return (Optional<List<PaymentPayout>>) paymentPayouts;
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
     * HTTP response content type for this operation
     */
    public ListPaymentPayoutsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public ListPaymentPayoutsResponse withPaymentPayouts(List<PaymentPayout> paymentPayouts) {
        Utils.checkNotNull(paymentPayouts, "paymentPayouts");
        this.paymentPayouts = Optional.ofNullable(paymentPayouts);
        return this;
    }


    /**
     * Successful
     */
    public ListPaymentPayoutsResponse withPaymentPayouts(Optional<? extends List<PaymentPayout>> paymentPayouts) {
        Utils.checkNotNull(paymentPayouts, "paymentPayouts");
        this.paymentPayouts = paymentPayouts;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListPaymentPayoutsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListPaymentPayoutsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListPaymentPayoutsResponse other = (ListPaymentPayoutsResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.paymentPayouts, other.paymentPayouts) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, paymentPayouts, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListPaymentPayoutsResponse.class,
                "contentType", contentType,
                "paymentPayouts", paymentPayouts,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Optional<? extends List<PaymentPayout>> paymentPayouts = Optional.empty();

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
        public Builder paymentPayouts(List<PaymentPayout> paymentPayouts) {
            Utils.checkNotNull(paymentPayouts, "paymentPayouts");
            this.paymentPayouts = Optional.ofNullable(paymentPayouts);
            return this;
        }

        /**
         * Successful
         */
        public Builder paymentPayouts(Optional<? extends List<PaymentPayout>> paymentPayouts) {
            Utils.checkNotNull(paymentPayouts, "paymentPayouts");
            this.paymentPayouts = paymentPayouts;
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

        public ListPaymentPayoutsResponse build() {

            return new ListPaymentPayoutsResponse(
                contentType, paymentPayouts, statusCode,
                rawResponse);
        }

    }
}
