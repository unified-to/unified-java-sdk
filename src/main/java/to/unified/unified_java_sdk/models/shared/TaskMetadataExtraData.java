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

@JsonDeserialize(using = TaskMetadataExtraData._Deserializer.class)
public class TaskMetadataExtraData {

    @JsonValue
    private TypedObject value;
    
    private TaskMetadataExtraData(TypedObject value) {
        this.value = value;
    }

    public static TaskMetadataExtraData of(TaskMetadata1 value) {
        Utils.checkNotNull(value, "value");
        return new TaskMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskMetadata1>(){}));
    }

    public static TaskMetadataExtraData of(TaskMetadata2 value) {
        Utils.checkNotNull(value, "value");
        return new TaskMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskMetadata2>(){}));
    }

    public static TaskMetadataExtraData of(TaskMetadata3 value) {
        Utils.checkNotNull(value, "value");
        return new TaskMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskMetadata3>(){}));
    }

    public static TaskMetadataExtraData of(TaskMetadata4 value) {
        Utils.checkNotNull(value, "value");
        return new TaskMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskMetadata4>(){}));
    }

    public static TaskMetadataExtraData of(TaskMetadata5 value) {
        Utils.checkNotNull(value, "value");
        return new TaskMetadataExtraData(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<TaskMetadata5>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code to.unified.unified_java_sdk.models.shared.TaskMetadata1}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.TaskMetadata2}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.TaskMetadata3}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.TaskMetadata4}</li>
     * <li>{@code to.unified.unified_java_sdk.models.shared.TaskMetadata5}</li>
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
        TaskMetadataExtraData other = (TaskMetadataExtraData) o;
        return Utils.enhancedDeepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<TaskMetadataExtraData> {

        public _Deserializer() {
            super(TaskMetadataExtraData.class, false,
                  TypeReferenceWithShape.of(new TypeReference<TaskMetadata5>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskMetadata4>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskMetadata3>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskMetadata2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<TaskMetadata1>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskMetadataExtraData.class,
                "value", value);
    }
 
}

