/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum Recommendation {
    DEFINITELY_NO("DEFINITELY_NO"),
    NO("NO"),
    YES("YES"),
    STRONG_YES("STRONG_YES");

    @JsonValue
    private final String value;

    private Recommendation(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Recommendation> fromValue(String value) {
        for (Recommendation o: Recommendation.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
