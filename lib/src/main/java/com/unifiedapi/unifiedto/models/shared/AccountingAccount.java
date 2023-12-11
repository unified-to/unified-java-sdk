/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.unifiedapi.unifiedto.utils.DateTimeDeserializer;
import com.unifiedapi.unifiedto.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class AccountingAccount {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    public Double balance;

    public AccountingAccount withBalance(Double balance) {
        this.balance = balance;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bank_account_number")
    public String bankAccountNumber;

    public AccountingAccount withBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public AccountingAccount withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public AccountingAccount withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_defined_code")
    public String customerDefinedCode;

    public AccountingAccount withCustomerDefinedCode(String customerDefinedCode) {
        this.customerDefinedCode = customerDefinedCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AccountingAccount withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AccountingAccount withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public AccountingAccount withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyAccountingAccountRaw raw;

    public AccountingAccount withRaw(PropertyAccountingAccountRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Status status;

    public AccountingAccount withStatus(Status status) {
        this.status = status;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public Type type;

    public AccountingAccount withType(Type type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public AccountingAccount withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public AccountingAccount(@JsonProperty("name") String name) {
        this.name = name;
  }
}