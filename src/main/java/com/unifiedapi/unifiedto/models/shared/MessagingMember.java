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
import java.util.Objects;
import java.util.Optional;

public class MessagingMember {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonCreator
    public MessagingMember(
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("user_id") Optional<String> userId) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(userId, "userId");
        this.email = email;
        this.name = name;
        this.userId = userId;
    }
    
    public MessagingMember() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MessagingMember withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public MessagingMember withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public MessagingMember withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public MessagingMember withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public MessagingMember withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public MessagingMember withUserId(Optional<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        MessagingMember other = (MessagingMember) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            name,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessagingMember.class,
                "email", email,
                "name", name,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> userId = Optional.empty();  
        
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

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public MessagingMember build() {
            return new MessagingMember(
                email,
                name,
                userId);
        }
    }
}

