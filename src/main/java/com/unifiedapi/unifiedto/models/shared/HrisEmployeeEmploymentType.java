/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum HrisEmployeeEmploymentType {
    FULL_TIME("FULL_TIME"),
    PART_TIME("PART_TIME"),
    CONTRACTOR("CONTRACTOR"),
    INTERN("INTERN"),
    CONSULTANT("CONSULTANT"),
    VOLUNTEER("VOLUNTEER"),
    CASUAL("CASUAL"),
    SEASONAL("SEASONAL"),
    FREELANCE("FREELANCE"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private HrisEmployeeEmploymentType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<HrisEmployeeEmploymentType> fromValue(String value) {
        for (HrisEmployeeEmploymentType o: HrisEmployeeEmploymentType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
