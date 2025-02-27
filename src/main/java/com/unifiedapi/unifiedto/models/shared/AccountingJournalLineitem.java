/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class AccountingJournalLineitem {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    private Optional<String> contactId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invoice_id")
    private Optional<String> invoiceId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_id")
    private Optional<String> paymentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    private Optional<Double> taxAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private Optional<Double> totalAmount;

    @JsonCreator
    public AccountingJournalLineitem(
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("contact_id") Optional<String> contactId,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("invoice_id") Optional<String> invoiceId,
            @JsonProperty("payment_id") Optional<String> paymentId,
            @JsonProperty("tax_amount") Optional<Double> taxAmount,
            @JsonProperty("total_amount") Optional<Double> totalAmount) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(invoiceId, "invoiceId");
        Utils.checkNotNull(paymentId, "paymentId");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.accountId = accountId;
        this.contactId = contactId;
        this.description = description;
        this.id = id;
        this.invoiceId = invoiceId;
        this.paymentId = paymentId;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
    }
    
    public AccountingJournalLineitem() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    @JsonIgnore
    public Optional<String> contactId() {
        return contactId;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> invoiceId() {
        return invoiceId;
    }

    @JsonIgnore
    public Optional<String> paymentId() {
        return paymentId;
    }

    @JsonIgnore
    public Optional<Double> taxAmount() {
        return taxAmount;
    }

    @JsonIgnore
    public Optional<Double> totalAmount() {
        return totalAmount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountingJournalLineitem withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    public AccountingJournalLineitem withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public AccountingJournalLineitem withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }

    public AccountingJournalLineitem withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    public AccountingJournalLineitem withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public AccountingJournalLineitem withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public AccountingJournalLineitem withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AccountingJournalLineitem withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingJournalLineitem withInvoiceId(String invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = Optional.ofNullable(invoiceId);
        return this;
    }

    public AccountingJournalLineitem withInvoiceId(Optional<String> invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = invoiceId;
        return this;
    }

    public AccountingJournalLineitem withPaymentId(String paymentId) {
        Utils.checkNotNull(paymentId, "paymentId");
        this.paymentId = Optional.ofNullable(paymentId);
        return this;
    }

    public AccountingJournalLineitem withPaymentId(Optional<String> paymentId) {
        Utils.checkNotNull(paymentId, "paymentId");
        this.paymentId = paymentId;
        return this;
    }

    public AccountingJournalLineitem withTaxAmount(double taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = Optional.ofNullable(taxAmount);
        return this;
    }

    public AccountingJournalLineitem withTaxAmount(Optional<Double> taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = taxAmount;
        return this;
    }

    public AccountingJournalLineitem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }

    public AccountingJournalLineitem withTotalAmount(Optional<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
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
        AccountingJournalLineitem other = (AccountingJournalLineitem) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.contactId, other.contactId) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.invoiceId, other.invoiceId) &&
            Objects.deepEquals(this.paymentId, other.paymentId) &&
            Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            contactId,
            description,
            id,
            invoiceId,
            paymentId,
            taxAmount,
            totalAmount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingJournalLineitem.class,
                "accountId", accountId,
                "contactId", contactId,
                "description", description,
                "id", id,
                "invoiceId", invoiceId,
                "paymentId", paymentId,
                "taxAmount", taxAmount,
                "totalAmount", totalAmount);
    }
    
    public final static class Builder {
 
        private Optional<String> accountId = Optional.empty();
 
        private Optional<String> contactId = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> invoiceId = Optional.empty();
 
        private Optional<String> paymentId = Optional.empty();
 
        private Optional<Double> taxAmount = Optional.empty();
 
        private Optional<Double> totalAmount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        public Builder accountId(Optional<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder contactId(String contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = Optional.ofNullable(contactId);
            return this;
        }

        public Builder contactId(Optional<String> contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = contactId;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder invoiceId(String invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = Optional.ofNullable(invoiceId);
            return this;
        }

        public Builder invoiceId(Optional<String> invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder paymentId(String paymentId) {
            Utils.checkNotNull(paymentId, "paymentId");
            this.paymentId = Optional.ofNullable(paymentId);
            return this;
        }

        public Builder paymentId(Optional<String> paymentId) {
            Utils.checkNotNull(paymentId, "paymentId");
            this.paymentId = paymentId;
            return this;
        }

        public Builder taxAmount(double taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = Optional.ofNullable(taxAmount);
            return this;
        }

        public Builder taxAmount(Optional<Double> taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = taxAmount;
            return this;
        }

        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = Optional.ofNullable(totalAmount);
            return this;
        }

        public Builder totalAmount(Optional<Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }
        
        public AccountingJournalLineitem build() {
            return new AccountingJournalLineitem(
                accountId,
                contactId,
                description,
                id,
                invoiceId,
                paymentId,
                taxAmount,
                totalAmount);
        }
    }
}

