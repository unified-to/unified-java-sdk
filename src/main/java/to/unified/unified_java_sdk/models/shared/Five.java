/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import to.unified.unified_java_sdk.utils.OneOfDeserializer;
import to.unified.unified_java_sdk.utils.TypedObject;
import to.unified.unified_java_sdk.utils.Utils.JsonShape;
import to.unified.unified_java_sdk.utils.Utils.TypeReferenceWithShape;
import to.unified.unified_java_sdk.utils.Utils;

@JsonDeserialize(using = Five._Deserializer.class)
public class Five {

    @JsonValue
    private TypedObject value;
    
    private Five(TypedObject value) {
        this.value = value;
    }

    public static Five of(List<Object> value) {
        Utils.checkNotNull(value, "value");
        return new Five(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<List<Object>>(){}));
    }

    public static Five of(AtsMetadataSchemasExtraData2 value) {
        Utils.checkNotNull(value, "value");
        return new Five(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AtsMetadataSchemasExtraData2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.util.List<java.lang.Object>}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.AtsMetadataSchemasExtraData2}</li>
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
        Five other = (Five) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Five> {

        public _Deserializer() {
            super(Five.class, false,
                  TypeReferenceWithShape.of(new TypeReference<List<Object>>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AtsMetadataSchemasExtraData2>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Five.class,
                "value", value);
    }
 
}

