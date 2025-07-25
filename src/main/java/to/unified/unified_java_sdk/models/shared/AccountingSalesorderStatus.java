/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * <p>Wrapper class for an "open" enum. "Open" enums are those that are expected
 * to evolve (particularly with the addition of enum members over time). If an
 * open enum is used then the appearance of unexpected enum values (say in a 
 * response from an updated an API) will not bring about a runtime error thus 
 * ensuring that non-updated client versions can continue to work without error.
 *
 * <p>Note that instances are immutable and are singletons (an internal thread-safe
 * cache is maintained to ensure that). As a consequence instances created with the 
 * same value will satisfy reference equality (via {@code ==}).
 * 
 * <p>This class is intended to emulate an enum (in terms of common usage and with 
 * reference equality) but with the ability to carry unknown values. Unfortunately
 * Java does not permit the use of an instance in a switch expression but you can 
 * use the {@code asEnum()} method (after dealing with the `Optional` appropriately).
 *
 */
@JsonDeserialize(using = AccountingSalesorderStatus._Deserializer.class)
@JsonSerialize(using = AccountingSalesorderStatus._Serializer.class)
public class AccountingSalesorderStatus {

    public static final AccountingSalesorderStatus DRAFT = new AccountingSalesorderStatus("DRAFT");
    public static final AccountingSalesorderStatus VOIDED = new AccountingSalesorderStatus("VOIDED");
    public static final AccountingSalesorderStatus AUTHORIZED = new AccountingSalesorderStatus("AUTHORIZED");
    public static final AccountingSalesorderStatus PAID = new AccountingSalesorderStatus("PAID");
    public static final AccountingSalesorderStatus PARTIALLY_PAID = new AccountingSalesorderStatus("PARTIALLY_PAID");
    public static final AccountingSalesorderStatus PARTIALLY_REFUNDED = new AccountingSalesorderStatus("PARTIALLY_REFUNDED");
    public static final AccountingSalesorderStatus REFUNDED = new AccountingSalesorderStatus("REFUNDED");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, AccountingSalesorderStatus> values = createValuesMap();
    private static final Map<String, AccountingSalesorderStatusEnum> enums = createEnumsMap();

    private final String value;

    private AccountingSalesorderStatus(String value) {
        this.value = value;
    }

    /**
     * Returns a AccountingSalesorderStatus with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as AccountingSalesorderStatus
     */ 
    public static AccountingSalesorderStatus of(String value) {
        synchronized (AccountingSalesorderStatus.class) {
            return values.computeIfAbsent(value, v -> new AccountingSalesorderStatus(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<AccountingSalesorderStatusEnum> asEnum() {
        return Optional.ofNullable(enums.getOrDefault(value, null));
    }

    public boolean isKnown() {
        return asEnum().isPresent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AccountingSalesorderStatus other = (AccountingSalesorderStatus) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "AccountingSalesorderStatus [value=" + value + "]";
    }

    // return an array just like an enum
    public static AccountingSalesorderStatus[] values() {
        synchronized (AccountingSalesorderStatus.class) {
            return values.values().toArray(new AccountingSalesorderStatus[] {});
        }
    }

    private static final Map<String, AccountingSalesorderStatus> createValuesMap() {
        Map<String, AccountingSalesorderStatus> map = new LinkedHashMap<>();
        map.put("DRAFT", DRAFT);
        map.put("VOIDED", VOIDED);
        map.put("AUTHORIZED", AUTHORIZED);
        map.put("PAID", PAID);
        map.put("PARTIALLY_PAID", PARTIALLY_PAID);
        map.put("PARTIALLY_REFUNDED", PARTIALLY_REFUNDED);
        map.put("REFUNDED", REFUNDED);
        return map;
    }

    private static final Map<String, AccountingSalesorderStatusEnum> createEnumsMap() {
        Map<String, AccountingSalesorderStatusEnum> map = new HashMap<>();
        map.put("DRAFT", AccountingSalesorderStatusEnum.DRAFT);
        map.put("VOIDED", AccountingSalesorderStatusEnum.VOIDED);
        map.put("AUTHORIZED", AccountingSalesorderStatusEnum.AUTHORIZED);
        map.put("PAID", AccountingSalesorderStatusEnum.PAID);
        map.put("PARTIALLY_PAID", AccountingSalesorderStatusEnum.PARTIALLY_PAID);
        map.put("PARTIALLY_REFUNDED", AccountingSalesorderStatusEnum.PARTIALLY_REFUNDED);
        map.put("REFUNDED", AccountingSalesorderStatusEnum.REFUNDED);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<AccountingSalesorderStatus> {

        protected _Serializer() {
            super(AccountingSalesorderStatus.class);
        }

        @Override
        public void serialize(AccountingSalesorderStatus value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<AccountingSalesorderStatus> {

        protected _Deserializer() {
            super(AccountingSalesorderStatus.class);
        }

        @Override
        public AccountingSalesorderStatus deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return AccountingSalesorderStatus.of(v);
        }
    }
    
    public enum AccountingSalesorderStatusEnum {

        DRAFT("DRAFT"),
        VOIDED("VOIDED"),
        AUTHORIZED("AUTHORIZED"),
        PAID("PAID"),
        PARTIALLY_PAID("PARTIALLY_PAID"),
        PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
        REFUNDED("REFUNDED"),;

        private final String value;

        private AccountingSalesorderStatusEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

