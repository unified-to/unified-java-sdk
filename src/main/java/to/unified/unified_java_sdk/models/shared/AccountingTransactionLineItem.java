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
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class AccountingTransactionLineItem {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_type")
    private Optional<String> objectType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private Optional<Double> totalAmount;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_amount")
    private Optional<Double> unitAmount;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_quantity")
    private Optional<Double> unitQuantity;

    @JsonCreator
    public AccountingTransactionLineItem(
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("object_type") Optional<String> objectType,
            @JsonProperty("total_amount") Optional<Double> totalAmount,
            @JsonProperty("unit_amount") Optional<Double> unitAmount,
            @JsonProperty("unit_quantity") Optional<Double> unitQuantity) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(objectType, "objectType");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(unitAmount, "unitAmount");
        Utils.checkNotNull(unitQuantity, "unitQuantity");
        this.accountId = accountId;
        this.description = description;
        this.id = id;
        this.name = name;
        this.objectType = objectType;
        this.totalAmount = totalAmount;
        this.unitAmount = unitAmount;
        this.unitQuantity = unitQuantity;
    }
    
    public AccountingTransactionLineItem() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
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
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> objectType() {
        return objectType;
    }

    @JsonIgnore
    public Optional<Double> totalAmount() {
        return totalAmount;
    }

    @JsonIgnore
    public Optional<Double> unitAmount() {
        return unitAmount;
    }

    @JsonIgnore
    public Optional<Double> unitQuantity() {
        return unitQuantity;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AccountingTransactionLineItem withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }


    public AccountingTransactionLineItem withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public AccountingTransactionLineItem withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }


    public AccountingTransactionLineItem withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public AccountingTransactionLineItem withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public AccountingTransactionLineItem withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingTransactionLineItem withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }


    public AccountingTransactionLineItem withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public AccountingTransactionLineItem withObjectType(String objectType) {
        Utils.checkNotNull(objectType, "objectType");
        this.objectType = Optional.ofNullable(objectType);
        return this;
    }


    public AccountingTransactionLineItem withObjectType(Optional<String> objectType) {
        Utils.checkNotNull(objectType, "objectType");
        this.objectType = objectType;
        return this;
    }

    public AccountingTransactionLineItem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }


    public AccountingTransactionLineItem withTotalAmount(Optional<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public AccountingTransactionLineItem withUnitAmount(double unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = Optional.ofNullable(unitAmount);
        return this;
    }


    public AccountingTransactionLineItem withUnitAmount(Optional<Double> unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = unitAmount;
        return this;
    }

    public AccountingTransactionLineItem withUnitQuantity(double unitQuantity) {
        Utils.checkNotNull(unitQuantity, "unitQuantity");
        this.unitQuantity = Optional.ofNullable(unitQuantity);
        return this;
    }


    public AccountingTransactionLineItem withUnitQuantity(Optional<Double> unitQuantity) {
        Utils.checkNotNull(unitQuantity, "unitQuantity");
        this.unitQuantity = unitQuantity;
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
        AccountingTransactionLineItem other = (AccountingTransactionLineItem) o;
        return 
            Utils.enhancedDeepEquals(this.accountId, other.accountId) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.objectType, other.objectType) &&
            Utils.enhancedDeepEquals(this.totalAmount, other.totalAmount) &&
            Utils.enhancedDeepEquals(this.unitAmount, other.unitAmount) &&
            Utils.enhancedDeepEquals(this.unitQuantity, other.unitQuantity);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            accountId, description, id,
            name, objectType, totalAmount,
            unitAmount, unitQuantity);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingTransactionLineItem.class,
                "accountId", accountId,
                "description", description,
                "id", id,
                "name", name,
                "objectType", objectType,
                "totalAmount", totalAmount,
                "unitAmount", unitAmount,
                "unitQuantity", unitQuantity);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> accountId = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> objectType = Optional.empty();

        private Optional<Double> totalAmount = Optional.empty();

        private Optional<Double> unitAmount = Optional.empty();

        private Optional<Double> unitQuantity = Optional.empty();

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


        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder objectType(String objectType) {
            Utils.checkNotNull(objectType, "objectType");
            this.objectType = Optional.ofNullable(objectType);
            return this;
        }

        public Builder objectType(Optional<String> objectType) {
            Utils.checkNotNull(objectType, "objectType");
            this.objectType = objectType;
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


        public Builder unitAmount(double unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = Optional.ofNullable(unitAmount);
            return this;
        }

        public Builder unitAmount(Optional<Double> unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = unitAmount;
            return this;
        }


        public Builder unitQuantity(double unitQuantity) {
            Utils.checkNotNull(unitQuantity, "unitQuantity");
            this.unitQuantity = Optional.ofNullable(unitQuantity);
            return this;
        }

        public Builder unitQuantity(Optional<Double> unitQuantity) {
            Utils.checkNotNull(unitQuantity, "unitQuantity");
            this.unitQuantity = unitQuantity;
            return this;
        }

        public AccountingTransactionLineItem build() {

            return new AccountingTransactionLineItem(
                accountId, description, id,
                name, objectType, totalAmount,
                unitAmount, unitQuantity);
        }

    }
}
