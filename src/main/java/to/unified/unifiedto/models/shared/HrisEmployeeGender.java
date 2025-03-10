/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum HrisEmployeeGender {
    MALE("MALE"),
    FEMALE("FEMALE"),
    INTERSEX("INTERSEX"),
    TRANS("TRANS"),
    NON_BINARY("NON_BINARY");

    @JsonValue
    private final String value;

    private HrisEmployeeGender(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<HrisEmployeeGender> fromValue(String value) {
        for (HrisEmployeeGender o: HrisEmployeeGender.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
