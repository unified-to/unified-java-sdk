/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum CommerceItemMediaType {
    IMAGE("image"),
    VIDEO("video");

    @JsonValue
    private final String value;

    private CommerceItemMediaType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CommerceItemMediaType> fromValue(String value) {
        for (CommerceItemMediaType o: CommerceItemMediaType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
