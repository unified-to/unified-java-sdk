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
@JsonDeserialize(using = HrisEmployeeGender._Deserializer.class)
@JsonSerialize(using = HrisEmployeeGender._Serializer.class)
public class HrisEmployeeGender {

    public static final HrisEmployeeGender MALE = new HrisEmployeeGender("MALE");
    public static final HrisEmployeeGender FEMALE = new HrisEmployeeGender("FEMALE");
    public static final HrisEmployeeGender INTERSEX = new HrisEmployeeGender("INTERSEX");
    public static final HrisEmployeeGender TRANS = new HrisEmployeeGender("TRANS");
    public static final HrisEmployeeGender NON_BINARY = new HrisEmployeeGender("NON_BINARY");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisEmployeeGender> values = createValuesMap();
    private static final Map<String, HrisEmployeeGenderEnum> enums = createEnumsMap();

    private final String value;

    private HrisEmployeeGender(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisEmployeeGender with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisEmployeeGender
     */ 
    public static HrisEmployeeGender of(String value) {
        synchronized (HrisEmployeeGender.class) {
            return values.computeIfAbsent(value, v -> new HrisEmployeeGender(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisEmployeeGenderEnum> asEnum() {
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
        HrisEmployeeGender other = (HrisEmployeeGender) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisEmployeeGender [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisEmployeeGender[] values() {
        synchronized (HrisEmployeeGender.class) {
            return values.values().toArray(new HrisEmployeeGender[] {});
        }
    }

    private static final Map<String, HrisEmployeeGender> createValuesMap() {
        Map<String, HrisEmployeeGender> map = new LinkedHashMap<>();
        map.put("MALE", MALE);
        map.put("FEMALE", FEMALE);
        map.put("INTERSEX", INTERSEX);
        map.put("TRANS", TRANS);
        map.put("NON_BINARY", NON_BINARY);
        return map;
    }

    private static final Map<String, HrisEmployeeGenderEnum> createEnumsMap() {
        Map<String, HrisEmployeeGenderEnum> map = new HashMap<>();
        map.put("MALE", HrisEmployeeGenderEnum.MALE);
        map.put("FEMALE", HrisEmployeeGenderEnum.FEMALE);
        map.put("INTERSEX", HrisEmployeeGenderEnum.INTERSEX);
        map.put("TRANS", HrisEmployeeGenderEnum.TRANS);
        map.put("NON_BINARY", HrisEmployeeGenderEnum.NON_BINARY);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisEmployeeGender> {

        protected _Serializer() {
            super(HrisEmployeeGender.class);
        }

        @Override
        public void serialize(HrisEmployeeGender value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisEmployeeGender> {

        protected _Deserializer() {
            super(HrisEmployeeGender.class);
        }

        @Override
        public HrisEmployeeGender deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisEmployeeGender.of(v);
        }
    }
    
    public enum HrisEmployeeGenderEnum {

        MALE("MALE"),
        FEMALE("FEMALE"),
        INTERSEX("INTERSEX"),
        TRANS("TRANS"),
        NON_BINARY("NON_BINARY"),;

        private final String value;

        private HrisEmployeeGenderEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

