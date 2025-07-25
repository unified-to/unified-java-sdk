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

@JsonDeserialize(using = KmsPageMetadataExtraData._Deserializer.class)
public class KmsPageMetadataExtraData {

    @JsonValue
    private TypedObject value;
    
    private KmsPageMetadataExtraData(TypedObject value) {
        this.value = value;
    }

    public static KmsPageMetadataExtraData of(KmsPageMetadata1 value) {
        Utils.checkNotNull(value, "value");
        return new KmsPageMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<KmsPageMetadata1>(){}));
    }

    public static KmsPageMetadataExtraData of(KmsPageMetadata2 value) {
        Utils.checkNotNull(value, "value");
        return new KmsPageMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<KmsPageMetadata2>(){}));
    }

    public static KmsPageMetadataExtraData of(KmsPageMetadata3 value) {
        Utils.checkNotNull(value, "value");
        return new KmsPageMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<KmsPageMetadata3>(){}));
    }

    public static KmsPageMetadataExtraData of(KmsPageMetadata4 value) {
        Utils.checkNotNull(value, "value");
        return new KmsPageMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<KmsPageMetadata4>(){}));
    }

    public static KmsPageMetadataExtraData of(KmsPageMetadata5 value) {
        Utils.checkNotNull(value, "value");
        return new KmsPageMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<KmsPageMetadata5>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code to.unified.unified_java_sdk.models.shared.KmsPageMetadata1}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.KmsPageMetadata2}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.KmsPageMetadata3}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.KmsPageMetadata4}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.KmsPageMetadata5}</li>
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
        KmsPageMetadataExtraData other = (KmsPageMetadataExtraData) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<KmsPageMetadataExtraData> {

        public _Deserializer() {
            super(KmsPageMetadataExtraData.class, false,
                  TypeReferenceWithShape.of(new TypeReference<KmsPageMetadata5>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<KmsPageMetadata4>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<KmsPageMetadata3>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<KmsPageMetadata2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<KmsPageMetadata1>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(KmsPageMetadataExtraData.class,
                "value", value);
    }
 
}

