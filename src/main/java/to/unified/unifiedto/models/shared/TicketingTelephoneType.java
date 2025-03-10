/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum TicketingTelephoneType {
    WORK("WORK"),
    HOME("HOME"),
    OTHER("OTHER"),
    FAX("FAX"),
    MOBILE("MOBILE");

    @JsonValue
    private final String value;

    private TicketingTelephoneType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TicketingTelephoneType> fromValue(String value) {
        for (TicketingTelephoneType o: TicketingTelephoneType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
