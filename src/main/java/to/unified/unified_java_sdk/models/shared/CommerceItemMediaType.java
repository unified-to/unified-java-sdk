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
@JsonDeserialize(using = CommerceItemMediaType._Deserializer.class)
@JsonSerialize(using = CommerceItemMediaType._Serializer.class)
public class CommerceItemMediaType {

    public static final CommerceItemMediaType IMAGE = new CommerceItemMediaType("image");
    public static final CommerceItemMediaType VIDEO = new CommerceItemMediaType("video");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, CommerceItemMediaType> values = createValuesMap();
    private static final Map<String, CommerceItemMediaTypeEnum> enums = createEnumsMap();

    private final String value;

    private CommerceItemMediaType(String value) {
        this.value = value;
    }

    /**
     * Returns a CommerceItemMediaType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as CommerceItemMediaType
     */ 
    public static CommerceItemMediaType of(String value) {
        synchronized (CommerceItemMediaType.class) {
            return values.computeIfAbsent(value, v -> new CommerceItemMediaType(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<CommerceItemMediaTypeEnum> asEnum() {
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
        CommerceItemMediaType other = (CommerceItemMediaType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "CommerceItemMediaType [value=" + value + "]";
    }

    // return an array just like an enum
    public static CommerceItemMediaType[] values() {
        synchronized (CommerceItemMediaType.class) {
            return values.values().toArray(new CommerceItemMediaType[] {});
        }
    }

    private static final Map<String, CommerceItemMediaType> createValuesMap() {
        Map<String, CommerceItemMediaType> map = new LinkedHashMap<>();
        map.put("image", IMAGE);
        map.put("video", VIDEO);
        return map;
    }

    private static final Map<String, CommerceItemMediaTypeEnum> createEnumsMap() {
        Map<String, CommerceItemMediaTypeEnum> map = new HashMap<>();
        map.put("image", CommerceItemMediaTypeEnum.IMAGE);
        map.put("video", CommerceItemMediaTypeEnum.VIDEO);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<CommerceItemMediaType> {

        protected _Serializer() {
            super(CommerceItemMediaType.class);
        }

        @Override
        public void serialize(CommerceItemMediaType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<CommerceItemMediaType> {

        protected _Deserializer() {
            super(CommerceItemMediaType.class);
        }

        @Override
        public CommerceItemMediaType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return CommerceItemMediaType.of(v);
        }
    }
    
    public enum CommerceItemMediaTypeEnum {

        IMAGE("image"),
        VIDEO("video"),;

        private final String value;

        private CommerceItemMediaTypeEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

