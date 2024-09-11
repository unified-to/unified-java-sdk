/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AccountingTransaction;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateAccountingTransactionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AccountingTransaction> accountingTransaction;

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
    public CreateAccountingTransactionRequest(
            Optional<? extends AccountingTransaction> accountingTransaction,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(accountingTransaction, "accountingTransaction");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.accountingTransaction = accountingTransaction;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateAccountingTransactionRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingTransaction> accountingTransaction() {
        return (Optional<AccountingTransaction>) accountingTransaction;
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

    public CreateAccountingTransactionRequest withAccountingTransaction(AccountingTransaction accountingTransaction) {
        Utils.checkNotNull(accountingTransaction, "accountingTransaction");
        this.accountingTransaction = Optional.ofNullable(accountingTransaction);
        return this;
    }

    public CreateAccountingTransactionRequest withAccountingTransaction(Optional<? extends AccountingTransaction> accountingTransaction) {
        Utils.checkNotNull(accountingTransaction, "accountingTransaction");
        this.accountingTransaction = accountingTransaction;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateAccountingTransactionRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAccountingTransactionRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAccountingTransactionRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateAccountingTransactionRequest other = (CreateAccountingTransactionRequest) o;
        return 
            Objects.deepEquals(this.accountingTransaction, other.accountingTransaction) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingTransaction,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountingTransactionRequest.class,
                "accountingTransaction", accountingTransaction,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingTransaction> accountingTransaction = Optional.empty();
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountingTransaction(AccountingTransaction accountingTransaction) {
            Utils.checkNotNull(accountingTransaction, "accountingTransaction");
            this.accountingTransaction = Optional.ofNullable(accountingTransaction);
            return this;
        }

        public Builder accountingTransaction(Optional<? extends AccountingTransaction> accountingTransaction) {
            Utils.checkNotNull(accountingTransaction, "accountingTransaction");
            this.accountingTransaction = accountingTransaction;
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
        
        public CreateAccountingTransactionRequest build() {
            return new CreateAccountingTransactionRequest(
                accountingTransaction,
                connectionId,
                fields);
        }
    }
}

