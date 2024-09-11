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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class UpdatePaymentLinkRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends PaymentLink> paymentLink;

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
     * ID of the Link
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdatePaymentLinkRequest(
            Optional<? extends PaymentLink> paymentLink,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(paymentLink, "paymentLink");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.paymentLink = paymentLink;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public UpdatePaymentLinkRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, Optional.empty(), id);
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
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
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

    public UpdatePaymentLinkRequest withPaymentLink(PaymentLink paymentLink) {
        Utils.checkNotNull(paymentLink, "paymentLink");
        this.paymentLink = Optional.ofNullable(paymentLink);
        return this;
    }

    public UpdatePaymentLinkRequest withPaymentLink(Optional<? extends PaymentLink> paymentLink) {
        Utils.checkNotNull(paymentLink, "paymentLink");
        this.paymentLink = paymentLink;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdatePaymentLinkRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdatePaymentLinkRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdatePaymentLinkRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Link
     */
    public UpdatePaymentLinkRequest withId(String id) {
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
        UpdatePaymentLinkRequest other = (UpdatePaymentLinkRequest) o;
        return 
            Objects.deepEquals(this.paymentLink, other.paymentLink) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentLink,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdatePaymentLinkRequest.class,
                "paymentLink", paymentLink,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends PaymentLink> paymentLink = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
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
         * ID of the Link
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdatePaymentLinkRequest build() {
            return new UpdatePaymentLinkRequest(
                paymentLink,
                connectionId,
                fields,
                id);
        }
    }
}

