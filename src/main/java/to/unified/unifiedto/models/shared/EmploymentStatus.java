/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum EmploymentStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    @JsonValue
    private final String value;

    private EmploymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EmploymentStatus> fromValue(String value) {
        for (EmploymentStatus o: EmploymentStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
