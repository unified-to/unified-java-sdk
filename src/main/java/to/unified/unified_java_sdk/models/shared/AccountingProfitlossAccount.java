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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class AccountingProfitlossAccount {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_name")
    private Optional<String> accountName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private Optional<Double> totalAmount;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction_ids")
    private Optional<? extends List<String>> transactionIds;

    @JsonCreator
    public AccountingProfitlossAccount(
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("account_name") Optional<String> accountName,
            @JsonProperty("total_amount") Optional<Double> totalAmount,
            @JsonProperty("transaction_ids") Optional<? extends List<String>> transactionIds) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(accountName, "accountName");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(transactionIds, "transactionIds");
        this.accountId = accountId;
        this.accountName = accountName;
        this.totalAmount = totalAmount;
        this.transactionIds = transactionIds;
    }
    
    public AccountingProfitlossAccount() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    @JsonIgnore
    public Optional<String> accountName() {
        return accountName;
    }

    @JsonIgnore
    public Optional<Double> totalAmount() {
        return totalAmount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> transactionIds() {
        return (Optional<List<String>>) transactionIds;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AccountingProfitlossAccount withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }


    public AccountingProfitlossAccount withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public AccountingProfitlossAccount withAccountName(String accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = Optional.ofNullable(accountName);
        return this;
    }


    public AccountingProfitlossAccount withAccountName(Optional<String> accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = accountName;
        return this;
    }

    public AccountingProfitlossAccount withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }


    public AccountingProfitlossAccount withTotalAmount(Optional<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public AccountingProfitlossAccount withTransactionIds(List<String> transactionIds) {
        Utils.checkNotNull(transactionIds, "transactionIds");
        this.transactionIds = Optional.ofNullable(transactionIds);
        return this;
    }


    public AccountingProfitlossAccount withTransactionIds(Optional<? extends List<String>> transactionIds) {
        Utils.checkNotNull(transactionIds, "transactionIds");
        this.transactionIds = transactionIds;
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
        AccountingProfitlossAccount other = (AccountingProfitlossAccount) o;
        return 
            Utils.enhancedDeepEquals(this.accountId, other.accountId) &&
            Utils.enhancedDeepEquals(this.accountName, other.accountName) &&
            Utils.enhancedDeepEquals(this.totalAmount, other.totalAmount) &&
            Utils.enhancedDeepEquals(this.transactionIds, other.transactionIds);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountId, accountName, totalAmount,
            transactionIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingProfitlossAccount.class,
                "accountId", accountId,
                "accountName", accountName,
                "totalAmount", totalAmount,
                "transactionIds", transactionIds);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> accountId = Optional.empty();

        private Optional<String> accountName = Optional.empty();

        private Optional<Double> totalAmount = Optional.empty();

        private Optional<? extends List<String>> transactionIds = Optional.empty();

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


        public Builder accountName(String accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = Optional.ofNullable(accountName);
            return this;
        }

        public Builder accountName(Optional<String> accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = accountName;
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


        public Builder transactionIds(List<String> transactionIds) {
            Utils.checkNotNull(transactionIds, "transactionIds");
            this.transactionIds = Optional.ofNullable(transactionIds);
            return this;
        }

        public Builder transactionIds(Optional<? extends List<String>> transactionIds) {
            Utils.checkNotNull(transactionIds, "transactionIds");
            this.transactionIds = transactionIds;
            return this;
        }

        public AccountingProfitlossAccount build() {

            return new AccountingProfitlossAccount(
                accountId, accountName, totalAmount,
                transactionIds);
        }

    }
}
