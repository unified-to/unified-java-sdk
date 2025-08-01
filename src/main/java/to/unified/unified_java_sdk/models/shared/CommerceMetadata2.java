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

@JsonDeserialize(using = CommerceMetadata2._Deserializer.class)
public class CommerceMetadata2 {

    @JsonValue
    private TypedObject value;
    
    private CommerceMetadata2(TypedObject value) {
        this.value = value;
    }

    public static CommerceMetadata2 of(String value) {
        Utils.checkNotNull(value, "value");
        return new CommerceMetadata2(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static CommerceMetadata2 of(CommerceMetadataSchemasExtraData22 value) {
        Utils.checkNotNull(value, "value");
        return new CommerceMetadata2(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<CommerceMetadataSchemasExtraData22>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.CommerceMetadataSchemasExtraData22}</li>
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
        CommerceMetadata2 other = (CommerceMetadata2) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CommerceMetadata2> {

        public _Deserializer() {
            super(CommerceMetadata2.class, false,
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<CommerceMetadataSchemasExtraData22>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceMetadata2.class,
                "value", value);
    }
 
}

