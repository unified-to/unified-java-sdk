/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AccountingJournal;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CreateAccountingJournalRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private AccountingJournal accountingJournal;

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
    public CreateAccountingJournalRequest(
            AccountingJournal accountingJournal,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(accountingJournal, "accountingJournal");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.accountingJournal = accountingJournal;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateAccountingJournalRequest(
            AccountingJournal accountingJournal,
            String connectionId) {
        this(accountingJournal, connectionId, Optional.empty());
    }

    @JsonIgnore
    public AccountingJournal accountingJournal() {
        return accountingJournal;
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

    public CreateAccountingJournalRequest withAccountingJournal(AccountingJournal accountingJournal) {
        Utils.checkNotNull(accountingJournal, "accountingJournal");
        this.accountingJournal = accountingJournal;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateAccountingJournalRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAccountingJournalRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAccountingJournalRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateAccountingJournalRequest other = (CreateAccountingJournalRequest) o;
        return 
            Objects.deepEquals(this.accountingJournal, other.accountingJournal) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingJournal,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountingJournalRequest.class,
                "accountingJournal", accountingJournal,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private AccountingJournal accountingJournal;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountingJournal(AccountingJournal accountingJournal) {
            Utils.checkNotNull(accountingJournal, "accountingJournal");
            this.accountingJournal = accountingJournal;
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
        
        public CreateAccountingJournalRequest build() {
            return new CreateAccountingJournalRequest(
                accountingJournal,
                connectionId,
                fields);
        }
    }
}

