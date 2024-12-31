/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum CrmEventFormFieldType {
    TEXT("TEXT"),
    NUMBER("NUMBER"),
    DATE("DATE"),
    BOOLEAN("BOOLEAN"),
    MULTIPLE_CHOICE("MULTIPLE_CHOICE"),
    FILE("FILE"),
    TEXTAREA("TEXTAREA"),
    MULTIPLE_SELECT("MULTIPLE_SELECT"),
    EMAIL("EMAIL"),
    PHONE("PHONE"),
    YES_NO("YES_NO"),
    CURRENCY("CURRENCY"),
    URL("URL");

    @JsonValue
    private final String value;

    private CrmEventFormFieldType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CrmEventFormFieldType> fromValue(String value) {
        for (CrmEventFormFieldType o: CrmEventFormFieldType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
