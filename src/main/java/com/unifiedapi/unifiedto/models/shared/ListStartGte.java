/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum ListStartGte {
    SUPPORTED_REQUIRED("supported-required"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    @JsonValue
    private final String value;

    private ListStartGte(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ListStartGte> fromValue(String value) {
        for (ListStartGte o: ListStartGte.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
