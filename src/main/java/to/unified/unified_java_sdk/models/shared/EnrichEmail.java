/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class EnrichEmail {

    @JsonProperty("email")
    private String email;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_verified")
    private Optional<Boolean> isVerified;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends EnrichEmailType> type;

    @JsonCreator
    public EnrichEmail(
            @JsonProperty("email") String email,
            @JsonProperty("is_verified") Optional<Boolean> isVerified,
            @JsonProperty("type") Optional<? extends EnrichEmailType> type) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(isVerified, "isVerified");
        Utils.checkNotNull(type, "type");
        this.email = email;
        this.isVerified = isVerified;
        this.type = type;
    }
    
    public EnrichEmail(
            String email) {
        this(email, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    @JsonIgnore
    public Optional<Boolean> isVerified() {
        return isVerified;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EnrichEmailType> type() {
        return (Optional<EnrichEmailType>) type;
    }

    public static Builder builder() {
        return new Builder();
    }


    public EnrichEmail withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public EnrichEmail withIsVerified(boolean isVerified) {
        Utils.checkNotNull(isVerified, "isVerified");
        this.isVerified = Optional.ofNullable(isVerified);
        return this;
    }


    public EnrichEmail withIsVerified(Optional<Boolean> isVerified) {
        Utils.checkNotNull(isVerified, "isVerified");
        this.isVerified = isVerified;
        return this;
    }

    public EnrichEmail withType(EnrichEmailType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }


    public EnrichEmail withType(Optional<? extends EnrichEmailType> type) {
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
        EnrichEmail other = (EnrichEmail) o;
        return 
            Utils.enhancedDeepEquals(this.email, other.email) &&
            Utils.enhancedDeepEquals(this.isVerified, other.isVerified) &&
            Utils.enhancedDeepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            email, isVerified, type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnrichEmail.class,
                "email", email,
                "isVerified", isVerified,
                "type", type);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String email;

        private Optional<Boolean> isVerified = Optional.empty();

        private Optional<? extends EnrichEmailType> type = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }


        public Builder isVerified(boolean isVerified) {
            Utils.checkNotNull(isVerified, "isVerified");
            this.isVerified = Optional.ofNullable(isVerified);
            return this;
        }

        public Builder isVerified(Optional<Boolean> isVerified) {
            Utils.checkNotNull(isVerified, "isVerified");
            this.isVerified = isVerified;
            return this;
        }


        public Builder type(EnrichEmailType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends EnrichEmailType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public EnrichEmail build() {

            return new EnrichEmail(
                email, isVerified, type);
        }

    }
}
