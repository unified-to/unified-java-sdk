/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;
import to.unified.unified_java_sdk.models.shared.PaymentPayment;
import to.unified.unified_java_sdk.utils.SpeakeasyMetadata;
import to.unified.unified_java_sdk.utils.Utils;


public class CreatePaymentPaymentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PaymentPayment paymentPayment;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<String> raw;

    @JsonCreator
    public CreatePaymentPaymentRequest(
            PaymentPayment paymentPayment,
            String connectionId,
            Optional<? extends List<String>> fields,
            Optional<String> raw) {
        Utils.checkNotNull(paymentPayment, "paymentPayment");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(raw, "raw");
        this.paymentPayment = paymentPayment;
        this.connectionId = connectionId;
        this.fields = fields;
        this.raw = raw;
    }
    
    public CreatePaymentPaymentRequest(
            PaymentPayment paymentPayment,
            String connectionId) {
        this(paymentPayment, connectionId, Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public PaymentPayment paymentPayment() {
        return paymentPayment;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @JsonIgnore
    public Optional<String> raw() {
        return raw;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CreatePaymentPaymentRequest withPaymentPayment(PaymentPayment paymentPayment) {
        Utils.checkNotNull(paymentPayment, "paymentPayment");
        this.paymentPayment = paymentPayment;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreatePaymentPaymentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreatePaymentPaymentRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }


    /**
     * Comma-delimited fields to return
     */
    public CreatePaymentPaymentRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public CreatePaymentPaymentRequest withRaw(String raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public CreatePaymentPaymentRequest withRaw(Optional<String> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
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
        CreatePaymentPaymentRequest other = (CreatePaymentPaymentRequest) o;
        return 
            Utils.enhancedDeepEquals(this.paymentPayment, other.paymentPayment) &&
            Utils.enhancedDeepEquals(this.connectionId, other.connectionId) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            paymentPayment, connectionId, fields,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePaymentPaymentRequest.class,
                "paymentPayment", paymentPayment,
                "connectionId", connectionId,
                "fields", fields,
                "raw", raw);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private PaymentPayment paymentPayment;

        private String connectionId;

        private Optional<? extends List<String>> fields = Optional.empty();

        private Optional<String> raw = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder paymentPayment(PaymentPayment paymentPayment) {
            Utils.checkNotNull(paymentPayment, "paymentPayment");
            this.paymentPayment = paymentPayment;
            return this;
        }


        /**
         * ID of the connection
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }


        /**
         * Comma-delimited fields to return
         */
        public Builder fields(List<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * Comma-delimited fields to return
         */
        public Builder fields(Optional<? extends List<String>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }


        /**
         * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
         */
        public Builder raw(String raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        /**
         * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
         */
        public Builder raw(Optional<String> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public CreatePaymentPaymentRequest build() {

            return new CreatePaymentPaymentRequest(
                paymentPayment, connectionId, fields,
                raw);
        }

    }
}
