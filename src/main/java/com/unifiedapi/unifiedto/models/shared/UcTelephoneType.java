/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum UcTelephoneType {
    WORK("WORK"),
    HOME("HOME"),
    OTHER("OTHER"),
    FAX("FAX"),
    MOBILE("MOBILE");

    @JsonValue
    private final String value;

    private UcTelephoneType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<UcTelephoneType> fromValue(String value) {
        for (UcTelephoneType o: UcTelephoneType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
