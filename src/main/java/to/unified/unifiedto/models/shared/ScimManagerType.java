/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum ScimManagerType {
    DIRECT("direct"),
    INDIRECT("indirect");

    @JsonValue
    private final String value;

    private ScimManagerType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ScimManagerType> fromValue(String value) {
        for (ScimManagerType o: ScimManagerType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
