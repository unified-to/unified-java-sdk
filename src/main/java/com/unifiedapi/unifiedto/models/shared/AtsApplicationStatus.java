/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum AtsApplicationStatus {
    NEW("NEW"),
    REVIEWING("REVIEWING"),
    SCREENING("SCREENING"),
    SUBMITTED("SUBMITTED"),
    FIRST_INTERVIEW("FIRST_INTERVIEW"),
    SECOND_INTERVIEW("SECOND_INTERVIEW"),
    THIRD_INTERVIEW("THIRD_INTERVIEW"),
    BACKGROUND_CHECK("BACKGROUND_CHECK"),
    OFFERED("OFFERED"),
    ACCEPTED("ACCEPTED"),
    HIRED("HIRED"),
    REJECTED("REJECTED"),
    DECLINED("DECLINED"),
    WITHDRAWN("WITHDRAWN");

    @JsonValue
    private final String value;

    private AtsApplicationStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AtsApplicationStatus> fromValue(String value) {
        for (AtsApplicationStatus o: AtsApplicationStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
