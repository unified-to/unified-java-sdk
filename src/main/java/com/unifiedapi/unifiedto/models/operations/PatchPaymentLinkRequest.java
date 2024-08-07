/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.PaymentLink;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PatchPaymentLinkRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends PaymentLink> paymentLink;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Link
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchPaymentLinkRequest(
            Optional<? extends PaymentLink> paymentLink,
            String connectionId,
            String id) {
        Utils.checkNotNull(paymentLink, "paymentLink");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.paymentLink = paymentLink;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public PatchPaymentLinkRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentLink> paymentLink() {
        return (Optional<PaymentLink>) paymentLink;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Link
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchPaymentLinkRequest withPaymentLink(PaymentLink paymentLink) {
        Utils.checkNotNull(paymentLink, "paymentLink");
        this.paymentLink = Optional.ofNullable(paymentLink);
        return this;
    }

    public PatchPaymentLinkRequest withPaymentLink(Optional<? extends PaymentLink> paymentLink) {
        Utils.checkNotNull(paymentLink, "paymentLink");
        this.paymentLink = paymentLink;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchPaymentLinkRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Link
     */
    public PatchPaymentLinkRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        PatchPaymentLinkRequest other = (PatchPaymentLinkRequest) o;
        return 
            Objects.deepEquals(this.paymentLink, other.paymentLink) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentLink,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchPaymentLinkRequest.class,
                "paymentLink", paymentLink,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends PaymentLink> paymentLink = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder paymentLink(PaymentLink paymentLink) {
            Utils.checkNotNull(paymentLink, "paymentLink");
            this.paymentLink = Optional.ofNullable(paymentLink);
            return this;
        }

        public Builder paymentLink(Optional<? extends PaymentLink> paymentLink) {
            Utils.checkNotNull(paymentLink, "paymentLink");
            this.paymentLink = paymentLink;
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
         * ID of the Link
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchPaymentLinkRequest build() {
            return new PatchPaymentLinkRequest(
                paymentLink,
                connectionId,
                id);
        }
    }
}

