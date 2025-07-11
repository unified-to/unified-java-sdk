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

/**
 * PropertyUcCallTelephone
 * 
 * <p>The telephone number called
 */
public class PropertyUcCallTelephone {

    @JsonProperty("telephone")
    private String telephone;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends PropertyUcCallTelephoneType> type;

    @JsonCreator
    public PropertyUcCallTelephone(
            @JsonProperty("telephone") String telephone,
            @JsonProperty("type") Optional<? extends PropertyUcCallTelephoneType> type) {
        Utils.checkNotNull(telephone, "telephone");
        Utils.checkNotNull(type, "type");
        this.telephone = telephone;
        this.type = type;
    }
    
    public PropertyUcCallTelephone(
            String telephone) {
        this(telephone, Optional.empty());
    }

    @JsonIgnore
    public String telephone() {
        return telephone;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyUcCallTelephoneType> type() {
        return (Optional<PropertyUcCallTelephoneType>) type;
    }

    public static Builder builder() {
        return new Builder();
    }


    public PropertyUcCallTelephone withTelephone(String telephone) {
        Utils.checkNotNull(telephone, "telephone");
        this.telephone = telephone;
        return this;
    }

    public PropertyUcCallTelephone withType(PropertyUcCallTelephoneType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }


    public PropertyUcCallTelephone withType(Optional<? extends PropertyUcCallTelephoneType> type) {
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
        PropertyUcCallTelephone other = (PropertyUcCallTelephone) o;
        return 
            Utils.enhancedDeepEquals(this.telephone, other.telephone) &&
            Utils.enhancedDeepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            telephone, type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PropertyUcCallTelephone.class,
                "telephone", telephone,
                "type", type);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String telephone;

        private Optional<? extends PropertyUcCallTelephoneType> type = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder telephone(String telephone) {
            Utils.checkNotNull(telephone, "telephone");
            this.telephone = telephone;
            return this;
        }


        public Builder type(PropertyUcCallTelephoneType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends PropertyUcCallTelephoneType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public PropertyUcCallTelephone build() {

            return new PropertyUcCallTelephone(
                telephone, type);
        }

    }
}
