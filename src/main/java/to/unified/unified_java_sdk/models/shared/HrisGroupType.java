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
@JsonDeserialize(using = HrisGroupType._Deserializer.class)
@JsonSerialize(using = HrisGroupType._Serializer.class)
public class HrisGroupType {

    public static final HrisGroupType TEAM = new HrisGroupType("TEAM");
    public static final HrisGroupType GROUP = new HrisGroupType("GROUP");
    public static final HrisGroupType DEPARTMENT = new HrisGroupType("DEPARTMENT");
    public static final HrisGroupType DIVISION = new HrisGroupType("DIVISION");
    public static final HrisGroupType BUSINESS_UNIT = new HrisGroupType("BUSINESS_UNIT");
    public static final HrisGroupType BRANCH = new HrisGroupType("BRANCH");
    public static final HrisGroupType SUB_DEPARTMENT = new HrisGroupType("SUB_DEPARTMENT");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, HrisGroupType> values = createValuesMap();
    private static final Map<String, HrisGroupTypeEnum> enums = createEnumsMap();

    private final String value;

    private HrisGroupType(String value) {
        this.value = value;
    }

    /**
     * Returns a HrisGroupType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as HrisGroupType
     */ 
    public static HrisGroupType of(String value) {
        synchronized (HrisGroupType.class) {
            return values.computeIfAbsent(value, v -> new HrisGroupType(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<HrisGroupTypeEnum> asEnum() {
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
        HrisGroupType other = (HrisGroupType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "HrisGroupType [value=" + value + "]";
    }

    // return an array just like an enum
    public static HrisGroupType[] values() {
        synchronized (HrisGroupType.class) {
            return values.values().toArray(new HrisGroupType[] {});
        }
    }

    private static final Map<String, HrisGroupType> createValuesMap() {
        Map<String, HrisGroupType> map = new LinkedHashMap<>();
        map.put("TEAM", TEAM);
        map.put("GROUP", GROUP);
        map.put("DEPARTMENT", DEPARTMENT);
        map.put("DIVISION", DIVISION);
        map.put("BUSINESS_UNIT", BUSINESS_UNIT);
        map.put("BRANCH", BRANCH);
        map.put("SUB_DEPARTMENT", SUB_DEPARTMENT);
        return map;
    }

    private static final Map<String, HrisGroupTypeEnum> createEnumsMap() {
        Map<String, HrisGroupTypeEnum> map = new HashMap<>();
        map.put("TEAM", HrisGroupTypeEnum.TEAM);
        map.put("GROUP", HrisGroupTypeEnum.GROUP);
        map.put("DEPARTMENT", HrisGroupTypeEnum.DEPARTMENT);
        map.put("DIVISION", HrisGroupTypeEnum.DIVISION);
        map.put("BUSINESS_UNIT", HrisGroupTypeEnum.BUSINESS_UNIT);
        map.put("BRANCH", HrisGroupTypeEnum.BRANCH);
        map.put("SUB_DEPARTMENT", HrisGroupTypeEnum.SUB_DEPARTMENT);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<HrisGroupType> {

        protected _Serializer() {
            super(HrisGroupType.class);
        }

        @Override
        public void serialize(HrisGroupType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<HrisGroupType> {

        protected _Deserializer() {
            super(HrisGroupType.class);
        }

        @Override
        public HrisGroupType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return HrisGroupType.of(v);
        }
    }
    
    public enum HrisGroupTypeEnum {

        TEAM("TEAM"),
        GROUP("GROUP"),
        DEPARTMENT("DEPARTMENT"),
        DIVISION("DIVISION"),
        BUSINESS_UNIT("BUSINESS_UNIT"),
        BRANCH("BRANCH"),
        SUB_DEPARTMENT("SUB_DEPARTMENT"),;

        private final String value;

        private HrisGroupTypeEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

