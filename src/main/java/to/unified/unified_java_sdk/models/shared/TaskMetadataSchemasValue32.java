/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.lang.Override;
import java.lang.String;
import to.unified.unified_java_sdk.utils.Utils;


public class TaskMetadataSchemasValue32 {
    @JsonCreator
    public TaskMetadataSchemasValue32() {
    }

    public static Builder builder() {
        return new Builder();
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskMetadataSchemasValue32.class);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Builder() {
          // force use of static builder() method
        }

        public TaskMetadataSchemasValue32 build() {

            return new TaskMetadataSchemasValue32(
                );
        }

    }
}
