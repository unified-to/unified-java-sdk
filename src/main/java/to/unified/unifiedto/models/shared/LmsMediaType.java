/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum LmsMediaType {
    IMAGE("IMAGE"),
    HEADSHOT("HEADSHOT"),
    VIDEO("VIDEO"),
    WEB("WEB"),
    DOCUMENT("DOCUMENT"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private LmsMediaType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<LmsMediaType> fromValue(String value) {
        for (LmsMediaType o: LmsMediaType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
