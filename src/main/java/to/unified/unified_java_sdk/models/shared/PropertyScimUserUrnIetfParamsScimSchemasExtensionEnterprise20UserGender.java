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
@JsonDeserialize(using = PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender._Deserializer.class)
@JsonSerialize(using = PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender._Serializer.class)
public class PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender {

    public static final PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender MALE = new PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender("male");
    public static final PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender FEMALE = new PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender("female");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender> values = createValuesMap();
    private static final Map<String, PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum> enums = createEnumsMap();

    private final String value;

    private PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender(String value) {
        this.value = value;
    }

    /**
     * Returns a PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender
     */ 
    public static PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender of(String value) {
        synchronized (PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender.class) {
            return values.computeIfAbsent(value, v -> new PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum> asEnum() {
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
        PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender other = (PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender [value=" + value + "]";
    }

    // return an array just like an enum
    public static PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender[] values() {
        synchronized (PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender.class) {
            return values.values().toArray(new PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender[] {});
        }
    }

    private static final Map<String, PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender> createValuesMap() {
        Map<String, PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender> map = new LinkedHashMap<>();
        map.put("male", MALE);
        map.put("female", FEMALE);
        return map;
    }

    private static final Map<String, PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum> createEnumsMap() {
        Map<String, PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum> map = new HashMap<>();
        map.put("male", PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum.MALE);
        map.put("female", PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum.FEMALE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender> {

        protected _Serializer() {
            super(PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender.class);
        }

        @Override
        public void serialize(PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender> {

        protected _Deserializer() {
            super(PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender.class);
        }

        @Override
        public PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGender.of(v);
        }
    }
    
    public enum PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum {

        MALE("male"),
        FEMALE("female"),;

        private final String value;

        private PropertyScimUserUrnIetfParamsScimSchemasExtensionEnterprise20UserGenderEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

