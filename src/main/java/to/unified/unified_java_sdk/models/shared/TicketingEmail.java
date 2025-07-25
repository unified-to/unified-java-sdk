/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class TicketingEmail {

    @JsonProperty("email")
    private String email;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends TicketingEmailType> type;

    @JsonCreator
    public TicketingEmail(
            @JsonProperty("email") String email,
            @JsonProperty("type") Optional<? extends TicketingEmailType> type) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(type, "type");
        this.email = email;
        this.type = type;
    }
    
    public TicketingEmail(
            String email) {
        this(email, Optional.empty());
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TicketingEmailType> type() {
        return (Optional<TicketingEmailType>) type;
    }

    public static Builder builder() {
        return new Builder();
    }


    public TicketingEmail withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public TicketingEmail withType(TicketingEmailType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }


    public TicketingEmail withType(Optional<? extends TicketingEmailType> type) {
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
        TicketingEmail other = (TicketingEmail) o;
        return 
            Utils.enhancedDeepEquals(this.email, other.email) &&
            Utils.enhancedDeepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            email, type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TicketingEmail.class,
                "email", email,
                "type", type);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String email;

        private Optional<? extends TicketingEmailType> type = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }


        public Builder type(TicketingEmailType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends TicketingEmailType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public TicketingEmail build() {

            return new TicketingEmail(
                email, type);
        }

    }
}
