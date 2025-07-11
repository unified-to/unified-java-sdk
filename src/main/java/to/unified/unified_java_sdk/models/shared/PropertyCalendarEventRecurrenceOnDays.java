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
@JsonDeserialize(using = PropertyCalendarEventRecurrenceOnDays._Deserializer.class)
@JsonSerialize(using = PropertyCalendarEventRecurrenceOnDays._Serializer.class)
public class PropertyCalendarEventRecurrenceOnDays {

    public static final PropertyCalendarEventRecurrenceOnDays SU = new PropertyCalendarEventRecurrenceOnDays("SU");
    public static final PropertyCalendarEventRecurrenceOnDays MO = new PropertyCalendarEventRecurrenceOnDays("MO");
    public static final PropertyCalendarEventRecurrenceOnDays TU = new PropertyCalendarEventRecurrenceOnDays("TU");
    public static final PropertyCalendarEventRecurrenceOnDays WE = new PropertyCalendarEventRecurrenceOnDays("WE");
    public static final PropertyCalendarEventRecurrenceOnDays TH = new PropertyCalendarEventRecurrenceOnDays("TH");
    public static final PropertyCalendarEventRecurrenceOnDays FR = new PropertyCalendarEventRecurrenceOnDays("FR");
    public static final PropertyCalendarEventRecurrenceOnDays SA = new PropertyCalendarEventRecurrenceOnDays("SA");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, PropertyCalendarEventRecurrenceOnDays> values = createValuesMap();
    private static final Map<String, PropertyCalendarEventRecurrenceOnDaysEnum> enums = createEnumsMap();

    private final String value;

    private PropertyCalendarEventRecurrenceOnDays(String value) {
        this.value = value;
    }

    /**
     * Returns a PropertyCalendarEventRecurrenceOnDays with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as PropertyCalendarEventRecurrenceOnDays
     */ 
    public static PropertyCalendarEventRecurrenceOnDays of(String value) {
        synchronized (PropertyCalendarEventRecurrenceOnDays.class) {
            return values.computeIfAbsent(value, v -> new PropertyCalendarEventRecurrenceOnDays(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<PropertyCalendarEventRecurrenceOnDaysEnum> asEnum() {
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
        PropertyCalendarEventRecurrenceOnDays other = (PropertyCalendarEventRecurrenceOnDays) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "PropertyCalendarEventRecurrenceOnDays [value=" + value + "]";
    }

    // return an array just like an enum
    public static PropertyCalendarEventRecurrenceOnDays[] values() {
        synchronized (PropertyCalendarEventRecurrenceOnDays.class) {
            return values.values().toArray(new PropertyCalendarEventRecurrenceOnDays[] {});
        }
    }

    private static final Map<String, PropertyCalendarEventRecurrenceOnDays> createValuesMap() {
        Map<String, PropertyCalendarEventRecurrenceOnDays> map = new LinkedHashMap<>();
        map.put("SU", SU);
        map.put("MO", MO);
        map.put("TU", TU);
        map.put("WE", WE);
        map.put("TH", TH);
        map.put("FR", FR);
        map.put("SA", SA);
        return map;
    }

    private static final Map<String, PropertyCalendarEventRecurrenceOnDaysEnum> createEnumsMap() {
        Map<String, PropertyCalendarEventRecurrenceOnDaysEnum> map = new HashMap<>();
        map.put("SU", PropertyCalendarEventRecurrenceOnDaysEnum.SU);
        map.put("MO", PropertyCalendarEventRecurrenceOnDaysEnum.MO);
        map.put("TU", PropertyCalendarEventRecurrenceOnDaysEnum.TU);
        map.put("WE", PropertyCalendarEventRecurrenceOnDaysEnum.WE);
        map.put("TH", PropertyCalendarEventRecurrenceOnDaysEnum.TH);
        map.put("FR", PropertyCalendarEventRecurrenceOnDaysEnum.FR);
        map.put("SA", PropertyCalendarEventRecurrenceOnDaysEnum.SA);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<PropertyCalendarEventRecurrenceOnDays> {

        protected _Serializer() {
            super(PropertyCalendarEventRecurrenceOnDays.class);
        }

        @Override
        public void serialize(PropertyCalendarEventRecurrenceOnDays value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<PropertyCalendarEventRecurrenceOnDays> {

        protected _Deserializer() {
            super(PropertyCalendarEventRecurrenceOnDays.class);
        }

        @Override
        public PropertyCalendarEventRecurrenceOnDays deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return PropertyCalendarEventRecurrenceOnDays.of(v);
        }
    }
    
    public enum PropertyCalendarEventRecurrenceOnDaysEnum {

        SU("SU"),
        MO("MO"),
        TU("TU"),
        WE("WE"),
        TH("TH"),
        FR("FR"),
        SA("SA"),;

        private final String value;

        private PropertyCalendarEventRecurrenceOnDaysEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

