/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.PaymentPayment;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreatePaymentPaymentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends PaymentPayment> paymentPayment;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreatePaymentPaymentRequest(
            Optional<? extends PaymentPayment> paymentPayment,
            String connectionId) {
        Utils.checkNotNull(paymentPayment, "paymentPayment");
        Utils.checkNotNull(connectionId, "connectionId");
        this.paymentPayment = paymentPayment;
        this.connectionId = connectionId;
    }
    
    public CreatePaymentPaymentRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentPayment> paymentPayment() {
        return (Optional<PaymentPayment>) paymentPayment;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreatePaymentPaymentRequest withPaymentPayment(PaymentPayment paymentPayment) {
        Utils.checkNotNull(paymentPayment, "paymentPayment");
        this.paymentPayment = Optional.ofNullable(paymentPayment);
        return this;
    }

    public CreatePaymentPaymentRequest withPaymentPayment(Optional<? extends PaymentPayment> paymentPayment) {
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
            Objects.deepEquals(this.paymentPayment, other.paymentPayment) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentPayment,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePaymentPaymentRequest.class,
                "paymentPayment", paymentPayment,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends PaymentPayment> paymentPayment = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder paymentPayment(PaymentPayment paymentPayment) {
            Utils.checkNotNull(paymentPayment, "paymentPayment");
            this.paymentPayment = Optional.ofNullable(paymentPayment);
            return this;
        }

        public Builder paymentPayment(Optional<? extends PaymentPayment> paymentPayment) {
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
        
        public CreatePaymentPaymentRequest build() {
            return new CreatePaymentPaymentRequest(
                paymentPayment,
                connectionId);
        }
    }
}
