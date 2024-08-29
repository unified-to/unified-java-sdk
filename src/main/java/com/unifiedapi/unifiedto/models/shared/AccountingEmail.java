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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class AccountingEmail {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AccountingEmailType> type;

    @JsonCreator
    public AccountingEmail(
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("type") Optional<? extends AccountingEmailType> type) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(type, "type");
        this.email = email;
        this.type = type;
    }
    
    public AccountingEmail() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingEmailType> type() {
        return (Optional<AccountingEmailType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountingEmail withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public AccountingEmail withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public AccountingEmail withType(AccountingEmailType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AccountingEmail withType(Optional<? extends AccountingEmailType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        AccountingEmail other = (AccountingEmail) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingEmail.class,
                "email", email,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> email = Optional.empty();
 
        private Optional<? extends AccountingEmailType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder type(AccountingEmailType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends AccountingEmailType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public AccountingEmail build() {
            return new AccountingEmail(
                email,
                type);
        }
    }
}
