/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class AccountingTransaction {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    private Optional<String> contactId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contacts")
    private Optional<? extends List<AccountingTransactionContact>> contacts;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_message")
    private Optional<String> customerMessage;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineitems")
    private Optional<? extends List<AccountingTransactionLineItem>> lineitems;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memo")
    private Optional<String> memo;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_method")
    private Optional<String> paymentMethod;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_terms")
    private Optional<String> paymentTerms;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<String> reference;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("split_account_id")
    private Optional<String> splitAccountId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sub_total_amount")
    private Optional<Double> subTotalAmount;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    private Optional<Double> taxAmount;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private Optional<Double> totalAmount;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public AccountingTransaction(
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("contact_id") Optional<String> contactId,
            @JsonProperty("contacts") Optional<? extends List<AccountingTransactionContact>> contacts,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("customer_message") Optional<String> customerMessage,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("lineitems") Optional<? extends List<AccountingTransactionLineItem>> lineitems,
            @JsonProperty("memo") Optional<String> memo,
            @JsonProperty("payment_method") Optional<String> paymentMethod,
            @JsonProperty("payment_terms") Optional<String> paymentTerms,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("split_account_id") Optional<String> splitAccountId,
            @JsonProperty("sub_total_amount") Optional<Double> subTotalAmount,
            @JsonProperty("tax_amount") Optional<Double> taxAmount,
            @JsonProperty("total_amount") Optional<Double> totalAmount,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(contacts, "contacts");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(customerMessage, "customerMessage");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lineitems, "lineitems");
        Utils.checkNotNull(memo, "memo");
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        Utils.checkNotNull(paymentTerms, "paymentTerms");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(splitAccountId, "splitAccountId");
        Utils.checkNotNull(subTotalAmount, "subTotalAmount");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.accountId = accountId;
        this.contactId = contactId;
        this.contacts = contacts;
        this.createdAt = createdAt;
        this.currency = currency;
        this.customerMessage = customerMessage;
        this.id = id;
        this.lineitems = lineitems;
        this.memo = memo;
        this.paymentMethod = paymentMethod;
        this.paymentTerms = paymentTerms;
        this.raw = raw;
        this.reference = reference;
        this.splitAccountId = splitAccountId;
        this.subTotalAmount = subTotalAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.type = type;
        this.updatedAt = updatedAt;
    }
    
    public AccountingTransaction() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    @JsonIgnore
    public Optional<String> contactId() {
        return contactId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AccountingTransactionContact>> contacts() {
        return (Optional<List<AccountingTransactionContact>>) contacts;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    @JsonIgnore
    public Optional<String> customerMessage() {
        return customerMessage;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AccountingTransactionLineItem>> lineitems() {
        return (Optional<List<AccountingTransactionLineItem>>) lineitems;
    }

    @JsonIgnore
    public Optional<String> memo() {
        return memo;
    }

    @JsonIgnore
    public Optional<String> paymentMethod() {
        return paymentMethod;
    }

    @JsonIgnore
    public Optional<String> paymentTerms() {
        return paymentTerms;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> reference() {
        return reference;
    }

    @JsonIgnore
    public Optional<String> splitAccountId() {
        return splitAccountId;
    }

    @JsonIgnore
    public Optional<Double> subTotalAmount() {
        return subTotalAmount;
    }

    @JsonIgnore
    public Optional<Double> taxAmount() {
        return taxAmount;
    }

    @JsonIgnore
    public Optional<Double> totalAmount() {
        return totalAmount;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AccountingTransaction withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }


    public AccountingTransaction withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public AccountingTransaction withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }


    public AccountingTransaction withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    public AccountingTransaction withContacts(List<AccountingTransactionContact> contacts) {
        Utils.checkNotNull(contacts, "contacts");
        this.contacts = Optional.ofNullable(contacts);
        return this;
    }


    public AccountingTransaction withContacts(Optional<? extends List<AccountingTransactionContact>> contacts) {
        Utils.checkNotNull(contacts, "contacts");
        this.contacts = contacts;
        return this;
    }

    public AccountingTransaction withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public AccountingTransaction withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AccountingTransaction withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }


    public AccountingTransaction withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public AccountingTransaction withCustomerMessage(String customerMessage) {
        Utils.checkNotNull(customerMessage, "customerMessage");
        this.customerMessage = Optional.ofNullable(customerMessage);
        return this;
    }


    public AccountingTransaction withCustomerMessage(Optional<String> customerMessage) {
        Utils.checkNotNull(customerMessage, "customerMessage");
        this.customerMessage = customerMessage;
        return this;
    }

    public AccountingTransaction withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public AccountingTransaction withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingTransaction withLineitems(List<AccountingTransactionLineItem> lineitems) {
        Utils.checkNotNull(lineitems, "lineitems");
        this.lineitems = Optional.ofNullable(lineitems);
        return this;
    }


    public AccountingTransaction withLineitems(Optional<? extends List<AccountingTransactionLineItem>> lineitems) {
        Utils.checkNotNull(lineitems, "lineitems");
        this.lineitems = lineitems;
        return this;
    }

    public AccountingTransaction withMemo(String memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = Optional.ofNullable(memo);
        return this;
    }


    public AccountingTransaction withMemo(Optional<String> memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = memo;
        return this;
    }

    public AccountingTransaction withPaymentMethod(String paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = Optional.ofNullable(paymentMethod);
        return this;
    }


    public AccountingTransaction withPaymentMethod(Optional<String> paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = paymentMethod;
        return this;
    }

    public AccountingTransaction withPaymentTerms(String paymentTerms) {
        Utils.checkNotNull(paymentTerms, "paymentTerms");
        this.paymentTerms = Optional.ofNullable(paymentTerms);
        return this;
    }


    public AccountingTransaction withPaymentTerms(Optional<String> paymentTerms) {
        Utils.checkNotNull(paymentTerms, "paymentTerms");
        this.paymentTerms = paymentTerms;
        return this;
    }

    public AccountingTransaction withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    public AccountingTransaction withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public AccountingTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }


    public AccountingTransaction withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public AccountingTransaction withSplitAccountId(String splitAccountId) {
        Utils.checkNotNull(splitAccountId, "splitAccountId");
        this.splitAccountId = Optional.ofNullable(splitAccountId);
        return this;
    }


    public AccountingTransaction withSplitAccountId(Optional<String> splitAccountId) {
        Utils.checkNotNull(splitAccountId, "splitAccountId");
        this.splitAccountId = splitAccountId;
        return this;
    }

    public AccountingTransaction withSubTotalAmount(double subTotalAmount) {
        Utils.checkNotNull(subTotalAmount, "subTotalAmount");
        this.subTotalAmount = Optional.ofNullable(subTotalAmount);
        return this;
    }


    public AccountingTransaction withSubTotalAmount(Optional<Double> subTotalAmount) {
        Utils.checkNotNull(subTotalAmount, "subTotalAmount");
        this.subTotalAmount = subTotalAmount;
        return this;
    }

    public AccountingTransaction withTaxAmount(double taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = Optional.ofNullable(taxAmount);
        return this;
    }


    public AccountingTransaction withTaxAmount(Optional<Double> taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = taxAmount;
        return this;
    }

    public AccountingTransaction withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }


    public AccountingTransaction withTotalAmount(Optional<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public AccountingTransaction withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }


    public AccountingTransaction withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public AccountingTransaction withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public AccountingTransaction withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        AccountingTransaction other = (AccountingTransaction) o;
        return 
            Utils.enhancedDeepEquals(this.accountId, other.accountId) &&
            Utils.enhancedDeepEquals(this.contactId, other.contactId) &&
            Utils.enhancedDeepEquals(this.contacts, other.contacts) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.currency, other.currency) &&
            Utils.enhancedDeepEquals(this.customerMessage, other.customerMessage) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.lineitems, other.lineitems) &&
            Utils.enhancedDeepEquals(this.memo, other.memo) &&
            Utils.enhancedDeepEquals(this.paymentMethod, other.paymentMethod) &&
            Utils.enhancedDeepEquals(this.paymentTerms, other.paymentTerms) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.reference, other.reference) &&
            Utils.enhancedDeepEquals(this.splitAccountId, other.splitAccountId) &&
            Utils.enhancedDeepEquals(this.subTotalAmount, other.subTotalAmount) &&
            Utils.enhancedDeepEquals(this.taxAmount, other.taxAmount) &&
            Utils.enhancedDeepEquals(this.totalAmount, other.totalAmount) &&
            Utils.enhancedDeepEquals(this.type, other.type) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountId, contactId, contacts,
            createdAt, currency, customerMessage,
            id, lineitems, memo,
            paymentMethod, paymentTerms, raw,
            reference, splitAccountId, subTotalAmount,
            taxAmount, totalAmount, type,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingTransaction.class,
                "accountId", accountId,
                "contactId", contactId,
                "contacts", contacts,
                "createdAt", createdAt,
                "currency", currency,
                "customerMessage", customerMessage,
                "id", id,
                "lineitems", lineitems,
                "memo", memo,
                "paymentMethod", paymentMethod,
                "paymentTerms", paymentTerms,
                "raw", raw,
                "reference", reference,
                "splitAccountId", splitAccountId,
                "subTotalAmount", subTotalAmount,
                "taxAmount", taxAmount,
                "totalAmount", totalAmount,
                "type", type,
                "updatedAt", updatedAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> accountId = Optional.empty();

        private Optional<String> contactId = Optional.empty();

        private Optional<? extends List<AccountingTransactionContact>> contacts = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> currency = Optional.empty();

        private Optional<String> customerMessage = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<? extends List<AccountingTransactionLineItem>> lineitems = Optional.empty();

        private Optional<String> memo = Optional.empty();

        private Optional<String> paymentMethod = Optional.empty();

        private Optional<String> paymentTerms = Optional.empty();

        private Optional<? extends Map<String, Object>> raw = Optional.empty();

        private Optional<String> reference = Optional.empty();

        private Optional<String> splitAccountId = Optional.empty();

        private Optional<Double> subTotalAmount = Optional.empty();

        private Optional<Double> taxAmount = Optional.empty();

        private Optional<Double> totalAmount = Optional.empty();

        private Optional<String> type = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

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


        public Builder contacts(List<AccountingTransactionContact> contacts) {
            Utils.checkNotNull(contacts, "contacts");
            this.contacts = Optional.ofNullable(contacts);
            return this;
        }

        public Builder contacts(Optional<? extends List<AccountingTransactionContact>> contacts) {
            Utils.checkNotNull(contacts, "contacts");
            this.contacts = contacts;
            return this;
        }


        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }


        public Builder customerMessage(String customerMessage) {
            Utils.checkNotNull(customerMessage, "customerMessage");
            this.customerMessage = Optional.ofNullable(customerMessage);
            return this;
        }

        public Builder customerMessage(Optional<String> customerMessage) {
            Utils.checkNotNull(customerMessage, "customerMessage");
            this.customerMessage = customerMessage;
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


        public Builder lineitems(List<AccountingTransactionLineItem> lineitems) {
            Utils.checkNotNull(lineitems, "lineitems");
            this.lineitems = Optional.ofNullable(lineitems);
            return this;
        }

        public Builder lineitems(Optional<? extends List<AccountingTransactionLineItem>> lineitems) {
            Utils.checkNotNull(lineitems, "lineitems");
            this.lineitems = lineitems;
            return this;
        }


        public Builder memo(String memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = Optional.ofNullable(memo);
            return this;
        }

        public Builder memo(Optional<String> memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = memo;
            return this;
        }


        public Builder paymentMethod(String paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = Optional.ofNullable(paymentMethod);
            return this;
        }

        public Builder paymentMethod(Optional<String> paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            return this;
        }


        public Builder paymentTerms(String paymentTerms) {
            Utils.checkNotNull(paymentTerms, "paymentTerms");
            this.paymentTerms = Optional.ofNullable(paymentTerms);
            return this;
        }

        public Builder paymentTerms(Optional<String> paymentTerms) {
            Utils.checkNotNull(paymentTerms, "paymentTerms");
            this.paymentTerms = paymentTerms;
            return this;
        }


        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends Map<String, Object>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }


        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }


        public Builder splitAccountId(String splitAccountId) {
            Utils.checkNotNull(splitAccountId, "splitAccountId");
            this.splitAccountId = Optional.ofNullable(splitAccountId);
            return this;
        }

        public Builder splitAccountId(Optional<String> splitAccountId) {
            Utils.checkNotNull(splitAccountId, "splitAccountId");
            this.splitAccountId = splitAccountId;
            return this;
        }


        public Builder subTotalAmount(double subTotalAmount) {
            Utils.checkNotNull(subTotalAmount, "subTotalAmount");
            this.subTotalAmount = Optional.ofNullable(subTotalAmount);
            return this;
        }

        public Builder subTotalAmount(Optional<Double> subTotalAmount) {
            Utils.checkNotNull(subTotalAmount, "subTotalAmount");
            this.subTotalAmount = subTotalAmount;
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


        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }


        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public AccountingTransaction build() {

            return new AccountingTransaction(
                accountId, contactId, contacts,
                createdAt, currency, customerMessage,
                id, lineitems, memo,
                paymentMethod, paymentTerms, raw,
                reference, splitAccountId, subTotalAmount,
                taxAmount, totalAmount, type,
                updatedAt);
        }

    }
}
