/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum ListProjectId {
    SUPPORTED_REQUIRED("supported-required"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    @JsonValue
    private final String value;

    private ListProjectId(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ListProjectId> fromValue(String value) {
        for (ListProjectId o: ListProjectId.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
