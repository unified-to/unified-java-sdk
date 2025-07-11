/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import to.unified.unified_java_sdk.utils.OneOfDeserializer;
import to.unified.unified_java_sdk.utils.TypedObject;
import to.unified.unified_java_sdk.utils.Utils.JsonShape;
import to.unified.unified_java_sdk.utils.Utils.TypeReferenceWithShape;
import to.unified.unified_java_sdk.utils.Utils;

@JsonDeserialize(using = HrisMetadataValue._Deserializer.class)
public class HrisMetadataValue {

    @JsonValue
    private TypedObject value;
    
    private HrisMetadataValue(TypedObject value) {
        this.value = value;
    }

    public static HrisMetadataValue of(HrisMetadataSchemas1 value) {
        Utils.checkNotNull(value, "value");
        return new HrisMetadataValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HrisMetadataSchemas1>(){}));
    }

    public static HrisMetadataValue of(HrisMetadataSchemas2 value) {
        Utils.checkNotNull(value, "value");
        return new HrisMetadataValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HrisMetadataSchemas2>(){}));
    }

    public static HrisMetadataValue of(HrisMetadataSchemas3 value) {
        Utils.checkNotNull(value, "value");
        return new HrisMetadataValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HrisMetadataSchemas3>(){}));
    }

    public static HrisMetadataValue of(HrisMetadataSchemas4 value) {
        Utils.checkNotNull(value, "value");
        return new HrisMetadataValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HrisMetadataSchemas4>(){}));
    }

    public static HrisMetadataValue of(HrisMetadataSchemas5 value) {
        Utils.checkNotNull(value, "value");
        return new HrisMetadataValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<HrisMetadataSchemas5>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code to.unified.unified_java_sdk.models.shared.HrisMetadataSchemas1}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.HrisMetadataSchemas2}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.HrisMetadataSchemas3}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.HrisMetadataSchemas4}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.HrisMetadataSchemas5}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HrisMetadataValue other = (HrisMetadataValue) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<HrisMetadataValue> {

        public _Deserializer() {
            super(HrisMetadataValue.class, false,
                  TypeReferenceWithShape.of(new TypeReference<HrisMetadataSchemas5>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HrisMetadataSchemas4>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HrisMetadataSchemas3>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HrisMetadataSchemas2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<HrisMetadataSchemas1>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisMetadataValue.class,
                "value", value);
    }
 
}

