/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AtsCompensationType {
    SALARY("SALARY"),
    BONUS("BONUS"),
    STOCK_OPTIONS("STOCK_OPTIONS"),
    EQUITY("EQUITY"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private AtsCompensationType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AtsCompensationType> fromValue(String value) {
        for (AtsCompensationType o: AtsCompensationType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
