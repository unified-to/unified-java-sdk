/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import to.unified.unified_java_sdk.utils.OneOfDeserializer;
import to.unified.unified_java_sdk.utils.TypedObject;
import to.unified.unified_java_sdk.utils.Utils.JsonShape;
import to.unified.unified_java_sdk.utils.Utils.TypeReferenceWithShape;
import to.unified.unified_java_sdk.utils.Utils;

@JsonDeserialize(using = Integration4._Deserializer.class)
public class Integration4 {

    @JsonValue
    private TypedObject value;
    
    private Integration4(TypedObject value) {
        this.value = value;
    }

    public static Integration4 of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new Integration4(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static Integration4 of(IntegrationSchemasApi2 value) {
        Utils.checkNotNull(value, "value");
        return new Integration4(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<IntegrationSchemasApi2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code boolean}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.IntegrationSchemasApi2}</li>
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
        Integration4 other = (Integration4) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Integration4> {

        public _Deserializer() {
            super(Integration4.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<IntegrationSchemasApi2>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Integration4.class,
                "value", value);
    }
 
}

