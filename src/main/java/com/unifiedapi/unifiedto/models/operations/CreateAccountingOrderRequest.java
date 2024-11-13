/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AccountingOrder;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateAccountingOrderRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AccountingOrder> accountingOrder;

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
    public CreateAccountingOrderRequest(
            Optional<? extends AccountingOrder> accountingOrder,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(accountingOrder, "accountingOrder");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.accountingOrder = accountingOrder;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateAccountingOrderRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingOrder> accountingOrder() {
        return (Optional<AccountingOrder>) accountingOrder;
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

    public CreateAccountingOrderRequest withAccountingOrder(AccountingOrder accountingOrder) {
        Utils.checkNotNull(accountingOrder, "accountingOrder");
        this.accountingOrder = Optional.ofNullable(accountingOrder);
        return this;
    }

    public CreateAccountingOrderRequest withAccountingOrder(Optional<? extends AccountingOrder> accountingOrder) {
        Utils.checkNotNull(accountingOrder, "accountingOrder");
        this.accountingOrder = accountingOrder;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateAccountingOrderRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAccountingOrderRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAccountingOrderRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateAccountingOrderRequest other = (CreateAccountingOrderRequest) o;
        return 
            Objects.deepEquals(this.accountingOrder, other.accountingOrder) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingOrder,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountingOrderRequest.class,
                "accountingOrder", accountingOrder,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingOrder> accountingOrder = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountingOrder(AccountingOrder accountingOrder) {
            Utils.checkNotNull(accountingOrder, "accountingOrder");
            this.accountingOrder = Optional.ofNullable(accountingOrder);
            return this;
        }

        public Builder accountingOrder(Optional<? extends AccountingOrder> accountingOrder) {
            Utils.checkNotNull(accountingOrder, "accountingOrder");
            this.accountingOrder = accountingOrder;
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
        
        public CreateAccountingOrderRequest build() {
            return new CreateAccountingOrderRequest(
                accountingOrder,
                connectionId,
                fields);
        }
    }
}
