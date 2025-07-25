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
@JsonDeserialize(using = PropertyHrisEmployeeEmployeeRoles._Deserializer.class)
@JsonSerialize(using = PropertyHrisEmployeeEmployeeRoles._Serializer.class)
public class PropertyHrisEmployeeEmployeeRoles {

    public static final PropertyHrisEmployeeEmployeeRoles ADMIN = new PropertyHrisEmployeeEmployeeRoles("ADMIN");
    public static final PropertyHrisEmployeeEmployeeRoles MANAGER = new PropertyHrisEmployeeEmployeeRoles("MANAGER");
    public static final PropertyHrisEmployeeEmployeeRoles RECRUITER = new PropertyHrisEmployeeEmployeeRoles("RECRUITER");
    public static final PropertyHrisEmployeeEmployeeRoles SALESREP = new PropertyHrisEmployeeEmployeeRoles("SALESREP");
    public static final PropertyHrisEmployeeEmployeeRoles INTERVIEWER = new PropertyHrisEmployeeEmployeeRoles("INTERVIEWER");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, PropertyHrisEmployeeEmployeeRoles> values = createValuesMap();
    private static final Map<String, PropertyHrisEmployeeEmployeeRolesEnum> enums = createEnumsMap();

    private final String value;

    private PropertyHrisEmployeeEmployeeRoles(String value) {
        this.value = value;
    }

    /**
     * Returns a PropertyHrisEmployeeEmployeeRoles with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as PropertyHrisEmployeeEmployeeRoles
     */ 
    public static PropertyHrisEmployeeEmployeeRoles of(String value) {
        synchronized (PropertyHrisEmployeeEmployeeRoles.class) {
            return values.computeIfAbsent(value, v -> new PropertyHrisEmployeeEmployeeRoles(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<PropertyHrisEmployeeEmployeeRolesEnum> asEnum() {
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
        PropertyHrisEmployeeEmployeeRoles other = (PropertyHrisEmployeeEmployeeRoles) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "PropertyHrisEmployeeEmployeeRoles [value=" + value + "]";
    }

    // return an array just like an enum
    public static PropertyHrisEmployeeEmployeeRoles[] values() {
        synchronized (PropertyHrisEmployeeEmployeeRoles.class) {
            return values.values().toArray(new PropertyHrisEmployeeEmployeeRoles[] {});
        }
    }

    private static final Map<String, PropertyHrisEmployeeEmployeeRoles> createValuesMap() {
        Map<String, PropertyHrisEmployeeEmployeeRoles> map = new LinkedHashMap<>();
        map.put("ADMIN", ADMIN);
        map.put("MANAGER", MANAGER);
        map.put("RECRUITER", RECRUITER);
        map.put("SALESREP", SALESREP);
        map.put("INTERVIEWER", INTERVIEWER);
        return map;
    }

    private static final Map<String, PropertyHrisEmployeeEmployeeRolesEnum> createEnumsMap() {
        Map<String, PropertyHrisEmployeeEmployeeRolesEnum> map = new HashMap<>();
        map.put("ADMIN", PropertyHrisEmployeeEmployeeRolesEnum.ADMIN);
        map.put("MANAGER", PropertyHrisEmployeeEmployeeRolesEnum.MANAGER);
        map.put("RECRUITER", PropertyHrisEmployeeEmployeeRolesEnum.RECRUITER);
        map.put("SALESREP", PropertyHrisEmployeeEmployeeRolesEnum.SALESREP);
        map.put("INTERVIEWER", PropertyHrisEmployeeEmployeeRolesEnum.INTERVIEWER);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<PropertyHrisEmployeeEmployeeRoles> {

        protected _Serializer() {
            super(PropertyHrisEmployeeEmployeeRoles.class);
        }

        @Override
        public void serialize(PropertyHrisEmployeeEmployeeRoles value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<PropertyHrisEmployeeEmployeeRoles> {

        protected _Deserializer() {
            super(PropertyHrisEmployeeEmployeeRoles.class);
        }

        @Override
        public PropertyHrisEmployeeEmployeeRoles deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return PropertyHrisEmployeeEmployeeRoles.of(v);
        }
    }
    
    public enum PropertyHrisEmployeeEmployeeRolesEnum {

        ADMIN("ADMIN"),
        MANAGER("MANAGER"),
        RECRUITER("RECRUITER"),
        SALESREP("SALESREP"),
        INTERVIEWER("INTERVIEWER"),;

        private final String value;

        private PropertyHrisEmployeeEmployeeRolesEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

