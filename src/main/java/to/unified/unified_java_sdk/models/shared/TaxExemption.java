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
@JsonDeserialize(using = TaxExemption._Deserializer.class)
@JsonSerialize(using = TaxExemption._Serializer.class)
public class TaxExemption {

    public static final TaxExemption FEDERAL_GOV = new TaxExemption("FEDERAL_GOV");
    public static final TaxExemption REGION_GOV = new TaxExemption("REGION_GOV");
    public static final TaxExemption LOCAL_GOV = new TaxExemption("LOCAL_GOV");
    public static final TaxExemption TRIBAL_GOV = new TaxExemption("TRIBAL_GOV");
    public static final TaxExemption CHARITABLE_ORG = new TaxExemption("CHARITABLE_ORG");
    public static final TaxExemption RELIGIOUS_ORG = new TaxExemption("RELIGIOUS_ORG");
    public static final TaxExemption EDUCATIONAL_ORG = new TaxExemption("EDUCATIONAL_ORG");
    public static final TaxExemption MEDICAL_ORG = new TaxExemption("MEDICAL_ORG");
    public static final TaxExemption RESALE = new TaxExemption("RESALE");
    public static final TaxExemption FOREIGN = new TaxExemption("FOREIGN");
    public static final TaxExemption OTHER = new TaxExemption("OTHER");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, TaxExemption> values = createValuesMap();
    private static final Map<String, TaxExemptionEnum> enums = createEnumsMap();

    private final String value;

    private TaxExemption(String value) {
        this.value = value;
    }

    /**
     * Returns a TaxExemption with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as TaxExemption
     */ 
    public static TaxExemption of(String value) {
        synchronized (TaxExemption.class) {
            return values.computeIfAbsent(value, v -> new TaxExemption(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<TaxExemptionEnum> asEnum() {
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
        TaxExemption other = (TaxExemption) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "TaxExemption [value=" + value + "]";
    }

    // return an array just like an enum
    public static TaxExemption[] values() {
        synchronized (TaxExemption.class) {
            return values.values().toArray(new TaxExemption[] {});
        }
    }

    private static final Map<String, TaxExemption> createValuesMap() {
        Map<String, TaxExemption> map = new LinkedHashMap<>();
        map.put("FEDERAL_GOV", FEDERAL_GOV);
        map.put("REGION_GOV", REGION_GOV);
        map.put("LOCAL_GOV", LOCAL_GOV);
        map.put("TRIBAL_GOV", TRIBAL_GOV);
        map.put("CHARITABLE_ORG", CHARITABLE_ORG);
        map.put("RELIGIOUS_ORG", RELIGIOUS_ORG);
        map.put("EDUCATIONAL_ORG", EDUCATIONAL_ORG);
        map.put("MEDICAL_ORG", MEDICAL_ORG);
        map.put("RESALE", RESALE);
        map.put("FOREIGN", FOREIGN);
        map.put("OTHER", OTHER);
        return map;
    }

    private static final Map<String, TaxExemptionEnum> createEnumsMap() {
        Map<String, TaxExemptionEnum> map = new HashMap<>();
        map.put("FEDERAL_GOV", TaxExemptionEnum.FEDERAL_GOV);
        map.put("REGION_GOV", TaxExemptionEnum.REGION_GOV);
        map.put("LOCAL_GOV", TaxExemptionEnum.LOCAL_GOV);
        map.put("TRIBAL_GOV", TaxExemptionEnum.TRIBAL_GOV);
        map.put("CHARITABLE_ORG", TaxExemptionEnum.CHARITABLE_ORG);
        map.put("RELIGIOUS_ORG", TaxExemptionEnum.RELIGIOUS_ORG);
        map.put("EDUCATIONAL_ORG", TaxExemptionEnum.EDUCATIONAL_ORG);
        map.put("MEDICAL_ORG", TaxExemptionEnum.MEDICAL_ORG);
        map.put("RESALE", TaxExemptionEnum.RESALE);
        map.put("FOREIGN", TaxExemptionEnum.FOREIGN);
        map.put("OTHER", TaxExemptionEnum.OTHER);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<TaxExemption> {

        protected _Serializer() {
            super(TaxExemption.class);
        }

        @Override
        public void serialize(TaxExemption value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<TaxExemption> {

        protected _Deserializer() {
            super(TaxExemption.class);
        }

        @Override
        public TaxExemption deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return TaxExemption.of(v);
        }
    }
    
    public enum TaxExemptionEnum {

        FEDERAL_GOV("FEDERAL_GOV"),
        REGION_GOV("REGION_GOV"),
        LOCAL_GOV("LOCAL_GOV"),
        TRIBAL_GOV("TRIBAL_GOV"),
        CHARITABLE_ORG("CHARITABLE_ORG"),
        RELIGIOUS_ORG("RELIGIOUS_ORG"),
        EDUCATIONAL_ORG("EDUCATIONAL_ORG"),
        MEDICAL_ORG("MEDICAL_ORG"),
        RESALE("RESALE"),
        FOREIGN("FOREIGN"),
        OTHER("OTHER"),;

        private final String value;

        private TaxExemptionEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

