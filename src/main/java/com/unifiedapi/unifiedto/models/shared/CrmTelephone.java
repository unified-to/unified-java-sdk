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

public class CrmTelephone {

    @JsonProperty("telephone")
    private String telephone;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends CrmTelephoneType> type;

    @JsonCreator
    public CrmTelephone(
            @JsonProperty("telephone") String telephone,
            @JsonProperty("type") Optional<? extends CrmTelephoneType> type) {
        Utils.checkNotNull(telephone, "telephone");
        Utils.checkNotNull(type, "type");
        this.telephone = telephone;
        this.type = type;
    }
    
    public CrmTelephone(
            String telephone) {
        this(telephone, Optional.empty());
    }

    @JsonIgnore
    public String telephone() {
        return telephone;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CrmTelephoneType> type() {
        return (Optional<CrmTelephoneType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CrmTelephone withTelephone(String telephone) {
        Utils.checkNotNull(telephone, "telephone");
        this.telephone = telephone;
        return this;
    }

    public CrmTelephone withType(CrmTelephoneType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public CrmTelephone withType(Optional<? extends CrmTelephoneType> type) {
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
        CrmTelephone other = (CrmTelephone) o;
        return 
            Objects.deepEquals(this.telephone, other.telephone) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            telephone,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmTelephone.class,
                "telephone", telephone,
                "type", type);
    }
    
    public final static class Builder {
 
        private String telephone;
 
        private Optional<? extends CrmTelephoneType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder telephone(String telephone) {
            Utils.checkNotNull(telephone, "telephone");
            this.telephone = telephone;
            return this;
        }

        public Builder type(CrmTelephoneType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends CrmTelephoneType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public CrmTelephone build() {
            return new CrmTelephone(
                telephone,
                type);
        }
    }
}

