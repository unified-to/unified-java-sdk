/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import to.unified.unifiedto.models.shared.PaymentSubscription;
import to.unified.unifiedto.utils.SpeakeasyMetadata;
import to.unified.unifiedto.utils.Utils;

public class CreatePaymentSubscriptionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PaymentSubscription paymentSubscription;

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

    @JsonCreator
    public CreatePaymentSubscriptionRequest(
            PaymentSubscription paymentSubscription,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(paymentSubscription, "paymentSubscription");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.paymentSubscription = paymentSubscription;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreatePaymentSubscriptionRequest(
            PaymentSubscription paymentSubscription,
            String connectionId) {
        this(paymentSubscription, connectionId, Optional.empty());
    }

    @JsonIgnore
    public PaymentSubscription paymentSubscription() {
        return paymentSubscription;
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

    public final static Builder builder() {
        return new Builder();
    }

    public CreatePaymentSubscriptionRequest withPaymentSubscription(PaymentSubscription paymentSubscription) {
        Utils.checkNotNull(paymentSubscription, "paymentSubscription");
        this.paymentSubscription = paymentSubscription;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreatePaymentSubscriptionRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreatePaymentSubscriptionRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreatePaymentSubscriptionRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
        CreatePaymentSubscriptionRequest other = (CreatePaymentSubscriptionRequest) o;
        return 
            Objects.deepEquals(this.paymentSubscription, other.paymentSubscription) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentSubscription,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePaymentSubscriptionRequest.class,
                "paymentSubscription", paymentSubscription,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private PaymentSubscription paymentSubscription;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder paymentSubscription(PaymentSubscription paymentSubscription) {
            Utils.checkNotNull(paymentSubscription, "paymentSubscription");
            this.paymentSubscription = paymentSubscription;
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
        
        public CreatePaymentSubscriptionRequest build() {
            return new CreatePaymentSubscriptionRequest(
                paymentSubscription,
                connectionId,
                fields);
        }
    }
}

