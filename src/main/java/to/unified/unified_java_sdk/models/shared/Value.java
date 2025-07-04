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

@JsonDeserialize(using = Value._Deserializer.class)
public class Value {

    @JsonValue
    private TypedObject value;
    
    private Value(TypedObject value) {
        this.value = value;
    }

    public static Value of(AtsMetadata1 value) {
        Utils.checkNotNull(value, "value");
        return new Value(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtsMetadata1>(){}));
    }

    public static Value of(AtsMetadata2 value) {
        Utils.checkNotNull(value, "value");
        return new Value(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtsMetadata2>(){}));
    }

    public static Value of(AtsMetadata3 value) {
        Utils.checkNotNull(value, "value");
        return new Value(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtsMetadata3>(){}));
    }

    public static Value of(AtsMetadata4 value) {
        Utils.checkNotNull(value, "value");
        return new Value(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtsMetadata4>(){}));
    }

    public static Value of(AtsMetadata5 value) {
        Utils.checkNotNull(value, "value");
        return new Value(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtsMetadata5>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code to.unified.unified_java_sdk.models.shared.AtsMetadata1}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.AtsMetadata2}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.AtsMetadata3}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.AtsMetadata4}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.AtsMetadata5}</li>
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
        Value other = (Value) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Value> {

        public _Deserializer() {
            super(Value.class, false,
                  TypeReferenceWithShape.of(new TypeReference<AtsMetadata5>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AtsMetadata4>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AtsMetadata3>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AtsMetadata2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AtsMetadata1>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Value.class,
                "value", value);
    }
 
}

