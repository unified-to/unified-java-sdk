/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum ContentType {
    HTML("HTML"),
    MARKDOWN("MARKDOWN"),
    TEXT("TEXT"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private ContentType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ContentType> fromValue(String value) {
        for (ContentType o: ContentType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
