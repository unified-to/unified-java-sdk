/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum Frequency {
    ONE_TIME("ONE_TIME"),
    DAY("DAY"),
    QUARTER("QUARTER"),
    YEAR("YEAR"),
    HOUR("HOUR"),
    MONTH("MONTH"),
    WEEK("WEEK");

    @JsonValue
    private final String value;

    private Frequency(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Frequency> fromValue(String value) {
        for (Frequency o: Frequency.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
