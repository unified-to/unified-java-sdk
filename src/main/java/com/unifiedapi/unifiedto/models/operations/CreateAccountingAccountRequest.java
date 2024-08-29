/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateAccountingAccountRequest {

    /**
     * Chart of accounts
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AccountingAccount> accountingAccount;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @JsonCreator
    public CreateAccountingAccountRequest(
            Optional<? extends AccountingAccount> accountingAccount,
            String connectionId) {
        Utils.checkNotNull(accountingAccount, "accountingAccount");
        Utils.checkNotNull(connectionId, "connectionId");
        this.accountingAccount = accountingAccount;
        this.connectionId = connectionId;
    }
    
    public CreateAccountingAccountRequest(
            String connectionId) {
        this(Optional.empty(), connectionId);
    }

    /**
     * Chart of accounts
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingAccount> accountingAccount() {
        return (Optional<AccountingAccount>) accountingAccount;
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

    /**
     * Chart of accounts
     */
    public CreateAccountingAccountRequest withAccountingAccount(AccountingAccount accountingAccount) {
        Utils.checkNotNull(accountingAccount, "accountingAccount");
        this.accountingAccount = Optional.ofNullable(accountingAccount);
        return this;
    }

    /**
     * Chart of accounts
     */
    public CreateAccountingAccountRequest withAccountingAccount(Optional<? extends AccountingAccount> accountingAccount) {
        Utils.checkNotNull(accountingAccount, "accountingAccount");
        this.accountingAccount = accountingAccount;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateAccountingAccountRequest withConnectionId(String connectionId) {
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
        CreateAccountingAccountRequest other = (CreateAccountingAccountRequest) o;
        return 
            Objects.deepEquals(this.accountingAccount, other.accountingAccount) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingAccount,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountingAccountRequest.class,
                "accountingAccount", accountingAccount,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingAccount> accountingAccount = Optional.empty();
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Chart of accounts
         */
        public Builder accountingAccount(AccountingAccount accountingAccount) {
            Utils.checkNotNull(accountingAccount, "accountingAccount");
            this.accountingAccount = Optional.ofNullable(accountingAccount);
            return this;
        }

        /**
         * Chart of accounts
         */
        public Builder accountingAccount(Optional<? extends AccountingAccount> accountingAccount) {
            Utils.checkNotNull(accountingAccount, "accountingAccount");
            this.accountingAccount = accountingAccount;
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
        
        public CreateAccountingAccountRequest build() {
            return new CreateAccountingAccountRequest(
                accountingAccount,
                connectionId);
        }
    }
}
