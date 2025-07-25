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
 * ScimManager
 * 
 * <p>"id" attribute of another User.
 */
public class ScimManager {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$ref")
    private Optional<String> dollarRef;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    private Optional<String> displayName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("managerId")
    private Optional<String> managerId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends ScimManagerType> type;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<String> value;

    @JsonCreator
    public ScimManager(
            @JsonProperty("$ref") Optional<String> dollarRef,
            @JsonProperty("displayName") Optional<String> displayName,
            @JsonProperty("managerId") Optional<String> managerId,
            @JsonProperty("type") Optional<? extends ScimManagerType> type,
            @JsonProperty("value") Optional<String> value) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(managerId, "managerId");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.dollarRef = dollarRef;
        this.displayName = displayName;
        this.managerId = managerId;
        this.type = type;
        this.value = value;
    }
    
    public ScimManager() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> dollarRef() {
        return dollarRef;
    }

    @JsonIgnore
    public Optional<String> displayName() {
        return displayName;
    }

    @JsonIgnore
    public Optional<String> managerId() {
        return managerId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScimManagerType> type() {
        return (Optional<ScimManagerType>) type;
    }

    @JsonIgnore
    public Optional<String> value() {
        return value;
    }

    public static Builder builder() {
        return new Builder();
    }


    public ScimManager withDollarRef(String dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = Optional.ofNullable(dollarRef);
        return this;
    }


    public ScimManager withDollarRef(Optional<String> dollarRef) {
        Utils.checkNotNull(dollarRef, "dollarRef");
        this.dollarRef = dollarRef;
        return this;
    }

    public ScimManager withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }


    public ScimManager withDisplayName(Optional<String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public ScimManager withManagerId(String managerId) {
        Utils.checkNotNull(managerId, "managerId");
        this.managerId = Optional.ofNullable(managerId);
        return this;
    }


    public ScimManager withManagerId(Optional<String> managerId) {
        Utils.checkNotNull(managerId, "managerId");
        this.managerId = managerId;
        return this;
    }

    public ScimManager withType(ScimManagerType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }


    public ScimManager withType(Optional<? extends ScimManagerType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public ScimManager withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }


    public ScimManager withValue(Optional<String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        ScimManager other = (ScimManager) o;
        return 
            Utils.enhancedDeepEquals(this.dollarRef, other.dollarRef) &&
            Utils.enhancedDeepEquals(this.displayName, other.displayName) &&
            Utils.enhancedDeepEquals(this.managerId, other.managerId) &&
            Utils.enhancedDeepEquals(this.type, other.type) &&
            Utils.enhancedDeepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            dollarRef, displayName, managerId,
            type, value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScimManager.class,
                "dollarRef", dollarRef,
                "displayName", displayName,
                "managerId", managerId,
                "type", type,
                "value", value);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> dollarRef = Optional.empty();

        private Optional<String> displayName = Optional.empty();

        private Optional<String> managerId = Optional.empty();

        private Optional<? extends ScimManagerType> type = Optional.empty();

        private Optional<String> value = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder dollarRef(String dollarRef) {
            Utils.checkNotNull(dollarRef, "dollarRef");
            this.dollarRef = Optional.ofNullable(dollarRef);
            return this;
        }

        public Builder dollarRef(Optional<String> dollarRef) {
            Utils.checkNotNull(dollarRef, "dollarRef");
            this.dollarRef = dollarRef;
            return this;
        }


        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }

        public Builder displayName(Optional<String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }


        public Builder managerId(String managerId) {
            Utils.checkNotNull(managerId, "managerId");
            this.managerId = Optional.ofNullable(managerId);
            return this;
        }

        public Builder managerId(Optional<String> managerId) {
            Utils.checkNotNull(managerId, "managerId");
            this.managerId = managerId;
            return this;
        }


        public Builder type(ScimManagerType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends ScimManagerType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }


        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public ScimManager build() {

            return new ScimManager(
                dollarRef, displayName, managerId,
                type, value);
        }

    }
}
