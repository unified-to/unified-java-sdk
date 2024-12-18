/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum ScimGroupMemberType {
    USER("User"),
    GROUP("Group");

    @JsonValue
    private final String value;

    private ScimGroupMemberType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ScimGroupMemberType> fromValue(String value) {
        for (ScimGroupMemberType o: ScimGroupMemberType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
